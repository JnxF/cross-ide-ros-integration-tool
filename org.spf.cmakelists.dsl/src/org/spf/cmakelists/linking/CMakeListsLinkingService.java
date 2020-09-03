package org.spf.cmakelists.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.spf.CMakeLists.CMakeListsPackage;
import org.spf.PackageXML.DeclaredPackageName;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.Package;
import org.spf.PackageXML.Tag;
import org.spf.common.util.EcoreIOUtil;

public class CMakeListsLinkingService extends DefaultLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
			throws IllegalNodeException {

		// final String crossRefNode = getCrossRefNodeAsString(node).replaceAll("\"",
		// "");

		// Project Instruction
		if (reference.equals(CMakeListsPackage.eINSTANCE.getProjectInstruction_DeclaredPackageName())) {
			Package pkg = loadModelFromSameFolder(context, "package.xml");
			if (pkg != null) {
				EList<Tag> tags = pkg.getTags();
				for (Tag t : tags) {
					if (t instanceof NameTag) {
						DeclaredPackageName dpn = ((NameTag) t).getDeclaredPackageName();
						return Collections.singletonList(dpn);
					}
				}
				return null;
			}
		}
		return super.getLinkedObjects(context, reference, node);
	}

	protected <T> T loadModelFromSameFolder(EObject modelElement, String fileName) {
		IFile originalFile = EcoreIOUtil.resolveRelativeFileFromEObject(modelElement);
		IFile accompanyingFile = getFileInSameFolder(originalFile, fileName);
		if (accompanyingFile == null || !accompanyingFile.exists()) {
			return null;
		}
		return EcoreIOUtil.loadModel(accompanyingFile);
	}

	protected IFile getFileInSameFolder(IFile originalFile, String filename) {
		IContainer parent = originalFile.getParent();
		IPath path = new Path(filename);
		return parent.getFile(path);
	}
}
