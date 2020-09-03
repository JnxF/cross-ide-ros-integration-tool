/*
 * generated by Xtext 2.22.0
 */
package org.spf.launchfile.dsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.spf.launchfile.dsl.parser.antlr.internal.InternalLaunchFileParser;
import org.spf.launchfile.dsl.services.LaunchFileGrammarAccess;

public class LaunchFileParser extends AbstractAntlrParser {

	@Inject
	private LaunchFileGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLaunchFileParser createParser(XtextTokenStream stream) {
		return new InternalLaunchFileParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PythonFile";
	}

	public LaunchFileGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LaunchFileGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
