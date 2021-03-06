/*
 * generated by Xtext 2.22.0
 */
package org.spf.packagexml.validation;

import java.util.ArrayList;
import java.util.HashSet;

import org.spf.PackageXML.Tag;

import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.xtext.validation.Check;
import org.spf.PackageXML.BuildDependDependencyTag;
import org.spf.PackageXML.DescriptionTag;
import org.spf.PackageXML.ExecDependDependencyTag;
import org.spf.PackageXML.LicenseTag;
import org.spf.PackageXML.MaintainerTag;
import org.spf.PackageXML.NameTag;
import org.spf.PackageXML.Package;
import org.spf.PackageXML.PackageXMLPackage;
import org.spf.PackageXML.RunDependencyTag;
import org.spf.PackageXML.VersionTag;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class PackageXMLValidator extends AbstractPackageXMLValidator {
	public static final String NOT_SUPPORTED_FORMAT = "notSupportedFormat";

	@Check
	public void checkFormat3(Package pkg) {
		if (!pkg.getFormat().equals("3")) {
			warning("This checker only works with Package Manifest Format Three.",
					PackageXMLPackage.eINSTANCE.getPackage_Format(), NOT_SUPPORTED_FORMAT, pkg.getFormat());
		}
	}

	public static final String MISSING_TAG = "missingTag";
	public static final String TOO_MUCH_TAGS = "tooMuchTags";

	@Check
	public void checkNoRepeated(Package pkg) {
		ArrayList<Class<?>> classes = new ArrayList<>();
		ArrayList<String> tagNames = new ArrayList<>();
		classes.add(NameTag.class);
		tagNames.add("name");
		classes.add(VersionTag.class);
		tagNames.add("version");
		classes.add(DescriptionTag.class);
		tagNames.add("description");
		classes.add(MaintainerTag.class);
		tagNames.add("maintainer");
		classes.add(LicenseTag.class);
		tagNames.add("license");

		assert classes.size() == tagNames.size();

		for (int i = 0; i < classes.size(); ++i) {
			Class<?> tagClass = classes.get(i);
			String tagName = tagNames.get(i);

			List<Tag> tags = pkg.getTags().stream().filter(x -> tagClass.isInstance(x)).collect(Collectors.toList());
			if (tags.size() == 0) {

				error("There must be exactly one <" + tagName + "> tag", PackageXMLPackage.eINSTANCE.getPackage_Tags(),
						NOT_SUPPORTED_FORMAT);
			} else {
				if (tagName.equals("maintainer") || tagName.equals("license")) {
					// We can have duplicates for those
					continue;
				}
				for (int j = 1; j < tags.size(); ++j) {
					// Tag tag = tags.get(j);
					error("There must be exactly one <" + tagName + "> tag",
							PackageXMLPackage.eINSTANCE.getPackage_Tags(), TOO_MUCH_TAGS);
				}
			}
		}
	}

	public static final String BUILD_DEPENDENCY_DUPLICATED = "buildDependencyDuplicated";

	@Check
	public void noRepeatedBuildDependencies(Package pkg) {
		HashSet<String> uniqueNames = new HashSet<>();
		List<Tag> tags = pkg.getTags().stream().filter(x -> x instanceof BuildDependDependencyTag)
				.collect(Collectors.toList());
		for (Tag tag : tags) {
			BuildDependDependencyTag bddt = (BuildDependDependencyTag) tag;
			String name = bddt.getName();
			if (uniqueNames.contains(name)) {
				error("Build dependency " + name + " is duplicated", PackageXMLPackage.eINSTANCE.getPackage_Tags(),
						BUILD_DEPENDENCY_DUPLICATED);
			}
			uniqueNames.add(name);
		}
	}

	public static final String EXEC_DEPENDENCY_DUPLICATED = "execDependencyDuplicated";

	@Check
	public void noRepeatedExecDependencies(Package pkg) {
		HashSet<String> uniqueNames = new HashSet<>();
		List<Tag> tags = pkg.getTags().stream().filter(x -> x instanceof ExecDependDependencyTag)
				.collect(Collectors.toList());
		for (Tag tag : tags) {
			ExecDependDependencyTag bddt = (ExecDependDependencyTag) tag;
			String name = bddt.getName();
			if (uniqueNames.contains(name)) {
				error("Execution dependency " + name + " is duplicated", PackageXMLPackage.eINSTANCE.getPackage_Tags(),
						EXEC_DEPENDENCY_DUPLICATED);
			}
			uniqueNames.add(name);
		}
	}

	public static final String RUN_DEPENDENCY_DUPLICATED = "runDependencyDuplicated";

	@Check
	public void noRepeatedRunDependencies(Package pkg) {
		HashSet<String> uniqueNames = new HashSet<>();
		List<Tag> tags = pkg.getTags().stream().filter(x -> x instanceof RunDependencyTag).collect(Collectors.toList());
		for (Tag tag : tags) {
			RunDependencyTag bddt = (RunDependencyTag) tag;
			String name = bddt.getName();
			if (uniqueNames.contains(name)) {
				error("Execution dependency " + name + " is duplicated", PackageXMLPackage.eINSTANCE.getPackage_Tags(),
						RUN_DEPENDENCY_DUPLICATED);
			}
			uniqueNames.add(name);
		}
	}
}
