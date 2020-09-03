package org.spf.cmakelists.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.CMakeLists.ProjectInstruction;
import org.spf.PackageXML.DeclaredPackageName;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.Package;
import org.spf.PackageXML.Tag;
import org.spf.common.util.EcoreIOUtil;

/**
 * This class contains custom scoping description.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
public class CMakeListsScopeProvider extends AbstractCMakeListsScopeProvider {
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof ProjectInstruction
				&& reference == CMakeListsPackage.eINSTANCE.getProjectInstruction_DeclaredPackageName()) {
			return getProjectInstructionScope((ProjectInstruction) context);
		}
		return super.getScope(context, reference);
	}

	private IScope getProjectInstructionScope(ProjectInstruction context) {
		List<EObject> objects = getSiblingObjectsOfExtension(context, "xml");
		ArrayList<EObject> result = new ArrayList<>();
		for (EObject p : objects) {
			Package pkg = (Package) p;
			for (Tag t : pkg.getTags()) {
				if (t instanceof NameTag) {
					DeclaredPackageName dpn = ((NameTag) t).getDeclaredPackageName();
					result.add(dpn);
				}
			}
		}
		return Scopes.scopeFor(result);
	}

	private static List<EObject> getSiblingObjectsOfExtension(EObject obj, String extension) {
		IResource[] siblingFiles = getSiblingFiles(obj);
		ArrayList<EObject> objects = new ArrayList<>();
		for (IResource resource : siblingFiles) {
			if (resource.getType() == IResource.FILE) {
				IFile file = (IFile) resource;
				if (file.getFileExtension().equalsIgnoreCase(extension)) {
					EObject net = EcoreIOUtil.loadModel(file);
					objects.add(net);
				}
			}
		}
		return objects;
	}

	private static IResource[] getSiblingFiles(EObject obj) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		IFile myFile = workspaceRoot.getFile(new Path(obj.eResource().getURI().toPlatformString(true)));
		IContainer folder = myFile.getParent();
		try {
			return folder.members();
		} catch (Exception e) {
			return new IResource[0];
		}
	}
}
