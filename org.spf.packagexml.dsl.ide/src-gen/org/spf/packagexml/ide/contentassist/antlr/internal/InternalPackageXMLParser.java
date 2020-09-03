package org.spf.packagexml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.spf.packagexml.services.PackageXMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPackageXMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_VERSION_TERMINAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'xml'", "'version'", "'='", "'?>'", "'<'", "'package'", "'format'", "'>'", "'/'", "'name'", "'description'", "'maintainer'", "'email'", "'license'", "'run_depend'", "'build_depend'", "'exec_depend'", "'buildtool_depend'", "'export'", "'author'", "'url'", "'type'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_VERSION_TERMINAL=6;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPackageXMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPackageXMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPackageXMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPackageXML.g"; }


    	private PackageXMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PackageXMLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePackage"
    // InternalPackageXML.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalPackageXML.g:54:1: ( rulePackage EOF )
            // InternalPackageXML.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalPackageXML.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalPackageXML.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalPackageXML.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalPackageXML.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalPackageXML.g:69:3: ( rule__Package__Group__0 )
            // InternalPackageXML.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTag"
    // InternalPackageXML.g:78:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:79:1: ( ruleTag EOF )
            // InternalPackageXML.g:80:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalPackageXML.g:87:1: ruleTag : ( ( rule__Tag__Alternatives ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:91:2: ( ( ( rule__Tag__Alternatives ) ) )
            // InternalPackageXML.g:92:2: ( ( rule__Tag__Alternatives ) )
            {
            // InternalPackageXML.g:92:2: ( ( rule__Tag__Alternatives ) )
            // InternalPackageXML.g:93:3: ( rule__Tag__Alternatives )
            {
             before(grammarAccess.getTagAccess().getAlternatives()); 
            // InternalPackageXML.g:94:3: ( rule__Tag__Alternatives )
            // InternalPackageXML.g:94:4: rule__Tag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleNameTag"
    // InternalPackageXML.g:103:1: entryRuleNameTag : ruleNameTag EOF ;
    public final void entryRuleNameTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:104:1: ( ruleNameTag EOF )
            // InternalPackageXML.g:105:1: ruleNameTag EOF
            {
             before(grammarAccess.getNameTagRule()); 
            pushFollow(FOLLOW_1);
            ruleNameTag();

            state._fsp--;

             after(grammarAccess.getNameTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameTag"


    // $ANTLR start "ruleNameTag"
    // InternalPackageXML.g:112:1: ruleNameTag : ( ( rule__NameTag__Group__0 ) ) ;
    public final void ruleNameTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:116:2: ( ( ( rule__NameTag__Group__0 ) ) )
            // InternalPackageXML.g:117:2: ( ( rule__NameTag__Group__0 ) )
            {
            // InternalPackageXML.g:117:2: ( ( rule__NameTag__Group__0 ) )
            // InternalPackageXML.g:118:3: ( rule__NameTag__Group__0 )
            {
             before(grammarAccess.getNameTagAccess().getGroup()); 
            // InternalPackageXML.g:119:3: ( rule__NameTag__Group__0 )
            // InternalPackageXML.g:119:4: rule__NameTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameTag"


    // $ANTLR start "entryRuleDeclaredPackageName"
    // InternalPackageXML.g:128:1: entryRuleDeclaredPackageName : ruleDeclaredPackageName EOF ;
    public final void entryRuleDeclaredPackageName() throws RecognitionException {
        try {
            // InternalPackageXML.g:129:1: ( ruleDeclaredPackageName EOF )
            // InternalPackageXML.g:130:1: ruleDeclaredPackageName EOF
            {
             before(grammarAccess.getDeclaredPackageNameRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaredPackageName();

            state._fsp--;

             after(grammarAccess.getDeclaredPackageNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclaredPackageName"


    // $ANTLR start "ruleDeclaredPackageName"
    // InternalPackageXML.g:137:1: ruleDeclaredPackageName : ( ( rule__DeclaredPackageName__NameAssignment ) ) ;
    public final void ruleDeclaredPackageName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:141:2: ( ( ( rule__DeclaredPackageName__NameAssignment ) ) )
            // InternalPackageXML.g:142:2: ( ( rule__DeclaredPackageName__NameAssignment ) )
            {
            // InternalPackageXML.g:142:2: ( ( rule__DeclaredPackageName__NameAssignment ) )
            // InternalPackageXML.g:143:3: ( rule__DeclaredPackageName__NameAssignment )
            {
             before(grammarAccess.getDeclaredPackageNameAccess().getNameAssignment()); 
            // InternalPackageXML.g:144:3: ( rule__DeclaredPackageName__NameAssignment )
            // InternalPackageXML.g:144:4: rule__DeclaredPackageName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DeclaredPackageName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDeclaredPackageNameAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredPackageName"


    // $ANTLR start "entryRuleVersionTag"
    // InternalPackageXML.g:153:1: entryRuleVersionTag : ruleVersionTag EOF ;
    public final void entryRuleVersionTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:154:1: ( ruleVersionTag EOF )
            // InternalPackageXML.g:155:1: ruleVersionTag EOF
            {
             before(grammarAccess.getVersionTagRule()); 
            pushFollow(FOLLOW_1);
            ruleVersionTag();

            state._fsp--;

             after(grammarAccess.getVersionTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVersionTag"


    // $ANTLR start "ruleVersionTag"
    // InternalPackageXML.g:162:1: ruleVersionTag : ( ( rule__VersionTag__Group__0 ) ) ;
    public final void ruleVersionTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:166:2: ( ( ( rule__VersionTag__Group__0 ) ) )
            // InternalPackageXML.g:167:2: ( ( rule__VersionTag__Group__0 ) )
            {
            // InternalPackageXML.g:167:2: ( ( rule__VersionTag__Group__0 ) )
            // InternalPackageXML.g:168:3: ( rule__VersionTag__Group__0 )
            {
             before(grammarAccess.getVersionTagAccess().getGroup()); 
            // InternalPackageXML.g:169:3: ( rule__VersionTag__Group__0 )
            // InternalPackageXML.g:169:4: rule__VersionTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersionTag"


    // $ANTLR start "entryRuleDescriptionTag"
    // InternalPackageXML.g:178:1: entryRuleDescriptionTag : ruleDescriptionTag EOF ;
    public final void entryRuleDescriptionTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:179:1: ( ruleDescriptionTag EOF )
            // InternalPackageXML.g:180:1: ruleDescriptionTag EOF
            {
             before(grammarAccess.getDescriptionTagRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptionTag();

            state._fsp--;

             after(grammarAccess.getDescriptionTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescriptionTag"


    // $ANTLR start "ruleDescriptionTag"
    // InternalPackageXML.g:187:1: ruleDescriptionTag : ( ( rule__DescriptionTag__Group__0 ) ) ;
    public final void ruleDescriptionTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:191:2: ( ( ( rule__DescriptionTag__Group__0 ) ) )
            // InternalPackageXML.g:192:2: ( ( rule__DescriptionTag__Group__0 ) )
            {
            // InternalPackageXML.g:192:2: ( ( rule__DescriptionTag__Group__0 ) )
            // InternalPackageXML.g:193:3: ( rule__DescriptionTag__Group__0 )
            {
             before(grammarAccess.getDescriptionTagAccess().getGroup()); 
            // InternalPackageXML.g:194:3: ( rule__DescriptionTag__Group__0 )
            // InternalPackageXML.g:194:4: rule__DescriptionTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionTag"


    // $ANTLR start "entryRuleMaintainerTag"
    // InternalPackageXML.g:203:1: entryRuleMaintainerTag : ruleMaintainerTag EOF ;
    public final void entryRuleMaintainerTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:204:1: ( ruleMaintainerTag EOF )
            // InternalPackageXML.g:205:1: ruleMaintainerTag EOF
            {
             before(grammarAccess.getMaintainerTagRule()); 
            pushFollow(FOLLOW_1);
            ruleMaintainerTag();

            state._fsp--;

             after(grammarAccess.getMaintainerTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaintainerTag"


    // $ANTLR start "ruleMaintainerTag"
    // InternalPackageXML.g:212:1: ruleMaintainerTag : ( ( rule__MaintainerTag__Group__0 ) ) ;
    public final void ruleMaintainerTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:216:2: ( ( ( rule__MaintainerTag__Group__0 ) ) )
            // InternalPackageXML.g:217:2: ( ( rule__MaintainerTag__Group__0 ) )
            {
            // InternalPackageXML.g:217:2: ( ( rule__MaintainerTag__Group__0 ) )
            // InternalPackageXML.g:218:3: ( rule__MaintainerTag__Group__0 )
            {
             before(grammarAccess.getMaintainerTagAccess().getGroup()); 
            // InternalPackageXML.g:219:3: ( rule__MaintainerTag__Group__0 )
            // InternalPackageXML.g:219:4: rule__MaintainerTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaintainerTag"


    // $ANTLR start "entryRuleLicenseTag"
    // InternalPackageXML.g:228:1: entryRuleLicenseTag : ruleLicenseTag EOF ;
    public final void entryRuleLicenseTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:229:1: ( ruleLicenseTag EOF )
            // InternalPackageXML.g:230:1: ruleLicenseTag EOF
            {
             before(grammarAccess.getLicenseTagRule()); 
            pushFollow(FOLLOW_1);
            ruleLicenseTag();

            state._fsp--;

             after(grammarAccess.getLicenseTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLicenseTag"


    // $ANTLR start "ruleLicenseTag"
    // InternalPackageXML.g:237:1: ruleLicenseTag : ( ( rule__LicenseTag__Group__0 ) ) ;
    public final void ruleLicenseTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:241:2: ( ( ( rule__LicenseTag__Group__0 ) ) )
            // InternalPackageXML.g:242:2: ( ( rule__LicenseTag__Group__0 ) )
            {
            // InternalPackageXML.g:242:2: ( ( rule__LicenseTag__Group__0 ) )
            // InternalPackageXML.g:243:3: ( rule__LicenseTag__Group__0 )
            {
             before(grammarAccess.getLicenseTagAccess().getGroup()); 
            // InternalPackageXML.g:244:3: ( rule__LicenseTag__Group__0 )
            // InternalPackageXML.g:244:4: rule__LicenseTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLicenseTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLicenseTag"


    // $ANTLR start "entryRuleDependencyTag"
    // InternalPackageXML.g:253:1: entryRuleDependencyTag : ruleDependencyTag EOF ;
    public final void entryRuleDependencyTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:254:1: ( ruleDependencyTag EOF )
            // InternalPackageXML.g:255:1: ruleDependencyTag EOF
            {
             before(grammarAccess.getDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            ruleDependencyTag();

            state._fsp--;

             after(grammarAccess.getDependencyTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependencyTag"


    // $ANTLR start "ruleDependencyTag"
    // InternalPackageXML.g:262:1: ruleDependencyTag : ( ( rule__DependencyTag__Alternatives ) ) ;
    public final void ruleDependencyTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:266:2: ( ( ( rule__DependencyTag__Alternatives ) ) )
            // InternalPackageXML.g:267:2: ( ( rule__DependencyTag__Alternatives ) )
            {
            // InternalPackageXML.g:267:2: ( ( rule__DependencyTag__Alternatives ) )
            // InternalPackageXML.g:268:3: ( rule__DependencyTag__Alternatives )
            {
             before(grammarAccess.getDependencyTagAccess().getAlternatives()); 
            // InternalPackageXML.g:269:3: ( rule__DependencyTag__Alternatives )
            // InternalPackageXML.g:269:4: rule__DependencyTag__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DependencyTag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyTagAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependencyTag"


    // $ANTLR start "entryRuleRunDependencyTag"
    // InternalPackageXML.g:278:1: entryRuleRunDependencyTag : ruleRunDependencyTag EOF ;
    public final void entryRuleRunDependencyTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:279:1: ( ruleRunDependencyTag EOF )
            // InternalPackageXML.g:280:1: ruleRunDependencyTag EOF
            {
             before(grammarAccess.getRunDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            ruleRunDependencyTag();

            state._fsp--;

             after(grammarAccess.getRunDependencyTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRunDependencyTag"


    // $ANTLR start "ruleRunDependencyTag"
    // InternalPackageXML.g:287:1: ruleRunDependencyTag : ( ( rule__RunDependencyTag__Group__0 ) ) ;
    public final void ruleRunDependencyTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:291:2: ( ( ( rule__RunDependencyTag__Group__0 ) ) )
            // InternalPackageXML.g:292:2: ( ( rule__RunDependencyTag__Group__0 ) )
            {
            // InternalPackageXML.g:292:2: ( ( rule__RunDependencyTag__Group__0 ) )
            // InternalPackageXML.g:293:3: ( rule__RunDependencyTag__Group__0 )
            {
             before(grammarAccess.getRunDependencyTagAccess().getGroup()); 
            // InternalPackageXML.g:294:3: ( rule__RunDependencyTag__Group__0 )
            // InternalPackageXML.g:294:4: rule__RunDependencyTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunDependencyTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunDependencyTag"


    // $ANTLR start "entryRuleBuildDependDependencyTag"
    // InternalPackageXML.g:303:1: entryRuleBuildDependDependencyTag : ruleBuildDependDependencyTag EOF ;
    public final void entryRuleBuildDependDependencyTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:304:1: ( ruleBuildDependDependencyTag EOF )
            // InternalPackageXML.g:305:1: ruleBuildDependDependencyTag EOF
            {
             before(grammarAccess.getBuildDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            ruleBuildDependDependencyTag();

            state._fsp--;

             after(grammarAccess.getBuildDependDependencyTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuildDependDependencyTag"


    // $ANTLR start "ruleBuildDependDependencyTag"
    // InternalPackageXML.g:312:1: ruleBuildDependDependencyTag : ( ( rule__BuildDependDependencyTag__Group__0 ) ) ;
    public final void ruleBuildDependDependencyTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:316:2: ( ( ( rule__BuildDependDependencyTag__Group__0 ) ) )
            // InternalPackageXML.g:317:2: ( ( rule__BuildDependDependencyTag__Group__0 ) )
            {
            // InternalPackageXML.g:317:2: ( ( rule__BuildDependDependencyTag__Group__0 ) )
            // InternalPackageXML.g:318:3: ( rule__BuildDependDependencyTag__Group__0 )
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getGroup()); 
            // InternalPackageXML.g:319:3: ( rule__BuildDependDependencyTag__Group__0 )
            // InternalPackageXML.g:319:4: rule__BuildDependDependencyTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildDependDependencyTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuildDependDependencyTag"


    // $ANTLR start "entryRuleExecDependDependencyTag"
    // InternalPackageXML.g:328:1: entryRuleExecDependDependencyTag : ruleExecDependDependencyTag EOF ;
    public final void entryRuleExecDependDependencyTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:329:1: ( ruleExecDependDependencyTag EOF )
            // InternalPackageXML.g:330:1: ruleExecDependDependencyTag EOF
            {
             before(grammarAccess.getExecDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            ruleExecDependDependencyTag();

            state._fsp--;

             after(grammarAccess.getExecDependDependencyTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExecDependDependencyTag"


    // $ANTLR start "ruleExecDependDependencyTag"
    // InternalPackageXML.g:337:1: ruleExecDependDependencyTag : ( ( rule__ExecDependDependencyTag__Group__0 ) ) ;
    public final void ruleExecDependDependencyTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:341:2: ( ( ( rule__ExecDependDependencyTag__Group__0 ) ) )
            // InternalPackageXML.g:342:2: ( ( rule__ExecDependDependencyTag__Group__0 ) )
            {
            // InternalPackageXML.g:342:2: ( ( rule__ExecDependDependencyTag__Group__0 ) )
            // InternalPackageXML.g:343:3: ( rule__ExecDependDependencyTag__Group__0 )
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getGroup()); 
            // InternalPackageXML.g:344:3: ( rule__ExecDependDependencyTag__Group__0 )
            // InternalPackageXML.g:344:4: rule__ExecDependDependencyTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecDependDependencyTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecDependDependencyTag"


    // $ANTLR start "entryRuleBuildToolDependDependencyTag"
    // InternalPackageXML.g:353:1: entryRuleBuildToolDependDependencyTag : ruleBuildToolDependDependencyTag EOF ;
    public final void entryRuleBuildToolDependDependencyTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:354:1: ( ruleBuildToolDependDependencyTag EOF )
            // InternalPackageXML.g:355:1: ruleBuildToolDependDependencyTag EOF
            {
             before(grammarAccess.getBuildToolDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            ruleBuildToolDependDependencyTag();

            state._fsp--;

             after(grammarAccess.getBuildToolDependDependencyTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBuildToolDependDependencyTag"


    // $ANTLR start "ruleBuildToolDependDependencyTag"
    // InternalPackageXML.g:362:1: ruleBuildToolDependDependencyTag : ( ( rule__BuildToolDependDependencyTag__Group__0 ) ) ;
    public final void ruleBuildToolDependDependencyTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:366:2: ( ( ( rule__BuildToolDependDependencyTag__Group__0 ) ) )
            // InternalPackageXML.g:367:2: ( ( rule__BuildToolDependDependencyTag__Group__0 ) )
            {
            // InternalPackageXML.g:367:2: ( ( rule__BuildToolDependDependencyTag__Group__0 ) )
            // InternalPackageXML.g:368:3: ( rule__BuildToolDependDependencyTag__Group__0 )
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getGroup()); 
            // InternalPackageXML.g:369:3: ( rule__BuildToolDependDependencyTag__Group__0 )
            // InternalPackageXML.g:369:4: rule__BuildToolDependDependencyTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBuildToolDependDependencyTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBuildToolDependDependencyTag"


    // $ANTLR start "entryRuleExportTag"
    // InternalPackageXML.g:378:1: entryRuleExportTag : ruleExportTag EOF ;
    public final void entryRuleExportTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:379:1: ( ruleExportTag EOF )
            // InternalPackageXML.g:380:1: ruleExportTag EOF
            {
             before(grammarAccess.getExportTagRule()); 
            pushFollow(FOLLOW_1);
            ruleExportTag();

            state._fsp--;

             after(grammarAccess.getExportTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExportTag"


    // $ANTLR start "ruleExportTag"
    // InternalPackageXML.g:387:1: ruleExportTag : ( ( rule__ExportTag__Group__0 ) ) ;
    public final void ruleExportTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:391:2: ( ( ( rule__ExportTag__Group__0 ) ) )
            // InternalPackageXML.g:392:2: ( ( rule__ExportTag__Group__0 ) )
            {
            // InternalPackageXML.g:392:2: ( ( rule__ExportTag__Group__0 ) )
            // InternalPackageXML.g:393:3: ( rule__ExportTag__Group__0 )
            {
             before(grammarAccess.getExportTagAccess().getGroup()); 
            // InternalPackageXML.g:394:3: ( rule__ExportTag__Group__0 )
            // InternalPackageXML.g:394:4: rule__ExportTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExportTag"


    // $ANTLR start "entryRuleAuthorTag"
    // InternalPackageXML.g:403:1: entryRuleAuthorTag : ruleAuthorTag EOF ;
    public final void entryRuleAuthorTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:404:1: ( ruleAuthorTag EOF )
            // InternalPackageXML.g:405:1: ruleAuthorTag EOF
            {
             before(grammarAccess.getAuthorTagRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthorTag();

            state._fsp--;

             after(grammarAccess.getAuthorTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthorTag"


    // $ANTLR start "ruleAuthorTag"
    // InternalPackageXML.g:412:1: ruleAuthorTag : ( ( rule__AuthorTag__Group__0 ) ) ;
    public final void ruleAuthorTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:416:2: ( ( ( rule__AuthorTag__Group__0 ) ) )
            // InternalPackageXML.g:417:2: ( ( rule__AuthorTag__Group__0 ) )
            {
            // InternalPackageXML.g:417:2: ( ( rule__AuthorTag__Group__0 ) )
            // InternalPackageXML.g:418:3: ( rule__AuthorTag__Group__0 )
            {
             before(grammarAccess.getAuthorTagAccess().getGroup()); 
            // InternalPackageXML.g:419:3: ( rule__AuthorTag__Group__0 )
            // InternalPackageXML.g:419:4: rule__AuthorTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthorTag"


    // $ANTLR start "entryRuleUrlTag"
    // InternalPackageXML.g:428:1: entryRuleUrlTag : ruleUrlTag EOF ;
    public final void entryRuleUrlTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:429:1: ( ruleUrlTag EOF )
            // InternalPackageXML.g:430:1: ruleUrlTag EOF
            {
             before(grammarAccess.getUrlTagRule()); 
            pushFollow(FOLLOW_1);
            ruleUrlTag();

            state._fsp--;

             after(grammarAccess.getUrlTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlTag"


    // $ANTLR start "ruleUrlTag"
    // InternalPackageXML.g:437:1: ruleUrlTag : ( ( rule__UrlTag__Group__0 ) ) ;
    public final void ruleUrlTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:441:2: ( ( ( rule__UrlTag__Group__0 ) ) )
            // InternalPackageXML.g:442:2: ( ( rule__UrlTag__Group__0 ) )
            {
            // InternalPackageXML.g:442:2: ( ( rule__UrlTag__Group__0 ) )
            // InternalPackageXML.g:443:3: ( rule__UrlTag__Group__0 )
            {
             before(grammarAccess.getUrlTagAccess().getGroup()); 
            // InternalPackageXML.g:444:3: ( rule__UrlTag__Group__0 )
            // InternalPackageXML.g:444:4: rule__UrlTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlTag"


    // $ANTLR start "entryRuleArbitraryTag"
    // InternalPackageXML.g:453:1: entryRuleArbitraryTag : ruleArbitraryTag EOF ;
    public final void entryRuleArbitraryTag() throws RecognitionException {
        try {
            // InternalPackageXML.g:454:1: ( ruleArbitraryTag EOF )
            // InternalPackageXML.g:455:1: ruleArbitraryTag EOF
            {
             before(grammarAccess.getArbitraryTagRule()); 
            pushFollow(FOLLOW_1);
            ruleArbitraryTag();

            state._fsp--;

             after(grammarAccess.getArbitraryTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArbitraryTag"


    // $ANTLR start "ruleArbitraryTag"
    // InternalPackageXML.g:462:1: ruleArbitraryTag : ( ( rule__ArbitraryTag__Group__0 ) ) ;
    public final void ruleArbitraryTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:466:2: ( ( ( rule__ArbitraryTag__Group__0 ) ) )
            // InternalPackageXML.g:467:2: ( ( rule__ArbitraryTag__Group__0 ) )
            {
            // InternalPackageXML.g:467:2: ( ( rule__ArbitraryTag__Group__0 ) )
            // InternalPackageXML.g:468:3: ( rule__ArbitraryTag__Group__0 )
            {
             before(grammarAccess.getArbitraryTagAccess().getGroup()); 
            // InternalPackageXML.g:469:3: ( rule__ArbitraryTag__Group__0 )
            // InternalPackageXML.g:469:4: rule__ArbitraryTag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArbitraryTag"


    // $ANTLR start "entryRuleAttribute"
    // InternalPackageXML.g:478:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPackageXML.g:479:1: ( ruleAttribute EOF )
            // InternalPackageXML.g:480:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPackageXML.g:487:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:491:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPackageXML.g:492:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPackageXML.g:492:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPackageXML.g:493:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPackageXML.g:494:3: ( rule__Attribute__Group__0 )
            // InternalPackageXML.g:494:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Tag__Alternatives"
    // InternalPackageXML.g:502:1: rule__Tag__Alternatives : ( ( ruleNameTag ) | ( ruleVersionTag ) | ( ruleDescriptionTag ) | ( ruleMaintainerTag ) | ( ruleLicenseTag ) | ( ruleDependencyTag ) | ( ruleExportTag ) | ( ruleAuthorTag ) | ( ruleUrlTag ) | ( ruleArbitraryTag ) );
    public final void rule__Tag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:506:1: ( ( ruleNameTag ) | ( ruleVersionTag ) | ( ruleDescriptionTag ) | ( ruleMaintainerTag ) | ( ruleLicenseTag ) | ( ruleDependencyTag ) | ( ruleExportTag ) | ( ruleAuthorTag ) | ( ruleUrlTag ) | ( ruleArbitraryTag ) )
            int alt1=10;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalPackageXML.g:507:2: ( ruleNameTag )
                    {
                    // InternalPackageXML.g:507:2: ( ruleNameTag )
                    // InternalPackageXML.g:508:3: ruleNameTag
                    {
                     before(grammarAccess.getTagAccess().getNameTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNameTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getNameTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:513:2: ( ruleVersionTag )
                    {
                    // InternalPackageXML.g:513:2: ( ruleVersionTag )
                    // InternalPackageXML.g:514:3: ruleVersionTag
                    {
                     before(grammarAccess.getTagAccess().getVersionTagParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVersionTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getVersionTagParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPackageXML.g:519:2: ( ruleDescriptionTag )
                    {
                    // InternalPackageXML.g:519:2: ( ruleDescriptionTag )
                    // InternalPackageXML.g:520:3: ruleDescriptionTag
                    {
                     before(grammarAccess.getTagAccess().getDescriptionTagParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDescriptionTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getDescriptionTagParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPackageXML.g:525:2: ( ruleMaintainerTag )
                    {
                    // InternalPackageXML.g:525:2: ( ruleMaintainerTag )
                    // InternalPackageXML.g:526:3: ruleMaintainerTag
                    {
                     before(grammarAccess.getTagAccess().getMaintainerTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMaintainerTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getMaintainerTagParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPackageXML.g:531:2: ( ruleLicenseTag )
                    {
                    // InternalPackageXML.g:531:2: ( ruleLicenseTag )
                    // InternalPackageXML.g:532:3: ruleLicenseTag
                    {
                     before(grammarAccess.getTagAccess().getLicenseTagParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLicenseTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getLicenseTagParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPackageXML.g:537:2: ( ruleDependencyTag )
                    {
                    // InternalPackageXML.g:537:2: ( ruleDependencyTag )
                    // InternalPackageXML.g:538:3: ruleDependencyTag
                    {
                     before(grammarAccess.getTagAccess().getDependencyTagParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDependencyTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getDependencyTagParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPackageXML.g:543:2: ( ruleExportTag )
                    {
                    // InternalPackageXML.g:543:2: ( ruleExportTag )
                    // InternalPackageXML.g:544:3: ruleExportTag
                    {
                     before(grammarAccess.getTagAccess().getExportTagParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleExportTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getExportTagParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalPackageXML.g:549:2: ( ruleAuthorTag )
                    {
                    // InternalPackageXML.g:549:2: ( ruleAuthorTag )
                    // InternalPackageXML.g:550:3: ruleAuthorTag
                    {
                     before(grammarAccess.getTagAccess().getAuthorTagParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleAuthorTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getAuthorTagParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalPackageXML.g:555:2: ( ruleUrlTag )
                    {
                    // InternalPackageXML.g:555:2: ( ruleUrlTag )
                    // InternalPackageXML.g:556:3: ruleUrlTag
                    {
                     before(grammarAccess.getTagAccess().getUrlTagParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleUrlTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getUrlTagParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalPackageXML.g:561:2: ( ruleArbitraryTag )
                    {
                    // InternalPackageXML.g:561:2: ( ruleArbitraryTag )
                    // InternalPackageXML.g:562:3: ruleArbitraryTag
                    {
                     before(grammarAccess.getTagAccess().getArbitraryTagParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleArbitraryTag();

                    state._fsp--;

                     after(grammarAccess.getTagAccess().getArbitraryTagParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Alternatives"


    // $ANTLR start "rule__DescriptionTag__DescriptionTextAlternatives_4_0"
    // InternalPackageXML.g:571:1: rule__DescriptionTag__DescriptionTextAlternatives_4_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__DescriptionTag__DescriptionTextAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:575:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPackageXML.g:576:2: ( RULE_ID )
                    {
                    // InternalPackageXML.g:576:2: ( RULE_ID )
                    // InternalPackageXML.g:577:3: RULE_ID
                    {
                     before(grammarAccess.getDescriptionTagAccess().getDescriptionTextIDTerminalRuleCall_4_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getDescriptionTagAccess().getDescriptionTextIDTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:582:2: ( RULE_STRING )
                    {
                    // InternalPackageXML.g:582:2: ( RULE_STRING )
                    // InternalPackageXML.g:583:3: RULE_STRING
                    {
                     before(grammarAccess.getDescriptionTagAccess().getDescriptionTextSTRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getDescriptionTagAccess().getDescriptionTextSTRINGTerminalRuleCall_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__DescriptionTextAlternatives_4_0"


    // $ANTLR start "rule__MaintainerTag__MaintainerTextAlternatives_6_0"
    // InternalPackageXML.g:592:1: rule__MaintainerTag__MaintainerTextAlternatives_6_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__MaintainerTag__MaintainerTextAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:596:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPackageXML.g:597:2: ( RULE_ID )
                    {
                    // InternalPackageXML.g:597:2: ( RULE_ID )
                    // InternalPackageXML.g:598:3: RULE_ID
                    {
                     before(grammarAccess.getMaintainerTagAccess().getMaintainerTextIDTerminalRuleCall_6_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getMaintainerTagAccess().getMaintainerTextIDTerminalRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:603:2: ( RULE_STRING )
                    {
                    // InternalPackageXML.g:603:2: ( RULE_STRING )
                    // InternalPackageXML.g:604:3: RULE_STRING
                    {
                     before(grammarAccess.getMaintainerTagAccess().getMaintainerTextSTRINGTerminalRuleCall_6_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getMaintainerTagAccess().getMaintainerTextSTRINGTerminalRuleCall_6_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__MaintainerTextAlternatives_6_0"


    // $ANTLR start "rule__DependencyTag__Alternatives"
    // InternalPackageXML.g:613:1: rule__DependencyTag__Alternatives : ( ( ruleBuildDependDependencyTag ) | ( ruleExecDependDependencyTag ) | ( ruleBuildToolDependDependencyTag ) | ( ruleRunDependencyTag ) );
    public final void rule__DependencyTag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:617:1: ( ( ruleBuildDependDependencyTag ) | ( ruleExecDependDependencyTag ) | ( ruleBuildToolDependDependencyTag ) | ( ruleRunDependencyTag ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt4=2;
                    }
                    break;
                case 27:
                    {
                    alt4=4;
                    }
                    break;
                case 28:
                    {
                    alt4=1;
                    }
                    break;
                case 30:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPackageXML.g:618:2: ( ruleBuildDependDependencyTag )
                    {
                    // InternalPackageXML.g:618:2: ( ruleBuildDependDependencyTag )
                    // InternalPackageXML.g:619:3: ruleBuildDependDependencyTag
                    {
                     before(grammarAccess.getDependencyTagAccess().getBuildDependDependencyTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBuildDependDependencyTag();

                    state._fsp--;

                     after(grammarAccess.getDependencyTagAccess().getBuildDependDependencyTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:624:2: ( ruleExecDependDependencyTag )
                    {
                    // InternalPackageXML.g:624:2: ( ruleExecDependDependencyTag )
                    // InternalPackageXML.g:625:3: ruleExecDependDependencyTag
                    {
                     before(grammarAccess.getDependencyTagAccess().getExecDependDependencyTagParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExecDependDependencyTag();

                    state._fsp--;

                     after(grammarAccess.getDependencyTagAccess().getExecDependDependencyTagParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPackageXML.g:630:2: ( ruleBuildToolDependDependencyTag )
                    {
                    // InternalPackageXML.g:630:2: ( ruleBuildToolDependDependencyTag )
                    // InternalPackageXML.g:631:3: ruleBuildToolDependDependencyTag
                    {
                     before(grammarAccess.getDependencyTagAccess().getBuildToolDependDependencyTagParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBuildToolDependDependencyTag();

                    state._fsp--;

                     after(grammarAccess.getDependencyTagAccess().getBuildToolDependDependencyTagParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPackageXML.g:636:2: ( ruleRunDependencyTag )
                    {
                    // InternalPackageXML.g:636:2: ( ruleRunDependencyTag )
                    // InternalPackageXML.g:637:3: ruleRunDependencyTag
                    {
                     before(grammarAccess.getDependencyTagAccess().getRunDependencyTagParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRunDependencyTag();

                    state._fsp--;

                     after(grammarAccess.getDependencyTagAccess().getRunDependencyTagParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DependencyTag__Alternatives"


    // $ANTLR start "rule__AuthorTag__AuthorTextAlternatives_5_0"
    // InternalPackageXML.g:646:1: rule__AuthorTag__AuthorTextAlternatives_5_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AuthorTag__AuthorTextAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:650:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPackageXML.g:651:2: ( RULE_ID )
                    {
                    // InternalPackageXML.g:651:2: ( RULE_ID )
                    // InternalPackageXML.g:652:3: RULE_ID
                    {
                     before(grammarAccess.getAuthorTagAccess().getAuthorTextIDTerminalRuleCall_5_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAuthorTagAccess().getAuthorTextIDTerminalRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:657:2: ( RULE_STRING )
                    {
                    // InternalPackageXML.g:657:2: ( RULE_STRING )
                    // InternalPackageXML.g:658:3: RULE_STRING
                    {
                     before(grammarAccess.getAuthorTagAccess().getAuthorTextSTRINGTerminalRuleCall_5_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAuthorTagAccess().getAuthorTextSTRINGTerminalRuleCall_5_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__AuthorTextAlternatives_5_0"


    // $ANTLR start "rule__ArbitraryTag__Alternatives_3"
    // InternalPackageXML.g:667:1: rule__ArbitraryTag__Alternatives_3 : ( ( ( rule__ArbitraryTag__Group_3_0__0 ) ) | ( ( rule__ArbitraryTag__Group_3_1__0 ) ) );
    public final void rule__ArbitraryTag__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:671:1: ( ( ( rule__ArbitraryTag__Group_3_0__0 ) ) | ( ( rule__ArbitraryTag__Group_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPackageXML.g:672:2: ( ( rule__ArbitraryTag__Group_3_0__0 ) )
                    {
                    // InternalPackageXML.g:672:2: ( ( rule__ArbitraryTag__Group_3_0__0 ) )
                    // InternalPackageXML.g:673:3: ( rule__ArbitraryTag__Group_3_0__0 )
                    {
                     before(grammarAccess.getArbitraryTagAccess().getGroup_3_0()); 
                    // InternalPackageXML.g:674:3: ( rule__ArbitraryTag__Group_3_0__0 )
                    // InternalPackageXML.g:674:4: rule__ArbitraryTag__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArbitraryTag__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArbitraryTagAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:678:2: ( ( rule__ArbitraryTag__Group_3_1__0 ) )
                    {
                    // InternalPackageXML.g:678:2: ( ( rule__ArbitraryTag__Group_3_1__0 ) )
                    // InternalPackageXML.g:679:3: ( rule__ArbitraryTag__Group_3_1__0 )
                    {
                     before(grammarAccess.getArbitraryTagAccess().getGroup_3_1()); 
                    // InternalPackageXML.g:680:3: ( rule__ArbitraryTag__Group_3_1__0 )
                    // InternalPackageXML.g:680:4: rule__ArbitraryTag__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArbitraryTag__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArbitraryTagAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Alternatives_3"


    // $ANTLR start "rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0"
    // InternalPackageXML.g:688:1: rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:692:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPackageXML.g:693:2: ( RULE_ID )
                    {
                    // InternalPackageXML.g:693:2: ( RULE_ID )
                    // InternalPackageXML.g:694:3: RULE_ID
                    {
                     before(grammarAccess.getArbitraryTagAccess().getInnerTextIDTerminalRuleCall_3_1_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getArbitraryTagAccess().getInnerTextIDTerminalRuleCall_3_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:699:2: ( RULE_STRING )
                    {
                    // InternalPackageXML.g:699:2: ( RULE_STRING )
                    // InternalPackageXML.g:700:3: RULE_STRING
                    {
                     before(grammarAccess.getArbitraryTagAccess().getInnerTextSTRINGTerminalRuleCall_3_1_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getArbitraryTagAccess().getInnerTextSTRINGTerminalRuleCall_3_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0"


    // $ANTLR start "rule__Package__Group__0"
    // InternalPackageXML.g:709:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:713:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalPackageXML.g:714:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalPackageXML.g:721:1: rule__Package__Group__0__Impl : ( '<?' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:725:1: ( ( '<?' ) )
            // InternalPackageXML.g:726:1: ( '<?' )
            {
            // InternalPackageXML.g:726:1: ( '<?' )
            // InternalPackageXML.g:727:2: '<?'
            {
             before(grammarAccess.getPackageAccess().getLessThanSignQuestionMarkKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLessThanSignQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalPackageXML.g:736:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:740:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalPackageXML.g:741:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalPackageXML.g:748:1: rule__Package__Group__1__Impl : ( 'xml' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:752:1: ( ( 'xml' ) )
            // InternalPackageXML.g:753:1: ( 'xml' )
            {
            // InternalPackageXML.g:753:1: ( 'xml' )
            // InternalPackageXML.g:754:2: 'xml'
            {
             before(grammarAccess.getPackageAccess().getXmlKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getXmlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalPackageXML.g:763:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:767:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalPackageXML.g:768:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalPackageXML.g:775:1: rule__Package__Group__2__Impl : ( 'version' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:779:1: ( ( 'version' ) )
            // InternalPackageXML.g:780:1: ( 'version' )
            {
            // InternalPackageXML.g:780:1: ( 'version' )
            // InternalPackageXML.g:781:2: 'version'
            {
             before(grammarAccess.getPackageAccess().getVersionKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getVersionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalPackageXML.g:790:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:794:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalPackageXML.g:795:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalPackageXML.g:802:1: rule__Package__Group__3__Impl : ( '=' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:806:1: ( ( '=' ) )
            // InternalPackageXML.g:807:1: ( '=' )
            {
            // InternalPackageXML.g:807:1: ( '=' )
            // InternalPackageXML.g:808:2: '='
            {
             before(grammarAccess.getPackageAccess().getEqualsSignKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalPackageXML.g:817:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:821:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalPackageXML.g:822:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalPackageXML.g:829:1: rule__Package__Group__4__Impl : ( ( rule__Package__VersionAssignment_4 ) ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:833:1: ( ( ( rule__Package__VersionAssignment_4 ) ) )
            // InternalPackageXML.g:834:1: ( ( rule__Package__VersionAssignment_4 ) )
            {
            // InternalPackageXML.g:834:1: ( ( rule__Package__VersionAssignment_4 ) )
            // InternalPackageXML.g:835:2: ( rule__Package__VersionAssignment_4 )
            {
             before(grammarAccess.getPackageAccess().getVersionAssignment_4()); 
            // InternalPackageXML.g:836:2: ( rule__Package__VersionAssignment_4 )
            // InternalPackageXML.g:836:3: rule__Package__VersionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Package__VersionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getVersionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalPackageXML.g:844:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:848:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalPackageXML.g:849:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalPackageXML.g:856:1: rule__Package__Group__5__Impl : ( '?>' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:860:1: ( ( '?>' ) )
            // InternalPackageXML.g:861:1: ( '?>' )
            {
            // InternalPackageXML.g:861:1: ( '?>' )
            // InternalPackageXML.g:862:2: '?>'
            {
             before(grammarAccess.getPackageAccess().getQuestionMarkGreaterThanSignKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getQuestionMarkGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // InternalPackageXML.g:871:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:875:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalPackageXML.g:876:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalPackageXML.g:883:1: rule__Package__Group__6__Impl : ( '<' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:887:1: ( ( '<' ) )
            // InternalPackageXML.g:888:1: ( '<' )
            {
            // InternalPackageXML.g:888:1: ( '<' )
            // InternalPackageXML.g:889:2: '<'
            {
             before(grammarAccess.getPackageAccess().getLessThanSignKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLessThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // InternalPackageXML.g:898:1: rule__Package__Group__7 : rule__Package__Group__7__Impl rule__Package__Group__8 ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:902:1: ( rule__Package__Group__7__Impl rule__Package__Group__8 )
            // InternalPackageXML.g:903:2: rule__Package__Group__7__Impl rule__Package__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // InternalPackageXML.g:910:1: rule__Package__Group__7__Impl : ( 'package' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:914:1: ( ( 'package' ) )
            // InternalPackageXML.g:915:1: ( 'package' )
            {
            // InternalPackageXML.g:915:1: ( 'package' )
            // InternalPackageXML.g:916:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group__8"
    // InternalPackageXML.g:925:1: rule__Package__Group__8 : rule__Package__Group__8__Impl rule__Package__Group__9 ;
    public final void rule__Package__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:929:1: ( rule__Package__Group__8__Impl rule__Package__Group__9 )
            // InternalPackageXML.g:930:2: rule__Package__Group__8__Impl rule__Package__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__8"


    // $ANTLR start "rule__Package__Group__8__Impl"
    // InternalPackageXML.g:937:1: rule__Package__Group__8__Impl : ( 'format' ) ;
    public final void rule__Package__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:941:1: ( ( 'format' ) )
            // InternalPackageXML.g:942:1: ( 'format' )
            {
            // InternalPackageXML.g:942:1: ( 'format' )
            // InternalPackageXML.g:943:2: 'format'
            {
             before(grammarAccess.getPackageAccess().getFormatKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getFormatKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__8__Impl"


    // $ANTLR start "rule__Package__Group__9"
    // InternalPackageXML.g:952:1: rule__Package__Group__9 : rule__Package__Group__9__Impl rule__Package__Group__10 ;
    public final void rule__Package__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:956:1: ( rule__Package__Group__9__Impl rule__Package__Group__10 )
            // InternalPackageXML.g:957:2: rule__Package__Group__9__Impl rule__Package__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__9"


    // $ANTLR start "rule__Package__Group__9__Impl"
    // InternalPackageXML.g:964:1: rule__Package__Group__9__Impl : ( '=' ) ;
    public final void rule__Package__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:968:1: ( ( '=' ) )
            // InternalPackageXML.g:969:1: ( '=' )
            {
            // InternalPackageXML.g:969:1: ( '=' )
            // InternalPackageXML.g:970:2: '='
            {
             before(grammarAccess.getPackageAccess().getEqualsSignKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getEqualsSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__9__Impl"


    // $ANTLR start "rule__Package__Group__10"
    // InternalPackageXML.g:979:1: rule__Package__Group__10 : rule__Package__Group__10__Impl rule__Package__Group__11 ;
    public final void rule__Package__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:983:1: ( rule__Package__Group__10__Impl rule__Package__Group__11 )
            // InternalPackageXML.g:984:2: rule__Package__Group__10__Impl rule__Package__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__10"


    // $ANTLR start "rule__Package__Group__10__Impl"
    // InternalPackageXML.g:991:1: rule__Package__Group__10__Impl : ( ( rule__Package__FormatAssignment_10 ) ) ;
    public final void rule__Package__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:995:1: ( ( ( rule__Package__FormatAssignment_10 ) ) )
            // InternalPackageXML.g:996:1: ( ( rule__Package__FormatAssignment_10 ) )
            {
            // InternalPackageXML.g:996:1: ( ( rule__Package__FormatAssignment_10 ) )
            // InternalPackageXML.g:997:2: ( rule__Package__FormatAssignment_10 )
            {
             before(grammarAccess.getPackageAccess().getFormatAssignment_10()); 
            // InternalPackageXML.g:998:2: ( rule__Package__FormatAssignment_10 )
            // InternalPackageXML.g:998:3: rule__Package__FormatAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Package__FormatAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getFormatAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__10__Impl"


    // $ANTLR start "rule__Package__Group__11"
    // InternalPackageXML.g:1006:1: rule__Package__Group__11 : rule__Package__Group__11__Impl rule__Package__Group__12 ;
    public final void rule__Package__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1010:1: ( rule__Package__Group__11__Impl rule__Package__Group__12 )
            // InternalPackageXML.g:1011:2: rule__Package__Group__11__Impl rule__Package__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__11"


    // $ANTLR start "rule__Package__Group__11__Impl"
    // InternalPackageXML.g:1018:1: rule__Package__Group__11__Impl : ( '>' ) ;
    public final void rule__Package__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1022:1: ( ( '>' ) )
            // InternalPackageXML.g:1023:1: ( '>' )
            {
            // InternalPackageXML.g:1023:1: ( '>' )
            // InternalPackageXML.g:1024:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__11__Impl"


    // $ANTLR start "rule__Package__Group__12"
    // InternalPackageXML.g:1033:1: rule__Package__Group__12 : rule__Package__Group__12__Impl rule__Package__Group__13 ;
    public final void rule__Package__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1037:1: ( rule__Package__Group__12__Impl rule__Package__Group__13 )
            // InternalPackageXML.g:1038:2: rule__Package__Group__12__Impl rule__Package__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__12"


    // $ANTLR start "rule__Package__Group__12__Impl"
    // InternalPackageXML.g:1045:1: rule__Package__Group__12__Impl : ( ( rule__Package__TagsAssignment_12 )* ) ;
    public final void rule__Package__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1049:1: ( ( ( rule__Package__TagsAssignment_12 )* ) )
            // InternalPackageXML.g:1050:1: ( ( rule__Package__TagsAssignment_12 )* )
            {
            // InternalPackageXML.g:1050:1: ( ( rule__Package__TagsAssignment_12 )* )
            // InternalPackageXML.g:1051:2: ( rule__Package__TagsAssignment_12 )*
            {
             before(grammarAccess.getPackageAccess().getTagsAssignment_12()); 
            // InternalPackageXML.g:1052:2: ( rule__Package__TagsAssignment_12 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID||LA8_1==14||(LA8_1>=22 && LA8_1<=24)||(LA8_1>=26 && LA8_1<=33)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalPackageXML.g:1052:3: rule__Package__TagsAssignment_12
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Package__TagsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getTagsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__12__Impl"


    // $ANTLR start "rule__Package__Group__13"
    // InternalPackageXML.g:1060:1: rule__Package__Group__13 : rule__Package__Group__13__Impl rule__Package__Group__14 ;
    public final void rule__Package__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1064:1: ( rule__Package__Group__13__Impl rule__Package__Group__14 )
            // InternalPackageXML.g:1065:2: rule__Package__Group__13__Impl rule__Package__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Package__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__13"


    // $ANTLR start "rule__Package__Group__13__Impl"
    // InternalPackageXML.g:1072:1: rule__Package__Group__13__Impl : ( '<' ) ;
    public final void rule__Package__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1076:1: ( ( '<' ) )
            // InternalPackageXML.g:1077:1: ( '<' )
            {
            // InternalPackageXML.g:1077:1: ( '<' )
            // InternalPackageXML.g:1078:2: '<'
            {
             before(grammarAccess.getPackageAccess().getLessThanSignKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLessThanSignKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__13__Impl"


    // $ANTLR start "rule__Package__Group__14"
    // InternalPackageXML.g:1087:1: rule__Package__Group__14 : rule__Package__Group__14__Impl rule__Package__Group__15 ;
    public final void rule__Package__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1091:1: ( rule__Package__Group__14__Impl rule__Package__Group__15 )
            // InternalPackageXML.g:1092:2: rule__Package__Group__14__Impl rule__Package__Group__15
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__14"


    // $ANTLR start "rule__Package__Group__14__Impl"
    // InternalPackageXML.g:1099:1: rule__Package__Group__14__Impl : ( '/' ) ;
    public final void rule__Package__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1103:1: ( ( '/' ) )
            // InternalPackageXML.g:1104:1: ( '/' )
            {
            // InternalPackageXML.g:1104:1: ( '/' )
            // InternalPackageXML.g:1105:2: '/'
            {
             before(grammarAccess.getPackageAccess().getSolidusKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getSolidusKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__14__Impl"


    // $ANTLR start "rule__Package__Group__15"
    // InternalPackageXML.g:1114:1: rule__Package__Group__15 : rule__Package__Group__15__Impl rule__Package__Group__16 ;
    public final void rule__Package__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1118:1: ( rule__Package__Group__15__Impl rule__Package__Group__16 )
            // InternalPackageXML.g:1119:2: rule__Package__Group__15__Impl rule__Package__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__15"


    // $ANTLR start "rule__Package__Group__15__Impl"
    // InternalPackageXML.g:1126:1: rule__Package__Group__15__Impl : ( 'package' ) ;
    public final void rule__Package__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1130:1: ( ( 'package' ) )
            // InternalPackageXML.g:1131:1: ( 'package' )
            {
            // InternalPackageXML.g:1131:1: ( 'package' )
            // InternalPackageXML.g:1132:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_15()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__15__Impl"


    // $ANTLR start "rule__Package__Group__16"
    // InternalPackageXML.g:1141:1: rule__Package__Group__16 : rule__Package__Group__16__Impl ;
    public final void rule__Package__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1145:1: ( rule__Package__Group__16__Impl )
            // InternalPackageXML.g:1146:2: rule__Package__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__16"


    // $ANTLR start "rule__Package__Group__16__Impl"
    // InternalPackageXML.g:1152:1: rule__Package__Group__16__Impl : ( '>' ) ;
    public final void rule__Package__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1156:1: ( ( '>' ) )
            // InternalPackageXML.g:1157:1: ( '>' )
            {
            // InternalPackageXML.g:1157:1: ( '>' )
            // InternalPackageXML.g:1158:2: '>'
            {
             before(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_16()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getGreaterThanSignKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__16__Impl"


    // $ANTLR start "rule__NameTag__Group__0"
    // InternalPackageXML.g:1168:1: rule__NameTag__Group__0 : rule__NameTag__Group__0__Impl rule__NameTag__Group__1 ;
    public final void rule__NameTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1172:1: ( rule__NameTag__Group__0__Impl rule__NameTag__Group__1 )
            // InternalPackageXML.g:1173:2: rule__NameTag__Group__0__Impl rule__NameTag__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__NameTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__0"


    // $ANTLR start "rule__NameTag__Group__0__Impl"
    // InternalPackageXML.g:1180:1: rule__NameTag__Group__0__Impl : ( '<' ) ;
    public final void rule__NameTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1184:1: ( ( '<' ) )
            // InternalPackageXML.g:1185:1: ( '<' )
            {
            // InternalPackageXML.g:1185:1: ( '<' )
            // InternalPackageXML.g:1186:2: '<'
            {
             before(grammarAccess.getNameTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__0__Impl"


    // $ANTLR start "rule__NameTag__Group__1"
    // InternalPackageXML.g:1195:1: rule__NameTag__Group__1 : rule__NameTag__Group__1__Impl rule__NameTag__Group__2 ;
    public final void rule__NameTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1199:1: ( rule__NameTag__Group__1__Impl rule__NameTag__Group__2 )
            // InternalPackageXML.g:1200:2: rule__NameTag__Group__1__Impl rule__NameTag__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NameTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__1"


    // $ANTLR start "rule__NameTag__Group__1__Impl"
    // InternalPackageXML.g:1207:1: rule__NameTag__Group__1__Impl : ( 'name' ) ;
    public final void rule__NameTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1211:1: ( ( 'name' ) )
            // InternalPackageXML.g:1212:1: ( 'name' )
            {
            // InternalPackageXML.g:1212:1: ( 'name' )
            // InternalPackageXML.g:1213:2: 'name'
            {
             before(grammarAccess.getNameTagAccess().getNameKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__1__Impl"


    // $ANTLR start "rule__NameTag__Group__2"
    // InternalPackageXML.g:1222:1: rule__NameTag__Group__2 : rule__NameTag__Group__2__Impl rule__NameTag__Group__3 ;
    public final void rule__NameTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1226:1: ( rule__NameTag__Group__2__Impl rule__NameTag__Group__3 )
            // InternalPackageXML.g:1227:2: rule__NameTag__Group__2__Impl rule__NameTag__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__NameTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__2"


    // $ANTLR start "rule__NameTag__Group__2__Impl"
    // InternalPackageXML.g:1234:1: rule__NameTag__Group__2__Impl : ( '>' ) ;
    public final void rule__NameTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1238:1: ( ( '>' ) )
            // InternalPackageXML.g:1239:1: ( '>' )
            {
            // InternalPackageXML.g:1239:1: ( '>' )
            // InternalPackageXML.g:1240:2: '>'
            {
             before(grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__2__Impl"


    // $ANTLR start "rule__NameTag__Group__3"
    // InternalPackageXML.g:1249:1: rule__NameTag__Group__3 : rule__NameTag__Group__3__Impl rule__NameTag__Group__4 ;
    public final void rule__NameTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1253:1: ( rule__NameTag__Group__3__Impl rule__NameTag__Group__4 )
            // InternalPackageXML.g:1254:2: rule__NameTag__Group__3__Impl rule__NameTag__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__NameTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__3"


    // $ANTLR start "rule__NameTag__Group__3__Impl"
    // InternalPackageXML.g:1261:1: rule__NameTag__Group__3__Impl : ( ( rule__NameTag__DeclaredPackageNameAssignment_3 ) ) ;
    public final void rule__NameTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1265:1: ( ( ( rule__NameTag__DeclaredPackageNameAssignment_3 ) ) )
            // InternalPackageXML.g:1266:1: ( ( rule__NameTag__DeclaredPackageNameAssignment_3 ) )
            {
            // InternalPackageXML.g:1266:1: ( ( rule__NameTag__DeclaredPackageNameAssignment_3 ) )
            // InternalPackageXML.g:1267:2: ( rule__NameTag__DeclaredPackageNameAssignment_3 )
            {
             before(grammarAccess.getNameTagAccess().getDeclaredPackageNameAssignment_3()); 
            // InternalPackageXML.g:1268:2: ( rule__NameTag__DeclaredPackageNameAssignment_3 )
            // InternalPackageXML.g:1268:3: rule__NameTag__DeclaredPackageNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NameTag__DeclaredPackageNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNameTagAccess().getDeclaredPackageNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__3__Impl"


    // $ANTLR start "rule__NameTag__Group__4"
    // InternalPackageXML.g:1276:1: rule__NameTag__Group__4 : rule__NameTag__Group__4__Impl rule__NameTag__Group__5 ;
    public final void rule__NameTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1280:1: ( rule__NameTag__Group__4__Impl rule__NameTag__Group__5 )
            // InternalPackageXML.g:1281:2: rule__NameTag__Group__4__Impl rule__NameTag__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__NameTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__4"


    // $ANTLR start "rule__NameTag__Group__4__Impl"
    // InternalPackageXML.g:1288:1: rule__NameTag__Group__4__Impl : ( '<' ) ;
    public final void rule__NameTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1292:1: ( ( '<' ) )
            // InternalPackageXML.g:1293:1: ( '<' )
            {
            // InternalPackageXML.g:1293:1: ( '<' )
            // InternalPackageXML.g:1294:2: '<'
            {
             before(grammarAccess.getNameTagAccess().getLessThanSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__4__Impl"


    // $ANTLR start "rule__NameTag__Group__5"
    // InternalPackageXML.g:1303:1: rule__NameTag__Group__5 : rule__NameTag__Group__5__Impl rule__NameTag__Group__6 ;
    public final void rule__NameTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1307:1: ( rule__NameTag__Group__5__Impl rule__NameTag__Group__6 )
            // InternalPackageXML.g:1308:2: rule__NameTag__Group__5__Impl rule__NameTag__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__NameTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__5"


    // $ANTLR start "rule__NameTag__Group__5__Impl"
    // InternalPackageXML.g:1315:1: rule__NameTag__Group__5__Impl : ( '/' ) ;
    public final void rule__NameTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1319:1: ( ( '/' ) )
            // InternalPackageXML.g:1320:1: ( '/' )
            {
            // InternalPackageXML.g:1320:1: ( '/' )
            // InternalPackageXML.g:1321:2: '/'
            {
             before(grammarAccess.getNameTagAccess().getSolidusKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getSolidusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__5__Impl"


    // $ANTLR start "rule__NameTag__Group__6"
    // InternalPackageXML.g:1330:1: rule__NameTag__Group__6 : rule__NameTag__Group__6__Impl rule__NameTag__Group__7 ;
    public final void rule__NameTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1334:1: ( rule__NameTag__Group__6__Impl rule__NameTag__Group__7 )
            // InternalPackageXML.g:1335:2: rule__NameTag__Group__6__Impl rule__NameTag__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__NameTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__6"


    // $ANTLR start "rule__NameTag__Group__6__Impl"
    // InternalPackageXML.g:1342:1: rule__NameTag__Group__6__Impl : ( 'name' ) ;
    public final void rule__NameTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1346:1: ( ( 'name' ) )
            // InternalPackageXML.g:1347:1: ( 'name' )
            {
            // InternalPackageXML.g:1347:1: ( 'name' )
            // InternalPackageXML.g:1348:2: 'name'
            {
             before(grammarAccess.getNameTagAccess().getNameKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__6__Impl"


    // $ANTLR start "rule__NameTag__Group__7"
    // InternalPackageXML.g:1357:1: rule__NameTag__Group__7 : rule__NameTag__Group__7__Impl ;
    public final void rule__NameTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1361:1: ( rule__NameTag__Group__7__Impl )
            // InternalPackageXML.g:1362:2: rule__NameTag__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameTag__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__7"


    // $ANTLR start "rule__NameTag__Group__7__Impl"
    // InternalPackageXML.g:1368:1: rule__NameTag__Group__7__Impl : ( '>' ) ;
    public final void rule__NameTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1372:1: ( ( '>' ) )
            // InternalPackageXML.g:1373:1: ( '>' )
            {
            // InternalPackageXML.g:1373:1: ( '>' )
            // InternalPackageXML.g:1374:2: '>'
            {
             before(grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__Group__7__Impl"


    // $ANTLR start "rule__VersionTag__Group__0"
    // InternalPackageXML.g:1384:1: rule__VersionTag__Group__0 : rule__VersionTag__Group__0__Impl rule__VersionTag__Group__1 ;
    public final void rule__VersionTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1388:1: ( rule__VersionTag__Group__0__Impl rule__VersionTag__Group__1 )
            // InternalPackageXML.g:1389:2: rule__VersionTag__Group__0__Impl rule__VersionTag__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VersionTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__0"


    // $ANTLR start "rule__VersionTag__Group__0__Impl"
    // InternalPackageXML.g:1396:1: rule__VersionTag__Group__0__Impl : ( '<' ) ;
    public final void rule__VersionTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1400:1: ( ( '<' ) )
            // InternalPackageXML.g:1401:1: ( '<' )
            {
            // InternalPackageXML.g:1401:1: ( '<' )
            // InternalPackageXML.g:1402:2: '<'
            {
             before(grammarAccess.getVersionTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__0__Impl"


    // $ANTLR start "rule__VersionTag__Group__1"
    // InternalPackageXML.g:1411:1: rule__VersionTag__Group__1 : rule__VersionTag__Group__1__Impl rule__VersionTag__Group__2 ;
    public final void rule__VersionTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1415:1: ( rule__VersionTag__Group__1__Impl rule__VersionTag__Group__2 )
            // InternalPackageXML.g:1416:2: rule__VersionTag__Group__1__Impl rule__VersionTag__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__VersionTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__1"


    // $ANTLR start "rule__VersionTag__Group__1__Impl"
    // InternalPackageXML.g:1423:1: rule__VersionTag__Group__1__Impl : ( 'version' ) ;
    public final void rule__VersionTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1427:1: ( ( 'version' ) )
            // InternalPackageXML.g:1428:1: ( 'version' )
            {
            // InternalPackageXML.g:1428:1: ( 'version' )
            // InternalPackageXML.g:1429:2: 'version'
            {
             before(grammarAccess.getVersionTagAccess().getVersionKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getVersionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__1__Impl"


    // $ANTLR start "rule__VersionTag__Group__2"
    // InternalPackageXML.g:1438:1: rule__VersionTag__Group__2 : rule__VersionTag__Group__2__Impl rule__VersionTag__Group__3 ;
    public final void rule__VersionTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1442:1: ( rule__VersionTag__Group__2__Impl rule__VersionTag__Group__3 )
            // InternalPackageXML.g:1443:2: rule__VersionTag__Group__2__Impl rule__VersionTag__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__VersionTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__2"


    // $ANTLR start "rule__VersionTag__Group__2__Impl"
    // InternalPackageXML.g:1450:1: rule__VersionTag__Group__2__Impl : ( '>' ) ;
    public final void rule__VersionTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1454:1: ( ( '>' ) )
            // InternalPackageXML.g:1455:1: ( '>' )
            {
            // InternalPackageXML.g:1455:1: ( '>' )
            // InternalPackageXML.g:1456:2: '>'
            {
             before(grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__2__Impl"


    // $ANTLR start "rule__VersionTag__Group__3"
    // InternalPackageXML.g:1465:1: rule__VersionTag__Group__3 : rule__VersionTag__Group__3__Impl rule__VersionTag__Group__4 ;
    public final void rule__VersionTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1469:1: ( rule__VersionTag__Group__3__Impl rule__VersionTag__Group__4 )
            // InternalPackageXML.g:1470:2: rule__VersionTag__Group__3__Impl rule__VersionTag__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__VersionTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__3"


    // $ANTLR start "rule__VersionTag__Group__3__Impl"
    // InternalPackageXML.g:1477:1: rule__VersionTag__Group__3__Impl : ( ( rule__VersionTag__VersionAssignment_3 ) ) ;
    public final void rule__VersionTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1481:1: ( ( ( rule__VersionTag__VersionAssignment_3 ) ) )
            // InternalPackageXML.g:1482:1: ( ( rule__VersionTag__VersionAssignment_3 ) )
            {
            // InternalPackageXML.g:1482:1: ( ( rule__VersionTag__VersionAssignment_3 ) )
            // InternalPackageXML.g:1483:2: ( rule__VersionTag__VersionAssignment_3 )
            {
             before(grammarAccess.getVersionTagAccess().getVersionAssignment_3()); 
            // InternalPackageXML.g:1484:2: ( rule__VersionTag__VersionAssignment_3 )
            // InternalPackageXML.g:1484:3: rule__VersionTag__VersionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VersionTag__VersionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVersionTagAccess().getVersionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__3__Impl"


    // $ANTLR start "rule__VersionTag__Group__4"
    // InternalPackageXML.g:1492:1: rule__VersionTag__Group__4 : rule__VersionTag__Group__4__Impl rule__VersionTag__Group__5 ;
    public final void rule__VersionTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1496:1: ( rule__VersionTag__Group__4__Impl rule__VersionTag__Group__5 )
            // InternalPackageXML.g:1497:2: rule__VersionTag__Group__4__Impl rule__VersionTag__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__VersionTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__4"


    // $ANTLR start "rule__VersionTag__Group__4__Impl"
    // InternalPackageXML.g:1504:1: rule__VersionTag__Group__4__Impl : ( '<' ) ;
    public final void rule__VersionTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1508:1: ( ( '<' ) )
            // InternalPackageXML.g:1509:1: ( '<' )
            {
            // InternalPackageXML.g:1509:1: ( '<' )
            // InternalPackageXML.g:1510:2: '<'
            {
             before(grammarAccess.getVersionTagAccess().getLessThanSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__4__Impl"


    // $ANTLR start "rule__VersionTag__Group__5"
    // InternalPackageXML.g:1519:1: rule__VersionTag__Group__5 : rule__VersionTag__Group__5__Impl rule__VersionTag__Group__6 ;
    public final void rule__VersionTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1523:1: ( rule__VersionTag__Group__5__Impl rule__VersionTag__Group__6 )
            // InternalPackageXML.g:1524:2: rule__VersionTag__Group__5__Impl rule__VersionTag__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__VersionTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__5"


    // $ANTLR start "rule__VersionTag__Group__5__Impl"
    // InternalPackageXML.g:1531:1: rule__VersionTag__Group__5__Impl : ( '/' ) ;
    public final void rule__VersionTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1535:1: ( ( '/' ) )
            // InternalPackageXML.g:1536:1: ( '/' )
            {
            // InternalPackageXML.g:1536:1: ( '/' )
            // InternalPackageXML.g:1537:2: '/'
            {
             before(grammarAccess.getVersionTagAccess().getSolidusKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getSolidusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__5__Impl"


    // $ANTLR start "rule__VersionTag__Group__6"
    // InternalPackageXML.g:1546:1: rule__VersionTag__Group__6 : rule__VersionTag__Group__6__Impl rule__VersionTag__Group__7 ;
    public final void rule__VersionTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1550:1: ( rule__VersionTag__Group__6__Impl rule__VersionTag__Group__7 )
            // InternalPackageXML.g:1551:2: rule__VersionTag__Group__6__Impl rule__VersionTag__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__VersionTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__6"


    // $ANTLR start "rule__VersionTag__Group__6__Impl"
    // InternalPackageXML.g:1558:1: rule__VersionTag__Group__6__Impl : ( 'version' ) ;
    public final void rule__VersionTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1562:1: ( ( 'version' ) )
            // InternalPackageXML.g:1563:1: ( 'version' )
            {
            // InternalPackageXML.g:1563:1: ( 'version' )
            // InternalPackageXML.g:1564:2: 'version'
            {
             before(grammarAccess.getVersionTagAccess().getVersionKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getVersionKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__6__Impl"


    // $ANTLR start "rule__VersionTag__Group__7"
    // InternalPackageXML.g:1573:1: rule__VersionTag__Group__7 : rule__VersionTag__Group__7__Impl ;
    public final void rule__VersionTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1577:1: ( rule__VersionTag__Group__7__Impl )
            // InternalPackageXML.g:1578:2: rule__VersionTag__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VersionTag__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__7"


    // $ANTLR start "rule__VersionTag__Group__7__Impl"
    // InternalPackageXML.g:1584:1: rule__VersionTag__Group__7__Impl : ( '>' ) ;
    public final void rule__VersionTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1588:1: ( ( '>' ) )
            // InternalPackageXML.g:1589:1: ( '>' )
            {
            // InternalPackageXML.g:1589:1: ( '>' )
            // InternalPackageXML.g:1590:2: '>'
            {
             before(grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__Group__7__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__0"
    // InternalPackageXML.g:1600:1: rule__DescriptionTag__Group__0 : rule__DescriptionTag__Group__0__Impl rule__DescriptionTag__Group__1 ;
    public final void rule__DescriptionTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1604:1: ( rule__DescriptionTag__Group__0__Impl rule__DescriptionTag__Group__1 )
            // InternalPackageXML.g:1605:2: rule__DescriptionTag__Group__0__Impl rule__DescriptionTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DescriptionTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__0"


    // $ANTLR start "rule__DescriptionTag__Group__0__Impl"
    // InternalPackageXML.g:1612:1: rule__DescriptionTag__Group__0__Impl : ( () ) ;
    public final void rule__DescriptionTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1616:1: ( ( () ) )
            // InternalPackageXML.g:1617:1: ( () )
            {
            // InternalPackageXML.g:1617:1: ( () )
            // InternalPackageXML.g:1618:2: ()
            {
             before(grammarAccess.getDescriptionTagAccess().getDescriptionTagAction_0()); 
            // InternalPackageXML.g:1619:2: ()
            // InternalPackageXML.g:1619:3: 
            {
            }

             after(grammarAccess.getDescriptionTagAccess().getDescriptionTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__0__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__1"
    // InternalPackageXML.g:1627:1: rule__DescriptionTag__Group__1 : rule__DescriptionTag__Group__1__Impl rule__DescriptionTag__Group__2 ;
    public final void rule__DescriptionTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1631:1: ( rule__DescriptionTag__Group__1__Impl rule__DescriptionTag__Group__2 )
            // InternalPackageXML.g:1632:2: rule__DescriptionTag__Group__1__Impl rule__DescriptionTag__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DescriptionTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__1"


    // $ANTLR start "rule__DescriptionTag__Group__1__Impl"
    // InternalPackageXML.g:1639:1: rule__DescriptionTag__Group__1__Impl : ( '<' ) ;
    public final void rule__DescriptionTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1643:1: ( ( '<' ) )
            // InternalPackageXML.g:1644:1: ( '<' )
            {
            // InternalPackageXML.g:1644:1: ( '<' )
            // InternalPackageXML.g:1645:2: '<'
            {
             before(grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__1__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__2"
    // InternalPackageXML.g:1654:1: rule__DescriptionTag__Group__2 : rule__DescriptionTag__Group__2__Impl rule__DescriptionTag__Group__3 ;
    public final void rule__DescriptionTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1658:1: ( rule__DescriptionTag__Group__2__Impl rule__DescriptionTag__Group__3 )
            // InternalPackageXML.g:1659:2: rule__DescriptionTag__Group__2__Impl rule__DescriptionTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DescriptionTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__2"


    // $ANTLR start "rule__DescriptionTag__Group__2__Impl"
    // InternalPackageXML.g:1666:1: rule__DescriptionTag__Group__2__Impl : ( 'description' ) ;
    public final void rule__DescriptionTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1670:1: ( ( 'description' ) )
            // InternalPackageXML.g:1671:1: ( 'description' )
            {
            // InternalPackageXML.g:1671:1: ( 'description' )
            // InternalPackageXML.g:1672:2: 'description'
            {
             before(grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__2__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__3"
    // InternalPackageXML.g:1681:1: rule__DescriptionTag__Group__3 : rule__DescriptionTag__Group__3__Impl rule__DescriptionTag__Group__4 ;
    public final void rule__DescriptionTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1685:1: ( rule__DescriptionTag__Group__3__Impl rule__DescriptionTag__Group__4 )
            // InternalPackageXML.g:1686:2: rule__DescriptionTag__Group__3__Impl rule__DescriptionTag__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__DescriptionTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__3"


    // $ANTLR start "rule__DescriptionTag__Group__3__Impl"
    // InternalPackageXML.g:1693:1: rule__DescriptionTag__Group__3__Impl : ( '>' ) ;
    public final void rule__DescriptionTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1697:1: ( ( '>' ) )
            // InternalPackageXML.g:1698:1: ( '>' )
            {
            // InternalPackageXML.g:1698:1: ( '>' )
            // InternalPackageXML.g:1699:2: '>'
            {
             before(grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__3__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__4"
    // InternalPackageXML.g:1708:1: rule__DescriptionTag__Group__4 : rule__DescriptionTag__Group__4__Impl rule__DescriptionTag__Group__5 ;
    public final void rule__DescriptionTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1712:1: ( rule__DescriptionTag__Group__4__Impl rule__DescriptionTag__Group__5 )
            // InternalPackageXML.g:1713:2: rule__DescriptionTag__Group__4__Impl rule__DescriptionTag__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__DescriptionTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__4"


    // $ANTLR start "rule__DescriptionTag__Group__4__Impl"
    // InternalPackageXML.g:1720:1: rule__DescriptionTag__Group__4__Impl : ( ( rule__DescriptionTag__DescriptionTextAssignment_4 )* ) ;
    public final void rule__DescriptionTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1724:1: ( ( ( rule__DescriptionTag__DescriptionTextAssignment_4 )* ) )
            // InternalPackageXML.g:1725:1: ( ( rule__DescriptionTag__DescriptionTextAssignment_4 )* )
            {
            // InternalPackageXML.g:1725:1: ( ( rule__DescriptionTag__DescriptionTextAssignment_4 )* )
            // InternalPackageXML.g:1726:2: ( rule__DescriptionTag__DescriptionTextAssignment_4 )*
            {
             before(grammarAccess.getDescriptionTagAccess().getDescriptionTextAssignment_4()); 
            // InternalPackageXML.g:1727:2: ( rule__DescriptionTag__DescriptionTextAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPackageXML.g:1727:3: rule__DescriptionTag__DescriptionTextAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__DescriptionTag__DescriptionTextAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDescriptionTagAccess().getDescriptionTextAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__4__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__5"
    // InternalPackageXML.g:1735:1: rule__DescriptionTag__Group__5 : rule__DescriptionTag__Group__5__Impl rule__DescriptionTag__Group__6 ;
    public final void rule__DescriptionTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1739:1: ( rule__DescriptionTag__Group__5__Impl rule__DescriptionTag__Group__6 )
            // InternalPackageXML.g:1740:2: rule__DescriptionTag__Group__5__Impl rule__DescriptionTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DescriptionTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__5"


    // $ANTLR start "rule__DescriptionTag__Group__5__Impl"
    // InternalPackageXML.g:1747:1: rule__DescriptionTag__Group__5__Impl : ( '<' ) ;
    public final void rule__DescriptionTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1751:1: ( ( '<' ) )
            // InternalPackageXML.g:1752:1: ( '<' )
            {
            // InternalPackageXML.g:1752:1: ( '<' )
            // InternalPackageXML.g:1753:2: '<'
            {
             before(grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__5__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__6"
    // InternalPackageXML.g:1762:1: rule__DescriptionTag__Group__6 : rule__DescriptionTag__Group__6__Impl rule__DescriptionTag__Group__7 ;
    public final void rule__DescriptionTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1766:1: ( rule__DescriptionTag__Group__6__Impl rule__DescriptionTag__Group__7 )
            // InternalPackageXML.g:1767:2: rule__DescriptionTag__Group__6__Impl rule__DescriptionTag__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__DescriptionTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__6"


    // $ANTLR start "rule__DescriptionTag__Group__6__Impl"
    // InternalPackageXML.g:1774:1: rule__DescriptionTag__Group__6__Impl : ( '/' ) ;
    public final void rule__DescriptionTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1778:1: ( ( '/' ) )
            // InternalPackageXML.g:1779:1: ( '/' )
            {
            // InternalPackageXML.g:1779:1: ( '/' )
            // InternalPackageXML.g:1780:2: '/'
            {
             before(grammarAccess.getDescriptionTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__6__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__7"
    // InternalPackageXML.g:1789:1: rule__DescriptionTag__Group__7 : rule__DescriptionTag__Group__7__Impl rule__DescriptionTag__Group__8 ;
    public final void rule__DescriptionTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1793:1: ( rule__DescriptionTag__Group__7__Impl rule__DescriptionTag__Group__8 )
            // InternalPackageXML.g:1794:2: rule__DescriptionTag__Group__7__Impl rule__DescriptionTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__DescriptionTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__7"


    // $ANTLR start "rule__DescriptionTag__Group__7__Impl"
    // InternalPackageXML.g:1801:1: rule__DescriptionTag__Group__7__Impl : ( 'description' ) ;
    public final void rule__DescriptionTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1805:1: ( ( 'description' ) )
            // InternalPackageXML.g:1806:1: ( 'description' )
            {
            // InternalPackageXML.g:1806:1: ( 'description' )
            // InternalPackageXML.g:1807:2: 'description'
            {
             before(grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__7__Impl"


    // $ANTLR start "rule__DescriptionTag__Group__8"
    // InternalPackageXML.g:1816:1: rule__DescriptionTag__Group__8 : rule__DescriptionTag__Group__8__Impl ;
    public final void rule__DescriptionTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1820:1: ( rule__DescriptionTag__Group__8__Impl )
            // InternalPackageXML.g:1821:2: rule__DescriptionTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__8"


    // $ANTLR start "rule__DescriptionTag__Group__8__Impl"
    // InternalPackageXML.g:1827:1: rule__DescriptionTag__Group__8__Impl : ( '>' ) ;
    public final void rule__DescriptionTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1831:1: ( ( '>' ) )
            // InternalPackageXML.g:1832:1: ( '>' )
            {
            // InternalPackageXML.g:1832:1: ( '>' )
            // InternalPackageXML.g:1833:2: '>'
            {
             before(grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__Group__8__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__0"
    // InternalPackageXML.g:1843:1: rule__MaintainerTag__Group__0 : rule__MaintainerTag__Group__0__Impl rule__MaintainerTag__Group__1 ;
    public final void rule__MaintainerTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1847:1: ( rule__MaintainerTag__Group__0__Impl rule__MaintainerTag__Group__1 )
            // InternalPackageXML.g:1848:2: rule__MaintainerTag__Group__0__Impl rule__MaintainerTag__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MaintainerTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__0"


    // $ANTLR start "rule__MaintainerTag__Group__0__Impl"
    // InternalPackageXML.g:1855:1: rule__MaintainerTag__Group__0__Impl : ( '<' ) ;
    public final void rule__MaintainerTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1859:1: ( ( '<' ) )
            // InternalPackageXML.g:1860:1: ( '<' )
            {
            // InternalPackageXML.g:1860:1: ( '<' )
            // InternalPackageXML.g:1861:2: '<'
            {
             before(grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__0__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__1"
    // InternalPackageXML.g:1870:1: rule__MaintainerTag__Group__1 : rule__MaintainerTag__Group__1__Impl rule__MaintainerTag__Group__2 ;
    public final void rule__MaintainerTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1874:1: ( rule__MaintainerTag__Group__1__Impl rule__MaintainerTag__Group__2 )
            // InternalPackageXML.g:1875:2: rule__MaintainerTag__Group__1__Impl rule__MaintainerTag__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__MaintainerTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__1"


    // $ANTLR start "rule__MaintainerTag__Group__1__Impl"
    // InternalPackageXML.g:1882:1: rule__MaintainerTag__Group__1__Impl : ( 'maintainer' ) ;
    public final void rule__MaintainerTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1886:1: ( ( 'maintainer' ) )
            // InternalPackageXML.g:1887:1: ( 'maintainer' )
            {
            // InternalPackageXML.g:1887:1: ( 'maintainer' )
            // InternalPackageXML.g:1888:2: 'maintainer'
            {
             before(grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__1__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__2"
    // InternalPackageXML.g:1897:1: rule__MaintainerTag__Group__2 : rule__MaintainerTag__Group__2__Impl rule__MaintainerTag__Group__3 ;
    public final void rule__MaintainerTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1901:1: ( rule__MaintainerTag__Group__2__Impl rule__MaintainerTag__Group__3 )
            // InternalPackageXML.g:1902:2: rule__MaintainerTag__Group__2__Impl rule__MaintainerTag__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MaintainerTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__2"


    // $ANTLR start "rule__MaintainerTag__Group__2__Impl"
    // InternalPackageXML.g:1909:1: rule__MaintainerTag__Group__2__Impl : ( 'email' ) ;
    public final void rule__MaintainerTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1913:1: ( ( 'email' ) )
            // InternalPackageXML.g:1914:1: ( 'email' )
            {
            // InternalPackageXML.g:1914:1: ( 'email' )
            // InternalPackageXML.g:1915:2: 'email'
            {
             before(grammarAccess.getMaintainerTagAccess().getEmailKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getEmailKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__2__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__3"
    // InternalPackageXML.g:1924:1: rule__MaintainerTag__Group__3 : rule__MaintainerTag__Group__3__Impl rule__MaintainerTag__Group__4 ;
    public final void rule__MaintainerTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1928:1: ( rule__MaintainerTag__Group__3__Impl rule__MaintainerTag__Group__4 )
            // InternalPackageXML.g:1929:2: rule__MaintainerTag__Group__3__Impl rule__MaintainerTag__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MaintainerTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__3"


    // $ANTLR start "rule__MaintainerTag__Group__3__Impl"
    // InternalPackageXML.g:1936:1: rule__MaintainerTag__Group__3__Impl : ( '=' ) ;
    public final void rule__MaintainerTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1940:1: ( ( '=' ) )
            // InternalPackageXML.g:1941:1: ( '=' )
            {
            // InternalPackageXML.g:1941:1: ( '=' )
            // InternalPackageXML.g:1942:2: '='
            {
             before(grammarAccess.getMaintainerTagAccess().getEqualsSignKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__3__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__4"
    // InternalPackageXML.g:1951:1: rule__MaintainerTag__Group__4 : rule__MaintainerTag__Group__4__Impl rule__MaintainerTag__Group__5 ;
    public final void rule__MaintainerTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1955:1: ( rule__MaintainerTag__Group__4__Impl rule__MaintainerTag__Group__5 )
            // InternalPackageXML.g:1956:2: rule__MaintainerTag__Group__4__Impl rule__MaintainerTag__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MaintainerTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__4"


    // $ANTLR start "rule__MaintainerTag__Group__4__Impl"
    // InternalPackageXML.g:1963:1: rule__MaintainerTag__Group__4__Impl : ( ( rule__MaintainerTag__EmailAssignment_4 ) ) ;
    public final void rule__MaintainerTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1967:1: ( ( ( rule__MaintainerTag__EmailAssignment_4 ) ) )
            // InternalPackageXML.g:1968:1: ( ( rule__MaintainerTag__EmailAssignment_4 ) )
            {
            // InternalPackageXML.g:1968:1: ( ( rule__MaintainerTag__EmailAssignment_4 ) )
            // InternalPackageXML.g:1969:2: ( rule__MaintainerTag__EmailAssignment_4 )
            {
             before(grammarAccess.getMaintainerTagAccess().getEmailAssignment_4()); 
            // InternalPackageXML.g:1970:2: ( rule__MaintainerTag__EmailAssignment_4 )
            // InternalPackageXML.g:1970:3: rule__MaintainerTag__EmailAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MaintainerTag__EmailAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerTagAccess().getEmailAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__4__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__5"
    // InternalPackageXML.g:1978:1: rule__MaintainerTag__Group__5 : rule__MaintainerTag__Group__5__Impl rule__MaintainerTag__Group__6 ;
    public final void rule__MaintainerTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1982:1: ( rule__MaintainerTag__Group__5__Impl rule__MaintainerTag__Group__6 )
            // InternalPackageXML.g:1983:2: rule__MaintainerTag__Group__5__Impl rule__MaintainerTag__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__MaintainerTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__5"


    // $ANTLR start "rule__MaintainerTag__Group__5__Impl"
    // InternalPackageXML.g:1990:1: rule__MaintainerTag__Group__5__Impl : ( '>' ) ;
    public final void rule__MaintainerTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:1994:1: ( ( '>' ) )
            // InternalPackageXML.g:1995:1: ( '>' )
            {
            // InternalPackageXML.g:1995:1: ( '>' )
            // InternalPackageXML.g:1996:2: '>'
            {
             before(grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__5__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__6"
    // InternalPackageXML.g:2005:1: rule__MaintainerTag__Group__6 : rule__MaintainerTag__Group__6__Impl rule__MaintainerTag__Group__7 ;
    public final void rule__MaintainerTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2009:1: ( rule__MaintainerTag__Group__6__Impl rule__MaintainerTag__Group__7 )
            // InternalPackageXML.g:2010:2: rule__MaintainerTag__Group__6__Impl rule__MaintainerTag__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__MaintainerTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__6"


    // $ANTLR start "rule__MaintainerTag__Group__6__Impl"
    // InternalPackageXML.g:2017:1: rule__MaintainerTag__Group__6__Impl : ( ( rule__MaintainerTag__MaintainerTextAssignment_6 )* ) ;
    public final void rule__MaintainerTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2021:1: ( ( ( rule__MaintainerTag__MaintainerTextAssignment_6 )* ) )
            // InternalPackageXML.g:2022:1: ( ( rule__MaintainerTag__MaintainerTextAssignment_6 )* )
            {
            // InternalPackageXML.g:2022:1: ( ( rule__MaintainerTag__MaintainerTextAssignment_6 )* )
            // InternalPackageXML.g:2023:2: ( rule__MaintainerTag__MaintainerTextAssignment_6 )*
            {
             before(grammarAccess.getMaintainerTagAccess().getMaintainerTextAssignment_6()); 
            // InternalPackageXML.g:2024:2: ( rule__MaintainerTag__MaintainerTextAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPackageXML.g:2024:3: rule__MaintainerTag__MaintainerTextAssignment_6
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__MaintainerTag__MaintainerTextAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMaintainerTagAccess().getMaintainerTextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__6__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__7"
    // InternalPackageXML.g:2032:1: rule__MaintainerTag__Group__7 : rule__MaintainerTag__Group__7__Impl rule__MaintainerTag__Group__8 ;
    public final void rule__MaintainerTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2036:1: ( rule__MaintainerTag__Group__7__Impl rule__MaintainerTag__Group__8 )
            // InternalPackageXML.g:2037:2: rule__MaintainerTag__Group__7__Impl rule__MaintainerTag__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__MaintainerTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__7"


    // $ANTLR start "rule__MaintainerTag__Group__7__Impl"
    // InternalPackageXML.g:2044:1: rule__MaintainerTag__Group__7__Impl : ( '<' ) ;
    public final void rule__MaintainerTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2048:1: ( ( '<' ) )
            // InternalPackageXML.g:2049:1: ( '<' )
            {
            // InternalPackageXML.g:2049:1: ( '<' )
            // InternalPackageXML.g:2050:2: '<'
            {
             before(grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__7__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__8"
    // InternalPackageXML.g:2059:1: rule__MaintainerTag__Group__8 : rule__MaintainerTag__Group__8__Impl rule__MaintainerTag__Group__9 ;
    public final void rule__MaintainerTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2063:1: ( rule__MaintainerTag__Group__8__Impl rule__MaintainerTag__Group__9 )
            // InternalPackageXML.g:2064:2: rule__MaintainerTag__Group__8__Impl rule__MaintainerTag__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__MaintainerTag__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__8"


    // $ANTLR start "rule__MaintainerTag__Group__8__Impl"
    // InternalPackageXML.g:2071:1: rule__MaintainerTag__Group__8__Impl : ( '/' ) ;
    public final void rule__MaintainerTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2075:1: ( ( '/' ) )
            // InternalPackageXML.g:2076:1: ( '/' )
            {
            // InternalPackageXML.g:2076:1: ( '/' )
            // InternalPackageXML.g:2077:2: '/'
            {
             before(grammarAccess.getMaintainerTagAccess().getSolidusKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getSolidusKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__8__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__9"
    // InternalPackageXML.g:2086:1: rule__MaintainerTag__Group__9 : rule__MaintainerTag__Group__9__Impl rule__MaintainerTag__Group__10 ;
    public final void rule__MaintainerTag__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2090:1: ( rule__MaintainerTag__Group__9__Impl rule__MaintainerTag__Group__10 )
            // InternalPackageXML.g:2091:2: rule__MaintainerTag__Group__9__Impl rule__MaintainerTag__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__MaintainerTag__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__9"


    // $ANTLR start "rule__MaintainerTag__Group__9__Impl"
    // InternalPackageXML.g:2098:1: rule__MaintainerTag__Group__9__Impl : ( 'maintainer' ) ;
    public final void rule__MaintainerTag__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2102:1: ( ( 'maintainer' ) )
            // InternalPackageXML.g:2103:1: ( 'maintainer' )
            {
            // InternalPackageXML.g:2103:1: ( 'maintainer' )
            // InternalPackageXML.g:2104:2: 'maintainer'
            {
             before(grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__9__Impl"


    // $ANTLR start "rule__MaintainerTag__Group__10"
    // InternalPackageXML.g:2113:1: rule__MaintainerTag__Group__10 : rule__MaintainerTag__Group__10__Impl ;
    public final void rule__MaintainerTag__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2117:1: ( rule__MaintainerTag__Group__10__Impl )
            // InternalPackageXML.g:2118:2: rule__MaintainerTag__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaintainerTag__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__10"


    // $ANTLR start "rule__MaintainerTag__Group__10__Impl"
    // InternalPackageXML.g:2124:1: rule__MaintainerTag__Group__10__Impl : ( '>' ) ;
    public final void rule__MaintainerTag__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2128:1: ( ( '>' ) )
            // InternalPackageXML.g:2129:1: ( '>' )
            {
            // InternalPackageXML.g:2129:1: ( '>' )
            // InternalPackageXML.g:2130:2: '>'
            {
             before(grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__Group__10__Impl"


    // $ANTLR start "rule__LicenseTag__Group__0"
    // InternalPackageXML.g:2140:1: rule__LicenseTag__Group__0 : rule__LicenseTag__Group__0__Impl rule__LicenseTag__Group__1 ;
    public final void rule__LicenseTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2144:1: ( rule__LicenseTag__Group__0__Impl rule__LicenseTag__Group__1 )
            // InternalPackageXML.g:2145:2: rule__LicenseTag__Group__0__Impl rule__LicenseTag__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LicenseTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__0"


    // $ANTLR start "rule__LicenseTag__Group__0__Impl"
    // InternalPackageXML.g:2152:1: rule__LicenseTag__Group__0__Impl : ( '<' ) ;
    public final void rule__LicenseTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2156:1: ( ( '<' ) )
            // InternalPackageXML.g:2157:1: ( '<' )
            {
            // InternalPackageXML.g:2157:1: ( '<' )
            // InternalPackageXML.g:2158:2: '<'
            {
             before(grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__0__Impl"


    // $ANTLR start "rule__LicenseTag__Group__1"
    // InternalPackageXML.g:2167:1: rule__LicenseTag__Group__1 : rule__LicenseTag__Group__1__Impl rule__LicenseTag__Group__2 ;
    public final void rule__LicenseTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2171:1: ( rule__LicenseTag__Group__1__Impl rule__LicenseTag__Group__2 )
            // InternalPackageXML.g:2172:2: rule__LicenseTag__Group__1__Impl rule__LicenseTag__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LicenseTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__1"


    // $ANTLR start "rule__LicenseTag__Group__1__Impl"
    // InternalPackageXML.g:2179:1: rule__LicenseTag__Group__1__Impl : ( 'license' ) ;
    public final void rule__LicenseTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2183:1: ( ( 'license' ) )
            // InternalPackageXML.g:2184:1: ( 'license' )
            {
            // InternalPackageXML.g:2184:1: ( 'license' )
            // InternalPackageXML.g:2185:2: 'license'
            {
             before(grammarAccess.getLicenseTagAccess().getLicenseKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getLicenseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__1__Impl"


    // $ANTLR start "rule__LicenseTag__Group__2"
    // InternalPackageXML.g:2194:1: rule__LicenseTag__Group__2 : rule__LicenseTag__Group__2__Impl rule__LicenseTag__Group__3 ;
    public final void rule__LicenseTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2198:1: ( rule__LicenseTag__Group__2__Impl rule__LicenseTag__Group__3 )
            // InternalPackageXML.g:2199:2: rule__LicenseTag__Group__2__Impl rule__LicenseTag__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__LicenseTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__2"


    // $ANTLR start "rule__LicenseTag__Group__2__Impl"
    // InternalPackageXML.g:2206:1: rule__LicenseTag__Group__2__Impl : ( '>' ) ;
    public final void rule__LicenseTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2210:1: ( ( '>' ) )
            // InternalPackageXML.g:2211:1: ( '>' )
            {
            // InternalPackageXML.g:2211:1: ( '>' )
            // InternalPackageXML.g:2212:2: '>'
            {
             before(grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__2__Impl"


    // $ANTLR start "rule__LicenseTag__Group__3"
    // InternalPackageXML.g:2221:1: rule__LicenseTag__Group__3 : rule__LicenseTag__Group__3__Impl rule__LicenseTag__Group__4 ;
    public final void rule__LicenseTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2225:1: ( rule__LicenseTag__Group__3__Impl rule__LicenseTag__Group__4 )
            // InternalPackageXML.g:2226:2: rule__LicenseTag__Group__3__Impl rule__LicenseTag__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LicenseTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__3"


    // $ANTLR start "rule__LicenseTag__Group__3__Impl"
    // InternalPackageXML.g:2233:1: rule__LicenseTag__Group__3__Impl : ( ( rule__LicenseTag__LicenseAssignment_3 ) ) ;
    public final void rule__LicenseTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2237:1: ( ( ( rule__LicenseTag__LicenseAssignment_3 ) ) )
            // InternalPackageXML.g:2238:1: ( ( rule__LicenseTag__LicenseAssignment_3 ) )
            {
            // InternalPackageXML.g:2238:1: ( ( rule__LicenseTag__LicenseAssignment_3 ) )
            // InternalPackageXML.g:2239:2: ( rule__LicenseTag__LicenseAssignment_3 )
            {
             before(grammarAccess.getLicenseTagAccess().getLicenseAssignment_3()); 
            // InternalPackageXML.g:2240:2: ( rule__LicenseTag__LicenseAssignment_3 )
            // InternalPackageXML.g:2240:3: rule__LicenseTag__LicenseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LicenseTag__LicenseAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLicenseTagAccess().getLicenseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__3__Impl"


    // $ANTLR start "rule__LicenseTag__Group__4"
    // InternalPackageXML.g:2248:1: rule__LicenseTag__Group__4 : rule__LicenseTag__Group__4__Impl rule__LicenseTag__Group__5 ;
    public final void rule__LicenseTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2252:1: ( rule__LicenseTag__Group__4__Impl rule__LicenseTag__Group__5 )
            // InternalPackageXML.g:2253:2: rule__LicenseTag__Group__4__Impl rule__LicenseTag__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__LicenseTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__4"


    // $ANTLR start "rule__LicenseTag__Group__4__Impl"
    // InternalPackageXML.g:2260:1: rule__LicenseTag__Group__4__Impl : ( '<' ) ;
    public final void rule__LicenseTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2264:1: ( ( '<' ) )
            // InternalPackageXML.g:2265:1: ( '<' )
            {
            // InternalPackageXML.g:2265:1: ( '<' )
            // InternalPackageXML.g:2266:2: '<'
            {
             before(grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__4__Impl"


    // $ANTLR start "rule__LicenseTag__Group__5"
    // InternalPackageXML.g:2275:1: rule__LicenseTag__Group__5 : rule__LicenseTag__Group__5__Impl rule__LicenseTag__Group__6 ;
    public final void rule__LicenseTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2279:1: ( rule__LicenseTag__Group__5__Impl rule__LicenseTag__Group__6 )
            // InternalPackageXML.g:2280:2: rule__LicenseTag__Group__5__Impl rule__LicenseTag__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__LicenseTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__5"


    // $ANTLR start "rule__LicenseTag__Group__5__Impl"
    // InternalPackageXML.g:2287:1: rule__LicenseTag__Group__5__Impl : ( '/' ) ;
    public final void rule__LicenseTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2291:1: ( ( '/' ) )
            // InternalPackageXML.g:2292:1: ( '/' )
            {
            // InternalPackageXML.g:2292:1: ( '/' )
            // InternalPackageXML.g:2293:2: '/'
            {
             before(grammarAccess.getLicenseTagAccess().getSolidusKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getSolidusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__5__Impl"


    // $ANTLR start "rule__LicenseTag__Group__6"
    // InternalPackageXML.g:2302:1: rule__LicenseTag__Group__6 : rule__LicenseTag__Group__6__Impl rule__LicenseTag__Group__7 ;
    public final void rule__LicenseTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2306:1: ( rule__LicenseTag__Group__6__Impl rule__LicenseTag__Group__7 )
            // InternalPackageXML.g:2307:2: rule__LicenseTag__Group__6__Impl rule__LicenseTag__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__LicenseTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__6"


    // $ANTLR start "rule__LicenseTag__Group__6__Impl"
    // InternalPackageXML.g:2314:1: rule__LicenseTag__Group__6__Impl : ( 'license' ) ;
    public final void rule__LicenseTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2318:1: ( ( 'license' ) )
            // InternalPackageXML.g:2319:1: ( 'license' )
            {
            // InternalPackageXML.g:2319:1: ( 'license' )
            // InternalPackageXML.g:2320:2: 'license'
            {
             before(grammarAccess.getLicenseTagAccess().getLicenseKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getLicenseKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__6__Impl"


    // $ANTLR start "rule__LicenseTag__Group__7"
    // InternalPackageXML.g:2329:1: rule__LicenseTag__Group__7 : rule__LicenseTag__Group__7__Impl ;
    public final void rule__LicenseTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2333:1: ( rule__LicenseTag__Group__7__Impl )
            // InternalPackageXML.g:2334:2: rule__LicenseTag__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenseTag__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__7"


    // $ANTLR start "rule__LicenseTag__Group__7__Impl"
    // InternalPackageXML.g:2340:1: rule__LicenseTag__Group__7__Impl : ( '>' ) ;
    public final void rule__LicenseTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2344:1: ( ( '>' ) )
            // InternalPackageXML.g:2345:1: ( '>' )
            {
            // InternalPackageXML.g:2345:1: ( '>' )
            // InternalPackageXML.g:2346:2: '>'
            {
             before(grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__Group__7__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__0"
    // InternalPackageXML.g:2356:1: rule__RunDependencyTag__Group__0 : rule__RunDependencyTag__Group__0__Impl rule__RunDependencyTag__Group__1 ;
    public final void rule__RunDependencyTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2360:1: ( rule__RunDependencyTag__Group__0__Impl rule__RunDependencyTag__Group__1 )
            // InternalPackageXML.g:2361:2: rule__RunDependencyTag__Group__0__Impl rule__RunDependencyTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RunDependencyTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__0"


    // $ANTLR start "rule__RunDependencyTag__Group__0__Impl"
    // InternalPackageXML.g:2368:1: rule__RunDependencyTag__Group__0__Impl : ( () ) ;
    public final void rule__RunDependencyTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2372:1: ( ( () ) )
            // InternalPackageXML.g:2373:1: ( () )
            {
            // InternalPackageXML.g:2373:1: ( () )
            // InternalPackageXML.g:2374:2: ()
            {
             before(grammarAccess.getRunDependencyTagAccess().getRunDependencyTagAction_0()); 
            // InternalPackageXML.g:2375:2: ()
            // InternalPackageXML.g:2375:3: 
            {
            }

             after(grammarAccess.getRunDependencyTagAccess().getRunDependencyTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__0__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__1"
    // InternalPackageXML.g:2383:1: rule__RunDependencyTag__Group__1 : rule__RunDependencyTag__Group__1__Impl rule__RunDependencyTag__Group__2 ;
    public final void rule__RunDependencyTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2387:1: ( rule__RunDependencyTag__Group__1__Impl rule__RunDependencyTag__Group__2 )
            // InternalPackageXML.g:2388:2: rule__RunDependencyTag__Group__1__Impl rule__RunDependencyTag__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__RunDependencyTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__1"


    // $ANTLR start "rule__RunDependencyTag__Group__1__Impl"
    // InternalPackageXML.g:2395:1: rule__RunDependencyTag__Group__1__Impl : ( '<' ) ;
    public final void rule__RunDependencyTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2399:1: ( ( '<' ) )
            // InternalPackageXML.g:2400:1: ( '<' )
            {
            // InternalPackageXML.g:2400:1: ( '<' )
            // InternalPackageXML.g:2401:2: '<'
            {
             before(grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__1__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__2"
    // InternalPackageXML.g:2410:1: rule__RunDependencyTag__Group__2 : rule__RunDependencyTag__Group__2__Impl rule__RunDependencyTag__Group__3 ;
    public final void rule__RunDependencyTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2414:1: ( rule__RunDependencyTag__Group__2__Impl rule__RunDependencyTag__Group__3 )
            // InternalPackageXML.g:2415:2: rule__RunDependencyTag__Group__2__Impl rule__RunDependencyTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__RunDependencyTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__2"


    // $ANTLR start "rule__RunDependencyTag__Group__2__Impl"
    // InternalPackageXML.g:2422:1: rule__RunDependencyTag__Group__2__Impl : ( 'run_depend' ) ;
    public final void rule__RunDependencyTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2426:1: ( ( 'run_depend' ) )
            // InternalPackageXML.g:2427:1: ( 'run_depend' )
            {
            // InternalPackageXML.g:2427:1: ( 'run_depend' )
            // InternalPackageXML.g:2428:2: 'run_depend'
            {
             before(grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__2__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__3"
    // InternalPackageXML.g:2437:1: rule__RunDependencyTag__Group__3 : rule__RunDependencyTag__Group__3__Impl rule__RunDependencyTag__Group__4 ;
    public final void rule__RunDependencyTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2441:1: ( rule__RunDependencyTag__Group__3__Impl rule__RunDependencyTag__Group__4 )
            // InternalPackageXML.g:2442:2: rule__RunDependencyTag__Group__3__Impl rule__RunDependencyTag__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__RunDependencyTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__3"


    // $ANTLR start "rule__RunDependencyTag__Group__3__Impl"
    // InternalPackageXML.g:2449:1: rule__RunDependencyTag__Group__3__Impl : ( '>' ) ;
    public final void rule__RunDependencyTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2453:1: ( ( '>' ) )
            // InternalPackageXML.g:2454:1: ( '>' )
            {
            // InternalPackageXML.g:2454:1: ( '>' )
            // InternalPackageXML.g:2455:2: '>'
            {
             before(grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__3__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__4"
    // InternalPackageXML.g:2464:1: rule__RunDependencyTag__Group__4 : rule__RunDependencyTag__Group__4__Impl rule__RunDependencyTag__Group__5 ;
    public final void rule__RunDependencyTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2468:1: ( rule__RunDependencyTag__Group__4__Impl rule__RunDependencyTag__Group__5 )
            // InternalPackageXML.g:2469:2: rule__RunDependencyTag__Group__4__Impl rule__RunDependencyTag__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RunDependencyTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__4"


    // $ANTLR start "rule__RunDependencyTag__Group__4__Impl"
    // InternalPackageXML.g:2476:1: rule__RunDependencyTag__Group__4__Impl : ( ( rule__RunDependencyTag__NameAssignment_4 ) ) ;
    public final void rule__RunDependencyTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2480:1: ( ( ( rule__RunDependencyTag__NameAssignment_4 ) ) )
            // InternalPackageXML.g:2481:1: ( ( rule__RunDependencyTag__NameAssignment_4 ) )
            {
            // InternalPackageXML.g:2481:1: ( ( rule__RunDependencyTag__NameAssignment_4 ) )
            // InternalPackageXML.g:2482:2: ( rule__RunDependencyTag__NameAssignment_4 )
            {
             before(grammarAccess.getRunDependencyTagAccess().getNameAssignment_4()); 
            // InternalPackageXML.g:2483:2: ( rule__RunDependencyTag__NameAssignment_4 )
            // InternalPackageXML.g:2483:3: rule__RunDependencyTag__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRunDependencyTagAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__4__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__5"
    // InternalPackageXML.g:2491:1: rule__RunDependencyTag__Group__5 : rule__RunDependencyTag__Group__5__Impl rule__RunDependencyTag__Group__6 ;
    public final void rule__RunDependencyTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2495:1: ( rule__RunDependencyTag__Group__5__Impl rule__RunDependencyTag__Group__6 )
            // InternalPackageXML.g:2496:2: rule__RunDependencyTag__Group__5__Impl rule__RunDependencyTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RunDependencyTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__5"


    // $ANTLR start "rule__RunDependencyTag__Group__5__Impl"
    // InternalPackageXML.g:2503:1: rule__RunDependencyTag__Group__5__Impl : ( '<' ) ;
    public final void rule__RunDependencyTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2507:1: ( ( '<' ) )
            // InternalPackageXML.g:2508:1: ( '<' )
            {
            // InternalPackageXML.g:2508:1: ( '<' )
            // InternalPackageXML.g:2509:2: '<'
            {
             before(grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__5__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__6"
    // InternalPackageXML.g:2518:1: rule__RunDependencyTag__Group__6 : rule__RunDependencyTag__Group__6__Impl rule__RunDependencyTag__Group__7 ;
    public final void rule__RunDependencyTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2522:1: ( rule__RunDependencyTag__Group__6__Impl rule__RunDependencyTag__Group__7 )
            // InternalPackageXML.g:2523:2: rule__RunDependencyTag__Group__6__Impl rule__RunDependencyTag__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__RunDependencyTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__6"


    // $ANTLR start "rule__RunDependencyTag__Group__6__Impl"
    // InternalPackageXML.g:2530:1: rule__RunDependencyTag__Group__6__Impl : ( '/' ) ;
    public final void rule__RunDependencyTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2534:1: ( ( '/' ) )
            // InternalPackageXML.g:2535:1: ( '/' )
            {
            // InternalPackageXML.g:2535:1: ( '/' )
            // InternalPackageXML.g:2536:2: '/'
            {
             before(grammarAccess.getRunDependencyTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__6__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__7"
    // InternalPackageXML.g:2545:1: rule__RunDependencyTag__Group__7 : rule__RunDependencyTag__Group__7__Impl rule__RunDependencyTag__Group__8 ;
    public final void rule__RunDependencyTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2549:1: ( rule__RunDependencyTag__Group__7__Impl rule__RunDependencyTag__Group__8 )
            // InternalPackageXML.g:2550:2: rule__RunDependencyTag__Group__7__Impl rule__RunDependencyTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__RunDependencyTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__7"


    // $ANTLR start "rule__RunDependencyTag__Group__7__Impl"
    // InternalPackageXML.g:2557:1: rule__RunDependencyTag__Group__7__Impl : ( 'run_depend' ) ;
    public final void rule__RunDependencyTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2561:1: ( ( 'run_depend' ) )
            // InternalPackageXML.g:2562:1: ( 'run_depend' )
            {
            // InternalPackageXML.g:2562:1: ( 'run_depend' )
            // InternalPackageXML.g:2563:2: 'run_depend'
            {
             before(grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__7__Impl"


    // $ANTLR start "rule__RunDependencyTag__Group__8"
    // InternalPackageXML.g:2572:1: rule__RunDependencyTag__Group__8 : rule__RunDependencyTag__Group__8__Impl ;
    public final void rule__RunDependencyTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2576:1: ( rule__RunDependencyTag__Group__8__Impl )
            // InternalPackageXML.g:2577:2: rule__RunDependencyTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RunDependencyTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__8"


    // $ANTLR start "rule__RunDependencyTag__Group__8__Impl"
    // InternalPackageXML.g:2583:1: rule__RunDependencyTag__Group__8__Impl : ( '>' ) ;
    public final void rule__RunDependencyTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2587:1: ( ( '>' ) )
            // InternalPackageXML.g:2588:1: ( '>' )
            {
            // InternalPackageXML.g:2588:1: ( '>' )
            // InternalPackageXML.g:2589:2: '>'
            {
             before(grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__Group__8__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__0"
    // InternalPackageXML.g:2599:1: rule__BuildDependDependencyTag__Group__0 : rule__BuildDependDependencyTag__Group__0__Impl rule__BuildDependDependencyTag__Group__1 ;
    public final void rule__BuildDependDependencyTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2603:1: ( rule__BuildDependDependencyTag__Group__0__Impl rule__BuildDependDependencyTag__Group__1 )
            // InternalPackageXML.g:2604:2: rule__BuildDependDependencyTag__Group__0__Impl rule__BuildDependDependencyTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BuildDependDependencyTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__0"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__0__Impl"
    // InternalPackageXML.g:2611:1: rule__BuildDependDependencyTag__Group__0__Impl : ( () ) ;
    public final void rule__BuildDependDependencyTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2615:1: ( ( () ) )
            // InternalPackageXML.g:2616:1: ( () )
            {
            // InternalPackageXML.g:2616:1: ( () )
            // InternalPackageXML.g:2617:2: ()
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getBuildDependDependencyTagAction_0()); 
            // InternalPackageXML.g:2618:2: ()
            // InternalPackageXML.g:2618:3: 
            {
            }

             after(grammarAccess.getBuildDependDependencyTagAccess().getBuildDependDependencyTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__0__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__1"
    // InternalPackageXML.g:2626:1: rule__BuildDependDependencyTag__Group__1 : rule__BuildDependDependencyTag__Group__1__Impl rule__BuildDependDependencyTag__Group__2 ;
    public final void rule__BuildDependDependencyTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2630:1: ( rule__BuildDependDependencyTag__Group__1__Impl rule__BuildDependDependencyTag__Group__2 )
            // InternalPackageXML.g:2631:2: rule__BuildDependDependencyTag__Group__1__Impl rule__BuildDependDependencyTag__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__BuildDependDependencyTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__1"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__1__Impl"
    // InternalPackageXML.g:2638:1: rule__BuildDependDependencyTag__Group__1__Impl : ( '<' ) ;
    public final void rule__BuildDependDependencyTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2642:1: ( ( '<' ) )
            // InternalPackageXML.g:2643:1: ( '<' )
            {
            // InternalPackageXML.g:2643:1: ( '<' )
            // InternalPackageXML.g:2644:2: '<'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__1__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__2"
    // InternalPackageXML.g:2653:1: rule__BuildDependDependencyTag__Group__2 : rule__BuildDependDependencyTag__Group__2__Impl rule__BuildDependDependencyTag__Group__3 ;
    public final void rule__BuildDependDependencyTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2657:1: ( rule__BuildDependDependencyTag__Group__2__Impl rule__BuildDependDependencyTag__Group__3 )
            // InternalPackageXML.g:2658:2: rule__BuildDependDependencyTag__Group__2__Impl rule__BuildDependDependencyTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__BuildDependDependencyTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__2"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__2__Impl"
    // InternalPackageXML.g:2665:1: rule__BuildDependDependencyTag__Group__2__Impl : ( 'build_depend' ) ;
    public final void rule__BuildDependDependencyTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2669:1: ( ( 'build_depend' ) )
            // InternalPackageXML.g:2670:1: ( 'build_depend' )
            {
            // InternalPackageXML.g:2670:1: ( 'build_depend' )
            // InternalPackageXML.g:2671:2: 'build_depend'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__2__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__3"
    // InternalPackageXML.g:2680:1: rule__BuildDependDependencyTag__Group__3 : rule__BuildDependDependencyTag__Group__3__Impl rule__BuildDependDependencyTag__Group__4 ;
    public final void rule__BuildDependDependencyTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2684:1: ( rule__BuildDependDependencyTag__Group__3__Impl rule__BuildDependDependencyTag__Group__4 )
            // InternalPackageXML.g:2685:2: rule__BuildDependDependencyTag__Group__3__Impl rule__BuildDependDependencyTag__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__BuildDependDependencyTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__3"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__3__Impl"
    // InternalPackageXML.g:2692:1: rule__BuildDependDependencyTag__Group__3__Impl : ( '>' ) ;
    public final void rule__BuildDependDependencyTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2696:1: ( ( '>' ) )
            // InternalPackageXML.g:2697:1: ( '>' )
            {
            // InternalPackageXML.g:2697:1: ( '>' )
            // InternalPackageXML.g:2698:2: '>'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__3__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__4"
    // InternalPackageXML.g:2707:1: rule__BuildDependDependencyTag__Group__4 : rule__BuildDependDependencyTag__Group__4__Impl rule__BuildDependDependencyTag__Group__5 ;
    public final void rule__BuildDependDependencyTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2711:1: ( rule__BuildDependDependencyTag__Group__4__Impl rule__BuildDependDependencyTag__Group__5 )
            // InternalPackageXML.g:2712:2: rule__BuildDependDependencyTag__Group__4__Impl rule__BuildDependDependencyTag__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__BuildDependDependencyTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__4"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__4__Impl"
    // InternalPackageXML.g:2719:1: rule__BuildDependDependencyTag__Group__4__Impl : ( ( rule__BuildDependDependencyTag__NameAssignment_4 ) ) ;
    public final void rule__BuildDependDependencyTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2723:1: ( ( ( rule__BuildDependDependencyTag__NameAssignment_4 ) ) )
            // InternalPackageXML.g:2724:1: ( ( rule__BuildDependDependencyTag__NameAssignment_4 ) )
            {
            // InternalPackageXML.g:2724:1: ( ( rule__BuildDependDependencyTag__NameAssignment_4 ) )
            // InternalPackageXML.g:2725:2: ( rule__BuildDependDependencyTag__NameAssignment_4 )
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getNameAssignment_4()); 
            // InternalPackageXML.g:2726:2: ( rule__BuildDependDependencyTag__NameAssignment_4 )
            // InternalPackageXML.g:2726:3: rule__BuildDependDependencyTag__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBuildDependDependencyTagAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__4__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__5"
    // InternalPackageXML.g:2734:1: rule__BuildDependDependencyTag__Group__5 : rule__BuildDependDependencyTag__Group__5__Impl rule__BuildDependDependencyTag__Group__6 ;
    public final void rule__BuildDependDependencyTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2738:1: ( rule__BuildDependDependencyTag__Group__5__Impl rule__BuildDependDependencyTag__Group__6 )
            // InternalPackageXML.g:2739:2: rule__BuildDependDependencyTag__Group__5__Impl rule__BuildDependDependencyTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__BuildDependDependencyTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__5"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__5__Impl"
    // InternalPackageXML.g:2746:1: rule__BuildDependDependencyTag__Group__5__Impl : ( '<' ) ;
    public final void rule__BuildDependDependencyTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2750:1: ( ( '<' ) )
            // InternalPackageXML.g:2751:1: ( '<' )
            {
            // InternalPackageXML.g:2751:1: ( '<' )
            // InternalPackageXML.g:2752:2: '<'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__5__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__6"
    // InternalPackageXML.g:2761:1: rule__BuildDependDependencyTag__Group__6 : rule__BuildDependDependencyTag__Group__6__Impl rule__BuildDependDependencyTag__Group__7 ;
    public final void rule__BuildDependDependencyTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2765:1: ( rule__BuildDependDependencyTag__Group__6__Impl rule__BuildDependDependencyTag__Group__7 )
            // InternalPackageXML.g:2766:2: rule__BuildDependDependencyTag__Group__6__Impl rule__BuildDependDependencyTag__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__BuildDependDependencyTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__6"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__6__Impl"
    // InternalPackageXML.g:2773:1: rule__BuildDependDependencyTag__Group__6__Impl : ( '/' ) ;
    public final void rule__BuildDependDependencyTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2777:1: ( ( '/' ) )
            // InternalPackageXML.g:2778:1: ( '/' )
            {
            // InternalPackageXML.g:2778:1: ( '/' )
            // InternalPackageXML.g:2779:2: '/'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__6__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__7"
    // InternalPackageXML.g:2788:1: rule__BuildDependDependencyTag__Group__7 : rule__BuildDependDependencyTag__Group__7__Impl rule__BuildDependDependencyTag__Group__8 ;
    public final void rule__BuildDependDependencyTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2792:1: ( rule__BuildDependDependencyTag__Group__7__Impl rule__BuildDependDependencyTag__Group__8 )
            // InternalPackageXML.g:2793:2: rule__BuildDependDependencyTag__Group__7__Impl rule__BuildDependDependencyTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__BuildDependDependencyTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__7"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__7__Impl"
    // InternalPackageXML.g:2800:1: rule__BuildDependDependencyTag__Group__7__Impl : ( 'build_depend' ) ;
    public final void rule__BuildDependDependencyTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2804:1: ( ( 'build_depend' ) )
            // InternalPackageXML.g:2805:1: ( 'build_depend' )
            {
            // InternalPackageXML.g:2805:1: ( 'build_depend' )
            // InternalPackageXML.g:2806:2: 'build_depend'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__7__Impl"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__8"
    // InternalPackageXML.g:2815:1: rule__BuildDependDependencyTag__Group__8 : rule__BuildDependDependencyTag__Group__8__Impl ;
    public final void rule__BuildDependDependencyTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2819:1: ( rule__BuildDependDependencyTag__Group__8__Impl )
            // InternalPackageXML.g:2820:2: rule__BuildDependDependencyTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildDependDependencyTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__8"


    // $ANTLR start "rule__BuildDependDependencyTag__Group__8__Impl"
    // InternalPackageXML.g:2826:1: rule__BuildDependDependencyTag__Group__8__Impl : ( '>' ) ;
    public final void rule__BuildDependDependencyTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2830:1: ( ( '>' ) )
            // InternalPackageXML.g:2831:1: ( '>' )
            {
            // InternalPackageXML.g:2831:1: ( '>' )
            // InternalPackageXML.g:2832:2: '>'
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__Group__8__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__0"
    // InternalPackageXML.g:2842:1: rule__ExecDependDependencyTag__Group__0 : rule__ExecDependDependencyTag__Group__0__Impl rule__ExecDependDependencyTag__Group__1 ;
    public final void rule__ExecDependDependencyTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2846:1: ( rule__ExecDependDependencyTag__Group__0__Impl rule__ExecDependDependencyTag__Group__1 )
            // InternalPackageXML.g:2847:2: rule__ExecDependDependencyTag__Group__0__Impl rule__ExecDependDependencyTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExecDependDependencyTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__0"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__0__Impl"
    // InternalPackageXML.g:2854:1: rule__ExecDependDependencyTag__Group__0__Impl : ( () ) ;
    public final void rule__ExecDependDependencyTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2858:1: ( ( () ) )
            // InternalPackageXML.g:2859:1: ( () )
            {
            // InternalPackageXML.g:2859:1: ( () )
            // InternalPackageXML.g:2860:2: ()
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getExecDependDependencyTagAction_0()); 
            // InternalPackageXML.g:2861:2: ()
            // InternalPackageXML.g:2861:3: 
            {
            }

             after(grammarAccess.getExecDependDependencyTagAccess().getExecDependDependencyTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__0__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__1"
    // InternalPackageXML.g:2869:1: rule__ExecDependDependencyTag__Group__1 : rule__ExecDependDependencyTag__Group__1__Impl rule__ExecDependDependencyTag__Group__2 ;
    public final void rule__ExecDependDependencyTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2873:1: ( rule__ExecDependDependencyTag__Group__1__Impl rule__ExecDependDependencyTag__Group__2 )
            // InternalPackageXML.g:2874:2: rule__ExecDependDependencyTag__Group__1__Impl rule__ExecDependDependencyTag__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__ExecDependDependencyTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__1"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__1__Impl"
    // InternalPackageXML.g:2881:1: rule__ExecDependDependencyTag__Group__1__Impl : ( '<' ) ;
    public final void rule__ExecDependDependencyTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2885:1: ( ( '<' ) )
            // InternalPackageXML.g:2886:1: ( '<' )
            {
            // InternalPackageXML.g:2886:1: ( '<' )
            // InternalPackageXML.g:2887:2: '<'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__1__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__2"
    // InternalPackageXML.g:2896:1: rule__ExecDependDependencyTag__Group__2 : rule__ExecDependDependencyTag__Group__2__Impl rule__ExecDependDependencyTag__Group__3 ;
    public final void rule__ExecDependDependencyTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2900:1: ( rule__ExecDependDependencyTag__Group__2__Impl rule__ExecDependDependencyTag__Group__3 )
            // InternalPackageXML.g:2901:2: rule__ExecDependDependencyTag__Group__2__Impl rule__ExecDependDependencyTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ExecDependDependencyTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__2"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__2__Impl"
    // InternalPackageXML.g:2908:1: rule__ExecDependDependencyTag__Group__2__Impl : ( 'exec_depend' ) ;
    public final void rule__ExecDependDependencyTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2912:1: ( ( 'exec_depend' ) )
            // InternalPackageXML.g:2913:1: ( 'exec_depend' )
            {
            // InternalPackageXML.g:2913:1: ( 'exec_depend' )
            // InternalPackageXML.g:2914:2: 'exec_depend'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__2__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__3"
    // InternalPackageXML.g:2923:1: rule__ExecDependDependencyTag__Group__3 : rule__ExecDependDependencyTag__Group__3__Impl rule__ExecDependDependencyTag__Group__4 ;
    public final void rule__ExecDependDependencyTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2927:1: ( rule__ExecDependDependencyTag__Group__3__Impl rule__ExecDependDependencyTag__Group__4 )
            // InternalPackageXML.g:2928:2: rule__ExecDependDependencyTag__Group__3__Impl rule__ExecDependDependencyTag__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ExecDependDependencyTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__3"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__3__Impl"
    // InternalPackageXML.g:2935:1: rule__ExecDependDependencyTag__Group__3__Impl : ( '>' ) ;
    public final void rule__ExecDependDependencyTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2939:1: ( ( '>' ) )
            // InternalPackageXML.g:2940:1: ( '>' )
            {
            // InternalPackageXML.g:2940:1: ( '>' )
            // InternalPackageXML.g:2941:2: '>'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__3__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__4"
    // InternalPackageXML.g:2950:1: rule__ExecDependDependencyTag__Group__4 : rule__ExecDependDependencyTag__Group__4__Impl rule__ExecDependDependencyTag__Group__5 ;
    public final void rule__ExecDependDependencyTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2954:1: ( rule__ExecDependDependencyTag__Group__4__Impl rule__ExecDependDependencyTag__Group__5 )
            // InternalPackageXML.g:2955:2: rule__ExecDependDependencyTag__Group__4__Impl rule__ExecDependDependencyTag__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ExecDependDependencyTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__4"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__4__Impl"
    // InternalPackageXML.g:2962:1: rule__ExecDependDependencyTag__Group__4__Impl : ( ( rule__ExecDependDependencyTag__NameAssignment_4 ) ) ;
    public final void rule__ExecDependDependencyTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2966:1: ( ( ( rule__ExecDependDependencyTag__NameAssignment_4 ) ) )
            // InternalPackageXML.g:2967:1: ( ( rule__ExecDependDependencyTag__NameAssignment_4 ) )
            {
            // InternalPackageXML.g:2967:1: ( ( rule__ExecDependDependencyTag__NameAssignment_4 ) )
            // InternalPackageXML.g:2968:2: ( rule__ExecDependDependencyTag__NameAssignment_4 )
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getNameAssignment_4()); 
            // InternalPackageXML.g:2969:2: ( rule__ExecDependDependencyTag__NameAssignment_4 )
            // InternalPackageXML.g:2969:3: rule__ExecDependDependencyTag__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExecDependDependencyTagAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__4__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__5"
    // InternalPackageXML.g:2977:1: rule__ExecDependDependencyTag__Group__5 : rule__ExecDependDependencyTag__Group__5__Impl rule__ExecDependDependencyTag__Group__6 ;
    public final void rule__ExecDependDependencyTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2981:1: ( rule__ExecDependDependencyTag__Group__5__Impl rule__ExecDependDependencyTag__Group__6 )
            // InternalPackageXML.g:2982:2: rule__ExecDependDependencyTag__Group__5__Impl rule__ExecDependDependencyTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ExecDependDependencyTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__5"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__5__Impl"
    // InternalPackageXML.g:2989:1: rule__ExecDependDependencyTag__Group__5__Impl : ( '<' ) ;
    public final void rule__ExecDependDependencyTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:2993:1: ( ( '<' ) )
            // InternalPackageXML.g:2994:1: ( '<' )
            {
            // InternalPackageXML.g:2994:1: ( '<' )
            // InternalPackageXML.g:2995:2: '<'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__5__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__6"
    // InternalPackageXML.g:3004:1: rule__ExecDependDependencyTag__Group__6 : rule__ExecDependDependencyTag__Group__6__Impl rule__ExecDependDependencyTag__Group__7 ;
    public final void rule__ExecDependDependencyTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3008:1: ( rule__ExecDependDependencyTag__Group__6__Impl rule__ExecDependDependencyTag__Group__7 )
            // InternalPackageXML.g:3009:2: rule__ExecDependDependencyTag__Group__6__Impl rule__ExecDependDependencyTag__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ExecDependDependencyTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__6"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__6__Impl"
    // InternalPackageXML.g:3016:1: rule__ExecDependDependencyTag__Group__6__Impl : ( '/' ) ;
    public final void rule__ExecDependDependencyTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3020:1: ( ( '/' ) )
            // InternalPackageXML.g:3021:1: ( '/' )
            {
            // InternalPackageXML.g:3021:1: ( '/' )
            // InternalPackageXML.g:3022:2: '/'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__6__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__7"
    // InternalPackageXML.g:3031:1: rule__ExecDependDependencyTag__Group__7 : rule__ExecDependDependencyTag__Group__7__Impl rule__ExecDependDependencyTag__Group__8 ;
    public final void rule__ExecDependDependencyTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3035:1: ( rule__ExecDependDependencyTag__Group__7__Impl rule__ExecDependDependencyTag__Group__8 )
            // InternalPackageXML.g:3036:2: rule__ExecDependDependencyTag__Group__7__Impl rule__ExecDependDependencyTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ExecDependDependencyTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__7"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__7__Impl"
    // InternalPackageXML.g:3043:1: rule__ExecDependDependencyTag__Group__7__Impl : ( 'exec_depend' ) ;
    public final void rule__ExecDependDependencyTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3047:1: ( ( 'exec_depend' ) )
            // InternalPackageXML.g:3048:1: ( 'exec_depend' )
            {
            // InternalPackageXML.g:3048:1: ( 'exec_depend' )
            // InternalPackageXML.g:3049:2: 'exec_depend'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__7__Impl"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__8"
    // InternalPackageXML.g:3058:1: rule__ExecDependDependencyTag__Group__8 : rule__ExecDependDependencyTag__Group__8__Impl ;
    public final void rule__ExecDependDependencyTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3062:1: ( rule__ExecDependDependencyTag__Group__8__Impl )
            // InternalPackageXML.g:3063:2: rule__ExecDependDependencyTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecDependDependencyTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__8"


    // $ANTLR start "rule__ExecDependDependencyTag__Group__8__Impl"
    // InternalPackageXML.g:3069:1: rule__ExecDependDependencyTag__Group__8__Impl : ( '>' ) ;
    public final void rule__ExecDependDependencyTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3073:1: ( ( '>' ) )
            // InternalPackageXML.g:3074:1: ( '>' )
            {
            // InternalPackageXML.g:3074:1: ( '>' )
            // InternalPackageXML.g:3075:2: '>'
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__Group__8__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__0"
    // InternalPackageXML.g:3085:1: rule__BuildToolDependDependencyTag__Group__0 : rule__BuildToolDependDependencyTag__Group__0__Impl rule__BuildToolDependDependencyTag__Group__1 ;
    public final void rule__BuildToolDependDependencyTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3089:1: ( rule__BuildToolDependDependencyTag__Group__0__Impl rule__BuildToolDependDependencyTag__Group__1 )
            // InternalPackageXML.g:3090:2: rule__BuildToolDependDependencyTag__Group__0__Impl rule__BuildToolDependDependencyTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__BuildToolDependDependencyTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__0"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__0__Impl"
    // InternalPackageXML.g:3097:1: rule__BuildToolDependDependencyTag__Group__0__Impl : ( () ) ;
    public final void rule__BuildToolDependDependencyTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3101:1: ( ( () ) )
            // InternalPackageXML.g:3102:1: ( () )
            {
            // InternalPackageXML.g:3102:1: ( () )
            // InternalPackageXML.g:3103:2: ()
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildToolDependDependencyTagAction_0()); 
            // InternalPackageXML.g:3104:2: ()
            // InternalPackageXML.g:3104:3: 
            {
            }

             after(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildToolDependDependencyTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__0__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__1"
    // InternalPackageXML.g:3112:1: rule__BuildToolDependDependencyTag__Group__1 : rule__BuildToolDependDependencyTag__Group__1__Impl rule__BuildToolDependDependencyTag__Group__2 ;
    public final void rule__BuildToolDependDependencyTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3116:1: ( rule__BuildToolDependDependencyTag__Group__1__Impl rule__BuildToolDependDependencyTag__Group__2 )
            // InternalPackageXML.g:3117:2: rule__BuildToolDependDependencyTag__Group__1__Impl rule__BuildToolDependDependencyTag__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__BuildToolDependDependencyTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__1"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__1__Impl"
    // InternalPackageXML.g:3124:1: rule__BuildToolDependDependencyTag__Group__1__Impl : ( '<' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3128:1: ( ( '<' ) )
            // InternalPackageXML.g:3129:1: ( '<' )
            {
            // InternalPackageXML.g:3129:1: ( '<' )
            // InternalPackageXML.g:3130:2: '<'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__1__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__2"
    // InternalPackageXML.g:3139:1: rule__BuildToolDependDependencyTag__Group__2 : rule__BuildToolDependDependencyTag__Group__2__Impl rule__BuildToolDependDependencyTag__Group__3 ;
    public final void rule__BuildToolDependDependencyTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3143:1: ( rule__BuildToolDependDependencyTag__Group__2__Impl rule__BuildToolDependDependencyTag__Group__3 )
            // InternalPackageXML.g:3144:2: rule__BuildToolDependDependencyTag__Group__2__Impl rule__BuildToolDependDependencyTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__BuildToolDependDependencyTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__2"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__2__Impl"
    // InternalPackageXML.g:3151:1: rule__BuildToolDependDependencyTag__Group__2__Impl : ( 'buildtool_depend' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3155:1: ( ( 'buildtool_depend' ) )
            // InternalPackageXML.g:3156:1: ( 'buildtool_depend' )
            {
            // InternalPackageXML.g:3156:1: ( 'buildtool_depend' )
            // InternalPackageXML.g:3157:2: 'buildtool_depend'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__2__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__3"
    // InternalPackageXML.g:3166:1: rule__BuildToolDependDependencyTag__Group__3 : rule__BuildToolDependDependencyTag__Group__3__Impl rule__BuildToolDependDependencyTag__Group__4 ;
    public final void rule__BuildToolDependDependencyTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3170:1: ( rule__BuildToolDependDependencyTag__Group__3__Impl rule__BuildToolDependDependencyTag__Group__4 )
            // InternalPackageXML.g:3171:2: rule__BuildToolDependDependencyTag__Group__3__Impl rule__BuildToolDependDependencyTag__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__BuildToolDependDependencyTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__3"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__3__Impl"
    // InternalPackageXML.g:3178:1: rule__BuildToolDependDependencyTag__Group__3__Impl : ( '>' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3182:1: ( ( '>' ) )
            // InternalPackageXML.g:3183:1: ( '>' )
            {
            // InternalPackageXML.g:3183:1: ( '>' )
            // InternalPackageXML.g:3184:2: '>'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__3__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__4"
    // InternalPackageXML.g:3193:1: rule__BuildToolDependDependencyTag__Group__4 : rule__BuildToolDependDependencyTag__Group__4__Impl rule__BuildToolDependDependencyTag__Group__5 ;
    public final void rule__BuildToolDependDependencyTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3197:1: ( rule__BuildToolDependDependencyTag__Group__4__Impl rule__BuildToolDependDependencyTag__Group__5 )
            // InternalPackageXML.g:3198:2: rule__BuildToolDependDependencyTag__Group__4__Impl rule__BuildToolDependDependencyTag__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__BuildToolDependDependencyTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__4"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__4__Impl"
    // InternalPackageXML.g:3205:1: rule__BuildToolDependDependencyTag__Group__4__Impl : ( ( rule__BuildToolDependDependencyTag__NameAssignment_4 ) ) ;
    public final void rule__BuildToolDependDependencyTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3209:1: ( ( ( rule__BuildToolDependDependencyTag__NameAssignment_4 ) ) )
            // InternalPackageXML.g:3210:1: ( ( rule__BuildToolDependDependencyTag__NameAssignment_4 ) )
            {
            // InternalPackageXML.g:3210:1: ( ( rule__BuildToolDependDependencyTag__NameAssignment_4 ) )
            // InternalPackageXML.g:3211:2: ( rule__BuildToolDependDependencyTag__NameAssignment_4 )
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getNameAssignment_4()); 
            // InternalPackageXML.g:3212:2: ( rule__BuildToolDependDependencyTag__NameAssignment_4 )
            // InternalPackageXML.g:3212:3: rule__BuildToolDependDependencyTag__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBuildToolDependDependencyTagAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__4__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__5"
    // InternalPackageXML.g:3220:1: rule__BuildToolDependDependencyTag__Group__5 : rule__BuildToolDependDependencyTag__Group__5__Impl rule__BuildToolDependDependencyTag__Group__6 ;
    public final void rule__BuildToolDependDependencyTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3224:1: ( rule__BuildToolDependDependencyTag__Group__5__Impl rule__BuildToolDependDependencyTag__Group__6 )
            // InternalPackageXML.g:3225:2: rule__BuildToolDependDependencyTag__Group__5__Impl rule__BuildToolDependDependencyTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__BuildToolDependDependencyTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__5"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__5__Impl"
    // InternalPackageXML.g:3232:1: rule__BuildToolDependDependencyTag__Group__5__Impl : ( '<' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3236:1: ( ( '<' ) )
            // InternalPackageXML.g:3237:1: ( '<' )
            {
            // InternalPackageXML.g:3237:1: ( '<' )
            // InternalPackageXML.g:3238:2: '<'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__5__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__6"
    // InternalPackageXML.g:3247:1: rule__BuildToolDependDependencyTag__Group__6 : rule__BuildToolDependDependencyTag__Group__6__Impl rule__BuildToolDependDependencyTag__Group__7 ;
    public final void rule__BuildToolDependDependencyTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3251:1: ( rule__BuildToolDependDependencyTag__Group__6__Impl rule__BuildToolDependDependencyTag__Group__7 )
            // InternalPackageXML.g:3252:2: rule__BuildToolDependDependencyTag__Group__6__Impl rule__BuildToolDependDependencyTag__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__BuildToolDependDependencyTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__6"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__6__Impl"
    // InternalPackageXML.g:3259:1: rule__BuildToolDependDependencyTag__Group__6__Impl : ( '/' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3263:1: ( ( '/' ) )
            // InternalPackageXML.g:3264:1: ( '/' )
            {
            // InternalPackageXML.g:3264:1: ( '/' )
            // InternalPackageXML.g:3265:2: '/'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__6__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__7"
    // InternalPackageXML.g:3274:1: rule__BuildToolDependDependencyTag__Group__7 : rule__BuildToolDependDependencyTag__Group__7__Impl rule__BuildToolDependDependencyTag__Group__8 ;
    public final void rule__BuildToolDependDependencyTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3278:1: ( rule__BuildToolDependDependencyTag__Group__7__Impl rule__BuildToolDependDependencyTag__Group__8 )
            // InternalPackageXML.g:3279:2: rule__BuildToolDependDependencyTag__Group__7__Impl rule__BuildToolDependDependencyTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__BuildToolDependDependencyTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__7"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__7__Impl"
    // InternalPackageXML.g:3286:1: rule__BuildToolDependDependencyTag__Group__7__Impl : ( 'buildtool_depend' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3290:1: ( ( 'buildtool_depend' ) )
            // InternalPackageXML.g:3291:1: ( 'buildtool_depend' )
            {
            // InternalPackageXML.g:3291:1: ( 'buildtool_depend' )
            // InternalPackageXML.g:3292:2: 'buildtool_depend'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__7__Impl"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__8"
    // InternalPackageXML.g:3301:1: rule__BuildToolDependDependencyTag__Group__8 : rule__BuildToolDependDependencyTag__Group__8__Impl ;
    public final void rule__BuildToolDependDependencyTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3305:1: ( rule__BuildToolDependDependencyTag__Group__8__Impl )
            // InternalPackageXML.g:3306:2: rule__BuildToolDependDependencyTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BuildToolDependDependencyTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__8"


    // $ANTLR start "rule__BuildToolDependDependencyTag__Group__8__Impl"
    // InternalPackageXML.g:3312:1: rule__BuildToolDependDependencyTag__Group__8__Impl : ( '>' ) ;
    public final void rule__BuildToolDependDependencyTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3316:1: ( ( '>' ) )
            // InternalPackageXML.g:3317:1: ( '>' )
            {
            // InternalPackageXML.g:3317:1: ( '>' )
            // InternalPackageXML.g:3318:2: '>'
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__Group__8__Impl"


    // $ANTLR start "rule__ExportTag__Group__0"
    // InternalPackageXML.g:3328:1: rule__ExportTag__Group__0 : rule__ExportTag__Group__0__Impl rule__ExportTag__Group__1 ;
    public final void rule__ExportTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3332:1: ( rule__ExportTag__Group__0__Impl rule__ExportTag__Group__1 )
            // InternalPackageXML.g:3333:2: rule__ExportTag__Group__0__Impl rule__ExportTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ExportTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__0"


    // $ANTLR start "rule__ExportTag__Group__0__Impl"
    // InternalPackageXML.g:3340:1: rule__ExportTag__Group__0__Impl : ( () ) ;
    public final void rule__ExportTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3344:1: ( ( () ) )
            // InternalPackageXML.g:3345:1: ( () )
            {
            // InternalPackageXML.g:3345:1: ( () )
            // InternalPackageXML.g:3346:2: ()
            {
             before(grammarAccess.getExportTagAccess().getExportTagAction_0()); 
            // InternalPackageXML.g:3347:2: ()
            // InternalPackageXML.g:3347:3: 
            {
            }

             after(grammarAccess.getExportTagAccess().getExportTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__0__Impl"


    // $ANTLR start "rule__ExportTag__Group__1"
    // InternalPackageXML.g:3355:1: rule__ExportTag__Group__1 : rule__ExportTag__Group__1__Impl rule__ExportTag__Group__2 ;
    public final void rule__ExportTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3359:1: ( rule__ExportTag__Group__1__Impl rule__ExportTag__Group__2 )
            // InternalPackageXML.g:3360:2: rule__ExportTag__Group__1__Impl rule__ExportTag__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ExportTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__1"


    // $ANTLR start "rule__ExportTag__Group__1__Impl"
    // InternalPackageXML.g:3367:1: rule__ExportTag__Group__1__Impl : ( '<' ) ;
    public final void rule__ExportTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3371:1: ( ( '<' ) )
            // InternalPackageXML.g:3372:1: ( '<' )
            {
            // InternalPackageXML.g:3372:1: ( '<' )
            // InternalPackageXML.g:3373:2: '<'
            {
             before(grammarAccess.getExportTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__1__Impl"


    // $ANTLR start "rule__ExportTag__Group__2"
    // InternalPackageXML.g:3382:1: rule__ExportTag__Group__2 : rule__ExportTag__Group__2__Impl rule__ExportTag__Group__3 ;
    public final void rule__ExportTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3386:1: ( rule__ExportTag__Group__2__Impl rule__ExportTag__Group__3 )
            // InternalPackageXML.g:3387:2: rule__ExportTag__Group__2__Impl rule__ExportTag__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ExportTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__2"


    // $ANTLR start "rule__ExportTag__Group__2__Impl"
    // InternalPackageXML.g:3394:1: rule__ExportTag__Group__2__Impl : ( 'export' ) ;
    public final void rule__ExportTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3398:1: ( ( 'export' ) )
            // InternalPackageXML.g:3399:1: ( 'export' )
            {
            // InternalPackageXML.g:3399:1: ( 'export' )
            // InternalPackageXML.g:3400:2: 'export'
            {
             before(grammarAccess.getExportTagAccess().getExportKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getExportKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__2__Impl"


    // $ANTLR start "rule__ExportTag__Group__3"
    // InternalPackageXML.g:3409:1: rule__ExportTag__Group__3 : rule__ExportTag__Group__3__Impl rule__ExportTag__Group__4 ;
    public final void rule__ExportTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3413:1: ( rule__ExportTag__Group__3__Impl rule__ExportTag__Group__4 )
            // InternalPackageXML.g:3414:2: rule__ExportTag__Group__3__Impl rule__ExportTag__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ExportTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__3"


    // $ANTLR start "rule__ExportTag__Group__3__Impl"
    // InternalPackageXML.g:3421:1: rule__ExportTag__Group__3__Impl : ( '>' ) ;
    public final void rule__ExportTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3425:1: ( ( '>' ) )
            // InternalPackageXML.g:3426:1: ( '>' )
            {
            // InternalPackageXML.g:3426:1: ( '>' )
            // InternalPackageXML.g:3427:2: '>'
            {
             before(grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__3__Impl"


    // $ANTLR start "rule__ExportTag__Group__4"
    // InternalPackageXML.g:3436:1: rule__ExportTag__Group__4 : rule__ExportTag__Group__4__Impl rule__ExportTag__Group__5 ;
    public final void rule__ExportTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3440:1: ( rule__ExportTag__Group__4__Impl rule__ExportTag__Group__5 )
            // InternalPackageXML.g:3441:2: rule__ExportTag__Group__4__Impl rule__ExportTag__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ExportTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__4"


    // $ANTLR start "rule__ExportTag__Group__4__Impl"
    // InternalPackageXML.g:3448:1: rule__ExportTag__Group__4__Impl : ( ( rule__ExportTag__Arbitrary_tagsAssignment_4 )* ) ;
    public final void rule__ExportTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3452:1: ( ( ( rule__ExportTag__Arbitrary_tagsAssignment_4 )* ) )
            // InternalPackageXML.g:3453:1: ( ( rule__ExportTag__Arbitrary_tagsAssignment_4 )* )
            {
            // InternalPackageXML.g:3453:1: ( ( rule__ExportTag__Arbitrary_tagsAssignment_4 )* )
            // InternalPackageXML.g:3454:2: ( rule__ExportTag__Arbitrary_tagsAssignment_4 )*
            {
             before(grammarAccess.getExportTagAccess().getArbitrary_tagsAssignment_4()); 
            // InternalPackageXML.g:3455:2: ( rule__ExportTag__Arbitrary_tagsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalPackageXML.g:3455:3: rule__ExportTag__Arbitrary_tagsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ExportTag__Arbitrary_tagsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getExportTagAccess().getArbitrary_tagsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__4__Impl"


    // $ANTLR start "rule__ExportTag__Group__5"
    // InternalPackageXML.g:3463:1: rule__ExportTag__Group__5 : rule__ExportTag__Group__5__Impl rule__ExportTag__Group__6 ;
    public final void rule__ExportTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3467:1: ( rule__ExportTag__Group__5__Impl rule__ExportTag__Group__6 )
            // InternalPackageXML.g:3468:2: rule__ExportTag__Group__5__Impl rule__ExportTag__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__ExportTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__5"


    // $ANTLR start "rule__ExportTag__Group__5__Impl"
    // InternalPackageXML.g:3475:1: rule__ExportTag__Group__5__Impl : ( '<' ) ;
    public final void rule__ExportTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3479:1: ( ( '<' ) )
            // InternalPackageXML.g:3480:1: ( '<' )
            {
            // InternalPackageXML.g:3480:1: ( '<' )
            // InternalPackageXML.g:3481:2: '<'
            {
             before(grammarAccess.getExportTagAccess().getLessThanSignKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getLessThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__5__Impl"


    // $ANTLR start "rule__ExportTag__Group__6"
    // InternalPackageXML.g:3490:1: rule__ExportTag__Group__6 : rule__ExportTag__Group__6__Impl rule__ExportTag__Group__7 ;
    public final void rule__ExportTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3494:1: ( rule__ExportTag__Group__6__Impl rule__ExportTag__Group__7 )
            // InternalPackageXML.g:3495:2: rule__ExportTag__Group__6__Impl rule__ExportTag__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__ExportTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__6"


    // $ANTLR start "rule__ExportTag__Group__6__Impl"
    // InternalPackageXML.g:3502:1: rule__ExportTag__Group__6__Impl : ( '/' ) ;
    public final void rule__ExportTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3506:1: ( ( '/' ) )
            // InternalPackageXML.g:3507:1: ( '/' )
            {
            // InternalPackageXML.g:3507:1: ( '/' )
            // InternalPackageXML.g:3508:2: '/'
            {
             before(grammarAccess.getExportTagAccess().getSolidusKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getSolidusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__6__Impl"


    // $ANTLR start "rule__ExportTag__Group__7"
    // InternalPackageXML.g:3517:1: rule__ExportTag__Group__7 : rule__ExportTag__Group__7__Impl rule__ExportTag__Group__8 ;
    public final void rule__ExportTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3521:1: ( rule__ExportTag__Group__7__Impl rule__ExportTag__Group__8 )
            // InternalPackageXML.g:3522:2: rule__ExportTag__Group__7__Impl rule__ExportTag__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__ExportTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__7"


    // $ANTLR start "rule__ExportTag__Group__7__Impl"
    // InternalPackageXML.g:3529:1: rule__ExportTag__Group__7__Impl : ( 'export' ) ;
    public final void rule__ExportTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3533:1: ( ( 'export' ) )
            // InternalPackageXML.g:3534:1: ( 'export' )
            {
            // InternalPackageXML.g:3534:1: ( 'export' )
            // InternalPackageXML.g:3535:2: 'export'
            {
             before(grammarAccess.getExportTagAccess().getExportKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getExportKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__7__Impl"


    // $ANTLR start "rule__ExportTag__Group__8"
    // InternalPackageXML.g:3544:1: rule__ExportTag__Group__8 : rule__ExportTag__Group__8__Impl ;
    public final void rule__ExportTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3548:1: ( rule__ExportTag__Group__8__Impl )
            // InternalPackageXML.g:3549:2: rule__ExportTag__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExportTag__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__8"


    // $ANTLR start "rule__ExportTag__Group__8__Impl"
    // InternalPackageXML.g:3555:1: rule__ExportTag__Group__8__Impl : ( '>' ) ;
    public final void rule__ExportTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3559:1: ( ( '>' ) )
            // InternalPackageXML.g:3560:1: ( '>' )
            {
            // InternalPackageXML.g:3560:1: ( '>' )
            // InternalPackageXML.g:3561:2: '>'
            {
             before(grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Group__8__Impl"


    // $ANTLR start "rule__AuthorTag__Group__0"
    // InternalPackageXML.g:3571:1: rule__AuthorTag__Group__0 : rule__AuthorTag__Group__0__Impl rule__AuthorTag__Group__1 ;
    public final void rule__AuthorTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3575:1: ( rule__AuthorTag__Group__0__Impl rule__AuthorTag__Group__1 )
            // InternalPackageXML.g:3576:2: rule__AuthorTag__Group__0__Impl rule__AuthorTag__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AuthorTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__0"


    // $ANTLR start "rule__AuthorTag__Group__0__Impl"
    // InternalPackageXML.g:3583:1: rule__AuthorTag__Group__0__Impl : ( () ) ;
    public final void rule__AuthorTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3587:1: ( ( () ) )
            // InternalPackageXML.g:3588:1: ( () )
            {
            // InternalPackageXML.g:3588:1: ( () )
            // InternalPackageXML.g:3589:2: ()
            {
             before(grammarAccess.getAuthorTagAccess().getAuthorTagAction_0()); 
            // InternalPackageXML.g:3590:2: ()
            // InternalPackageXML.g:3590:3: 
            {
            }

             after(grammarAccess.getAuthorTagAccess().getAuthorTagAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__0__Impl"


    // $ANTLR start "rule__AuthorTag__Group__1"
    // InternalPackageXML.g:3598:1: rule__AuthorTag__Group__1 : rule__AuthorTag__Group__1__Impl rule__AuthorTag__Group__2 ;
    public final void rule__AuthorTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3602:1: ( rule__AuthorTag__Group__1__Impl rule__AuthorTag__Group__2 )
            // InternalPackageXML.g:3603:2: rule__AuthorTag__Group__1__Impl rule__AuthorTag__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__AuthorTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__1"


    // $ANTLR start "rule__AuthorTag__Group__1__Impl"
    // InternalPackageXML.g:3610:1: rule__AuthorTag__Group__1__Impl : ( '<' ) ;
    public final void rule__AuthorTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3614:1: ( ( '<' ) )
            // InternalPackageXML.g:3615:1: ( '<' )
            {
            // InternalPackageXML.g:3615:1: ( '<' )
            // InternalPackageXML.g:3616:2: '<'
            {
             before(grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__1__Impl"


    // $ANTLR start "rule__AuthorTag__Group__2"
    // InternalPackageXML.g:3625:1: rule__AuthorTag__Group__2 : rule__AuthorTag__Group__2__Impl rule__AuthorTag__Group__3 ;
    public final void rule__AuthorTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3629:1: ( rule__AuthorTag__Group__2__Impl rule__AuthorTag__Group__3 )
            // InternalPackageXML.g:3630:2: rule__AuthorTag__Group__2__Impl rule__AuthorTag__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__AuthorTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__2"


    // $ANTLR start "rule__AuthorTag__Group__2__Impl"
    // InternalPackageXML.g:3637:1: rule__AuthorTag__Group__2__Impl : ( 'author' ) ;
    public final void rule__AuthorTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3641:1: ( ( 'author' ) )
            // InternalPackageXML.g:3642:1: ( 'author' )
            {
            // InternalPackageXML.g:3642:1: ( 'author' )
            // InternalPackageXML.g:3643:2: 'author'
            {
             before(grammarAccess.getAuthorTagAccess().getAuthorKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getAuthorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__2__Impl"


    // $ANTLR start "rule__AuthorTag__Group__3"
    // InternalPackageXML.g:3652:1: rule__AuthorTag__Group__3 : rule__AuthorTag__Group__3__Impl rule__AuthorTag__Group__4 ;
    public final void rule__AuthorTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3656:1: ( rule__AuthorTag__Group__3__Impl rule__AuthorTag__Group__4 )
            // InternalPackageXML.g:3657:2: rule__AuthorTag__Group__3__Impl rule__AuthorTag__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__AuthorTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__3"


    // $ANTLR start "rule__AuthorTag__Group__3__Impl"
    // InternalPackageXML.g:3664:1: rule__AuthorTag__Group__3__Impl : ( ( rule__AuthorTag__Group_3__0 )? ) ;
    public final void rule__AuthorTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3668:1: ( ( ( rule__AuthorTag__Group_3__0 )? ) )
            // InternalPackageXML.g:3669:1: ( ( rule__AuthorTag__Group_3__0 )? )
            {
            // InternalPackageXML.g:3669:1: ( ( rule__AuthorTag__Group_3__0 )? )
            // InternalPackageXML.g:3670:2: ( rule__AuthorTag__Group_3__0 )?
            {
             before(grammarAccess.getAuthorTagAccess().getGroup_3()); 
            // InternalPackageXML.g:3671:2: ( rule__AuthorTag__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPackageXML.g:3671:3: rule__AuthorTag__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AuthorTag__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAuthorTagAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__3__Impl"


    // $ANTLR start "rule__AuthorTag__Group__4"
    // InternalPackageXML.g:3679:1: rule__AuthorTag__Group__4 : rule__AuthorTag__Group__4__Impl rule__AuthorTag__Group__5 ;
    public final void rule__AuthorTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3683:1: ( rule__AuthorTag__Group__4__Impl rule__AuthorTag__Group__5 )
            // InternalPackageXML.g:3684:2: rule__AuthorTag__Group__4__Impl rule__AuthorTag__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__AuthorTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__4"


    // $ANTLR start "rule__AuthorTag__Group__4__Impl"
    // InternalPackageXML.g:3691:1: rule__AuthorTag__Group__4__Impl : ( '>' ) ;
    public final void rule__AuthorTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3695:1: ( ( '>' ) )
            // InternalPackageXML.g:3696:1: ( '>' )
            {
            // InternalPackageXML.g:3696:1: ( '>' )
            // InternalPackageXML.g:3697:2: '>'
            {
             before(grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__4__Impl"


    // $ANTLR start "rule__AuthorTag__Group__5"
    // InternalPackageXML.g:3706:1: rule__AuthorTag__Group__5 : rule__AuthorTag__Group__5__Impl rule__AuthorTag__Group__6 ;
    public final void rule__AuthorTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3710:1: ( rule__AuthorTag__Group__5__Impl rule__AuthorTag__Group__6 )
            // InternalPackageXML.g:3711:2: rule__AuthorTag__Group__5__Impl rule__AuthorTag__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__AuthorTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__5"


    // $ANTLR start "rule__AuthorTag__Group__5__Impl"
    // InternalPackageXML.g:3718:1: rule__AuthorTag__Group__5__Impl : ( ( rule__AuthorTag__AuthorTextAssignment_5 )* ) ;
    public final void rule__AuthorTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3722:1: ( ( ( rule__AuthorTag__AuthorTextAssignment_5 )* ) )
            // InternalPackageXML.g:3723:1: ( ( rule__AuthorTag__AuthorTextAssignment_5 )* )
            {
            // InternalPackageXML.g:3723:1: ( ( rule__AuthorTag__AuthorTextAssignment_5 )* )
            // InternalPackageXML.g:3724:2: ( rule__AuthorTag__AuthorTextAssignment_5 )*
            {
             before(grammarAccess.getAuthorTagAccess().getAuthorTextAssignment_5()); 
            // InternalPackageXML.g:3725:2: ( rule__AuthorTag__AuthorTextAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPackageXML.g:3725:3: rule__AuthorTag__AuthorTextAssignment_5
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AuthorTag__AuthorTextAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAuthorTagAccess().getAuthorTextAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__5__Impl"


    // $ANTLR start "rule__AuthorTag__Group__6"
    // InternalPackageXML.g:3733:1: rule__AuthorTag__Group__6 : rule__AuthorTag__Group__6__Impl rule__AuthorTag__Group__7 ;
    public final void rule__AuthorTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3737:1: ( rule__AuthorTag__Group__6__Impl rule__AuthorTag__Group__7 )
            // InternalPackageXML.g:3738:2: rule__AuthorTag__Group__6__Impl rule__AuthorTag__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__AuthorTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__6"


    // $ANTLR start "rule__AuthorTag__Group__6__Impl"
    // InternalPackageXML.g:3745:1: rule__AuthorTag__Group__6__Impl : ( '<' ) ;
    public final void rule__AuthorTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3749:1: ( ( '<' ) )
            // InternalPackageXML.g:3750:1: ( '<' )
            {
            // InternalPackageXML.g:3750:1: ( '<' )
            // InternalPackageXML.g:3751:2: '<'
            {
             before(grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__6__Impl"


    // $ANTLR start "rule__AuthorTag__Group__7"
    // InternalPackageXML.g:3760:1: rule__AuthorTag__Group__7 : rule__AuthorTag__Group__7__Impl rule__AuthorTag__Group__8 ;
    public final void rule__AuthorTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3764:1: ( rule__AuthorTag__Group__7__Impl rule__AuthorTag__Group__8 )
            // InternalPackageXML.g:3765:2: rule__AuthorTag__Group__7__Impl rule__AuthorTag__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__AuthorTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__7"


    // $ANTLR start "rule__AuthorTag__Group__7__Impl"
    // InternalPackageXML.g:3772:1: rule__AuthorTag__Group__7__Impl : ( '/' ) ;
    public final void rule__AuthorTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3776:1: ( ( '/' ) )
            // InternalPackageXML.g:3777:1: ( '/' )
            {
            // InternalPackageXML.g:3777:1: ( '/' )
            // InternalPackageXML.g:3778:2: '/'
            {
             before(grammarAccess.getAuthorTagAccess().getSolidusKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getSolidusKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__7__Impl"


    // $ANTLR start "rule__AuthorTag__Group__8"
    // InternalPackageXML.g:3787:1: rule__AuthorTag__Group__8 : rule__AuthorTag__Group__8__Impl rule__AuthorTag__Group__9 ;
    public final void rule__AuthorTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3791:1: ( rule__AuthorTag__Group__8__Impl rule__AuthorTag__Group__9 )
            // InternalPackageXML.g:3792:2: rule__AuthorTag__Group__8__Impl rule__AuthorTag__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__AuthorTag__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__8"


    // $ANTLR start "rule__AuthorTag__Group__8__Impl"
    // InternalPackageXML.g:3799:1: rule__AuthorTag__Group__8__Impl : ( 'author' ) ;
    public final void rule__AuthorTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3803:1: ( ( 'author' ) )
            // InternalPackageXML.g:3804:1: ( 'author' )
            {
            // InternalPackageXML.g:3804:1: ( 'author' )
            // InternalPackageXML.g:3805:2: 'author'
            {
             before(grammarAccess.getAuthorTagAccess().getAuthorKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getAuthorKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__8__Impl"


    // $ANTLR start "rule__AuthorTag__Group__9"
    // InternalPackageXML.g:3814:1: rule__AuthorTag__Group__9 : rule__AuthorTag__Group__9__Impl ;
    public final void rule__AuthorTag__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3818:1: ( rule__AuthorTag__Group__9__Impl )
            // InternalPackageXML.g:3819:2: rule__AuthorTag__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__9"


    // $ANTLR start "rule__AuthorTag__Group__9__Impl"
    // InternalPackageXML.g:3825:1: rule__AuthorTag__Group__9__Impl : ( '>' ) ;
    public final void rule__AuthorTag__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3829:1: ( ( '>' ) )
            // InternalPackageXML.g:3830:1: ( '>' )
            {
            // InternalPackageXML.g:3830:1: ( '>' )
            // InternalPackageXML.g:3831:2: '>'
            {
             before(grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group__9__Impl"


    // $ANTLR start "rule__AuthorTag__Group_3__0"
    // InternalPackageXML.g:3841:1: rule__AuthorTag__Group_3__0 : rule__AuthorTag__Group_3__0__Impl rule__AuthorTag__Group_3__1 ;
    public final void rule__AuthorTag__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3845:1: ( rule__AuthorTag__Group_3__0__Impl rule__AuthorTag__Group_3__1 )
            // InternalPackageXML.g:3846:2: rule__AuthorTag__Group_3__0__Impl rule__AuthorTag__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__AuthorTag__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__0"


    // $ANTLR start "rule__AuthorTag__Group_3__0__Impl"
    // InternalPackageXML.g:3853:1: rule__AuthorTag__Group_3__0__Impl : ( 'email' ) ;
    public final void rule__AuthorTag__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3857:1: ( ( 'email' ) )
            // InternalPackageXML.g:3858:1: ( 'email' )
            {
            // InternalPackageXML.g:3858:1: ( 'email' )
            // InternalPackageXML.g:3859:2: 'email'
            {
             before(grammarAccess.getAuthorTagAccess().getEmailKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getEmailKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__0__Impl"


    // $ANTLR start "rule__AuthorTag__Group_3__1"
    // InternalPackageXML.g:3868:1: rule__AuthorTag__Group_3__1 : rule__AuthorTag__Group_3__1__Impl rule__AuthorTag__Group_3__2 ;
    public final void rule__AuthorTag__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3872:1: ( rule__AuthorTag__Group_3__1__Impl rule__AuthorTag__Group_3__2 )
            // InternalPackageXML.g:3873:2: rule__AuthorTag__Group_3__1__Impl rule__AuthorTag__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__AuthorTag__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__1"


    // $ANTLR start "rule__AuthorTag__Group_3__1__Impl"
    // InternalPackageXML.g:3880:1: rule__AuthorTag__Group_3__1__Impl : ( '=' ) ;
    public final void rule__AuthorTag__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3884:1: ( ( '=' ) )
            // InternalPackageXML.g:3885:1: ( '=' )
            {
            // InternalPackageXML.g:3885:1: ( '=' )
            // InternalPackageXML.g:3886:2: '='
            {
             before(grammarAccess.getAuthorTagAccess().getEqualsSignKeyword_3_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getEqualsSignKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__1__Impl"


    // $ANTLR start "rule__AuthorTag__Group_3__2"
    // InternalPackageXML.g:3895:1: rule__AuthorTag__Group_3__2 : rule__AuthorTag__Group_3__2__Impl ;
    public final void rule__AuthorTag__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3899:1: ( rule__AuthorTag__Group_3__2__Impl )
            // InternalPackageXML.g:3900:2: rule__AuthorTag__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AuthorTag__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__2"


    // $ANTLR start "rule__AuthorTag__Group_3__2__Impl"
    // InternalPackageXML.g:3906:1: rule__AuthorTag__Group_3__2__Impl : ( ( rule__AuthorTag__EmailAssignment_3_2 ) ) ;
    public final void rule__AuthorTag__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3910:1: ( ( ( rule__AuthorTag__EmailAssignment_3_2 ) ) )
            // InternalPackageXML.g:3911:1: ( ( rule__AuthorTag__EmailAssignment_3_2 ) )
            {
            // InternalPackageXML.g:3911:1: ( ( rule__AuthorTag__EmailAssignment_3_2 ) )
            // InternalPackageXML.g:3912:2: ( rule__AuthorTag__EmailAssignment_3_2 )
            {
             before(grammarAccess.getAuthorTagAccess().getEmailAssignment_3_2()); 
            // InternalPackageXML.g:3913:2: ( rule__AuthorTag__EmailAssignment_3_2 )
            // InternalPackageXML.g:3913:3: rule__AuthorTag__EmailAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__AuthorTag__EmailAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAuthorTagAccess().getEmailAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__Group_3__2__Impl"


    // $ANTLR start "rule__UrlTag__Group__0"
    // InternalPackageXML.g:3922:1: rule__UrlTag__Group__0 : rule__UrlTag__Group__0__Impl rule__UrlTag__Group__1 ;
    public final void rule__UrlTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3926:1: ( rule__UrlTag__Group__0__Impl rule__UrlTag__Group__1 )
            // InternalPackageXML.g:3927:2: rule__UrlTag__Group__0__Impl rule__UrlTag__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__UrlTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__0"


    // $ANTLR start "rule__UrlTag__Group__0__Impl"
    // InternalPackageXML.g:3934:1: rule__UrlTag__Group__0__Impl : ( '<' ) ;
    public final void rule__UrlTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3938:1: ( ( '<' ) )
            // InternalPackageXML.g:3939:1: ( '<' )
            {
            // InternalPackageXML.g:3939:1: ( '<' )
            // InternalPackageXML.g:3940:2: '<'
            {
             before(grammarAccess.getUrlTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__0__Impl"


    // $ANTLR start "rule__UrlTag__Group__1"
    // InternalPackageXML.g:3949:1: rule__UrlTag__Group__1 : rule__UrlTag__Group__1__Impl rule__UrlTag__Group__2 ;
    public final void rule__UrlTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3953:1: ( rule__UrlTag__Group__1__Impl rule__UrlTag__Group__2 )
            // InternalPackageXML.g:3954:2: rule__UrlTag__Group__1__Impl rule__UrlTag__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__UrlTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__1"


    // $ANTLR start "rule__UrlTag__Group__1__Impl"
    // InternalPackageXML.g:3961:1: rule__UrlTag__Group__1__Impl : ( 'url' ) ;
    public final void rule__UrlTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3965:1: ( ( 'url' ) )
            // InternalPackageXML.g:3966:1: ( 'url' )
            {
            // InternalPackageXML.g:3966:1: ( 'url' )
            // InternalPackageXML.g:3967:2: 'url'
            {
             before(grammarAccess.getUrlTagAccess().getUrlKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getUrlKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__1__Impl"


    // $ANTLR start "rule__UrlTag__Group__2"
    // InternalPackageXML.g:3976:1: rule__UrlTag__Group__2 : rule__UrlTag__Group__2__Impl rule__UrlTag__Group__3 ;
    public final void rule__UrlTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3980:1: ( rule__UrlTag__Group__2__Impl rule__UrlTag__Group__3 )
            // InternalPackageXML.g:3981:2: rule__UrlTag__Group__2__Impl rule__UrlTag__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__UrlTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__2"


    // $ANTLR start "rule__UrlTag__Group__2__Impl"
    // InternalPackageXML.g:3988:1: rule__UrlTag__Group__2__Impl : ( 'type' ) ;
    public final void rule__UrlTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:3992:1: ( ( 'type' ) )
            // InternalPackageXML.g:3993:1: ( 'type' )
            {
            // InternalPackageXML.g:3993:1: ( 'type' )
            // InternalPackageXML.g:3994:2: 'type'
            {
             before(grammarAccess.getUrlTagAccess().getTypeKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__2__Impl"


    // $ANTLR start "rule__UrlTag__Group__3"
    // InternalPackageXML.g:4003:1: rule__UrlTag__Group__3 : rule__UrlTag__Group__3__Impl rule__UrlTag__Group__4 ;
    public final void rule__UrlTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4007:1: ( rule__UrlTag__Group__3__Impl rule__UrlTag__Group__4 )
            // InternalPackageXML.g:4008:2: rule__UrlTag__Group__3__Impl rule__UrlTag__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__UrlTag__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__3"


    // $ANTLR start "rule__UrlTag__Group__3__Impl"
    // InternalPackageXML.g:4015:1: rule__UrlTag__Group__3__Impl : ( '=' ) ;
    public final void rule__UrlTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4019:1: ( ( '=' ) )
            // InternalPackageXML.g:4020:1: ( '=' )
            {
            // InternalPackageXML.g:4020:1: ( '=' )
            // InternalPackageXML.g:4021:2: '='
            {
             before(grammarAccess.getUrlTagAccess().getEqualsSignKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__3__Impl"


    // $ANTLR start "rule__UrlTag__Group__4"
    // InternalPackageXML.g:4030:1: rule__UrlTag__Group__4 : rule__UrlTag__Group__4__Impl rule__UrlTag__Group__5 ;
    public final void rule__UrlTag__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4034:1: ( rule__UrlTag__Group__4__Impl rule__UrlTag__Group__5 )
            // InternalPackageXML.g:4035:2: rule__UrlTag__Group__4__Impl rule__UrlTag__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__UrlTag__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__4"


    // $ANTLR start "rule__UrlTag__Group__4__Impl"
    // InternalPackageXML.g:4042:1: rule__UrlTag__Group__4__Impl : ( ( rule__UrlTag__TypeAssignment_4 ) ) ;
    public final void rule__UrlTag__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4046:1: ( ( ( rule__UrlTag__TypeAssignment_4 ) ) )
            // InternalPackageXML.g:4047:1: ( ( rule__UrlTag__TypeAssignment_4 ) )
            {
            // InternalPackageXML.g:4047:1: ( ( rule__UrlTag__TypeAssignment_4 ) )
            // InternalPackageXML.g:4048:2: ( rule__UrlTag__TypeAssignment_4 )
            {
             before(grammarAccess.getUrlTagAccess().getTypeAssignment_4()); 
            // InternalPackageXML.g:4049:2: ( rule__UrlTag__TypeAssignment_4 )
            // InternalPackageXML.g:4049:3: rule__UrlTag__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UrlTag__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUrlTagAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__4__Impl"


    // $ANTLR start "rule__UrlTag__Group__5"
    // InternalPackageXML.g:4057:1: rule__UrlTag__Group__5 : rule__UrlTag__Group__5__Impl rule__UrlTag__Group__6 ;
    public final void rule__UrlTag__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4061:1: ( rule__UrlTag__Group__5__Impl rule__UrlTag__Group__6 )
            // InternalPackageXML.g:4062:2: rule__UrlTag__Group__5__Impl rule__UrlTag__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__UrlTag__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__5"


    // $ANTLR start "rule__UrlTag__Group__5__Impl"
    // InternalPackageXML.g:4069:1: rule__UrlTag__Group__5__Impl : ( '>' ) ;
    public final void rule__UrlTag__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4073:1: ( ( '>' ) )
            // InternalPackageXML.g:4074:1: ( '>' )
            {
            // InternalPackageXML.g:4074:1: ( '>' )
            // InternalPackageXML.g:4075:2: '>'
            {
             before(grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__5__Impl"


    // $ANTLR start "rule__UrlTag__Group__6"
    // InternalPackageXML.g:4084:1: rule__UrlTag__Group__6 : rule__UrlTag__Group__6__Impl rule__UrlTag__Group__7 ;
    public final void rule__UrlTag__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4088:1: ( rule__UrlTag__Group__6__Impl rule__UrlTag__Group__7 )
            // InternalPackageXML.g:4089:2: rule__UrlTag__Group__6__Impl rule__UrlTag__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__UrlTag__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__6"


    // $ANTLR start "rule__UrlTag__Group__6__Impl"
    // InternalPackageXML.g:4096:1: rule__UrlTag__Group__6__Impl : ( ( rule__UrlTag__UrlAssignment_6 ) ) ;
    public final void rule__UrlTag__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4100:1: ( ( ( rule__UrlTag__UrlAssignment_6 ) ) )
            // InternalPackageXML.g:4101:1: ( ( rule__UrlTag__UrlAssignment_6 ) )
            {
            // InternalPackageXML.g:4101:1: ( ( rule__UrlTag__UrlAssignment_6 ) )
            // InternalPackageXML.g:4102:2: ( rule__UrlTag__UrlAssignment_6 )
            {
             before(grammarAccess.getUrlTagAccess().getUrlAssignment_6()); 
            // InternalPackageXML.g:4103:2: ( rule__UrlTag__UrlAssignment_6 )
            // InternalPackageXML.g:4103:3: rule__UrlTag__UrlAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UrlTag__UrlAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUrlTagAccess().getUrlAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__6__Impl"


    // $ANTLR start "rule__UrlTag__Group__7"
    // InternalPackageXML.g:4111:1: rule__UrlTag__Group__7 : rule__UrlTag__Group__7__Impl rule__UrlTag__Group__8 ;
    public final void rule__UrlTag__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4115:1: ( rule__UrlTag__Group__7__Impl rule__UrlTag__Group__8 )
            // InternalPackageXML.g:4116:2: rule__UrlTag__Group__7__Impl rule__UrlTag__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__UrlTag__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__7"


    // $ANTLR start "rule__UrlTag__Group__7__Impl"
    // InternalPackageXML.g:4123:1: rule__UrlTag__Group__7__Impl : ( '<' ) ;
    public final void rule__UrlTag__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4127:1: ( ( '<' ) )
            // InternalPackageXML.g:4128:1: ( '<' )
            {
            // InternalPackageXML.g:4128:1: ( '<' )
            // InternalPackageXML.g:4129:2: '<'
            {
             before(grammarAccess.getUrlTagAccess().getLessThanSignKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getLessThanSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__7__Impl"


    // $ANTLR start "rule__UrlTag__Group__8"
    // InternalPackageXML.g:4138:1: rule__UrlTag__Group__8 : rule__UrlTag__Group__8__Impl rule__UrlTag__Group__9 ;
    public final void rule__UrlTag__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4142:1: ( rule__UrlTag__Group__8__Impl rule__UrlTag__Group__9 )
            // InternalPackageXML.g:4143:2: rule__UrlTag__Group__8__Impl rule__UrlTag__Group__9
            {
            pushFollow(FOLLOW_30);
            rule__UrlTag__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__8"


    // $ANTLR start "rule__UrlTag__Group__8__Impl"
    // InternalPackageXML.g:4150:1: rule__UrlTag__Group__8__Impl : ( '/' ) ;
    public final void rule__UrlTag__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4154:1: ( ( '/' ) )
            // InternalPackageXML.g:4155:1: ( '/' )
            {
            // InternalPackageXML.g:4155:1: ( '/' )
            // InternalPackageXML.g:4156:2: '/'
            {
             before(grammarAccess.getUrlTagAccess().getSolidusKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getSolidusKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__8__Impl"


    // $ANTLR start "rule__UrlTag__Group__9"
    // InternalPackageXML.g:4165:1: rule__UrlTag__Group__9 : rule__UrlTag__Group__9__Impl rule__UrlTag__Group__10 ;
    public final void rule__UrlTag__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4169:1: ( rule__UrlTag__Group__9__Impl rule__UrlTag__Group__10 )
            // InternalPackageXML.g:4170:2: rule__UrlTag__Group__9__Impl rule__UrlTag__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__UrlTag__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__9"


    // $ANTLR start "rule__UrlTag__Group__9__Impl"
    // InternalPackageXML.g:4177:1: rule__UrlTag__Group__9__Impl : ( 'url' ) ;
    public final void rule__UrlTag__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4181:1: ( ( 'url' ) )
            // InternalPackageXML.g:4182:1: ( 'url' )
            {
            // InternalPackageXML.g:4182:1: ( 'url' )
            // InternalPackageXML.g:4183:2: 'url'
            {
             before(grammarAccess.getUrlTagAccess().getUrlKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getUrlKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__9__Impl"


    // $ANTLR start "rule__UrlTag__Group__10"
    // InternalPackageXML.g:4192:1: rule__UrlTag__Group__10 : rule__UrlTag__Group__10__Impl ;
    public final void rule__UrlTag__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4196:1: ( rule__UrlTag__Group__10__Impl )
            // InternalPackageXML.g:4197:2: rule__UrlTag__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UrlTag__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__10"


    // $ANTLR start "rule__UrlTag__Group__10__Impl"
    // InternalPackageXML.g:4203:1: rule__UrlTag__Group__10__Impl : ( '>' ) ;
    public final void rule__UrlTag__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4207:1: ( ( '>' ) )
            // InternalPackageXML.g:4208:1: ( '>' )
            {
            // InternalPackageXML.g:4208:1: ( '>' )
            // InternalPackageXML.g:4209:2: '>'
            {
             before(grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__Group__10__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group__0"
    // InternalPackageXML.g:4219:1: rule__ArbitraryTag__Group__0 : rule__ArbitraryTag__Group__0__Impl rule__ArbitraryTag__Group__1 ;
    public final void rule__ArbitraryTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4223:1: ( rule__ArbitraryTag__Group__0__Impl rule__ArbitraryTag__Group__1 )
            // InternalPackageXML.g:4224:2: rule__ArbitraryTag__Group__0__Impl rule__ArbitraryTag__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ArbitraryTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__0"


    // $ANTLR start "rule__ArbitraryTag__Group__0__Impl"
    // InternalPackageXML.g:4231:1: rule__ArbitraryTag__Group__0__Impl : ( '<' ) ;
    public final void rule__ArbitraryTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4235:1: ( ( '<' ) )
            // InternalPackageXML.g:4236:1: ( '<' )
            {
            // InternalPackageXML.g:4236:1: ( '<' )
            // InternalPackageXML.g:4237:2: '<'
            {
             before(grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__0__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group__1"
    // InternalPackageXML.g:4246:1: rule__ArbitraryTag__Group__1 : rule__ArbitraryTag__Group__1__Impl rule__ArbitraryTag__Group__2 ;
    public final void rule__ArbitraryTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4250:1: ( rule__ArbitraryTag__Group__1__Impl rule__ArbitraryTag__Group__2 )
            // InternalPackageXML.g:4251:2: rule__ArbitraryTag__Group__1__Impl rule__ArbitraryTag__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ArbitraryTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__1"


    // $ANTLR start "rule__ArbitraryTag__Group__1__Impl"
    // InternalPackageXML.g:4258:1: rule__ArbitraryTag__Group__1__Impl : ( ( rule__ArbitraryTag__NameAssignment_1 ) ) ;
    public final void rule__ArbitraryTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4262:1: ( ( ( rule__ArbitraryTag__NameAssignment_1 ) ) )
            // InternalPackageXML.g:4263:1: ( ( rule__ArbitraryTag__NameAssignment_1 ) )
            {
            // InternalPackageXML.g:4263:1: ( ( rule__ArbitraryTag__NameAssignment_1 ) )
            // InternalPackageXML.g:4264:2: ( rule__ArbitraryTag__NameAssignment_1 )
            {
             before(grammarAccess.getArbitraryTagAccess().getNameAssignment_1()); 
            // InternalPackageXML.g:4265:2: ( rule__ArbitraryTag__NameAssignment_1 )
            // InternalPackageXML.g:4265:3: rule__ArbitraryTag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryTagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__1__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group__2"
    // InternalPackageXML.g:4273:1: rule__ArbitraryTag__Group__2 : rule__ArbitraryTag__Group__2__Impl rule__ArbitraryTag__Group__3 ;
    public final void rule__ArbitraryTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4277:1: ( rule__ArbitraryTag__Group__2__Impl rule__ArbitraryTag__Group__3 )
            // InternalPackageXML.g:4278:2: rule__ArbitraryTag__Group__2__Impl rule__ArbitraryTag__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__ArbitraryTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__2"


    // $ANTLR start "rule__ArbitraryTag__Group__2__Impl"
    // InternalPackageXML.g:4285:1: rule__ArbitraryTag__Group__2__Impl : ( ( rule__ArbitraryTag__AttributesAssignment_2 )* ) ;
    public final void rule__ArbitraryTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4289:1: ( ( ( rule__ArbitraryTag__AttributesAssignment_2 )* ) )
            // InternalPackageXML.g:4290:1: ( ( rule__ArbitraryTag__AttributesAssignment_2 )* )
            {
            // InternalPackageXML.g:4290:1: ( ( rule__ArbitraryTag__AttributesAssignment_2 )* )
            // InternalPackageXML.g:4291:2: ( rule__ArbitraryTag__AttributesAssignment_2 )*
            {
             before(grammarAccess.getArbitraryTagAccess().getAttributesAssignment_2()); 
            // InternalPackageXML.g:4292:2: ( rule__ArbitraryTag__AttributesAssignment_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPackageXML.g:4292:3: rule__ArbitraryTag__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ArbitraryTag__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getArbitraryTagAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__2__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group__3"
    // InternalPackageXML.g:4300:1: rule__ArbitraryTag__Group__3 : rule__ArbitraryTag__Group__3__Impl ;
    public final void rule__ArbitraryTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4304:1: ( rule__ArbitraryTag__Group__3__Impl )
            // InternalPackageXML.g:4305:2: rule__ArbitraryTag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__3"


    // $ANTLR start "rule__ArbitraryTag__Group__3__Impl"
    // InternalPackageXML.g:4311:1: rule__ArbitraryTag__Group__3__Impl : ( ( rule__ArbitraryTag__Alternatives_3 ) ) ;
    public final void rule__ArbitraryTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4315:1: ( ( ( rule__ArbitraryTag__Alternatives_3 ) ) )
            // InternalPackageXML.g:4316:1: ( ( rule__ArbitraryTag__Alternatives_3 ) )
            {
            // InternalPackageXML.g:4316:1: ( ( rule__ArbitraryTag__Alternatives_3 ) )
            // InternalPackageXML.g:4317:2: ( rule__ArbitraryTag__Alternatives_3 )
            {
             before(grammarAccess.getArbitraryTagAccess().getAlternatives_3()); 
            // InternalPackageXML.g:4318:2: ( rule__ArbitraryTag__Alternatives_3 )
            // InternalPackageXML.g:4318:3: rule__ArbitraryTag__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryTagAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group__3__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_0__0"
    // InternalPackageXML.g:4327:1: rule__ArbitraryTag__Group_3_0__0 : rule__ArbitraryTag__Group_3_0__0__Impl rule__ArbitraryTag__Group_3_0__1 ;
    public final void rule__ArbitraryTag__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4331:1: ( rule__ArbitraryTag__Group_3_0__0__Impl rule__ArbitraryTag__Group_3_0__1 )
            // InternalPackageXML.g:4332:2: rule__ArbitraryTag__Group_3_0__0__Impl rule__ArbitraryTag__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ArbitraryTag__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_0__0"


    // $ANTLR start "rule__ArbitraryTag__Group_3_0__0__Impl"
    // InternalPackageXML.g:4339:1: rule__ArbitraryTag__Group_3_0__0__Impl : ( '/' ) ;
    public final void rule__ArbitraryTag__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4343:1: ( ( '/' ) )
            // InternalPackageXML.g:4344:1: ( '/' )
            {
            // InternalPackageXML.g:4344:1: ( '/' )
            // InternalPackageXML.g:4345:2: '/'
            {
             before(grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_0__0__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_0__1"
    // InternalPackageXML.g:4354:1: rule__ArbitraryTag__Group_3_0__1 : rule__ArbitraryTag__Group_3_0__1__Impl ;
    public final void rule__ArbitraryTag__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4358:1: ( rule__ArbitraryTag__Group_3_0__1__Impl )
            // InternalPackageXML.g:4359:2: rule__ArbitraryTag__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_0__1"


    // $ANTLR start "rule__ArbitraryTag__Group_3_0__1__Impl"
    // InternalPackageXML.g:4365:1: rule__ArbitraryTag__Group_3_0__1__Impl : ( '>' ) ;
    public final void rule__ArbitraryTag__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4369:1: ( ( '>' ) )
            // InternalPackageXML.g:4370:1: ( '>' )
            {
            // InternalPackageXML.g:4370:1: ( '>' )
            // InternalPackageXML.g:4371:2: '>'
            {
             before(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_0__1__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__0"
    // InternalPackageXML.g:4381:1: rule__ArbitraryTag__Group_3_1__0 : rule__ArbitraryTag__Group_3_1__0__Impl rule__ArbitraryTag__Group_3_1__1 ;
    public final void rule__ArbitraryTag__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4385:1: ( rule__ArbitraryTag__Group_3_1__0__Impl rule__ArbitraryTag__Group_3_1__1 )
            // InternalPackageXML.g:4386:2: rule__ArbitraryTag__Group_3_1__0__Impl rule__ArbitraryTag__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__ArbitraryTag__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__0"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__0__Impl"
    // InternalPackageXML.g:4393:1: rule__ArbitraryTag__Group_3_1__0__Impl : ( '>' ) ;
    public final void rule__ArbitraryTag__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4397:1: ( ( '>' ) )
            // InternalPackageXML.g:4398:1: ( '>' )
            {
            // InternalPackageXML.g:4398:1: ( '>' )
            // InternalPackageXML.g:4399:2: '>'
            {
             before(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__0__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__1"
    // InternalPackageXML.g:4408:1: rule__ArbitraryTag__Group_3_1__1 : rule__ArbitraryTag__Group_3_1__1__Impl rule__ArbitraryTag__Group_3_1__2 ;
    public final void rule__ArbitraryTag__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4412:1: ( rule__ArbitraryTag__Group_3_1__1__Impl rule__ArbitraryTag__Group_3_1__2 )
            // InternalPackageXML.g:4413:2: rule__ArbitraryTag__Group_3_1__1__Impl rule__ArbitraryTag__Group_3_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ArbitraryTag__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__1"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__1__Impl"
    // InternalPackageXML.g:4420:1: rule__ArbitraryTag__Group_3_1__1__Impl : ( ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )* ) ;
    public final void rule__ArbitraryTag__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4424:1: ( ( ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )* ) )
            // InternalPackageXML.g:4425:1: ( ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )* )
            {
            // InternalPackageXML.g:4425:1: ( ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )* )
            // InternalPackageXML.g:4426:2: ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )*
            {
             before(grammarAccess.getArbitraryTagAccess().getInnerTextAssignment_3_1_1()); 
            // InternalPackageXML.g:4427:2: ( rule__ArbitraryTag__InnerTextAssignment_3_1_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPackageXML.g:4427:3: rule__ArbitraryTag__InnerTextAssignment_3_1_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ArbitraryTag__InnerTextAssignment_3_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getArbitraryTagAccess().getInnerTextAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__1__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__2"
    // InternalPackageXML.g:4435:1: rule__ArbitraryTag__Group_3_1__2 : rule__ArbitraryTag__Group_3_1__2__Impl rule__ArbitraryTag__Group_3_1__3 ;
    public final void rule__ArbitraryTag__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4439:1: ( rule__ArbitraryTag__Group_3_1__2__Impl rule__ArbitraryTag__Group_3_1__3 )
            // InternalPackageXML.g:4440:2: rule__ArbitraryTag__Group_3_1__2__Impl rule__ArbitraryTag__Group_3_1__3
            {
            pushFollow(FOLLOW_13);
            rule__ArbitraryTag__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__2"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__2__Impl"
    // InternalPackageXML.g:4447:1: rule__ArbitraryTag__Group_3_1__2__Impl : ( '<' ) ;
    public final void rule__ArbitraryTag__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4451:1: ( ( '<' ) )
            // InternalPackageXML.g:4452:1: ( '<' )
            {
            // InternalPackageXML.g:4452:1: ( '<' )
            // InternalPackageXML.g:4453:2: '<'
            {
             before(grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_3_1_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__2__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__3"
    // InternalPackageXML.g:4462:1: rule__ArbitraryTag__Group_3_1__3 : rule__ArbitraryTag__Group_3_1__3__Impl rule__ArbitraryTag__Group_3_1__4 ;
    public final void rule__ArbitraryTag__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4466:1: ( rule__ArbitraryTag__Group_3_1__3__Impl rule__ArbitraryTag__Group_3_1__4 )
            // InternalPackageXML.g:4467:2: rule__ArbitraryTag__Group_3_1__3__Impl rule__ArbitraryTag__Group_3_1__4
            {
            pushFollow(FOLLOW_15);
            rule__ArbitraryTag__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__3"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__3__Impl"
    // InternalPackageXML.g:4474:1: rule__ArbitraryTag__Group_3_1__3__Impl : ( '/' ) ;
    public final void rule__ArbitraryTag__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4478:1: ( ( '/' ) )
            // InternalPackageXML.g:4479:1: ( '/' )
            {
            // InternalPackageXML.g:4479:1: ( '/' )
            // InternalPackageXML.g:4480:2: '/'
            {
             before(grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__3__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__4"
    // InternalPackageXML.g:4489:1: rule__ArbitraryTag__Group_3_1__4 : rule__ArbitraryTag__Group_3_1__4__Impl rule__ArbitraryTag__Group_3_1__5 ;
    public final void rule__ArbitraryTag__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4493:1: ( rule__ArbitraryTag__Group_3_1__4__Impl rule__ArbitraryTag__Group_3_1__5 )
            // InternalPackageXML.g:4494:2: rule__ArbitraryTag__Group_3_1__4__Impl rule__ArbitraryTag__Group_3_1__5
            {
            pushFollow(FOLLOW_11);
            rule__ArbitraryTag__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__4"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__4__Impl"
    // InternalPackageXML.g:4501:1: rule__ArbitraryTag__Group_3_1__4__Impl : ( RULE_ID ) ;
    public final void rule__ArbitraryTag__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4505:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4506:1: ( RULE_ID )
            {
            // InternalPackageXML.g:4506:1: ( RULE_ID )
            // InternalPackageXML.g:4507:2: RULE_ID
            {
             before(grammarAccess.getArbitraryTagAccess().getIDTerminalRuleCall_3_1_4()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getIDTerminalRuleCall_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__4__Impl"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__5"
    // InternalPackageXML.g:4516:1: rule__ArbitraryTag__Group_3_1__5 : rule__ArbitraryTag__Group_3_1__5__Impl ;
    public final void rule__ArbitraryTag__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4520:1: ( rule__ArbitraryTag__Group_3_1__5__Impl )
            // InternalPackageXML.g:4521:2: rule__ArbitraryTag__Group_3_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__Group_3_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__5"


    // $ANTLR start "rule__ArbitraryTag__Group_3_1__5__Impl"
    // InternalPackageXML.g:4527:1: rule__ArbitraryTag__Group_3_1__5__Impl : ( '>' ) ;
    public final void rule__ArbitraryTag__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4531:1: ( ( '>' ) )
            // InternalPackageXML.g:4532:1: ( '>' )
            {
            // InternalPackageXML.g:4532:1: ( '>' )
            // InternalPackageXML.g:4533:2: '>'
            {
             before(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__Group_3_1__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPackageXML.g:4543:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4547:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPackageXML.g:4548:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalPackageXML.g:4555:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__KeyAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4559:1: ( ( ( rule__Attribute__KeyAssignment_0 ) ) )
            // InternalPackageXML.g:4560:1: ( ( rule__Attribute__KeyAssignment_0 ) )
            {
            // InternalPackageXML.g:4560:1: ( ( rule__Attribute__KeyAssignment_0 ) )
            // InternalPackageXML.g:4561:2: ( rule__Attribute__KeyAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getKeyAssignment_0()); 
            // InternalPackageXML.g:4562:2: ( rule__Attribute__KeyAssignment_0 )
            // InternalPackageXML.g:4562:3: rule__Attribute__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalPackageXML.g:4570:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4574:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPackageXML.g:4575:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalPackageXML.g:4582:1: rule__Attribute__Group__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4586:1: ( ( '=' ) )
            // InternalPackageXML.g:4587:1: ( '=' )
            {
            // InternalPackageXML.g:4587:1: ( '=' )
            // InternalPackageXML.g:4588:2: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalPackageXML.g:4597:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4601:1: ( rule__Attribute__Group__2__Impl )
            // InternalPackageXML.g:4602:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalPackageXML.g:4608:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4612:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // InternalPackageXML.g:4613:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // InternalPackageXML.g:4613:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // InternalPackageXML.g:4614:2: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // InternalPackageXML.g:4615:2: ( rule__Attribute__ValueAssignment_2 )
            // InternalPackageXML.g:4615:3: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Package__VersionAssignment_4"
    // InternalPackageXML.g:4624:1: rule__Package__VersionAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Package__VersionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4628:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4629:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4629:2: ( RULE_STRING )
            // InternalPackageXML.g:4630:3: RULE_STRING
            {
             before(grammarAccess.getPackageAccess().getVersionSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getVersionSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__VersionAssignment_4"


    // $ANTLR start "rule__Package__FormatAssignment_10"
    // InternalPackageXML.g:4639:1: rule__Package__FormatAssignment_10 : ( RULE_STRING ) ;
    public final void rule__Package__FormatAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4643:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4644:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4644:2: ( RULE_STRING )
            // InternalPackageXML.g:4645:3: RULE_STRING
            {
             before(grammarAccess.getPackageAccess().getFormatSTRINGTerminalRuleCall_10_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getFormatSTRINGTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__FormatAssignment_10"


    // $ANTLR start "rule__Package__TagsAssignment_12"
    // InternalPackageXML.g:4654:1: rule__Package__TagsAssignment_12 : ( ruleTag ) ;
    public final void rule__Package__TagsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4658:1: ( ( ruleTag ) )
            // InternalPackageXML.g:4659:2: ( ruleTag )
            {
            // InternalPackageXML.g:4659:2: ( ruleTag )
            // InternalPackageXML.g:4660:3: ruleTag
            {
             before(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TagsAssignment_12"


    // $ANTLR start "rule__NameTag__DeclaredPackageNameAssignment_3"
    // InternalPackageXML.g:4669:1: rule__NameTag__DeclaredPackageNameAssignment_3 : ( ruleDeclaredPackageName ) ;
    public final void rule__NameTag__DeclaredPackageNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4673:1: ( ( ruleDeclaredPackageName ) )
            // InternalPackageXML.g:4674:2: ( ruleDeclaredPackageName )
            {
            // InternalPackageXML.g:4674:2: ( ruleDeclaredPackageName )
            // InternalPackageXML.g:4675:3: ruleDeclaredPackageName
            {
             before(grammarAccess.getNameTagAccess().getDeclaredPackageNameDeclaredPackageNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaredPackageName();

            state._fsp--;

             after(grammarAccess.getNameTagAccess().getDeclaredPackageNameDeclaredPackageNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameTag__DeclaredPackageNameAssignment_3"


    // $ANTLR start "rule__DeclaredPackageName__NameAssignment"
    // InternalPackageXML.g:4684:1: rule__DeclaredPackageName__NameAssignment : ( RULE_ID ) ;
    public final void rule__DeclaredPackageName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4688:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4689:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4689:2: ( RULE_ID )
            // InternalPackageXML.g:4690:3: RULE_ID
            {
             before(grammarAccess.getDeclaredPackageNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeclaredPackageNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclaredPackageName__NameAssignment"


    // $ANTLR start "rule__VersionTag__VersionAssignment_3"
    // InternalPackageXML.g:4699:1: rule__VersionTag__VersionAssignment_3 : ( RULE_VERSION_TERMINAL ) ;
    public final void rule__VersionTag__VersionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4703:1: ( ( RULE_VERSION_TERMINAL ) )
            // InternalPackageXML.g:4704:2: ( RULE_VERSION_TERMINAL )
            {
            // InternalPackageXML.g:4704:2: ( RULE_VERSION_TERMINAL )
            // InternalPackageXML.g:4705:3: RULE_VERSION_TERMINAL
            {
             before(grammarAccess.getVersionTagAccess().getVersionVERSION_TERMINALTerminalRuleCall_3_0()); 
            match(input,RULE_VERSION_TERMINAL,FOLLOW_2); 
             after(grammarAccess.getVersionTagAccess().getVersionVERSION_TERMINALTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VersionTag__VersionAssignment_3"


    // $ANTLR start "rule__DescriptionTag__DescriptionTextAssignment_4"
    // InternalPackageXML.g:4714:1: rule__DescriptionTag__DescriptionTextAssignment_4 : ( ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 ) ) ;
    public final void rule__DescriptionTag__DescriptionTextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4718:1: ( ( ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 ) ) )
            // InternalPackageXML.g:4719:2: ( ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 ) )
            {
            // InternalPackageXML.g:4719:2: ( ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 ) )
            // InternalPackageXML.g:4720:3: ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 )
            {
             before(grammarAccess.getDescriptionTagAccess().getDescriptionTextAlternatives_4_0()); 
            // InternalPackageXML.g:4721:3: ( rule__DescriptionTag__DescriptionTextAlternatives_4_0 )
            // InternalPackageXML.g:4721:4: rule__DescriptionTag__DescriptionTextAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionTag__DescriptionTextAlternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionTagAccess().getDescriptionTextAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionTag__DescriptionTextAssignment_4"


    // $ANTLR start "rule__MaintainerTag__EmailAssignment_4"
    // InternalPackageXML.g:4729:1: rule__MaintainerTag__EmailAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MaintainerTag__EmailAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4733:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4734:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4734:2: ( RULE_STRING )
            // InternalPackageXML.g:4735:3: RULE_STRING
            {
             before(grammarAccess.getMaintainerTagAccess().getEmailSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMaintainerTagAccess().getEmailSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__EmailAssignment_4"


    // $ANTLR start "rule__MaintainerTag__MaintainerTextAssignment_6"
    // InternalPackageXML.g:4744:1: rule__MaintainerTag__MaintainerTextAssignment_6 : ( ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 ) ) ;
    public final void rule__MaintainerTag__MaintainerTextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4748:1: ( ( ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 ) ) )
            // InternalPackageXML.g:4749:2: ( ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 ) )
            {
            // InternalPackageXML.g:4749:2: ( ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 ) )
            // InternalPackageXML.g:4750:3: ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 )
            {
             before(grammarAccess.getMaintainerTagAccess().getMaintainerTextAlternatives_6_0()); 
            // InternalPackageXML.g:4751:3: ( rule__MaintainerTag__MaintainerTextAlternatives_6_0 )
            // InternalPackageXML.g:4751:4: rule__MaintainerTag__MaintainerTextAlternatives_6_0
            {
            pushFollow(FOLLOW_2);
            rule__MaintainerTag__MaintainerTextAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMaintainerTagAccess().getMaintainerTextAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaintainerTag__MaintainerTextAssignment_6"


    // $ANTLR start "rule__LicenseTag__LicenseAssignment_3"
    // InternalPackageXML.g:4759:1: rule__LicenseTag__LicenseAssignment_3 : ( RULE_ID ) ;
    public final void rule__LicenseTag__LicenseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4763:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4764:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4764:2: ( RULE_ID )
            // InternalPackageXML.g:4765:3: RULE_ID
            {
             before(grammarAccess.getLicenseTagAccess().getLicenseIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenseTagAccess().getLicenseIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenseTag__LicenseAssignment_3"


    // $ANTLR start "rule__RunDependencyTag__NameAssignment_4"
    // InternalPackageXML.g:4774:1: rule__RunDependencyTag__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RunDependencyTag__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4778:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4779:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4779:2: ( RULE_ID )
            // InternalPackageXML.g:4780:3: RULE_ID
            {
             before(grammarAccess.getRunDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRunDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunDependencyTag__NameAssignment_4"


    // $ANTLR start "rule__BuildDependDependencyTag__NameAssignment_4"
    // InternalPackageXML.g:4789:1: rule__BuildDependDependencyTag__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__BuildDependDependencyTag__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4793:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4794:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4794:2: ( RULE_ID )
            // InternalPackageXML.g:4795:3: RULE_ID
            {
             before(grammarAccess.getBuildDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBuildDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildDependDependencyTag__NameAssignment_4"


    // $ANTLR start "rule__ExecDependDependencyTag__NameAssignment_4"
    // InternalPackageXML.g:4804:1: rule__ExecDependDependencyTag__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__ExecDependDependencyTag__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4808:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4809:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4809:2: ( RULE_ID )
            // InternalPackageXML.g:4810:3: RULE_ID
            {
             before(grammarAccess.getExecDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExecDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecDependDependencyTag__NameAssignment_4"


    // $ANTLR start "rule__BuildToolDependDependencyTag__NameAssignment_4"
    // InternalPackageXML.g:4819:1: rule__BuildToolDependDependencyTag__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__BuildToolDependDependencyTag__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4823:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4824:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4824:2: ( RULE_ID )
            // InternalPackageXML.g:4825:3: RULE_ID
            {
             before(grammarAccess.getBuildToolDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBuildToolDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BuildToolDependDependencyTag__NameAssignment_4"


    // $ANTLR start "rule__ExportTag__Arbitrary_tagsAssignment_4"
    // InternalPackageXML.g:4834:1: rule__ExportTag__Arbitrary_tagsAssignment_4 : ( ruleArbitraryTag ) ;
    public final void rule__ExportTag__Arbitrary_tagsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4838:1: ( ( ruleArbitraryTag ) )
            // InternalPackageXML.g:4839:2: ( ruleArbitraryTag )
            {
            // InternalPackageXML.g:4839:2: ( ruleArbitraryTag )
            // InternalPackageXML.g:4840:3: ruleArbitraryTag
            {
             before(grammarAccess.getExportTagAccess().getArbitrary_tagsArbitraryTagParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleArbitraryTag();

            state._fsp--;

             after(grammarAccess.getExportTagAccess().getArbitrary_tagsArbitraryTagParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExportTag__Arbitrary_tagsAssignment_4"


    // $ANTLR start "rule__AuthorTag__EmailAssignment_3_2"
    // InternalPackageXML.g:4849:1: rule__AuthorTag__EmailAssignment_3_2 : ( RULE_STRING ) ;
    public final void rule__AuthorTag__EmailAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4853:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4854:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4854:2: ( RULE_STRING )
            // InternalPackageXML.g:4855:3: RULE_STRING
            {
             before(grammarAccess.getAuthorTagAccess().getEmailSTRINGTerminalRuleCall_3_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAuthorTagAccess().getEmailSTRINGTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__EmailAssignment_3_2"


    // $ANTLR start "rule__AuthorTag__AuthorTextAssignment_5"
    // InternalPackageXML.g:4864:1: rule__AuthorTag__AuthorTextAssignment_5 : ( ( rule__AuthorTag__AuthorTextAlternatives_5_0 ) ) ;
    public final void rule__AuthorTag__AuthorTextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4868:1: ( ( ( rule__AuthorTag__AuthorTextAlternatives_5_0 ) ) )
            // InternalPackageXML.g:4869:2: ( ( rule__AuthorTag__AuthorTextAlternatives_5_0 ) )
            {
            // InternalPackageXML.g:4869:2: ( ( rule__AuthorTag__AuthorTextAlternatives_5_0 ) )
            // InternalPackageXML.g:4870:3: ( rule__AuthorTag__AuthorTextAlternatives_5_0 )
            {
             before(grammarAccess.getAuthorTagAccess().getAuthorTextAlternatives_5_0()); 
            // InternalPackageXML.g:4871:3: ( rule__AuthorTag__AuthorTextAlternatives_5_0 )
            // InternalPackageXML.g:4871:4: rule__AuthorTag__AuthorTextAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__AuthorTag__AuthorTextAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorTagAccess().getAuthorTextAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorTag__AuthorTextAssignment_5"


    // $ANTLR start "rule__UrlTag__TypeAssignment_4"
    // InternalPackageXML.g:4879:1: rule__UrlTag__TypeAssignment_4 : ( RULE_STRING ) ;
    public final void rule__UrlTag__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4883:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4884:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4884:2: ( RULE_STRING )
            // InternalPackageXML.g:4885:3: RULE_STRING
            {
             before(grammarAccess.getUrlTagAccess().getTypeSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getTypeSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__TypeAssignment_4"


    // $ANTLR start "rule__UrlTag__UrlAssignment_6"
    // InternalPackageXML.g:4894:1: rule__UrlTag__UrlAssignment_6 : ( RULE_ID ) ;
    public final void rule__UrlTag__UrlAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4898:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4899:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4899:2: ( RULE_ID )
            // InternalPackageXML.g:4900:3: RULE_ID
            {
             before(grammarAccess.getUrlTagAccess().getUrlIDTerminalRuleCall_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUrlTagAccess().getUrlIDTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlTag__UrlAssignment_6"


    // $ANTLR start "rule__ArbitraryTag__NameAssignment_1"
    // InternalPackageXML.g:4909:1: rule__ArbitraryTag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArbitraryTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4913:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4914:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4914:2: ( RULE_ID )
            // InternalPackageXML.g:4915:3: RULE_ID
            {
             before(grammarAccess.getArbitraryTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getArbitraryTagAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__NameAssignment_1"


    // $ANTLR start "rule__ArbitraryTag__AttributesAssignment_2"
    // InternalPackageXML.g:4924:1: rule__ArbitraryTag__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__ArbitraryTag__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4928:1: ( ( ruleAttribute ) )
            // InternalPackageXML.g:4929:2: ( ruleAttribute )
            {
            // InternalPackageXML.g:4929:2: ( ruleAttribute )
            // InternalPackageXML.g:4930:3: ruleAttribute
            {
             before(grammarAccess.getArbitraryTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getArbitraryTagAccess().getAttributesAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__AttributesAssignment_2"


    // $ANTLR start "rule__ArbitraryTag__InnerTextAssignment_3_1_1"
    // InternalPackageXML.g:4939:1: rule__ArbitraryTag__InnerTextAssignment_3_1_1 : ( ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 ) ) ;
    public final void rule__ArbitraryTag__InnerTextAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4943:1: ( ( ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 ) ) )
            // InternalPackageXML.g:4944:2: ( ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 ) )
            {
            // InternalPackageXML.g:4944:2: ( ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 ) )
            // InternalPackageXML.g:4945:3: ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 )
            {
             before(grammarAccess.getArbitraryTagAccess().getInnerTextAlternatives_3_1_1_0()); 
            // InternalPackageXML.g:4946:3: ( rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0 )
            // InternalPackageXML.g:4946:4: rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArbitraryTag__InnerTextAlternatives_3_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArbitraryTagAccess().getInnerTextAlternatives_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArbitraryTag__InnerTextAssignment_3_1_1"


    // $ANTLR start "rule__Attribute__KeyAssignment_0"
    // InternalPackageXML.g:4954:1: rule__Attribute__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4958:1: ( ( RULE_ID ) )
            // InternalPackageXML.g:4959:2: ( RULE_ID )
            {
            // InternalPackageXML.g:4959:2: ( RULE_ID )
            // InternalPackageXML.g:4960:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__KeyAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // InternalPackageXML.g:4969:1: rule__Attribute__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPackageXML.g:4973:1: ( ( RULE_STRING ) )
            // InternalPackageXML.g:4974:2: ( RULE_STRING )
            {
            // InternalPackageXML.g:4974:2: ( RULE_STRING )
            // InternalPackageXML.g:4975:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\21\1\4\12\uffff";
    static final String dfa_3s = "\1\21\1\41\12\uffff";
    static final String dfa_4s = "\2\uffff\1\11\1\6\1\5\1\4\1\3\1\7\1\2\1\10\1\12\1\1";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\12\11\uffff\1\10\7\uffff\1\13\1\6\1\5\1\uffff\1\4\4\3\1\7\1\11\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "502:1: rule__Tag__Alternatives : ( ( ruleNameTag ) | ( ruleVersionTag ) | ( ruleDescriptionTag ) | ( ruleMaintainerTag ) | ( ruleLicenseTag ) | ( ruleDependencyTag ) | ( ruleExportTag ) | ( ruleAuthorTag ) | ( ruleUrlTag ) | ( ruleArbitraryTag ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000012L});

}