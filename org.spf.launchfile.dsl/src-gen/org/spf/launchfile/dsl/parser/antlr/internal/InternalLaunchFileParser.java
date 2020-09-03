package org.spf.launchfile.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.spf.launchfile.dsl.services.LaunchFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLaunchFileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOTTED_PARAM", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'from'", "'import'", "'LaunchDescription'", "'Node'", "','", "'def'", "'('", "')'", "':'", "'return'", "'['", "']'", "'launch_ros.actions.Node'", "'node_name'", "'='", "'package'", "'namespace'", "'node_executable'", "'output'", "'parameters'", "'[{'", "'}]'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_DOTTED_PARAM=5;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
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


        public InternalLaunchFileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLaunchFileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLaunchFileParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLaunchFile.g"; }



     	private LaunchFileGrammarAccess grammarAccess;

        public InternalLaunchFileParser(TokenStream input, LaunchFileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PythonFile";
       	}

       	@Override
       	protected LaunchFileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePythonFile"
    // InternalLaunchFile.g:64:1: entryRulePythonFile returns [EObject current=null] : iv_rulePythonFile= rulePythonFile EOF ;
    public final EObject entryRulePythonFile() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePythonFile = null;


        try {
            // InternalLaunchFile.g:64:51: (iv_rulePythonFile= rulePythonFile EOF )
            // InternalLaunchFile.g:65:2: iv_rulePythonFile= rulePythonFile EOF
            {
             newCompositeNode(grammarAccess.getPythonFileRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePythonFile=rulePythonFile();

            state._fsp--;

             current =iv_rulePythonFile; 
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
    // $ANTLR end "entryRulePythonFile"


    // $ANTLR start "rulePythonFile"
    // InternalLaunchFile.g:71:1: rulePythonFile returns [EObject current=null] : ( (lv_instructions_0_0= rulePythonInstruction ) )* ;
    public final EObject rulePythonFile() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:77:2: ( ( (lv_instructions_0_0= rulePythonInstruction ) )* )
            // InternalLaunchFile.g:78:2: ( (lv_instructions_0_0= rulePythonInstruction ) )*
            {
            // InternalLaunchFile.g:78:2: ( (lv_instructions_0_0= rulePythonInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLaunchFile.g:79:3: (lv_instructions_0_0= rulePythonInstruction )
            	    {
            	    // InternalLaunchFile.g:79:3: (lv_instructions_0_0= rulePythonInstruction )
            	    // InternalLaunchFile.g:80:4: lv_instructions_0_0= rulePythonInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getPythonFileAccess().getInstructionsPythonInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=rulePythonInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPythonFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.spf.launchfile.dsl.LaunchFile.PythonInstruction");
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
    // $ANTLR end "rulePythonFile"


    // $ANTLR start "entryRulePythonInstruction"
    // InternalLaunchFile.g:100:1: entryRulePythonInstruction returns [EObject current=null] : iv_rulePythonInstruction= rulePythonInstruction EOF ;
    public final EObject entryRulePythonInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePythonInstruction = null;


        try {
            // InternalLaunchFile.g:100:58: (iv_rulePythonInstruction= rulePythonInstruction EOF )
            // InternalLaunchFile.g:101:2: iv_rulePythonInstruction= rulePythonInstruction EOF
            {
             newCompositeNode(grammarAccess.getPythonInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePythonInstruction=rulePythonInstruction();

            state._fsp--;

             current =iv_rulePythonInstruction; 
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
    // $ANTLR end "entryRulePythonInstruction"


    // $ANTLR start "rulePythonInstruction"
    // InternalLaunchFile.g:107:1: rulePythonInstruction returns [EObject current=null] : (this_ImportStatement_0= ruleImportStatement | this_Function_1= ruleFunction ) ;
    public final EObject rulePythonInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_ImportStatement_0 = null;

        EObject this_Function_1 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:113:2: ( (this_ImportStatement_0= ruleImportStatement | this_Function_1= ruleFunction ) )
            // InternalLaunchFile.g:114:2: (this_ImportStatement_0= ruleImportStatement | this_Function_1= ruleFunction )
            {
            // InternalLaunchFile.g:114:2: (this_ImportStatement_0= ruleImportStatement | this_Function_1= ruleFunction )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLaunchFile.g:115:3: this_ImportStatement_0= ruleImportStatement
                    {

                    			newCompositeNode(grammarAccess.getPythonInstructionAccess().getImportStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImportStatement_0=ruleImportStatement();

                    state._fsp--;


                    			current = this_ImportStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLaunchFile.g:124:3: this_Function_1= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getPythonInstructionAccess().getFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_1=ruleFunction();

                    state._fsp--;


                    			current = this_Function_1;
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
    // $ANTLR end "rulePythonInstruction"


    // $ANTLR start "entryRuleImportStatement"
    // InternalLaunchFile.g:136:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // InternalLaunchFile.g:136:56: (iv_ruleImportStatement= ruleImportStatement EOF )
            // InternalLaunchFile.g:137:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
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
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // InternalLaunchFile.g:143:1: ruleImportStatement returns [EObject current=null] : ( (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )? otherlv_2= 'import' ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) ) (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )* ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_1=null;
        Token otherlv_2=null;
        Token lv_imports_3_2=null;
        Token lv_imports_3_3=null;
        Token otherlv_4=null;
        Token lv_imports_5_2=null;
        Token lv_imports_5_3=null;
        AntlrDatatypeRuleToken lv_from_1_2 = null;

        AntlrDatatypeRuleToken lv_imports_3_1 = null;

        AntlrDatatypeRuleToken lv_imports_5_1 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:149:2: ( ( (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )? otherlv_2= 'import' ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) ) (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )* ) )
            // InternalLaunchFile.g:150:2: ( (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )? otherlv_2= 'import' ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) ) (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )* )
            {
            // InternalLaunchFile.g:150:2: ( (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )? otherlv_2= 'import' ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) ) (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )* )
            // InternalLaunchFile.g:151:3: (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )? otherlv_2= 'import' ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) ) (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )*
            {
            // InternalLaunchFile.g:151:3: (otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLaunchFile.g:152:4: otherlv_0= 'from' ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) )
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getFromKeyword_0_0());
                    			
                    // InternalLaunchFile.g:156:4: ( ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) ) )
                    // InternalLaunchFile.g:157:5: ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) )
                    {
                    // InternalLaunchFile.g:157:5: ( (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString ) )
                    // InternalLaunchFile.g:158:6: (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString )
                    {
                    // InternalLaunchFile.g:158:6: (lv_from_1_1= RULE_ID | lv_from_1_2= ruleFromString )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_DOTTED_PARAM) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalLaunchFile.g:159:7: lv_from_1_1= RULE_ID
                            {
                            lv_from_1_1=(Token)match(input,RULE_ID,FOLLOW_5); 

                            							newLeafNode(lv_from_1_1, grammarAccess.getImportStatementAccess().getFromIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getImportStatementRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"from",
                            								lv_from_1_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalLaunchFile.g:174:7: lv_from_1_2= ruleFromString
                            {

                            							newCompositeNode(grammarAccess.getImportStatementAccess().getFromFromStringParserRuleCall_0_1_0_1());
                            						
                            pushFollow(FOLLOW_5);
                            lv_from_1_2=ruleFromString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImportStatementRule());
                            							}
                            							set(
                            								current,
                            								"from",
                            								lv_from_1_2,
                            								"org.spf.launchfile.dsl.LaunchFile.FromString");
                            							afterParserOrEnumRuleCall();
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getImportStatementAccess().getImportKeyword_1());
            		
            // InternalLaunchFile.g:197:3: ( ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) ) )
            // InternalLaunchFile.g:198:4: ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) )
            {
            // InternalLaunchFile.g:198:4: ( (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' ) )
            // InternalLaunchFile.g:199:5: (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' )
            {
            // InternalLaunchFile.g:199:5: (lv_imports_3_1= ruleFromString | lv_imports_3_2= 'LaunchDescription' | lv_imports_3_3= 'Node' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_DOTTED_PARAM:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLaunchFile.g:200:6: lv_imports_3_1= ruleFromString
                    {

                    						newCompositeNode(grammarAccess.getImportStatementAccess().getImportsFromStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_imports_3_1=ruleFromString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImportStatementRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_3_1,
                    							"org.spf.launchfile.dsl.LaunchFile.FromString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLaunchFile.g:216:6: lv_imports_3_2= 'LaunchDescription'
                    {
                    lv_imports_3_2=(Token)match(input,14,FOLLOW_7); 

                    						newLeafNode(lv_imports_3_2, grammarAccess.getImportStatementAccess().getImportsLaunchDescriptionKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportStatementRule());
                    						}
                    						addWithLastConsumed(current, "imports", lv_imports_3_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalLaunchFile.g:227:6: lv_imports_3_3= 'Node'
                    {
                    lv_imports_3_3=(Token)match(input,15,FOLLOW_7); 

                    						newLeafNode(lv_imports_3_3, grammarAccess.getImportStatementAccess().getImportsNodeKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImportStatementRule());
                    						}
                    						addWithLastConsumed(current, "imports", lv_imports_3_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalLaunchFile.g:240:3: (otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLaunchFile.g:241:4: otherlv_4= ',' ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImportStatementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLaunchFile.g:245:4: ( ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) ) )
            	    // InternalLaunchFile.g:246:5: ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) )
            	    {
            	    // InternalLaunchFile.g:246:5: ( (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' ) )
            	    // InternalLaunchFile.g:247:6: (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' )
            	    {
            	    // InternalLaunchFile.g:247:6: (lv_imports_5_1= ruleFromString | lv_imports_5_2= 'LaunchDescription' | lv_imports_5_3= 'Node' )
            	    int alt6=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_DOTTED_PARAM:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // InternalLaunchFile.g:248:7: lv_imports_5_1= ruleFromString
            	            {

            	            							newCompositeNode(grammarAccess.getImportStatementAccess().getImportsFromStringParserRuleCall_3_1_0_0());
            	            						
            	            pushFollow(FOLLOW_7);
            	            lv_imports_5_1=ruleFromString();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getImportStatementRule());
            	            							}
            	            							add(
            	            								current,
            	            								"imports",
            	            								lv_imports_5_1,
            	            								"org.spf.launchfile.dsl.LaunchFile.FromString");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalLaunchFile.g:264:7: lv_imports_5_2= 'LaunchDescription'
            	            {
            	            lv_imports_5_2=(Token)match(input,14,FOLLOW_7); 

            	            							newLeafNode(lv_imports_5_2, grammarAccess.getImportStatementAccess().getImportsLaunchDescriptionKeyword_3_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getImportStatementRule());
            	            							}
            	            							addWithLastConsumed(current, "imports", lv_imports_5_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalLaunchFile.g:275:7: lv_imports_5_3= 'Node'
            	            {
            	            lv_imports_5_3=(Token)match(input,15,FOLLOW_7); 

            	            							newLeafNode(lv_imports_5_3, grammarAccess.getImportStatementAccess().getImportsNodeKeyword_3_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getImportStatementRule());
            	            							}
            	            							addWithLastConsumed(current, "imports", lv_imports_5_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleFromString"
    // InternalLaunchFile.g:293:1: entryRuleFromString returns [String current=null] : iv_ruleFromString= ruleFromString EOF ;
    public final String entryRuleFromString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFromString = null;


        try {
            // InternalLaunchFile.g:293:50: (iv_ruleFromString= ruleFromString EOF )
            // InternalLaunchFile.g:294:2: iv_ruleFromString= ruleFromString EOF
            {
             newCompositeNode(grammarAccess.getFromStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromString=ruleFromString();

            state._fsp--;

             current =iv_ruleFromString.getText(); 
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
    // $ANTLR end "entryRuleFromString"


    // $ANTLR start "ruleFromString"
    // InternalLaunchFile.g:300:1: ruleFromString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOTTED_PARAM_0= RULE_DOTTED_PARAM ;
    public final AntlrDatatypeRuleToken ruleFromString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOTTED_PARAM_0=null;


        	enterRule();

        try {
            // InternalLaunchFile.g:306:2: (this_DOTTED_PARAM_0= RULE_DOTTED_PARAM )
            // InternalLaunchFile.g:307:2: this_DOTTED_PARAM_0= RULE_DOTTED_PARAM
            {
            this_DOTTED_PARAM_0=(Token)match(input,RULE_DOTTED_PARAM,FOLLOW_2); 

            		current.merge(this_DOTTED_PARAM_0);
            	

            		newLeafNode(this_DOTTED_PARAM_0, grammarAccess.getFromStringAccess().getDOTTED_PARAMTerminalRuleCall());
            	

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
    // $ANTLR end "ruleFromString"


    // $ANTLR start "entryRuleFunction"
    // InternalLaunchFile.g:317:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalLaunchFile.g:317:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalLaunchFile.g:318:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalLaunchFile.g:324:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (lv_body_5_0= rulePythonInstruction ) )* ( (lv_body_6_0= ruleReturnStatement ) )? ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_body_5_0 = null;

        EObject lv_body_6_0 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:330:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (lv_body_5_0= rulePythonInstruction ) )* ( (lv_body_6_0= ruleReturnStatement ) )? ) )
            // InternalLaunchFile.g:331:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (lv_body_5_0= rulePythonInstruction ) )* ( (lv_body_6_0= ruleReturnStatement ) )? )
            {
            // InternalLaunchFile.g:331:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (lv_body_5_0= rulePythonInstruction ) )* ( (lv_body_6_0= ruleReturnStatement ) )? )
            // InternalLaunchFile.g:332:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' otherlv_4= ':' ( (lv_body_5_0= rulePythonInstruction ) )* ( (lv_body_6_0= ruleReturnStatement ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getDefKeyword_0());
            		
            // InternalLaunchFile.g:336:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLaunchFile.g:337:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLaunchFile.g:337:4: (lv_name_1_0= RULE_ID )
            // InternalLaunchFile.g:338:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getColonKeyword_4());
            		
            // InternalLaunchFile.g:366:3: ( (lv_body_5_0= rulePythonInstruction ) )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt8=1;
                    }
                    break;
                case 13:
                    {
                    alt8=1;
                    }
                    break;
                case 17:
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalLaunchFile.g:367:4: (lv_body_5_0= rulePythonInstruction )
            	    {
            	    // InternalLaunchFile.g:367:4: (lv_body_5_0= rulePythonInstruction )
            	    // InternalLaunchFile.g:368:5: lv_body_5_0= rulePythonInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getBodyPythonInstructionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_body_5_0=rulePythonInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"body",
            	    						lv_body_5_0,
            	    						"org.spf.launchfile.dsl.LaunchFile.PythonInstruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalLaunchFile.g:385:3: ( (lv_body_6_0= ruleReturnStatement ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalLaunchFile.g:386:4: (lv_body_6_0= ruleReturnStatement )
                    {
                    // InternalLaunchFile.g:386:4: (lv_body_6_0= ruleReturnStatement )
                    // InternalLaunchFile.g:387:5: lv_body_6_0= ruleReturnStatement
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getBodyReturnStatementParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_body_6_0=ruleReturnStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					add(
                    						current,
                    						"body",
                    						lv_body_6_0,
                    						"org.spf.launchfile.dsl.LaunchFile.ReturnStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalLaunchFile.g:408:1: entryRuleReturnStatement returns [EObject current=null] : iv_ruleReturnStatement= ruleReturnStatement EOF ;
    public final EObject entryRuleReturnStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatement = null;


        try {
            // InternalLaunchFile.g:408:56: (iv_ruleReturnStatement= ruleReturnStatement EOF )
            // InternalLaunchFile.g:409:2: iv_ruleReturnStatement= ruleReturnStatement EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatement=ruleReturnStatement();

            state._fsp--;

             current =iv_ruleReturnStatement; 
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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalLaunchFile.g:415:1: ruleReturnStatement returns [EObject current=null] : (otherlv_0= 'return' ( (lv_launchDescription_1_0= ruleLaunchDescription ) ) ) ;
    public final EObject ruleReturnStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_launchDescription_1_0 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:421:2: ( (otherlv_0= 'return' ( (lv_launchDescription_1_0= ruleLaunchDescription ) ) ) )
            // InternalLaunchFile.g:422:2: (otherlv_0= 'return' ( (lv_launchDescription_1_0= ruleLaunchDescription ) ) )
            {
            // InternalLaunchFile.g:422:2: (otherlv_0= 'return' ( (lv_launchDescription_1_0= ruleLaunchDescription ) ) )
            // InternalLaunchFile.g:423:3: otherlv_0= 'return' ( (lv_launchDescription_1_0= ruleLaunchDescription ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
            		
            // InternalLaunchFile.g:427:3: ( (lv_launchDescription_1_0= ruleLaunchDescription ) )
            // InternalLaunchFile.g:428:4: (lv_launchDescription_1_0= ruleLaunchDescription )
            {
            // InternalLaunchFile.g:428:4: (lv_launchDescription_1_0= ruleLaunchDescription )
            // InternalLaunchFile.g:429:5: lv_launchDescription_1_0= ruleLaunchDescription
            {

            					newCompositeNode(grammarAccess.getReturnStatementAccess().getLaunchDescriptionLaunchDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_launchDescription_1_0=ruleLaunchDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnStatementRule());
            					}
            					set(
            						current,
            						"launchDescription",
            						lv_launchDescription_1_0,
            						"org.spf.launchfile.dsl.LaunchFile.LaunchDescription");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleLaunchDescription"
    // InternalLaunchFile.g:450:1: entryRuleLaunchDescription returns [EObject current=null] : iv_ruleLaunchDescription= ruleLaunchDescription EOF ;
    public final EObject entryRuleLaunchDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunchDescription = null;


        try {
            // InternalLaunchFile.g:450:58: (iv_ruleLaunchDescription= ruleLaunchDescription EOF )
            // InternalLaunchFile.g:451:2: iv_ruleLaunchDescription= ruleLaunchDescription EOF
            {
             newCompositeNode(grammarAccess.getLaunchDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLaunchDescription=ruleLaunchDescription();

            state._fsp--;

             current =iv_ruleLaunchDescription; 
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
    // $ANTLR end "entryRuleLaunchDescription"


    // $ANTLR start "ruleLaunchDescription"
    // InternalLaunchFile.g:457:1: ruleLaunchDescription returns [EObject current=null] : ( () otherlv_1= 'LaunchDescription' otherlv_2= '(' otherlv_3= '[' ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* (otherlv_7= ',' )? otherlv_8= ']' otherlv_9= ')' ) ;
    public final EObject ruleLaunchDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_nodes_4_0 = null;

        EObject lv_nodes_6_0 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:463:2: ( ( () otherlv_1= 'LaunchDescription' otherlv_2= '(' otherlv_3= '[' ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* (otherlv_7= ',' )? otherlv_8= ']' otherlv_9= ')' ) )
            // InternalLaunchFile.g:464:2: ( () otherlv_1= 'LaunchDescription' otherlv_2= '(' otherlv_3= '[' ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* (otherlv_7= ',' )? otherlv_8= ']' otherlv_9= ')' )
            {
            // InternalLaunchFile.g:464:2: ( () otherlv_1= 'LaunchDescription' otherlv_2= '(' otherlv_3= '[' ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* (otherlv_7= ',' )? otherlv_8= ']' otherlv_9= ')' )
            // InternalLaunchFile.g:465:3: () otherlv_1= 'LaunchDescription' otherlv_2= '(' otherlv_3= '[' ( (lv_nodes_4_0= ruleNode ) ) (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )* (otherlv_7= ',' )? otherlv_8= ']' otherlv_9= ')'
            {
            // InternalLaunchFile.g:465:3: ()
            // InternalLaunchFile.g:466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLaunchDescriptionAccess().getLaunchDescriptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getLaunchDescriptionAccess().getLaunchDescriptionKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getLaunchDescriptionAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getLaunchDescriptionAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalLaunchFile.g:484:3: ( (lv_nodes_4_0= ruleNode ) )
            // InternalLaunchFile.g:485:4: (lv_nodes_4_0= ruleNode )
            {
            // InternalLaunchFile.g:485:4: (lv_nodes_4_0= ruleNode )
            // InternalLaunchFile.g:486:5: lv_nodes_4_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getLaunchDescriptionAccess().getNodesNodeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_nodes_4_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchDescriptionRule());
            					}
            					add(
            						current,
            						"nodes",
            						lv_nodes_4_0,
            						"org.spf.launchfile.dsl.LaunchFile.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLaunchFile.g:503:3: (otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==15||LA10_1==24) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalLaunchFile.g:504:4: otherlv_5= ',' ( (lv_nodes_6_0= ruleNode ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLaunchDescriptionAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalLaunchFile.g:508:4: ( (lv_nodes_6_0= ruleNode ) )
            	    // InternalLaunchFile.g:509:5: (lv_nodes_6_0= ruleNode )
            	    {
            	    // InternalLaunchFile.g:509:5: (lv_nodes_6_0= ruleNode )
            	    // InternalLaunchFile.g:510:6: lv_nodes_6_0= ruleNode
            	    {

            	    						newCompositeNode(grammarAccess.getLaunchDescriptionAccess().getNodesNodeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_nodes_6_0=ruleNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLaunchDescriptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_6_0,
            	    							"org.spf.launchfile.dsl.LaunchFile.Node");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalLaunchFile.g:528:3: (otherlv_7= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLaunchFile.g:529:4: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getLaunchDescriptionAccess().getCommaKeyword_6());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getLaunchDescriptionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLaunchDescriptionAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLaunchDescription"


    // $ANTLR start "entryRuleNode"
    // InternalLaunchFile.g:546:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalLaunchFile.g:546:45: (iv_ruleNode= ruleNode EOF )
            // InternalLaunchFile.g:547:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalLaunchFile.g:553:1: ruleNode returns [EObject current=null] : ( () (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' ) otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )? otherlv_27= ')' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_node_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_package_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_namespace_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_node_executable_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_output_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_parameters_23_0 = null;

        EObject lv_parameters_25_0 = null;



        	enterRule();

        try {
            // InternalLaunchFile.g:559:2: ( ( () (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' ) otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )? otherlv_27= ')' ) )
            // InternalLaunchFile.g:560:2: ( () (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' ) otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )? otherlv_27= ')' )
            {
            // InternalLaunchFile.g:560:2: ( () (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' ) otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )? otherlv_27= ')' )
            // InternalLaunchFile.g:561:3: () (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' ) otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )? otherlv_27= ')'
            {
            // InternalLaunchFile.g:561:3: ()
            // InternalLaunchFile.g:562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNodeAccess().getNodeAction_0(),
            					current);
            			

            }

            // InternalLaunchFile.g:568:3: (otherlv_1= 'Node' | otherlv_2= 'launch_ros.actions.Node' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLaunchFile.g:569:4: otherlv_1= 'Node'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLaunchFile.g:574:4: otherlv_2= 'launch_ros.actions.Node'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLaunch_rosActionsNodeKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLaunchFile.g:583:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25||(LA15_0>=27 && LA15_0<=31)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLaunchFile.g:584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) )
                    {
                    // InternalLaunchFile.g:584:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?) )
                    // InternalLaunchFile.g:585:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?)
                    {
                     
                    				  getUnorderedGroupHelper().enter(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    				
                    // InternalLaunchFile.g:588:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?)
                    // InternalLaunchFile.g:589:6: ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+ {...}?
                    {
                    // InternalLaunchFile.g:589:6: ( ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=7;
                        int LA14_0 = input.LA(1);

                        if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 0) ) {
                            alt14=1;
                        }
                        else if ( LA14_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 1) ) {
                            alt14=2;
                        }
                        else if ( LA14_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 2) ) {
                            alt14=3;
                        }
                        else if ( LA14_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 3) ) {
                            alt14=4;
                        }
                        else if ( LA14_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 4) ) {
                            alt14=5;
                        }
                        else if ( LA14_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 5) ) {
                            alt14=6;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLaunchFile.g:590:4: ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:590:4: ({...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalLaunchFile.g:591:5: {...}? => ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 0)");
                    	    }
                    	    // InternalLaunchFile.g:591:101: ( ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) ) )
                    	    // InternalLaunchFile.g:592:6: ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 0);
                    	    					
                    	    // InternalLaunchFile.g:595:9: ({...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) ) )
                    	    // InternalLaunchFile.g:595:10: {...}? => (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:595:19: (otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) ) )
                    	    // InternalLaunchFile.g:595:20: otherlv_5= 'node_name' otherlv_6= '=' ( (lv_node_name_7_0= RULE_STRING ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_20); 

                    	    									newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getNode_nameKeyword_3_0_0());
                    	    								
                    	    otherlv_6=(Token)match(input,26,FOLLOW_21); 

                    	    									newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_0_1());
                    	    								
                    	    // InternalLaunchFile.g:603:9: ( (lv_node_name_7_0= RULE_STRING ) )
                    	    // InternalLaunchFile.g:604:10: (lv_node_name_7_0= RULE_STRING )
                    	    {
                    	    // InternalLaunchFile.g:604:10: (lv_node_name_7_0= RULE_STRING )
                    	    // InternalLaunchFile.g:605:11: lv_node_name_7_0= RULE_STRING
                    	    {
                    	    lv_node_name_7_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    											newLeafNode(lv_node_name_7_0, grammarAccess.getNodeAccess().getNode_nameSTRINGTerminalRuleCall_3_0_2_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getNodeRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"node_name",
                    	    												lv_node_name_7_0,
                    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLaunchFile.g:627:4: ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:627:4: ({...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalLaunchFile.g:628:5: {...}? => ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 1)");
                    	    }
                    	    // InternalLaunchFile.g:628:101: ( ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) ) )
                    	    // InternalLaunchFile.g:629:6: ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 1);
                    	    					
                    	    // InternalLaunchFile.g:632:9: ({...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) ) )
                    	    // InternalLaunchFile.g:632:10: {...}? => (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:632:19: (otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) ) )
                    	    // InternalLaunchFile.g:632:20: otherlv_8= 'package' otherlv_9= '=' ( (lv_package_name_10_0= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,27,FOLLOW_20); 

                    	    									newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getPackageKeyword_3_1_0());
                    	    								
                    	    otherlv_9=(Token)match(input,26,FOLLOW_21); 

                    	    									newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_1_1());
                    	    								
                    	    // InternalLaunchFile.g:640:9: ( (lv_package_name_10_0= RULE_STRING ) )
                    	    // InternalLaunchFile.g:641:10: (lv_package_name_10_0= RULE_STRING )
                    	    {
                    	    // InternalLaunchFile.g:641:10: (lv_package_name_10_0= RULE_STRING )
                    	    // InternalLaunchFile.g:642:11: lv_package_name_10_0= RULE_STRING
                    	    {
                    	    lv_package_name_10_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    											newLeafNode(lv_package_name_10_0, grammarAccess.getNodeAccess().getPackage_nameSTRINGTerminalRuleCall_3_1_2_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getNodeRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"package_name",
                    	    												lv_package_name_10_0,
                    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalLaunchFile.g:664:4: ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:664:4: ({...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalLaunchFile.g:665:5: {...}? => ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 2)");
                    	    }
                    	    // InternalLaunchFile.g:665:101: ( ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) ) )
                    	    // InternalLaunchFile.g:666:6: ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 2);
                    	    					
                    	    // InternalLaunchFile.g:669:9: ({...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) ) )
                    	    // InternalLaunchFile.g:669:10: {...}? => (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:669:19: (otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) ) )
                    	    // InternalLaunchFile.g:669:20: otherlv_11= 'namespace' otherlv_12= '=' ( (lv_namespace_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_11=(Token)match(input,28,FOLLOW_20); 

                    	    									newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getNamespaceKeyword_3_2_0());
                    	    								
                    	    otherlv_12=(Token)match(input,26,FOLLOW_21); 

                    	    									newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_2_1());
                    	    								
                    	    // InternalLaunchFile.g:677:9: ( (lv_namespace_13_0= RULE_STRING ) )
                    	    // InternalLaunchFile.g:678:10: (lv_namespace_13_0= RULE_STRING )
                    	    {
                    	    // InternalLaunchFile.g:678:10: (lv_namespace_13_0= RULE_STRING )
                    	    // InternalLaunchFile.g:679:11: lv_namespace_13_0= RULE_STRING
                    	    {
                    	    lv_namespace_13_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    											newLeafNode(lv_namespace_13_0, grammarAccess.getNodeAccess().getNamespaceSTRINGTerminalRuleCall_3_2_2_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getNodeRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"namespace",
                    	    												lv_namespace_13_0,
                    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalLaunchFile.g:701:4: ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:701:4: ({...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalLaunchFile.g:702:5: {...}? => ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 3)");
                    	    }
                    	    // InternalLaunchFile.g:702:101: ( ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) ) )
                    	    // InternalLaunchFile.g:703:6: ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 3);
                    	    					
                    	    // InternalLaunchFile.g:706:9: ({...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) ) )
                    	    // InternalLaunchFile.g:706:10: {...}? => (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:706:19: (otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) ) )
                    	    // InternalLaunchFile.g:706:20: otherlv_14= 'node_executable' otherlv_15= '=' ( (lv_node_executable_16_0= RULE_STRING ) )
                    	    {
                    	    otherlv_14=(Token)match(input,29,FOLLOW_20); 

                    	    									newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getNode_executableKeyword_3_3_0());
                    	    								
                    	    otherlv_15=(Token)match(input,26,FOLLOW_21); 

                    	    									newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_3_1());
                    	    								
                    	    // InternalLaunchFile.g:714:9: ( (lv_node_executable_16_0= RULE_STRING ) )
                    	    // InternalLaunchFile.g:715:10: (lv_node_executable_16_0= RULE_STRING )
                    	    {
                    	    // InternalLaunchFile.g:715:10: (lv_node_executable_16_0= RULE_STRING )
                    	    // InternalLaunchFile.g:716:11: lv_node_executable_16_0= RULE_STRING
                    	    {
                    	    lv_node_executable_16_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    											newLeafNode(lv_node_executable_16_0, grammarAccess.getNodeAccess().getNode_executableSTRINGTerminalRuleCall_3_3_2_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getNodeRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"node_executable",
                    	    												lv_node_executable_16_0,
                    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalLaunchFile.g:738:4: ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:738:4: ({...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) ) )
                    	    // InternalLaunchFile.g:739:5: {...}? => ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 4)");
                    	    }
                    	    // InternalLaunchFile.g:739:101: ( ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) ) )
                    	    // InternalLaunchFile.g:740:6: ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 4);
                    	    					
                    	    // InternalLaunchFile.g:743:9: ({...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) ) )
                    	    // InternalLaunchFile.g:743:10: {...}? => (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:743:19: (otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) ) )
                    	    // InternalLaunchFile.g:743:20: otherlv_17= 'output' otherlv_18= '=' ( (lv_output_19_0= RULE_STRING ) )
                    	    {
                    	    otherlv_17=(Token)match(input,30,FOLLOW_20); 

                    	    									newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getOutputKeyword_3_4_0());
                    	    								
                    	    otherlv_18=(Token)match(input,26,FOLLOW_21); 

                    	    									newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_4_1());
                    	    								
                    	    // InternalLaunchFile.g:751:9: ( (lv_output_19_0= RULE_STRING ) )
                    	    // InternalLaunchFile.g:752:10: (lv_output_19_0= RULE_STRING )
                    	    {
                    	    // InternalLaunchFile.g:752:10: (lv_output_19_0= RULE_STRING )
                    	    // InternalLaunchFile.g:753:11: lv_output_19_0= RULE_STRING
                    	    {
                    	    lv_output_19_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    	    											newLeafNode(lv_output_19_0, grammarAccess.getNodeAccess().getOutputSTRINGTerminalRuleCall_3_4_2_0());
                    	    										

                    	    											if (current==null) {
                    	    												current = createModelElement(grammarAccess.getNodeRule());
                    	    											}
                    	    											setWithLastConsumed(
                    	    												current,
                    	    												"output",
                    	    												lv_output_19_0,
                    	    												"org.eclipse.xtext.common.Terminals.STRING");
                    	    										

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalLaunchFile.g:775:4: ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) )
                    	    {
                    	    // InternalLaunchFile.g:775:4: ({...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) ) )
                    	    // InternalLaunchFile.g:776:5: {...}? => ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 5)");
                    	    }
                    	    // InternalLaunchFile.g:776:101: ( ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) ) )
                    	    // InternalLaunchFile.g:777:6: ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) )
                    	    {

                    	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_3(), 5);
                    	    					
                    	    // InternalLaunchFile.g:780:9: ({...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' ) )
                    	    // InternalLaunchFile.g:780:10: {...}? => (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleNode", "true");
                    	    }
                    	    // InternalLaunchFile.g:780:19: (otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]' )
                    	    // InternalLaunchFile.g:780:20: otherlv_20= 'parameters' otherlv_21= '=' otherlv_22= '[{' ( (lv_parameters_23_0= ruleParameter ) ) (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )* otherlv_26= '}]'
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_20); 

                    	    									newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getParametersKeyword_3_5_0());
                    	    								
                    	    otherlv_21=(Token)match(input,26,FOLLOW_22); 

                    	    									newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getEqualsSignKeyword_3_5_1());
                    	    								
                    	    otherlv_22=(Token)match(input,32,FOLLOW_21); 

                    	    									newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getLeftSquareBracketLeftCurlyBracketKeyword_3_5_2());
                    	    								
                    	    // InternalLaunchFile.g:792:9: ( (lv_parameters_23_0= ruleParameter ) )
                    	    // InternalLaunchFile.g:793:10: (lv_parameters_23_0= ruleParameter )
                    	    {
                    	    // InternalLaunchFile.g:793:10: (lv_parameters_23_0= ruleParameter )
                    	    // InternalLaunchFile.g:794:11: lv_parameters_23_0= ruleParameter
                    	    {

                    	    											newCompositeNode(grammarAccess.getNodeAccess().getParametersParameterParserRuleCall_3_5_3_0());
                    	    										
                    	    pushFollow(FOLLOW_23);
                    	    lv_parameters_23_0=ruleParameter();

                    	    state._fsp--;


                    	    											if (current==null) {
                    	    												current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    											}
                    	    											add(
                    	    												current,
                    	    												"parameters",
                    	    												lv_parameters_23_0,
                    	    												"org.spf.launchfile.dsl.LaunchFile.Parameter");
                    	    											afterParserOrEnumRuleCall();
                    	    										

                    	    }


                    	    }

                    	    // InternalLaunchFile.g:811:9: (otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) ) )*
                    	    loop13:
                    	    do {
                    	        int alt13=2;
                    	        int LA13_0 = input.LA(1);

                    	        if ( (LA13_0==16) ) {
                    	            alt13=1;
                    	        }


                    	        switch (alt13) {
                    	    	case 1 :
                    	    	    // InternalLaunchFile.g:812:10: otherlv_24= ',' ( (lv_parameters_25_0= ruleParameter ) )
                    	    	    {
                    	    	    otherlv_24=(Token)match(input,16,FOLLOW_21); 

                    	    	    										newLeafNode(otherlv_24, grammarAccess.getNodeAccess().getCommaKeyword_3_5_4_0());
                    	    	    									
                    	    	    // InternalLaunchFile.g:816:10: ( (lv_parameters_25_0= ruleParameter ) )
                    	    	    // InternalLaunchFile.g:817:11: (lv_parameters_25_0= ruleParameter )
                    	    	    {
                    	    	    // InternalLaunchFile.g:817:11: (lv_parameters_25_0= ruleParameter )
                    	    	    // InternalLaunchFile.g:818:12: lv_parameters_25_0= ruleParameter
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getNodeAccess().getParametersParameterParserRuleCall_3_5_4_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_23);
                    	    	    lv_parameters_25_0=ruleParameter();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"parameters",
                    	    	    													lv_parameters_25_0,
                    	    	    													"org.spf.launchfile.dsl.LaunchFile.Parameter");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop13;
                    	        }
                    	    } while (true);

                    	    otherlv_26=(Token)match(input,33,FOLLOW_19); 

                    	    									newLeafNode(otherlv_26, grammarAccess.getNodeAccess().getRightCurlyBracketRightSquareBracketKeyword_3_5_5());
                    	    								

                    	    }


                    	    }

                    	     
                    	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    	    					

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNodeAccess().getUnorderedGroup_3()) ) {
                        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canLeave(grammarAccess.getNodeAccess().getUnorderedGroup_3())");
                    }

                    }


                    }

                     
                    				  getUnorderedGroupHelper().leave(grammarAccess.getNodeAccess().getUnorderedGroup_3());
                    				

                    }
                    break;

            }

            otherlv_27=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleParameter"
    // InternalLaunchFile.g:862:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalLaunchFile.g:862:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalLaunchFile.g:863:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalLaunchFile.g:869:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalLaunchFile.g:875:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalLaunchFile.g:876:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalLaunchFile.g:876:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalLaunchFile.g:877:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalLaunchFile.g:877:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalLaunchFile.g:878:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalLaunchFile.g:878:4: (lv_name_0_0= RULE_STRING )
            // InternalLaunchFile.g:879:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalLaunchFile.g:899:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalLaunchFile.g:900:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalLaunchFile.g:900:4: (lv_value_2_0= RULE_STRING )
            // InternalLaunchFile.g:901:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getParameterAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleParameter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000023002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000223000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000223002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000FA080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200010000L});

}
