/*
 * generated by Xtext 2.22.0
 */
package org.spf.cmakelists.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.spf.cmakelists.ide.contentassist.antlr.internal.InternalCMakeListsParser;
import org.spf.cmakelists.services.CMakeListsGrammarAccess;

public class CMakeListsParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(CMakeListsGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, CMakeListsGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getPathAccess().getAlternatives(), "rule__Path__Alternatives");
			builder.put(grammarAccess.getIfInstructionAccess().getAlternatives_3(), "rule__IfInstruction__Alternatives_3");
			builder.put(grammarAccess.getSetInstructionAccess().getAlternatives_3(), "rule__SetInstruction__Alternatives_3");
			builder.put(grammarAccess.getSetInstructionAccess().getArgumentsAlternatives_3_0_0(), "rule__SetInstruction__ArgumentsAlternatives_3_0_0");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getAlternatives_2(), "rule__UndefinedInstruction__Alternatives_2");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getArgumentsAlternatives_2_0_0(), "rule__UndefinedInstruction__ArgumentsAlternatives_2_0_0");
			builder.put(grammarAccess.getCMakeMinimumRequiredAccess().getGroup(), "rule__CMakeMinimumRequired__Group__0");
			builder.put(grammarAccess.getProjectInstructionAccess().getGroup(), "rule__ProjectInstruction__Group__0");
			builder.put(grammarAccess.getFindPackageAccess().getGroup(), "rule__FindPackage__Group__0");
			builder.put(grammarAccess.getFindPackageAccess().getGroup_5(), "rule__FindPackage__Group_5__0");
			builder.put(grammarAccess.getAddExecutableAccess().getGroup(), "rule__AddExecutable__Group__0");
			builder.put(grammarAccess.getPathAccess().getGroup_1(), "rule__Path__Group_1__0");
			builder.put(grammarAccess.getPathAccess().getGroup_2(), "rule__Path__Group_2__0");
			builder.put(grammarAccess.getPathAccess().getGroup_3(), "rule__Path__Group_3__0");
			builder.put(grammarAccess.getExecutableAccess().getGroup(), "rule__Executable__Group__0");
			builder.put(grammarAccess.getAmentTargetDependenciesAccess().getGroup(), "rule__AmentTargetDependencies__Group__0");
			builder.put(grammarAccess.getAmentPackageInstructionAccess().getGroup(), "rule__AmentPackageInstruction__Group__0");
			builder.put(grammarAccess.getInstallTargetsAccess().getGroup(), "rule__InstallTargets__Group__0");
			builder.put(grammarAccess.getInstallDirectoryAccess().getGroup(), "rule__InstallDirectory__Group__0");
			builder.put(grammarAccess.getInstallDirectoryAccess().getGroup_6(), "rule__InstallDirectory__Group_6__0");
			builder.put(grammarAccess.getInstallDirectoryAccess().getGroup_6_1(), "rule__InstallDirectory__Group_6_1__0");
			builder.put(grammarAccess.getIfInstructionAccess().getGroup(), "rule__IfInstruction__Group__0");
			builder.put(grammarAccess.getSetInstructionAccess().getGroup(), "rule__SetInstruction__Group__0");
			builder.put(grammarAccess.getAddCompileOptionsAccess().getGroup(), "rule__AddCompileOptions__Group__0");
			builder.put(grammarAccess.getAddCompileOptionsAccess().getGroup_2(), "rule__AddCompileOptions__Group_2__0");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getGroup(), "rule__UndefinedInstruction__Group__0");
			builder.put(grammarAccess.getCMakeListsFileAccess().getInstructionsAssignment(), "rule__CMakeListsFile__InstructionsAssignment");
			builder.put(grammarAccess.getCMakeMinimumRequiredAccess().getVersionAssignment_3(), "rule__CMakeMinimumRequired__VersionAssignment_3");
			builder.put(grammarAccess.getProjectInstructionAccess().getDeclaredPackageNameAssignment_3(), "rule__ProjectInstruction__DeclaredPackageNameAssignment_3");
			builder.put(grammarAccess.getFindPackageAccess().getNameAssignment_3(), "rule__FindPackage__NameAssignment_3");
			builder.put(grammarAccess.getFindPackageAccess().getRequiredAssignment_4(), "rule__FindPackage__RequiredAssignment_4");
			builder.put(grammarAccess.getFindPackageAccess().getComponentsAssignment_5_1(), "rule__FindPackage__ComponentsAssignment_5_1");
			builder.put(grammarAccess.getAddExecutableAccess().getNameAssignment_2(), "rule__AddExecutable__NameAssignment_2");
			builder.put(grammarAccess.getAddExecutableAccess().getSourcesAssignment_3(), "rule__AddExecutable__SourcesAssignment_3");
			builder.put(grammarAccess.getExecutableAccess().getNameAssignment_1(), "rule__Executable__NameAssignment_1");
			builder.put(grammarAccess.getAmentTargetDependenciesAccess().getNameAssignment_2(), "rule__AmentTargetDependencies__NameAssignment_2");
			builder.put(grammarAccess.getAmentTargetDependenciesAccess().getDependenciesAssignment_3(), "rule__AmentTargetDependencies__DependenciesAssignment_3");
			builder.put(grammarAccess.getInstallTargetsAccess().getTargetsAssignment_3(), "rule__InstallTargets__TargetsAssignment_3");
			builder.put(grammarAccess.getInstallTargetsAccess().getRuntimeAssignment_4(), "rule__InstallTargets__RuntimeAssignment_4");
			builder.put(grammarAccess.getInstallTargetsAccess().getDestinationAssignment_6(), "rule__InstallTargets__DestinationAssignment_6");
			builder.put(grammarAccess.getInstallDirectoryAccess().getDirectoryAssignment_3(), "rule__InstallDirectory__DirectoryAssignment_3");
			builder.put(grammarAccess.getInstallDirectoryAccess().getDestinationAssignment_5(), "rule__InstallDirectory__DestinationAssignment_5");
			builder.put(grammarAccess.getInstallDirectoryAccess().getPatternsAssignment_6_1_1(), "rule__InstallDirectory__PatternsAssignment_6_1_1");
			builder.put(grammarAccess.getIfInstructionAccess().getPredicateAssignment_3_0(), "rule__IfInstruction__PredicateAssignment_3_0");
			builder.put(grammarAccess.getIfInstructionAccess().getInstructionsAssignment_5(), "rule__IfInstruction__InstructionsAssignment_5");
			builder.put(grammarAccess.getSetInstructionAccess().getVariableAssignment_2(), "rule__SetInstruction__VariableAssignment_2");
			builder.put(grammarAccess.getSetInstructionAccess().getArgumentsAssignment_3_0(), "rule__SetInstruction__ArgumentsAssignment_3_0");
			builder.put(grammarAccess.getSetInstructionAccess().getArgumentsAssignment_3_1(), "rule__SetInstruction__ArgumentsAssignment_3_1");
			builder.put(grammarAccess.getAddCompileOptionsAccess().getOptionsAssignment_2_1(), "rule__AddCompileOptions__OptionsAssignment_2_1");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getNameAssignment_0(), "rule__UndefinedInstruction__NameAssignment_0");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getArgumentsAssignment_2_0(), "rule__UndefinedInstruction__ArgumentsAssignment_2_0");
			builder.put(grammarAccess.getUndefinedInstructionAccess().getArgumentsAssignment_2_1(), "rule__UndefinedInstruction__ArgumentsAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private CMakeListsGrammarAccess grammarAccess;

	@Override
	protected InternalCMakeListsParser createParser() {
		InternalCMakeListsParser result = new InternalCMakeListsParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CMakeListsGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CMakeListsGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
