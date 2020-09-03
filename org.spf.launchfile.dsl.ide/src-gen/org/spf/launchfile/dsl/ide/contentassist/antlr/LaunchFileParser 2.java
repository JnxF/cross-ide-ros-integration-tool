/*
 * generated by Xtext 2.21.0
 */
package org.spf.launchfile.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.spf.launchfile.dsl.ide.contentassist.antlr.internal.InternalLaunchFileParser;
import org.spf.launchfile.dsl.services.LaunchFileGrammarAccess;

public class LaunchFileParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LaunchFileGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LaunchFileGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPythonInstructionAccess().getAlternatives(), "rule__PythonInstruction__Alternatives");
			builder.put(grammarAccess.getImportStatementAccess().getFromAlternatives_0_1_0(), "rule__ImportStatement__FromAlternatives_0_1_0");
			builder.put(grammarAccess.getImportStatementAccess().getImportsAlternatives_2_0(), "rule__ImportStatement__ImportsAlternatives_2_0");
			builder.put(grammarAccess.getImportStatementAccess().getImportsAlternatives_3_1_0(), "rule__ImportStatement__ImportsAlternatives_3_1_0");
			builder.put(grammarAccess.getNodeAccess().getAlternatives_1(), "rule__Node__Alternatives_1");
			builder.put(grammarAccess.getImportStatementAccess().getGroup(), "rule__ImportStatement__Group__0");
			builder.put(grammarAccess.getImportStatementAccess().getGroup_0(), "rule__ImportStatement__Group_0__0");
			builder.put(grammarAccess.getImportStatementAccess().getGroup_3(), "rule__ImportStatement__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
			builder.put(grammarAccess.getLaunchDescriptionAccess().getGroup(), "rule__LaunchDescription__Group__0");
			builder.put(grammarAccess.getLaunchDescriptionAccess().getGroup_5(), "rule__LaunchDescription__Group_5__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_0(), "rule__Node__Group_3_0__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_1(), "rule__Node__Group_3_1__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_2(), "rule__Node__Group_3_2__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_3(), "rule__Node__Group_3_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_4(), "rule__Node__Group_3_4__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_5(), "rule__Node__Group_3_5__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_3_5_4(), "rule__Node__Group_3_5_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getPythonFileAccess().getInstructionsAssignment(), "rule__PythonFile__InstructionsAssignment");
			builder.put(grammarAccess.getImportStatementAccess().getFromAssignment_0_1(), "rule__ImportStatement__FromAssignment_0_1");
			builder.put(grammarAccess.getImportStatementAccess().getImportsAssignment_2(), "rule__ImportStatement__ImportsAssignment_2");
			builder.put(grammarAccess.getImportStatementAccess().getImportsAssignment_3_1(), "rule__ImportStatement__ImportsAssignment_3_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getBodyAssignment_5(), "rule__Function__BodyAssignment_5");
			builder.put(grammarAccess.getFunctionAccess().getBodyAssignment_6(), "rule__Function__BodyAssignment_6");
			builder.put(grammarAccess.getReturnStatementAccess().getLaunchDescriptionAssignment_1(), "rule__ReturnStatement__LaunchDescriptionAssignment_1");
			builder.put(grammarAccess.getLaunchDescriptionAccess().getNodesAssignment_4(), "rule__LaunchDescription__NodesAssignment_4");
			builder.put(grammarAccess.getLaunchDescriptionAccess().getNodesAssignment_5_1(), "rule__LaunchDescription__NodesAssignment_5_1");
			builder.put(grammarAccess.getNodeAccess().getNode_nameAssignment_3_0_2(), "rule__Node__Node_nameAssignment_3_0_2");
			builder.put(grammarAccess.getNodeAccess().getPackage_nameAssignment_3_1_2(), "rule__Node__Package_nameAssignment_3_1_2");
			builder.put(grammarAccess.getNodeAccess().getNamespaceAssignment_3_2_2(), "rule__Node__NamespaceAssignment_3_2_2");
			builder.put(grammarAccess.getNodeAccess().getNode_executableAssignment_3_3_2(), "rule__Node__Node_executableAssignment_3_3_2");
			builder.put(grammarAccess.getNodeAccess().getOutputAssignment_3_4_2(), "rule__Node__OutputAssignment_3_4_2");
			builder.put(grammarAccess.getNodeAccess().getParametersAssignment_3_5_3(), "rule__Node__ParametersAssignment_3_5_3");
			builder.put(grammarAccess.getNodeAccess().getParametersAssignment_3_5_4_1(), "rule__Node__ParametersAssignment_3_5_4_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_2(), "rule__Parameter__ValueAssignment_2");
			builder.put(grammarAccess.getNodeAccess().getUnorderedGroup_3(), "rule__Node__UnorderedGroup_3");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LaunchFileGrammarAccess grammarAccess;

	@Override
	protected InternalLaunchFileParser createParser() {
		InternalLaunchFileParser result = new InternalLaunchFileParser(null);
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

	public LaunchFileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LaunchFileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
