package org.spf.cmakelists.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.spf.cmakelists.services.CMakeListsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCMakeListsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VERSION_TERMINAL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECORATED_PACKAGE", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cmake_minimum_required'", "'('", "'VERSION'", "')'", "'project'", "'find_package'", "'REQUIRED'", "'COMPONENTS'", "'add_executable'", "'.'", "'$'", "'{'", "'}'", "'/'", "'ament_target_dependencies'", "'ament_package'", "'install'", "'TARGETS'", "'RUNTIME'", "'DESTINATION'", "'DIRECTORY'", "'FILES_MATCHING'", "'PATTERN'", "'if'", "'AND'", "'OR'", "'MATCHES'", "'endif'", "'set'", "'add_compile_options'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_VERSION_TERMINAL=4;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DECORATED_PACKAGE=8;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCMakeListsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCMakeListsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCMakeListsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCMakeLists.g"; }



     	private CMakeListsGrammarAccess grammarAccess;

        public InternalCMakeListsParser(TokenStream input, CMakeListsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CMakeListsFile";
       	}

       	@Override
       	protected CMakeListsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCMakeListsFile"
    // InternalCMakeLists.g:64:1: entryRuleCMakeListsFile returns [EObject current=null] : iv_ruleCMakeListsFile= ruleCMakeListsFile EOF ;
    public final EObject entryRuleCMakeListsFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMakeListsFile = null;


        try {
            // InternalCMakeLists.g:64:55: (iv_ruleCMakeListsFile= ruleCMakeListsFile EOF )
            // InternalCMakeLists.g:65:2: iv_ruleCMakeListsFile= ruleCMakeListsFile EOF
            {
             newCompositeNode(grammarAccess.getCMakeListsFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCMakeListsFile=ruleCMakeListsFile();

            state._fsp--;

             current =iv_ruleCMakeListsFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCMakeListsFile"


    // $ANTLR start "ruleCMakeListsFile"
    // InternalCMakeLists.g:71:1: ruleCMakeListsFile returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )* ;
    public final EObject ruleCMakeListsFile() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:77:2: ( ( (lv_instructions_0_0= ruleInstruction ) )* )
            // InternalCMakeLists.g:78:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            {
            // InternalCMakeLists.g:78:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==13||(LA1_0>=17 && LA1_0<=18)||LA1_0==21||(LA1_0>=27 && LA1_0<=29)||LA1_0==36||(LA1_0>=41 && LA1_0<=42)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCMakeLists.g:79:3: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // InternalCMakeLists.g:79:3: (lv_instructions_0_0= ruleInstruction )
            	    // InternalCMakeLists.g:80:4: lv_instructions_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getCMakeListsFileAccess().getInstructionsInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getCMakeListsFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.spf.cmakelists.CMakeLists.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCMakeListsFile"


    // $ANTLR start "entryRuleInstruction"
    // InternalCMakeLists.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalCMakeLists.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalCMakeLists.g:101:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalCMakeLists.g:107:1: ruleInstruction returns [EObject current=null] : (this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired | this_ProjectInstruction_1= ruleProjectInstruction | this_FindPackage_2= ruleFindPackage | this_AddExecutable_3= ruleAddExecutable | this_AmentTargetDependencies_4= ruleAmentTargetDependencies | this_AmentPackageInstruction_5= ruleAmentPackageInstruction | this_InstallTargets_6= ruleInstallTargets | this_InstallDirectory_7= ruleInstallDirectory | this_IfInstruction_8= ruleIfInstruction | this_SetInstruction_9= ruleSetInstruction | this_AddCompileOptions_10= ruleAddCompileOptions | this_UndefinedInstruction_11= ruleUndefinedInstruction ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_CMakeMinimumRequired_0 = null;

        EObject this_ProjectInstruction_1 = null;

        EObject this_FindPackage_2 = null;

        EObject this_AddExecutable_3 = null;

        EObject this_AmentTargetDependencies_4 = null;

        EObject this_AmentPackageInstruction_5 = null;

        EObject this_InstallTargets_6 = null;

        EObject this_InstallDirectory_7 = null;

        EObject this_IfInstruction_8 = null;

        EObject this_SetInstruction_9 = null;

        EObject this_AddCompileOptions_10 = null;

        EObject this_UndefinedInstruction_11 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:113:2: ( (this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired | this_ProjectInstruction_1= ruleProjectInstruction | this_FindPackage_2= ruleFindPackage | this_AddExecutable_3= ruleAddExecutable | this_AmentTargetDependencies_4= ruleAmentTargetDependencies | this_AmentPackageInstruction_5= ruleAmentPackageInstruction | this_InstallTargets_6= ruleInstallTargets | this_InstallDirectory_7= ruleInstallDirectory | this_IfInstruction_8= ruleIfInstruction | this_SetInstruction_9= ruleSetInstruction | this_AddCompileOptions_10= ruleAddCompileOptions | this_UndefinedInstruction_11= ruleUndefinedInstruction ) )
            // InternalCMakeLists.g:114:2: (this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired | this_ProjectInstruction_1= ruleProjectInstruction | this_FindPackage_2= ruleFindPackage | this_AddExecutable_3= ruleAddExecutable | this_AmentTargetDependencies_4= ruleAmentTargetDependencies | this_AmentPackageInstruction_5= ruleAmentPackageInstruction | this_InstallTargets_6= ruleInstallTargets | this_InstallDirectory_7= ruleInstallDirectory | this_IfInstruction_8= ruleIfInstruction | this_SetInstruction_9= ruleSetInstruction | this_AddCompileOptions_10= ruleAddCompileOptions | this_UndefinedInstruction_11= ruleUndefinedInstruction )
            {
            // InternalCMakeLists.g:114:2: (this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired | this_ProjectInstruction_1= ruleProjectInstruction | this_FindPackage_2= ruleFindPackage | this_AddExecutable_3= ruleAddExecutable | this_AmentTargetDependencies_4= ruleAmentTargetDependencies | this_AmentPackageInstruction_5= ruleAmentPackageInstruction | this_InstallTargets_6= ruleInstallTargets | this_InstallDirectory_7= ruleInstallDirectory | this_IfInstruction_8= ruleIfInstruction | this_SetInstruction_9= ruleSetInstruction | this_AddCompileOptions_10= ruleAddCompileOptions | this_UndefinedInstruction_11= ruleUndefinedInstruction )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalCMakeLists.g:115:3: this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCMakeMinimumRequiredParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CMakeMinimumRequired_0=ruleCMakeMinimumRequired();

                    state._fsp--;


                    			current = this_CMakeMinimumRequired_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCMakeLists.g:124:3: this_ProjectInstruction_1= ruleProjectInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getProjectInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProjectInstruction_1=ruleProjectInstruction();

                    state._fsp--;


                    			current = this_ProjectInstruction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCMakeLists.g:133:3: this_FindPackage_2= ruleFindPackage
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFindPackageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FindPackage_2=ruleFindPackage();

                    state._fsp--;


                    			current = this_FindPackage_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCMakeLists.g:142:3: this_AddExecutable_3= ruleAddExecutable
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddExecutableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddExecutable_3=ruleAddExecutable();

                    state._fsp--;


                    			current = this_AddExecutable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCMakeLists.g:151:3: this_AmentTargetDependencies_4= ruleAmentTargetDependencies
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAmentTargetDependenciesParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_AmentTargetDependencies_4=ruleAmentTargetDependencies();

                    state._fsp--;


                    			current = this_AmentTargetDependencies_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCMakeLists.g:160:3: this_AmentPackageInstruction_5= ruleAmentPackageInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAmentPackageInstructionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AmentPackageInstruction_5=ruleAmentPackageInstruction();

                    state._fsp--;


                    			current = this_AmentPackageInstruction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCMakeLists.g:169:3: this_InstallTargets_6= ruleInstallTargets
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstallTargetsParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstallTargets_6=ruleInstallTargets();

                    state._fsp--;


                    			current = this_InstallTargets_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCMakeLists.g:178:3: this_InstallDirectory_7= ruleInstallDirectory
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getInstallDirectoryParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_InstallDirectory_7=ruleInstallDirectory();

                    state._fsp--;


                    			current = this_InstallDirectory_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalCMakeLists.g:187:3: this_IfInstruction_8= ruleIfInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getIfInstructionParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfInstruction_8=ruleIfInstruction();

                    state._fsp--;


                    			current = this_IfInstruction_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCMakeLists.g:196:3: this_SetInstruction_9= ruleSetInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSetInstructionParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetInstruction_9=ruleSetInstruction();

                    state._fsp--;


                    			current = this_SetInstruction_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCMakeLists.g:205:3: this_AddCompileOptions_10= ruleAddCompileOptions
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddCompileOptionsParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddCompileOptions_10=ruleAddCompileOptions();

                    state._fsp--;


                    			current = this_AddCompileOptions_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalCMakeLists.g:214:3: this_UndefinedInstruction_11= ruleUndefinedInstruction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getUndefinedInstructionParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_UndefinedInstruction_11=ruleUndefinedInstruction();

                    state._fsp--;


                    			current = this_UndefinedInstruction_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCMakeMinimumRequired"
    // InternalCMakeLists.g:226:1: entryRuleCMakeMinimumRequired returns [EObject current=null] : iv_ruleCMakeMinimumRequired= ruleCMakeMinimumRequired EOF ;
    public final EObject entryRuleCMakeMinimumRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCMakeMinimumRequired = null;


        try {
            // InternalCMakeLists.g:226:61: (iv_ruleCMakeMinimumRequired= ruleCMakeMinimumRequired EOF )
            // InternalCMakeLists.g:227:2: iv_ruleCMakeMinimumRequired= ruleCMakeMinimumRequired EOF
            {
             newCompositeNode(grammarAccess.getCMakeMinimumRequiredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCMakeMinimumRequired=ruleCMakeMinimumRequired();

            state._fsp--;

             current =iv_ruleCMakeMinimumRequired; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCMakeMinimumRequired"


    // $ANTLR start "ruleCMakeMinimumRequired"
    // InternalCMakeLists.g:233:1: ruleCMakeMinimumRequired returns [EObject current=null] : (otherlv_0= 'cmake_minimum_required' otherlv_1= '(' otherlv_2= 'VERSION' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= ')' ) ;
    public final EObject ruleCMakeMinimumRequired() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:239:2: ( (otherlv_0= 'cmake_minimum_required' otherlv_1= '(' otherlv_2= 'VERSION' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= ')' ) )
            // InternalCMakeLists.g:240:2: (otherlv_0= 'cmake_minimum_required' otherlv_1= '(' otherlv_2= 'VERSION' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= ')' )
            {
            // InternalCMakeLists.g:240:2: (otherlv_0= 'cmake_minimum_required' otherlv_1= '(' otherlv_2= 'VERSION' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= ')' )
            // InternalCMakeLists.g:241:3: otherlv_0= 'cmake_minimum_required' otherlv_1= '(' otherlv_2= 'VERSION' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCMakeMinimumRequiredAccess().getCmake_minimum_requiredKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCMakeMinimumRequiredAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getCMakeMinimumRequiredAccess().getVERSIONKeyword_2());
            		
            // InternalCMakeLists.g:253:3: ( (lv_version_3_0= RULE_VERSION_TERMINAL ) )
            // InternalCMakeLists.g:254:4: (lv_version_3_0= RULE_VERSION_TERMINAL )
            {
            // InternalCMakeLists.g:254:4: (lv_version_3_0= RULE_VERSION_TERMINAL )
            // InternalCMakeLists.g:255:5: lv_version_3_0= RULE_VERSION_TERMINAL
            {
            lv_version_3_0=(Token)match(input,RULE_VERSION_TERMINAL,FOLLOW_7); 

            					newLeafNode(lv_version_3_0, grammarAccess.getCMakeMinimumRequiredAccess().getVersionVERSION_TERMINALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCMakeMinimumRequiredRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_3_0,
            						"org.spf.cmakelists.CMakeLists.VERSION_TERMINAL");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCMakeMinimumRequiredAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCMakeMinimumRequired"


    // $ANTLR start "entryRuleProjectInstruction"
    // InternalCMakeLists.g:279:1: entryRuleProjectInstruction returns [EObject current=null] : iv_ruleProjectInstruction= ruleProjectInstruction EOF ;
    public final EObject entryRuleProjectInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectInstruction = null;


        try {
            // InternalCMakeLists.g:279:59: (iv_ruleProjectInstruction= ruleProjectInstruction EOF )
            // InternalCMakeLists.g:280:2: iv_ruleProjectInstruction= ruleProjectInstruction EOF
            {
             newCompositeNode(grammarAccess.getProjectInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProjectInstruction=ruleProjectInstruction();

            state._fsp--;

             current =iv_ruleProjectInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectInstruction"


    // $ANTLR start "ruleProjectInstruction"
    // InternalCMakeLists.g:286:1: ruleProjectInstruction returns [EObject current=null] : ( () otherlv_1= 'project' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleProjectInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:292:2: ( ( () otherlv_1= 'project' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalCMakeLists.g:293:2: ( () otherlv_1= 'project' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalCMakeLists.g:293:2: ( () otherlv_1= 'project' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalCMakeLists.g:294:3: () otherlv_1= 'project' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            // InternalCMakeLists.g:294:3: ()
            // InternalCMakeLists.g:295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectInstructionAccess().getProjectInstructionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectInstructionAccess().getProjectKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectInstructionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMakeLists.g:309:3: ( (otherlv_3= RULE_ID ) )
            // InternalCMakeLists.g:310:4: (otherlv_3= RULE_ID )
            {
            // InternalCMakeLists.g:310:4: (otherlv_3= RULE_ID )
            // InternalCMakeLists.g:311:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectInstructionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getProjectInstructionAccess().getDeclaredPackageNameDeclaredPackageNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectInstructionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectInstruction"


    // $ANTLR start "entryRuleFindPackage"
    // InternalCMakeLists.g:330:1: entryRuleFindPackage returns [EObject current=null] : iv_ruleFindPackage= ruleFindPackage EOF ;
    public final EObject entryRuleFindPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFindPackage = null;


        try {
            // InternalCMakeLists.g:330:52: (iv_ruleFindPackage= ruleFindPackage EOF )
            // InternalCMakeLists.g:331:2: iv_ruleFindPackage= ruleFindPackage EOF
            {
             newCompositeNode(grammarAccess.getFindPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFindPackage=ruleFindPackage();

            state._fsp--;

             current =iv_ruleFindPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFindPackage"


    // $ANTLR start "ruleFindPackage"
    // InternalCMakeLists.g:337:1: ruleFindPackage returns [EObject current=null] : ( () otherlv_1= 'find_package' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_required_4_0= 'REQUIRED' ) )? (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )? otherlv_7= ')' ) ;
    public final EObject ruleFindPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token lv_required_4_0=null;
        Token otherlv_5=null;
        Token lv_components_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:343:2: ( ( () otherlv_1= 'find_package' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_required_4_0= 'REQUIRED' ) )? (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )? otherlv_7= ')' ) )
            // InternalCMakeLists.g:344:2: ( () otherlv_1= 'find_package' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_required_4_0= 'REQUIRED' ) )? (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )? otherlv_7= ')' )
            {
            // InternalCMakeLists.g:344:2: ( () otherlv_1= 'find_package' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_required_4_0= 'REQUIRED' ) )? (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )? otherlv_7= ')' )
            // InternalCMakeLists.g:345:3: () otherlv_1= 'find_package' otherlv_2= '(' ( (lv_name_3_0= RULE_ID ) ) ( (lv_required_4_0= 'REQUIRED' ) )? (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )? otherlv_7= ')'
            {
            // InternalCMakeLists.g:345:3: ()
            // InternalCMakeLists.g:346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFindPackageAccess().getFindPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFindPackageAccess().getFind_packageKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getFindPackageAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMakeLists.g:360:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalCMakeLists.g:361:4: (lv_name_3_0= RULE_ID )
            {
            // InternalCMakeLists.g:361:4: (lv_name_3_0= RULE_ID )
            // InternalCMakeLists.g:362:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFindPackageAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFindPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCMakeLists.g:378:3: ( (lv_required_4_0= 'REQUIRED' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCMakeLists.g:379:4: (lv_required_4_0= 'REQUIRED' )
                    {
                    // InternalCMakeLists.g:379:4: (lv_required_4_0= 'REQUIRED' )
                    // InternalCMakeLists.g:380:5: lv_required_4_0= 'REQUIRED'
                    {
                    lv_required_4_0=(Token)match(input,19,FOLLOW_10); 

                    					newLeafNode(lv_required_4_0, grammarAccess.getFindPackageAccess().getRequiredREQUIREDKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFindPackageRule());
                    					}
                    					setWithLastConsumed(current, "required", lv_required_4_0 != null, "REQUIRED");
                    				

                    }


                    }
                    break;

            }

            // InternalCMakeLists.g:392:3: (otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCMakeLists.g:393:4: otherlv_5= 'COMPONENTS' ( (lv_components_6_0= RULE_ID ) )+
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getFindPackageAccess().getCOMPONENTSKeyword_5_0());
                    			
                    // InternalCMakeLists.g:397:4: ( (lv_components_6_0= RULE_ID ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCMakeLists.g:398:5: (lv_components_6_0= RULE_ID )
                    	    {
                    	    // InternalCMakeLists.g:398:5: (lv_components_6_0= RULE_ID )
                    	    // InternalCMakeLists.g:399:6: lv_components_6_0= RULE_ID
                    	    {
                    	    lv_components_6_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						newLeafNode(lv_components_6_0, grammarAccess.getFindPackageAccess().getComponentsIDTerminalRuleCall_5_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getFindPackageRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"components",
                    	    							lv_components_6_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFindPackageAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFindPackage"


    // $ANTLR start "entryRuleAddExecutable"
    // InternalCMakeLists.g:424:1: entryRuleAddExecutable returns [EObject current=null] : iv_ruleAddExecutable= ruleAddExecutable EOF ;
    public final EObject entryRuleAddExecutable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExecutable = null;


        try {
            // InternalCMakeLists.g:424:54: (iv_ruleAddExecutable= ruleAddExecutable EOF )
            // InternalCMakeLists.g:425:2: iv_ruleAddExecutable= ruleAddExecutable EOF
            {
             newCompositeNode(grammarAccess.getAddExecutableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExecutable=ruleAddExecutable();

            state._fsp--;

             current =iv_ruleAddExecutable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddExecutable"


    // $ANTLR start "ruleAddExecutable"
    // InternalCMakeLists.g:431:1: ruleAddExecutable returns [EObject current=null] : (otherlv_0= 'add_executable' otherlv_1= '(' ( (lv_name_2_0= ruleExecutable ) ) ( (lv_sources_3_0= rulePath ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAddExecutable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_sources_3_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:437:2: ( (otherlv_0= 'add_executable' otherlv_1= '(' ( (lv_name_2_0= ruleExecutable ) ) ( (lv_sources_3_0= rulePath ) )+ otherlv_4= ')' ) )
            // InternalCMakeLists.g:438:2: (otherlv_0= 'add_executable' otherlv_1= '(' ( (lv_name_2_0= ruleExecutable ) ) ( (lv_sources_3_0= rulePath ) )+ otherlv_4= ')' )
            {
            // InternalCMakeLists.g:438:2: (otherlv_0= 'add_executable' otherlv_1= '(' ( (lv_name_2_0= ruleExecutable ) ) ( (lv_sources_3_0= rulePath ) )+ otherlv_4= ')' )
            // InternalCMakeLists.g:439:3: otherlv_0= 'add_executable' otherlv_1= '(' ( (lv_name_2_0= ruleExecutable ) ) ( (lv_sources_3_0= rulePath ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddExecutableAccess().getAdd_executableKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAddExecutableAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMakeLists.g:447:3: ( (lv_name_2_0= ruleExecutable ) )
            // InternalCMakeLists.g:448:4: (lv_name_2_0= ruleExecutable )
            {
            // InternalCMakeLists.g:448:4: (lv_name_2_0= ruleExecutable )
            // InternalCMakeLists.g:449:5: lv_name_2_0= ruleExecutable
            {

            					newCompositeNode(grammarAccess.getAddExecutableAccess().getNameExecutableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleExecutable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddExecutableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.spf.cmakelists.CMakeLists.Executable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMakeLists.g:466:3: ( (lv_sources_3_0= rulePath ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCMakeLists.g:467:4: (lv_sources_3_0= rulePath )
            	    {
            	    // InternalCMakeLists.g:467:4: (lv_sources_3_0= rulePath )
            	    // InternalCMakeLists.g:468:5: lv_sources_3_0= rulePath
            	    {

            	    					newCompositeNode(grammarAccess.getAddExecutableAccess().getSourcesPathParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_sources_3_0=rulePath();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAddExecutableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sources",
            	    						lv_sources_3_0,
            	    						"org.spf.cmakelists.CMakeLists.Path");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAddExecutableAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddExecutable"


    // $ANTLR start "entryRulePath"
    // InternalCMakeLists.g:493:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // InternalCMakeLists.g:493:44: (iv_rulePath= rulePath EOF )
            // InternalCMakeLists.g:494:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalCMakeLists.g:500:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' ) | (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath ) ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_6=null;
        Token this_ID_8=null;
        AntlrDatatypeRuleToken this_Path_10 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:506:2: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' ) | (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath ) ) )
            // InternalCMakeLists.g:507:2: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' ) | (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath ) )
            {
            // InternalCMakeLists.g:507:2: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) | (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' ) | (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath ) )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case RULE_ID:
                case RULE_STRING:
                case RULE_INT:
                case RULE_DECORATED_PACKAGE:
                case 16:
                case 23:
                case 32:
                case 34:
                    {
                    alt7=1;
                    }
                    break;
                case 22:
                    {
                    alt7=2;
                    }
                    break;
                case 26:
                    {
                    alt7=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA7_0==23) ) {
                alt7=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCMakeLists.g:508:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCMakeLists.g:516:3: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // InternalCMakeLists.g:516:3: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // InternalCMakeLists.g:517:4: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_0());
                    			
                    kw=(Token)match(input,22,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_1_1());
                    			
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_3);
                    			

                    				newLeafNode(this_ID_3, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCMakeLists.g:538:3: (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' )
                    {
                    // InternalCMakeLists.g:538:3: (kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}' )
                    // InternalCMakeLists.g:539:4: kw= '$' kw= '{' this_ID_6= RULE_ID kw= '}'
                    {
                    kw=(Token)match(input,23,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPathAccess().getDollarSignKeyword_2_0());
                    			
                    kw=(Token)match(input,24,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPathAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    				current.merge(this_ID_6);
                    			

                    				newLeafNode(this_ID_6, grammarAccess.getPathAccess().getIDTerminalRuleCall_2_2());
                    			
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPathAccess().getRightCurlyBracketKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCMakeLists.g:563:3: (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath )
                    {
                    // InternalCMakeLists.g:563:3: (this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath )
                    // InternalCMakeLists.g:564:4: this_ID_8= RULE_ID kw= '/' this_Path_10= rulePath
                    {
                    this_ID_8=(Token)match(input,RULE_ID,FOLLOW_17); 

                    				current.merge(this_ID_8);
                    			

                    				newLeafNode(this_ID_8, grammarAccess.getPathAccess().getIDTerminalRuleCall_3_0());
                    			
                    kw=(Token)match(input,26,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPathAccess().getSolidusKeyword_3_1());
                    			

                    				newCompositeNode(grammarAccess.getPathAccess().getPathParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Path_10=rulePath();

                    state._fsp--;


                    				current.merge(this_Path_10);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleExecutable"
    // InternalCMakeLists.g:591:1: entryRuleExecutable returns [EObject current=null] : iv_ruleExecutable= ruleExecutable EOF ;
    public final EObject entryRuleExecutable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutable = null;


        try {
            // InternalCMakeLists.g:591:51: (iv_ruleExecutable= ruleExecutable EOF )
            // InternalCMakeLists.g:592:2: iv_ruleExecutable= ruleExecutable EOF
            {
             newCompositeNode(grammarAccess.getExecutableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecutable=ruleExecutable();

            state._fsp--;

             current =iv_ruleExecutable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExecutable"


    // $ANTLR start "ruleExecutable"
    // InternalCMakeLists.g:598:1: ruleExecutable returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExecutable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:604:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalCMakeLists.g:605:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalCMakeLists.g:605:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalCMakeLists.g:606:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalCMakeLists.g:606:3: ()
            // InternalCMakeLists.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecutableAccess().getExecutableAction_0(),
            					current);
            			

            }

            // InternalCMakeLists.g:613:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCMakeLists.g:614:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCMakeLists.g:614:4: (lv_name_1_0= RULE_ID )
            // InternalCMakeLists.g:615:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExecutableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecutableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExecutable"


    // $ANTLR start "entryRuleAmentTargetDependencies"
    // InternalCMakeLists.g:635:1: entryRuleAmentTargetDependencies returns [EObject current=null] : iv_ruleAmentTargetDependencies= ruleAmentTargetDependencies EOF ;
    public final EObject entryRuleAmentTargetDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmentTargetDependencies = null;


        try {
            // InternalCMakeLists.g:635:64: (iv_ruleAmentTargetDependencies= ruleAmentTargetDependencies EOF )
            // InternalCMakeLists.g:636:2: iv_ruleAmentTargetDependencies= ruleAmentTargetDependencies EOF
            {
             newCompositeNode(grammarAccess.getAmentTargetDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmentTargetDependencies=ruleAmentTargetDependencies();

            state._fsp--;

             current =iv_ruleAmentTargetDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmentTargetDependencies"


    // $ANTLR start "ruleAmentTargetDependencies"
    // InternalCMakeLists.g:642:1: ruleAmentTargetDependencies returns [EObject current=null] : (otherlv_0= 'ament_target_dependencies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_dependencies_3_0= rulePath ) )* otherlv_4= ')' ) ;
    public final EObject ruleAmentTargetDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_dependencies_3_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:648:2: ( (otherlv_0= 'ament_target_dependencies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_dependencies_3_0= rulePath ) )* otherlv_4= ')' ) )
            // InternalCMakeLists.g:649:2: (otherlv_0= 'ament_target_dependencies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_dependencies_3_0= rulePath ) )* otherlv_4= ')' )
            {
            // InternalCMakeLists.g:649:2: (otherlv_0= 'ament_target_dependencies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_dependencies_3_0= rulePath ) )* otherlv_4= ')' )
            // InternalCMakeLists.g:650:3: otherlv_0= 'ament_target_dependencies' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) ( (lv_dependencies_3_0= rulePath ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAmentTargetDependenciesAccess().getAment_target_dependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAmentTargetDependenciesAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMakeLists.g:658:3: ( (otherlv_2= RULE_ID ) )
            // InternalCMakeLists.g:659:4: (otherlv_2= RULE_ID )
            {
            // InternalCMakeLists.g:659:4: (otherlv_2= RULE_ID )
            // InternalCMakeLists.g:660:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAmentTargetDependenciesRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getAmentTargetDependenciesAccess().getNameExecutableCrossReference_2_0());
            				

            }


            }

            // InternalCMakeLists.g:671:3: ( (lv_dependencies_3_0= rulePath ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCMakeLists.g:672:4: (lv_dependencies_3_0= rulePath )
            	    {
            	    // InternalCMakeLists.g:672:4: (lv_dependencies_3_0= rulePath )
            	    // InternalCMakeLists.g:673:5: lv_dependencies_3_0= rulePath
            	    {

            	    					newCompositeNode(grammarAccess.getAmentTargetDependenciesAccess().getDependenciesPathParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_dependencies_3_0=rulePath();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAmentTargetDependenciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dependencies",
            	    						lv_dependencies_3_0,
            	    						"org.spf.cmakelists.CMakeLists.Path");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAmentTargetDependenciesAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmentTargetDependencies"


    // $ANTLR start "entryRuleAmentPackageInstruction"
    // InternalCMakeLists.g:698:1: entryRuleAmentPackageInstruction returns [EObject current=null] : iv_ruleAmentPackageInstruction= ruleAmentPackageInstruction EOF ;
    public final EObject entryRuleAmentPackageInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmentPackageInstruction = null;


        try {
            // InternalCMakeLists.g:698:64: (iv_ruleAmentPackageInstruction= ruleAmentPackageInstruction EOF )
            // InternalCMakeLists.g:699:2: iv_ruleAmentPackageInstruction= ruleAmentPackageInstruction EOF
            {
             newCompositeNode(grammarAccess.getAmentPackageInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmentPackageInstruction=ruleAmentPackageInstruction();

            state._fsp--;

             current =iv_ruleAmentPackageInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmentPackageInstruction"


    // $ANTLR start "ruleAmentPackageInstruction"
    // InternalCMakeLists.g:705:1: ruleAmentPackageInstruction returns [EObject current=null] : ( () otherlv_1= 'ament_package' otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleAmentPackageInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:711:2: ( ( () otherlv_1= 'ament_package' otherlv_2= '(' otherlv_3= ')' ) )
            // InternalCMakeLists.g:712:2: ( () otherlv_1= 'ament_package' otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalCMakeLists.g:712:2: ( () otherlv_1= 'ament_package' otherlv_2= '(' otherlv_3= ')' )
            // InternalCMakeLists.g:713:3: () otherlv_1= 'ament_package' otherlv_2= '(' otherlv_3= ')'
            {
            // InternalCMakeLists.g:713:3: ()
            // InternalCMakeLists.g:714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmentPackageInstructionAccess().getAmentPackageInstructionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAmentPackageInstructionAccess().getAment_packageKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getAmentPackageInstructionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAmentPackageInstructionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmentPackageInstruction"


    // $ANTLR start "entryRuleInstallTargets"
    // InternalCMakeLists.g:736:1: entryRuleInstallTargets returns [EObject current=null] : iv_ruleInstallTargets= ruleInstallTargets EOF ;
    public final EObject entryRuleInstallTargets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstallTargets = null;


        try {
            // InternalCMakeLists.g:736:55: (iv_ruleInstallTargets= ruleInstallTargets EOF )
            // InternalCMakeLists.g:737:2: iv_ruleInstallTargets= ruleInstallTargets EOF
            {
             newCompositeNode(grammarAccess.getInstallTargetsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstallTargets=ruleInstallTargets();

            state._fsp--;

             current =iv_ruleInstallTargets; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstallTargets"


    // $ANTLR start "ruleInstallTargets"
    // InternalCMakeLists.g:743:1: ruleInstallTargets returns [EObject current=null] : (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'TARGETS' ( (otherlv_3= RULE_ID ) )* ( (lv_runtime_4_0= 'RUNTIME' ) )? otherlv_5= 'DESTINATION' ( (lv_destination_6_0= rulePath ) ) otherlv_7= ')' ) ;
    public final EObject ruleInstallTargets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_runtime_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_destination_6_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:749:2: ( (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'TARGETS' ( (otherlv_3= RULE_ID ) )* ( (lv_runtime_4_0= 'RUNTIME' ) )? otherlv_5= 'DESTINATION' ( (lv_destination_6_0= rulePath ) ) otherlv_7= ')' ) )
            // InternalCMakeLists.g:750:2: (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'TARGETS' ( (otherlv_3= RULE_ID ) )* ( (lv_runtime_4_0= 'RUNTIME' ) )? otherlv_5= 'DESTINATION' ( (lv_destination_6_0= rulePath ) ) otherlv_7= ')' )
            {
            // InternalCMakeLists.g:750:2: (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'TARGETS' ( (otherlv_3= RULE_ID ) )* ( (lv_runtime_4_0= 'RUNTIME' ) )? otherlv_5= 'DESTINATION' ( (lv_destination_6_0= rulePath ) ) otherlv_7= ')' )
            // InternalCMakeLists.g:751:3: otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'TARGETS' ( (otherlv_3= RULE_ID ) )* ( (lv_runtime_4_0= 'RUNTIME' ) )? otherlv_5= 'DESTINATION' ( (lv_destination_6_0= rulePath ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstallTargetsAccess().getInstallKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInstallTargetsAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getInstallTargetsAccess().getTARGETSKeyword_2());
            		
            // InternalCMakeLists.g:763:3: ( (otherlv_3= RULE_ID ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCMakeLists.g:764:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalCMakeLists.g:764:4: (otherlv_3= RULE_ID )
            	    // InternalCMakeLists.g:765:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getInstallTargetsRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    					newLeafNode(otherlv_3, grammarAccess.getInstallTargetsAccess().getTargetsExecutableCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalCMakeLists.g:776:3: ( (lv_runtime_4_0= 'RUNTIME' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCMakeLists.g:777:4: (lv_runtime_4_0= 'RUNTIME' )
                    {
                    // InternalCMakeLists.g:777:4: (lv_runtime_4_0= 'RUNTIME' )
                    // InternalCMakeLists.g:778:5: lv_runtime_4_0= 'RUNTIME'
                    {
                    lv_runtime_4_0=(Token)match(input,31,FOLLOW_20); 

                    					newLeafNode(lv_runtime_4_0, grammarAccess.getInstallTargetsAccess().getRuntimeRUNTIMEKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstallTargetsRule());
                    					}
                    					setWithLastConsumed(current, "runtime", lv_runtime_4_0 != null, "RUNTIME");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getInstallTargetsAccess().getDESTINATIONKeyword_5());
            		
            // InternalCMakeLists.g:794:3: ( (lv_destination_6_0= rulePath ) )
            // InternalCMakeLists.g:795:4: (lv_destination_6_0= rulePath )
            {
            // InternalCMakeLists.g:795:4: (lv_destination_6_0= rulePath )
            // InternalCMakeLists.g:796:5: lv_destination_6_0= rulePath
            {

            					newCompositeNode(grammarAccess.getInstallTargetsAccess().getDestinationPathParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_destination_6_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstallTargetsRule());
            					}
            					set(
            						current,
            						"destination",
            						lv_destination_6_0,
            						"org.spf.cmakelists.CMakeLists.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getInstallTargetsAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstallTargets"


    // $ANTLR start "entryRuleInstallDirectory"
    // InternalCMakeLists.g:821:1: entryRuleInstallDirectory returns [EObject current=null] : iv_ruleInstallDirectory= ruleInstallDirectory EOF ;
    public final EObject entryRuleInstallDirectory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstallDirectory = null;


        try {
            // InternalCMakeLists.g:821:57: (iv_ruleInstallDirectory= ruleInstallDirectory EOF )
            // InternalCMakeLists.g:822:2: iv_ruleInstallDirectory= ruleInstallDirectory EOF
            {
             newCompositeNode(grammarAccess.getInstallDirectoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstallDirectory=ruleInstallDirectory();

            state._fsp--;

             current =iv_ruleInstallDirectory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstallDirectory"


    // $ANTLR start "ruleInstallDirectory"
    // InternalCMakeLists.g:828:1: ruleInstallDirectory returns [EObject current=null] : (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'DIRECTORY' ( (lv_directory_3_0= rulePath ) ) otherlv_4= 'DESTINATION' ( (lv_destination_5_0= rulePath ) ) (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )? otherlv_9= ')' ) ;
    public final EObject ruleInstallDirectory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_patterns_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_directory_3_0 = null;

        AntlrDatatypeRuleToken lv_destination_5_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:834:2: ( (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'DIRECTORY' ( (lv_directory_3_0= rulePath ) ) otherlv_4= 'DESTINATION' ( (lv_destination_5_0= rulePath ) ) (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )? otherlv_9= ')' ) )
            // InternalCMakeLists.g:835:2: (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'DIRECTORY' ( (lv_directory_3_0= rulePath ) ) otherlv_4= 'DESTINATION' ( (lv_destination_5_0= rulePath ) ) (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )? otherlv_9= ')' )
            {
            // InternalCMakeLists.g:835:2: (otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'DIRECTORY' ( (lv_directory_3_0= rulePath ) ) otherlv_4= 'DESTINATION' ( (lv_destination_5_0= rulePath ) ) (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )? otherlv_9= ')' )
            // InternalCMakeLists.g:836:3: otherlv_0= 'install' otherlv_1= '(' otherlv_2= 'DIRECTORY' ( (lv_directory_3_0= rulePath ) ) otherlv_4= 'DESTINATION' ( (lv_destination_5_0= rulePath ) ) (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )? otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstallDirectoryAccess().getInstallKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getInstallDirectoryAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getInstallDirectoryAccess().getDIRECTORYKeyword_2());
            		
            // InternalCMakeLists.g:848:3: ( (lv_directory_3_0= rulePath ) )
            // InternalCMakeLists.g:849:4: (lv_directory_3_0= rulePath )
            {
            // InternalCMakeLists.g:849:4: (lv_directory_3_0= rulePath )
            // InternalCMakeLists.g:850:5: lv_directory_3_0= rulePath
            {

            					newCompositeNode(grammarAccess.getInstallDirectoryAccess().getDirectoryPathParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_directory_3_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstallDirectoryRule());
            					}
            					set(
            						current,
            						"directory",
            						lv_directory_3_0,
            						"org.spf.cmakelists.CMakeLists.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getInstallDirectoryAccess().getDESTINATIONKeyword_4());
            		
            // InternalCMakeLists.g:871:3: ( (lv_destination_5_0= rulePath ) )
            // InternalCMakeLists.g:872:4: (lv_destination_5_0= rulePath )
            {
            // InternalCMakeLists.g:872:4: (lv_destination_5_0= rulePath )
            // InternalCMakeLists.g:873:5: lv_destination_5_0= rulePath
            {

            					newCompositeNode(grammarAccess.getInstallDirectoryAccess().getDestinationPathParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_destination_5_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstallDirectoryRule());
            					}
            					set(
            						current,
            						"destination",
            						lv_destination_5_0,
            						"org.spf.cmakelists.CMakeLists.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCMakeLists.g:890:3: (otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCMakeLists.g:891:4: otherlv_6= 'FILES_MATCHING' (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getInstallDirectoryAccess().getFILES_MATCHINGKeyword_6_0());
                    			
                    // InternalCMakeLists.g:895:4: (otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==35) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalCMakeLists.g:896:5: otherlv_7= 'PATTERN' ( (lv_patterns_8_0= RULE_STRING ) )
                    	    {
                    	    otherlv_7=(Token)match(input,35,FOLLOW_24); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getInstallDirectoryAccess().getPATTERNKeyword_6_1_0());
                    	    				
                    	    // InternalCMakeLists.g:900:5: ( (lv_patterns_8_0= RULE_STRING ) )
                    	    // InternalCMakeLists.g:901:6: (lv_patterns_8_0= RULE_STRING )
                    	    {
                    	    // InternalCMakeLists.g:901:6: (lv_patterns_8_0= RULE_STRING )
                    	    // InternalCMakeLists.g:902:7: lv_patterns_8_0= RULE_STRING
                    	    {
                    	    lv_patterns_8_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    	    							newLeafNode(lv_patterns_8_0, grammarAccess.getInstallDirectoryAccess().getPatternsSTRINGTerminalRuleCall_6_1_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getInstallDirectoryRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"patterns",
                    	    								lv_patterns_8_0,
                    	    								"org.eclipse.xtext.common.Terminals.STRING");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInstallDirectoryAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstallDirectory"


    // $ANTLR start "entryRuleIfInstruction"
    // InternalCMakeLists.g:928:1: entryRuleIfInstruction returns [EObject current=null] : iv_ruleIfInstruction= ruleIfInstruction EOF ;
    public final EObject entryRuleIfInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfInstruction = null;


        try {
            // InternalCMakeLists.g:928:54: (iv_ruleIfInstruction= ruleIfInstruction EOF )
            // InternalCMakeLists.g:929:2: iv_ruleIfInstruction= ruleIfInstruction EOF
            {
             newCompositeNode(grammarAccess.getIfInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfInstruction=ruleIfInstruction();

            state._fsp--;

             current =iv_ruleIfInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfInstruction"


    // $ANTLR start "ruleIfInstruction"
    // InternalCMakeLists.g:935:1: ruleIfInstruction returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )* otherlv_8= ')' ( (lv_instructions_9_0= ruleInstruction ) )* otherlv_10= 'endif' otherlv_11= '(' otherlv_12= ')' ) ;
    public final EObject ruleIfInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_predicate_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_ID_6=null;
        Token this_STRING_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_instructions_9_0 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:941:2: ( ( () otherlv_1= 'if' otherlv_2= '(' ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )* otherlv_8= ')' ( (lv_instructions_9_0= ruleInstruction ) )* otherlv_10= 'endif' otherlv_11= '(' otherlv_12= ')' ) )
            // InternalCMakeLists.g:942:2: ( () otherlv_1= 'if' otherlv_2= '(' ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )* otherlv_8= ')' ( (lv_instructions_9_0= ruleInstruction ) )* otherlv_10= 'endif' otherlv_11= '(' otherlv_12= ')' )
            {
            // InternalCMakeLists.g:942:2: ( () otherlv_1= 'if' otherlv_2= '(' ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )* otherlv_8= ')' ( (lv_instructions_9_0= ruleInstruction ) )* otherlv_10= 'endif' otherlv_11= '(' otherlv_12= ')' )
            // InternalCMakeLists.g:943:3: () otherlv_1= 'if' otherlv_2= '(' ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )* otherlv_8= ')' ( (lv_instructions_9_0= ruleInstruction ) )* otherlv_10= 'endif' otherlv_11= '(' otherlv_12= ')'
            {
            // InternalCMakeLists.g:943:3: ()
            // InternalCMakeLists.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfInstructionAccess().getIfInstructionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIfInstructionAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getIfInstructionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCMakeLists.g:958:3: ( ( (lv_predicate_3_0= 'AND' ) ) | otherlv_4= 'OR' | otherlv_5= 'MATCHES' | this_ID_6= RULE_ID | this_STRING_7= RULE_STRING )*
            loop13:
            do {
                int alt13=6;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt13=1;
                    }
                    break;
                case 38:
                    {
                    alt13=2;
                    }
                    break;
                case 39:
                    {
                    alt13=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt13=4;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt13=5;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalCMakeLists.g:959:4: ( (lv_predicate_3_0= 'AND' ) )
            	    {
            	    // InternalCMakeLists.g:959:4: ( (lv_predicate_3_0= 'AND' ) )
            	    // InternalCMakeLists.g:960:5: (lv_predicate_3_0= 'AND' )
            	    {
            	    // InternalCMakeLists.g:960:5: (lv_predicate_3_0= 'AND' )
            	    // InternalCMakeLists.g:961:6: lv_predicate_3_0= 'AND'
            	    {
            	    lv_predicate_3_0=(Token)match(input,37,FOLLOW_26); 

            	    						newLeafNode(lv_predicate_3_0, grammarAccess.getIfInstructionAccess().getPredicateANDKeyword_3_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getIfInstructionRule());
            	    						}
            	    						addWithLastConsumed(current, "predicate", lv_predicate_3_0, "AND");
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMakeLists.g:974:4: otherlv_4= 'OR'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_26); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfInstructionAccess().getORKeyword_3_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalCMakeLists.g:979:4: otherlv_5= 'MATCHES'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getIfInstructionAccess().getMATCHESKeyword_3_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalCMakeLists.g:984:4: this_ID_6= RULE_ID
            	    {
            	    this_ID_6=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    				newLeafNode(this_ID_6, grammarAccess.getIfInstructionAccess().getIDTerminalRuleCall_3_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalCMakeLists.g:989:4: this_STRING_7= RULE_STRING
            	    {
            	    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    				newLeafNode(this_STRING_7, grammarAccess.getIfInstructionAccess().getSTRINGTerminalRuleCall_3_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getIfInstructionAccess().getRightParenthesisKeyword_4());
            		
            // InternalCMakeLists.g:998:3: ( (lv_instructions_9_0= ruleInstruction ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==13||(LA14_0>=17 && LA14_0<=18)||LA14_0==21||(LA14_0>=27 && LA14_0<=29)||LA14_0==36||(LA14_0>=41 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCMakeLists.g:999:4: (lv_instructions_9_0= ruleInstruction )
            	    {
            	    // InternalCMakeLists.g:999:4: (lv_instructions_9_0= ruleInstruction )
            	    // InternalCMakeLists.g:1000:5: lv_instructions_9_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getIfInstructionAccess().getInstructionsInstructionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_instructions_9_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfInstructionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instructions",
            	    						lv_instructions_9_0,
            	    						"org.spf.cmakelists.CMakeLists.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_10=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getIfInstructionAccess().getEndifKeyword_6());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getIfInstructionAccess().getLeftParenthesisKeyword_7());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getIfInstructionAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfInstruction"


    // $ANTLR start "entryRuleSetInstruction"
    // InternalCMakeLists.g:1033:1: entryRuleSetInstruction returns [EObject current=null] : iv_ruleSetInstruction= ruleSetInstruction EOF ;
    public final EObject entryRuleSetInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetInstruction = null;


        try {
            // InternalCMakeLists.g:1033:55: (iv_ruleSetInstruction= ruleSetInstruction EOF )
            // InternalCMakeLists.g:1034:2: iv_ruleSetInstruction= ruleSetInstruction EOF
            {
             newCompositeNode(grammarAccess.getSetInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetInstruction=ruleSetInstruction();

            state._fsp--;

             current =iv_ruleSetInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetInstruction"


    // $ANTLR start "ruleSetInstruction"
    // InternalCMakeLists.g:1040:1: ruleSetInstruction returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSetInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token lv_arguments_3_1=null;
        Token lv_arguments_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_arguments_3_2 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:1046:2: ( (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' ) )
            // InternalCMakeLists.g:1047:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )
            {
            // InternalCMakeLists.g:1047:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')' )
            // InternalCMakeLists.g:1048:3: otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_ID ) ) ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSetInstructionAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSetInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMakeLists.g:1056:3: ( (lv_variable_2_0= RULE_ID ) )
            // InternalCMakeLists.g:1057:4: (lv_variable_2_0= RULE_ID )
            {
            // InternalCMakeLists.g:1057:4: (lv_variable_2_0= RULE_ID )
            // InternalCMakeLists.g:1058:5: lv_variable_2_0= RULE_ID
            {
            lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_variable_2_0, grammarAccess.getSetInstructionAccess().getVariableIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCMakeLists.g:1074:3: ( ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) ) | ( (lv_arguments_4_0= RULE_INT ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)||LA16_0==23) ) {
                    alt16=1;
                }
                else if ( (LA16_0==RULE_INT) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCMakeLists.g:1075:4: ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) )
            	    {
            	    // InternalCMakeLists.g:1075:4: ( ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) ) )
            	    // InternalCMakeLists.g:1076:5: ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) )
            	    {
            	    // InternalCMakeLists.g:1076:5: ( (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath ) )
            	    // InternalCMakeLists.g:1077:6: (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath )
            	    {
            	    // InternalCMakeLists.g:1077:6: (lv_arguments_3_1= RULE_STRING | lv_arguments_3_2= rulePath )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_STRING) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_ID||LA15_0==23) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalCMakeLists.g:1078:7: lv_arguments_3_1= RULE_STRING
            	            {
            	            lv_arguments_3_1=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	            							newLeafNode(lv_arguments_3_1, grammarAccess.getSetInstructionAccess().getArgumentsSTRINGTerminalRuleCall_3_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getSetInstructionRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_3_1,
            	            								"org.eclipse.xtext.common.Terminals.STRING");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMakeLists.g:1093:7: lv_arguments_3_2= rulePath
            	            {

            	            							newCompositeNode(grammarAccess.getSetInstructionAccess().getArgumentsPathParserRuleCall_3_0_0_1());
            	            						
            	            pushFollow(FOLLOW_28);
            	            lv_arguments_3_2=rulePath();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getSetInstructionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_3_2,
            	            								"org.spf.cmakelists.CMakeLists.Path");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMakeLists.g:1112:4: ( (lv_arguments_4_0= RULE_INT ) )
            	    {
            	    // InternalCMakeLists.g:1112:4: ( (lv_arguments_4_0= RULE_INT ) )
            	    // InternalCMakeLists.g:1113:5: (lv_arguments_4_0= RULE_INT )
            	    {
            	    // InternalCMakeLists.g:1113:5: (lv_arguments_4_0= RULE_INT )
            	    // InternalCMakeLists.g:1114:6: lv_arguments_4_0= RULE_INT
            	    {
            	    lv_arguments_4_0=(Token)match(input,RULE_INT,FOLLOW_28); 

            	    						newLeafNode(lv_arguments_4_0, grammarAccess.getSetInstructionAccess().getArgumentsINTTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSetInstructionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_4_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSetInstructionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetInstruction"


    // $ANTLR start "entryRuleAddCompileOptions"
    // InternalCMakeLists.g:1139:1: entryRuleAddCompileOptions returns [EObject current=null] : iv_ruleAddCompileOptions= ruleAddCompileOptions EOF ;
    public final EObject entryRuleAddCompileOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCompileOptions = null;


        try {
            // InternalCMakeLists.g:1139:58: (iv_ruleAddCompileOptions= ruleAddCompileOptions EOF )
            // InternalCMakeLists.g:1140:2: iv_ruleAddCompileOptions= ruleAddCompileOptions EOF
            {
             newCompositeNode(grammarAccess.getAddCompileOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddCompileOptions=ruleAddCompileOptions();

            state._fsp--;

             current =iv_ruleAddCompileOptions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddCompileOptions"


    // $ANTLR start "ruleAddCompileOptions"
    // InternalCMakeLists.g:1146:1: ruleAddCompileOptions returns [EObject current=null] : (otherlv_0= 'add_compile_options' otherlv_1= '(' (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAddCompileOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_options_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCMakeLists.g:1152:2: ( (otherlv_0= 'add_compile_options' otherlv_1= '(' (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+ otherlv_4= ')' ) )
            // InternalCMakeLists.g:1153:2: (otherlv_0= 'add_compile_options' otherlv_1= '(' (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+ otherlv_4= ')' )
            {
            // InternalCMakeLists.g:1153:2: (otherlv_0= 'add_compile_options' otherlv_1= '(' (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+ otherlv_4= ')' )
            // InternalCMakeLists.g:1154:3: otherlv_0= 'add_compile_options' otherlv_1= '(' (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAddCompileOptionsAccess().getAdd_compile_optionsKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getAddCompileOptionsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMakeLists.g:1162:3: (otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCMakeLists.g:1163:4: otherlv_2= '-' ( (lv_options_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_8); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAddCompileOptionsAccess().getHyphenMinusKeyword_2_0());
            	    			
            	    // InternalCMakeLists.g:1167:4: ( (lv_options_3_0= RULE_ID ) )
            	    // InternalCMakeLists.g:1168:5: (lv_options_3_0= RULE_ID )
            	    {
            	    // InternalCMakeLists.g:1168:5: (lv_options_3_0= RULE_ID )
            	    // InternalCMakeLists.g:1169:6: lv_options_3_0= RULE_ID
            	    {
            	    lv_options_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            	    						newLeafNode(lv_options_3_0, grammarAccess.getAddCompileOptionsAccess().getOptionsIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAddCompileOptionsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"options",
            	    							lv_options_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAddCompileOptionsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddCompileOptions"


    // $ANTLR start "entryRuleUndefinedInstruction"
    // InternalCMakeLists.g:1194:1: entryRuleUndefinedInstruction returns [EObject current=null] : iv_ruleUndefinedInstruction= ruleUndefinedInstruction EOF ;
    public final EObject entryRuleUndefinedInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUndefinedInstruction = null;


        try {
            // InternalCMakeLists.g:1194:61: (iv_ruleUndefinedInstruction= ruleUndefinedInstruction EOF )
            // InternalCMakeLists.g:1195:2: iv_ruleUndefinedInstruction= ruleUndefinedInstruction EOF
            {
             newCompositeNode(grammarAccess.getUndefinedInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUndefinedInstruction=ruleUndefinedInstruction();

            state._fsp--;

             current =iv_ruleUndefinedInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUndefinedInstruction"


    // $ANTLR start "ruleUndefinedInstruction"
    // InternalCMakeLists.g:1201:1: ruleUndefinedInstruction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleUndefinedInstruction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_arguments_2_1=null;
        Token lv_arguments_2_3=null;
        Token lv_arguments_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_arguments_2_2 = null;



        	enterRule();

        try {
            // InternalCMakeLists.g:1207:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )* otherlv_4= ')' ) )
            // InternalCMakeLists.g:1208:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )* otherlv_4= ')' )
            {
            // InternalCMakeLists.g:1208:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )* otherlv_4= ')' )
            // InternalCMakeLists.g:1209:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '(' ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )* otherlv_4= ')'
            {
            // InternalCMakeLists.g:1209:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCMakeLists.g:1210:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCMakeLists.g:1210:4: (lv_name_0_0= RULE_ID )
            // InternalCMakeLists.g:1211:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getUndefinedInstructionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUndefinedInstructionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getUndefinedInstructionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalCMakeLists.g:1231:3: ( ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) ) | ( (lv_arguments_3_0= RULE_INT ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==RULE_DECORATED_PACKAGE||LA19_0==23) ) {
                    alt19=1;
                }
                else if ( (LA19_0==RULE_INT) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCMakeLists.g:1232:4: ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) )
            	    {
            	    // InternalCMakeLists.g:1232:4: ( ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) ) )
            	    // InternalCMakeLists.g:1233:5: ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) )
            	    {
            	    // InternalCMakeLists.g:1233:5: ( (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE ) )
            	    // InternalCMakeLists.g:1234:6: (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE )
            	    {
            	    // InternalCMakeLists.g:1234:6: (lv_arguments_2_1= RULE_STRING | lv_arguments_2_2= rulePath | lv_arguments_2_3= RULE_DECORATED_PACKAGE )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case RULE_ID:
            	    case 23:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case RULE_DECORATED_PACKAGE:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // InternalCMakeLists.g:1235:7: lv_arguments_2_1= RULE_STRING
            	            {
            	            lv_arguments_2_1=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	            							newLeafNode(lv_arguments_2_1, grammarAccess.getUndefinedInstructionAccess().getArgumentsSTRINGTerminalRuleCall_2_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getUndefinedInstructionRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_2_1,
            	            								"org.eclipse.xtext.common.Terminals.STRING");
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalCMakeLists.g:1250:7: lv_arguments_2_2= rulePath
            	            {

            	            							newCompositeNode(grammarAccess.getUndefinedInstructionAccess().getArgumentsPathParserRuleCall_2_0_0_1());
            	            						
            	            pushFollow(FOLLOW_31);
            	            lv_arguments_2_2=rulePath();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getUndefinedInstructionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_2_2,
            	            								"org.spf.cmakelists.CMakeLists.Path");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalCMakeLists.g:1266:7: lv_arguments_2_3= RULE_DECORATED_PACKAGE
            	            {
            	            lv_arguments_2_3=(Token)match(input,RULE_DECORATED_PACKAGE,FOLLOW_31); 

            	            							newLeafNode(lv_arguments_2_3, grammarAccess.getUndefinedInstructionAccess().getArgumentsDECORATED_PACKAGETerminalRuleCall_2_0_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getUndefinedInstructionRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"arguments",
            	            								lv_arguments_2_3,
            	            								"org.spf.cmakelists.CMakeLists.DECORATED_PACKAGE");
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCMakeLists.g:1284:4: ( (lv_arguments_3_0= RULE_INT ) )
            	    {
            	    // InternalCMakeLists.g:1284:4: ( (lv_arguments_3_0= RULE_INT ) )
            	    // InternalCMakeLists.g:1285:5: (lv_arguments_3_0= RULE_INT )
            	    {
            	    // InternalCMakeLists.g:1285:5: (lv_arguments_3_0= RULE_INT )
            	    // InternalCMakeLists.g:1286:6: lv_arguments_3_0= RULE_INT
            	    {
            	    lv_arguments_3_0=(Token)match(input,RULE_INT,FOLLOW_31); 

            	    						newLeafNode(lv_arguments_3_0, grammarAccess.getUndefinedInstructionAccess().getArgumentsINTTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUndefinedInstructionRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"arguments",
            	    							lv_arguments_3_0,
            	    							"org.eclipse.xtext.common.Terminals.INT");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getUndefinedInstructionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUndefinedInstruction"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\5\6\uffff\1\16\4\uffff\1\36\2\uffff";
    static final String dfa_3s = "\1\52\6\uffff\1\16\4\uffff\1\41\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\14\1\uffff\1\7\1\10";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\13\7\uffff\1\1\3\uffff\1\2\1\3\2\uffff\1\4\5\uffff\1\5\1\6\1\7\6\uffff\1\10\4\uffff\1\11\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "\1\15\2\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "114:2: (this_CMakeMinimumRequired_0= ruleCMakeMinimumRequired | this_ProjectInstruction_1= ruleProjectInstruction | this_FindPackage_2= ruleFindPackage | this_AddExecutable_3= ruleAddExecutable | this_AmentTargetDependencies_4= ruleAmentTargetDependencies | this_AmentPackageInstruction_5= ruleAmentPackageInstruction | this_InstallTargets_6= ruleInstallTargets | this_InstallDirectory_7= ruleInstallDirectory | this_IfInstruction_8= ruleIfInstruction | this_SetInstruction_9= ruleSetInstruction | this_AddCompileOptions_10= ruleAddCompileOptions | this_UndefinedInstruction_11= ruleUndefinedInstruction )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000061038262022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000810020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000180000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000E000010060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000071038262020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000008100E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000008101E0L});

}