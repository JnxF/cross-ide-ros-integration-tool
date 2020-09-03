package org.spf.launchfile.dsl.linking;


import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.spf.common.util.EcoreIOUtil;

public class LaunchFileLinkingService extends DefaultLinkingService {
	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {
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
