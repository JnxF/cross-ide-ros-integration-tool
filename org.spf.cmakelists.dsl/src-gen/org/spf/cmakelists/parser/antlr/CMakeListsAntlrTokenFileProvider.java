/*
 * generated by Xtext 2.22.0
 */
package org.spf.cmakelists.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CMakeListsAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/spf/cmakelists/parser/antlr/internal/InternalCMakeLists.tokens");
	}
}