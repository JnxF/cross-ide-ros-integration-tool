package org.spf.packagexml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.spf.packagexml.services.PackageXMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPackageXMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_VERSION_TERMINAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<?'", "'xml'", "'version'", "'='", "'?>'", "'<'", "'package'", "'format'", "'>'", "'/'", "'name'", "'description'", "'maintainer'", "'email'", "'license'", "'run_depend'", "'build_depend'", "'exec_depend'", "'buildtool_depend'", "'export'", "'author'", "'url'", "'type'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

        public InternalPackageXMLParser(TokenStream input, PackageXMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected PackageXMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalPackageXML.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalPackageXML.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalPackageXML.g:65:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalPackageXML.g:71:1: rulePackage returns [EObject current=null] : (otherlv_0= '<?' otherlv_1= 'xml' otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_STRING ) ) otherlv_5= '?>' otherlv_6= '<' otherlv_7= 'package' otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_tags_12_0= ruleTag ) )* otherlv_13= '<' otherlv_14= '/' otherlv_15= 'package' otherlv_16= '>' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_format_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_tags_12_0 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:77:2: ( (otherlv_0= '<?' otherlv_1= 'xml' otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_STRING ) ) otherlv_5= '?>' otherlv_6= '<' otherlv_7= 'package' otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_tags_12_0= ruleTag ) )* otherlv_13= '<' otherlv_14= '/' otherlv_15= 'package' otherlv_16= '>' ) )
            // InternalPackageXML.g:78:2: (otherlv_0= '<?' otherlv_1= 'xml' otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_STRING ) ) otherlv_5= '?>' otherlv_6= '<' otherlv_7= 'package' otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_tags_12_0= ruleTag ) )* otherlv_13= '<' otherlv_14= '/' otherlv_15= 'package' otherlv_16= '>' )
            {
            // InternalPackageXML.g:78:2: (otherlv_0= '<?' otherlv_1= 'xml' otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_STRING ) ) otherlv_5= '?>' otherlv_6= '<' otherlv_7= 'package' otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_tags_12_0= ruleTag ) )* otherlv_13= '<' otherlv_14= '/' otherlv_15= 'package' otherlv_16= '>' )
            // InternalPackageXML.g:79:3: otherlv_0= '<?' otherlv_1= 'xml' otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_STRING ) ) otherlv_5= '?>' otherlv_6= '<' otherlv_7= 'package' otherlv_8= 'format' otherlv_9= '=' ( (lv_format_10_0= RULE_STRING ) ) otherlv_11= '>' ( (lv_tags_12_0= ruleTag ) )* otherlv_13= '<' otherlv_14= '/' otherlv_15= 'package' otherlv_16= '>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getLessThanSignQuestionMarkKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getXmlKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getEqualsSignKeyword_3());
            		
            // InternalPackageXML.g:95:3: ( (lv_version_4_0= RULE_STRING ) )
            // InternalPackageXML.g:96:4: (lv_version_4_0= RULE_STRING )
            {
            // InternalPackageXML.g:96:4: (lv_version_4_0= RULE_STRING )
            // InternalPackageXML.g:97:5: lv_version_4_0= RULE_STRING
            {
            lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_version_4_0, grammarAccess.getPackageAccess().getVersionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_4_0,
            						"org.spf.packagexml.PackageXML.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getQuestionMarkGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getLessThanSignKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getPackageKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getFormatKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getEqualsSignKeyword_9());
            		
            // InternalPackageXML.g:133:3: ( (lv_format_10_0= RULE_STRING ) )
            // InternalPackageXML.g:134:4: (lv_format_10_0= RULE_STRING )
            {
            // InternalPackageXML.g:134:4: (lv_format_10_0= RULE_STRING )
            // InternalPackageXML.g:135:5: lv_format_10_0= RULE_STRING
            {
            lv_format_10_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_format_10_0, grammarAccess.getPackageAccess().getFormatSTRINGTerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_10_0,
            						"org.spf.packagexml.PackageXML.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getGreaterThanSignKeyword_11());
            		
            // InternalPackageXML.g:155:3: ( (lv_tags_12_0= ruleTag ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1==RULE_ID||LA1_1==14||(LA1_1>=22 && LA1_1<=24)||(LA1_1>=26 && LA1_1<=33)) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalPackageXML.g:156:4: (lv_tags_12_0= ruleTag )
            	    {
            	    // InternalPackageXML.g:156:4: (lv_tags_12_0= ruleTag )
            	    // InternalPackageXML.g:157:5: lv_tags_12_0= ruleTag
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_tags_12_0=ruleTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tags",
            	    						lv_tags_12_0,
            	    						"org.spf.packagexml.PackageXML.Tag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getLessThanSignKeyword_13());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getPackageAccess().getSolidusKeyword_14());
            		
            otherlv_15=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getPackageAccess().getPackageKeyword_15());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPackageAccess().getGreaterThanSignKeyword_16());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTag"
    // InternalPackageXML.g:194:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalPackageXML.g:194:44: (iv_ruleTag= ruleTag EOF )
            // InternalPackageXML.g:195:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalPackageXML.g:201:1: ruleTag returns [EObject current=null] : (this_NameTag_0= ruleNameTag | this_VersionTag_1= ruleVersionTag | this_DescriptionTag_2= ruleDescriptionTag | this_MaintainerTag_3= ruleMaintainerTag | this_LicenseTag_4= ruleLicenseTag | this_DependencyTag_5= ruleDependencyTag | this_ExportTag_6= ruleExportTag | this_AuthorTag_7= ruleAuthorTag | this_UrlTag_8= ruleUrlTag | this_ArbitraryTag_9= ruleArbitraryTag ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        EObject this_NameTag_0 = null;

        EObject this_VersionTag_1 = null;

        EObject this_DescriptionTag_2 = null;

        EObject this_MaintainerTag_3 = null;

        EObject this_LicenseTag_4 = null;

        EObject this_DependencyTag_5 = null;

        EObject this_ExportTag_6 = null;

        EObject this_AuthorTag_7 = null;

        EObject this_UrlTag_8 = null;

        EObject this_ArbitraryTag_9 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:207:2: ( (this_NameTag_0= ruleNameTag | this_VersionTag_1= ruleVersionTag | this_DescriptionTag_2= ruleDescriptionTag | this_MaintainerTag_3= ruleMaintainerTag | this_LicenseTag_4= ruleLicenseTag | this_DependencyTag_5= ruleDependencyTag | this_ExportTag_6= ruleExportTag | this_AuthorTag_7= ruleAuthorTag | this_UrlTag_8= ruleUrlTag | this_ArbitraryTag_9= ruleArbitraryTag ) )
            // InternalPackageXML.g:208:2: (this_NameTag_0= ruleNameTag | this_VersionTag_1= ruleVersionTag | this_DescriptionTag_2= ruleDescriptionTag | this_MaintainerTag_3= ruleMaintainerTag | this_LicenseTag_4= ruleLicenseTag | this_DependencyTag_5= ruleDependencyTag | this_ExportTag_6= ruleExportTag | this_AuthorTag_7= ruleAuthorTag | this_UrlTag_8= ruleUrlTag | this_ArbitraryTag_9= ruleArbitraryTag )
            {
            // InternalPackageXML.g:208:2: (this_NameTag_0= ruleNameTag | this_VersionTag_1= ruleVersionTag | this_DescriptionTag_2= ruleDescriptionTag | this_MaintainerTag_3= ruleMaintainerTag | this_LicenseTag_4= ruleLicenseTag | this_DependencyTag_5= ruleDependencyTag | this_ExportTag_6= ruleExportTag | this_AuthorTag_7= ruleAuthorTag | this_UrlTag_8= ruleUrlTag | this_ArbitraryTag_9= ruleArbitraryTag )
            int alt2=10;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalPackageXML.g:209:3: this_NameTag_0= ruleNameTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getNameTagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameTag_0=ruleNameTag();

                    state._fsp--;


                    			current = this_NameTag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:218:3: this_VersionTag_1= ruleVersionTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getVersionTagParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VersionTag_1=ruleVersionTag();

                    state._fsp--;


                    			current = this_VersionTag_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPackageXML.g:227:3: this_DescriptionTag_2= ruleDescriptionTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getDescriptionTagParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DescriptionTag_2=ruleDescriptionTag();

                    state._fsp--;


                    			current = this_DescriptionTag_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPackageXML.g:236:3: this_MaintainerTag_3= ruleMaintainerTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getMaintainerTagParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaintainerTag_3=ruleMaintainerTag();

                    state._fsp--;


                    			current = this_MaintainerTag_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalPackageXML.g:245:3: this_LicenseTag_4= ruleLicenseTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getLicenseTagParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_LicenseTag_4=ruleLicenseTag();

                    state._fsp--;


                    			current = this_LicenseTag_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalPackageXML.g:254:3: this_DependencyTag_5= ruleDependencyTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getDependencyTagParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_DependencyTag_5=ruleDependencyTag();

                    state._fsp--;


                    			current = this_DependencyTag_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalPackageXML.g:263:3: this_ExportTag_6= ruleExportTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getExportTagParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExportTag_6=ruleExportTag();

                    state._fsp--;


                    			current = this_ExportTag_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalPackageXML.g:272:3: this_AuthorTag_7= ruleAuthorTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getAuthorTagParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AuthorTag_7=ruleAuthorTag();

                    state._fsp--;


                    			current = this_AuthorTag_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalPackageXML.g:281:3: this_UrlTag_8= ruleUrlTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getUrlTagParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_UrlTag_8=ruleUrlTag();

                    state._fsp--;


                    			current = this_UrlTag_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalPackageXML.g:290:3: this_ArbitraryTag_9= ruleArbitraryTag
                    {

                    			newCompositeNode(grammarAccess.getTagAccess().getArbitraryTagParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArbitraryTag_9=ruleArbitraryTag();

                    state._fsp--;


                    			current = this_ArbitraryTag_9;
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleNameTag"
    // InternalPackageXML.g:302:1: entryRuleNameTag returns [EObject current=null] : iv_ruleNameTag= ruleNameTag EOF ;
    public final EObject entryRuleNameTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTag = null;


        try {
            // InternalPackageXML.g:302:48: (iv_ruleNameTag= ruleNameTag EOF )
            // InternalPackageXML.g:303:2: iv_ruleNameTag= ruleNameTag EOF
            {
             newCompositeNode(grammarAccess.getNameTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameTag=ruleNameTag();

            state._fsp--;

             current =iv_ruleNameTag; 
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
    // $ANTLR end "entryRuleNameTag"


    // $ANTLR start "ruleNameTag"
    // InternalPackageXML.g:309:1: ruleNameTag returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'name' otherlv_2= '>' ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'name' otherlv_7= '>' ) ;
    public final EObject ruleNameTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_declaredPackageName_3_0 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:315:2: ( (otherlv_0= '<' otherlv_1= 'name' otherlv_2= '>' ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'name' otherlv_7= '>' ) )
            // InternalPackageXML.g:316:2: (otherlv_0= '<' otherlv_1= 'name' otherlv_2= '>' ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'name' otherlv_7= '>' )
            {
            // InternalPackageXML.g:316:2: (otherlv_0= '<' otherlv_1= 'name' otherlv_2= '>' ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'name' otherlv_7= '>' )
            // InternalPackageXML.g:317:3: otherlv_0= '<' otherlv_1= 'name' otherlv_2= '>' ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'name' otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTagAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTagAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_2());
            		
            // InternalPackageXML.g:329:3: ( (lv_declaredPackageName_3_0= ruleDeclaredPackageName ) )
            // InternalPackageXML.g:330:4: (lv_declaredPackageName_3_0= ruleDeclaredPackageName )
            {
            // InternalPackageXML.g:330:4: (lv_declaredPackageName_3_0= ruleDeclaredPackageName )
            // InternalPackageXML.g:331:5: lv_declaredPackageName_3_0= ruleDeclaredPackageName
            {

            					newCompositeNode(grammarAccess.getNameTagAccess().getDeclaredPackageNameDeclaredPackageNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_declaredPackageName_3_0=ruleDeclaredPackageName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameTagRule());
            					}
            					set(
            						current,
            						"declaredPackageName",
            						lv_declaredPackageName_3_0,
            						"org.spf.packagexml.PackageXML.DeclaredPackageName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getNameTagAccess().getLessThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getNameTagAccess().getSolidusKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getNameTagAccess().getNameKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNameTagAccess().getGreaterThanSignKeyword_7());
            		

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
    // $ANTLR end "ruleNameTag"


    // $ANTLR start "entryRuleDeclaredPackageName"
    // InternalPackageXML.g:368:1: entryRuleDeclaredPackageName returns [EObject current=null] : iv_ruleDeclaredPackageName= ruleDeclaredPackageName EOF ;
    public final EObject entryRuleDeclaredPackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaredPackageName = null;


        try {
            // InternalPackageXML.g:368:60: (iv_ruleDeclaredPackageName= ruleDeclaredPackageName EOF )
            // InternalPackageXML.g:369:2: iv_ruleDeclaredPackageName= ruleDeclaredPackageName EOF
            {
             newCompositeNode(grammarAccess.getDeclaredPackageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaredPackageName=ruleDeclaredPackageName();

            state._fsp--;

             current =iv_ruleDeclaredPackageName; 
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
    // $ANTLR end "entryRuleDeclaredPackageName"


    // $ANTLR start "ruleDeclaredPackageName"
    // InternalPackageXML.g:375:1: ruleDeclaredPackageName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDeclaredPackageName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPackageXML.g:381:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPackageXML.g:382:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPackageXML.g:382:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPackageXML.g:383:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPackageXML.g:383:3: (lv_name_0_0= RULE_ID )
            // InternalPackageXML.g:384:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDeclaredPackageNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDeclaredPackageNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.spf.packagexml.PackageXML.ID");
            			

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
    // $ANTLR end "ruleDeclaredPackageName"


    // $ANTLR start "entryRuleVersionTag"
    // InternalPackageXML.g:403:1: entryRuleVersionTag returns [EObject current=null] : iv_ruleVersionTag= ruleVersionTag EOF ;
    public final EObject entryRuleVersionTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionTag = null;


        try {
            // InternalPackageXML.g:403:51: (iv_ruleVersionTag= ruleVersionTag EOF )
            // InternalPackageXML.g:404:2: iv_ruleVersionTag= ruleVersionTag EOF
            {
             newCompositeNode(grammarAccess.getVersionTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersionTag=ruleVersionTag();

            state._fsp--;

             current =iv_ruleVersionTag; 
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
    // $ANTLR end "entryRuleVersionTag"


    // $ANTLR start "ruleVersionTag"
    // InternalPackageXML.g:410:1: ruleVersionTag returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'version' otherlv_2= '>' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'version' otherlv_7= '>' ) ;
    public final EObject ruleVersionTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_version_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPackageXML.g:416:2: ( (otherlv_0= '<' otherlv_1= 'version' otherlv_2= '>' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'version' otherlv_7= '>' ) )
            // InternalPackageXML.g:417:2: (otherlv_0= '<' otherlv_1= 'version' otherlv_2= '>' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'version' otherlv_7= '>' )
            {
            // InternalPackageXML.g:417:2: (otherlv_0= '<' otherlv_1= 'version' otherlv_2= '>' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'version' otherlv_7= '>' )
            // InternalPackageXML.g:418:3: otherlv_0= '<' otherlv_1= 'version' otherlv_2= '>' ( (lv_version_3_0= RULE_VERSION_TERMINAL ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'version' otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionTagAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionTagAccess().getVersionKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_2());
            		
            // InternalPackageXML.g:430:3: ( (lv_version_3_0= RULE_VERSION_TERMINAL ) )
            // InternalPackageXML.g:431:4: (lv_version_3_0= RULE_VERSION_TERMINAL )
            {
            // InternalPackageXML.g:431:4: (lv_version_3_0= RULE_VERSION_TERMINAL )
            // InternalPackageXML.g:432:5: lv_version_3_0= RULE_VERSION_TERMINAL
            {
            lv_version_3_0=(Token)match(input,RULE_VERSION_TERMINAL,FOLLOW_8); 

            					newLeafNode(lv_version_3_0, grammarAccess.getVersionTagAccess().getVersionVERSION_TERMINALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVersionTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_3_0,
            						"org.spf.packagexml.PackageXML.VERSION_TERMINAL");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionTagAccess().getLessThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getVersionTagAccess().getSolidusKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionTagAccess().getVersionKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVersionTagAccess().getGreaterThanSignKeyword_7());
            		

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
    // $ANTLR end "ruleVersionTag"


    // $ANTLR start "entryRuleDescriptionTag"
    // InternalPackageXML.g:468:1: entryRuleDescriptionTag returns [EObject current=null] : iv_ruleDescriptionTag= ruleDescriptionTag EOF ;
    public final EObject entryRuleDescriptionTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionTag = null;


        try {
            // InternalPackageXML.g:468:55: (iv_ruleDescriptionTag= ruleDescriptionTag EOF )
            // InternalPackageXML.g:469:2: iv_ruleDescriptionTag= ruleDescriptionTag EOF
            {
             newCompositeNode(grammarAccess.getDescriptionTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionTag=ruleDescriptionTag();

            state._fsp--;

             current =iv_ruleDescriptionTag; 
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
    // $ANTLR end "entryRuleDescriptionTag"


    // $ANTLR start "ruleDescriptionTag"
    // InternalPackageXML.g:475:1: ruleDescriptionTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'description' otherlv_3= '>' ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'description' otherlv_8= '>' ) ;
    public final EObject ruleDescriptionTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_descriptionText_4_1=null;
        Token lv_descriptionText_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPackageXML.g:481:2: ( ( () otherlv_1= '<' otherlv_2= 'description' otherlv_3= '>' ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'description' otherlv_8= '>' ) )
            // InternalPackageXML.g:482:2: ( () otherlv_1= '<' otherlv_2= 'description' otherlv_3= '>' ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'description' otherlv_8= '>' )
            {
            // InternalPackageXML.g:482:2: ( () otherlv_1= '<' otherlv_2= 'description' otherlv_3= '>' ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'description' otherlv_8= '>' )
            // InternalPackageXML.g:483:3: () otherlv_1= '<' otherlv_2= 'description' otherlv_3= '>' ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'description' otherlv_8= '>'
            {
            // InternalPackageXML.g:483:3: ()
            // InternalPackageXML.g:484:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptionTagAccess().getDescriptionTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:502:3: ( ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPackageXML.g:503:4: ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) )
            	    {
            	    // InternalPackageXML.g:503:4: ( (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING ) )
            	    // InternalPackageXML.g:504:5: (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING )
            	    {
            	    // InternalPackageXML.g:504:5: (lv_descriptionText_4_1= RULE_ID | lv_descriptionText_4_2= RULE_STRING )
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
            	            // InternalPackageXML.g:505:6: lv_descriptionText_4_1= RULE_ID
            	            {
            	            lv_descriptionText_4_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	            						newLeafNode(lv_descriptionText_4_1, grammarAccess.getDescriptionTagAccess().getDescriptionTextIDTerminalRuleCall_4_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getDescriptionTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"descriptionText",
            	            							lv_descriptionText_4_1,
            	            							"org.spf.packagexml.PackageXML.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPackageXML.g:520:6: lv_descriptionText_4_2= RULE_STRING
            	            {
            	            lv_descriptionText_4_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	            						newLeafNode(lv_descriptionText_4_2, grammarAccess.getDescriptionTagAccess().getDescriptionTextSTRINGTerminalRuleCall_4_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getDescriptionTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"descriptionText",
            	            							lv_descriptionText_4_2,
            	            							"org.spf.packagexml.PackageXML.STRING");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getDescriptionTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getDescriptionTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getDescriptionTagAccess().getDescriptionKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDescriptionTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleDescriptionTag"


    // $ANTLR start "entryRuleMaintainerTag"
    // InternalPackageXML.g:557:1: entryRuleMaintainerTag returns [EObject current=null] : iv_ruleMaintainerTag= ruleMaintainerTag EOF ;
    public final EObject entryRuleMaintainerTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaintainerTag = null;


        try {
            // InternalPackageXML.g:557:54: (iv_ruleMaintainerTag= ruleMaintainerTag EOF )
            // InternalPackageXML.g:558:2: iv_ruleMaintainerTag= ruleMaintainerTag EOF
            {
             newCompositeNode(grammarAccess.getMaintainerTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaintainerTag=ruleMaintainerTag();

            state._fsp--;

             current =iv_ruleMaintainerTag; 
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
    // $ANTLR end "entryRuleMaintainerTag"


    // $ANTLR start "ruleMaintainerTag"
    // InternalPackageXML.g:564:1: ruleMaintainerTag returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'maintainer' otherlv_2= 'email' otherlv_3= '=' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= '>' ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' otherlv_9= 'maintainer' otherlv_10= '>' ) ;
    public final EObject ruleMaintainerTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_email_4_0=null;
        Token otherlv_5=null;
        Token lv_maintainerText_6_1=null;
        Token lv_maintainerText_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalPackageXML.g:570:2: ( (otherlv_0= '<' otherlv_1= 'maintainer' otherlv_2= 'email' otherlv_3= '=' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= '>' ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' otherlv_9= 'maintainer' otherlv_10= '>' ) )
            // InternalPackageXML.g:571:2: (otherlv_0= '<' otherlv_1= 'maintainer' otherlv_2= 'email' otherlv_3= '=' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= '>' ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' otherlv_9= 'maintainer' otherlv_10= '>' )
            {
            // InternalPackageXML.g:571:2: (otherlv_0= '<' otherlv_1= 'maintainer' otherlv_2= 'email' otherlv_3= '=' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= '>' ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' otherlv_9= 'maintainer' otherlv_10= '>' )
            // InternalPackageXML.g:572:3: otherlv_0= '<' otherlv_1= 'maintainer' otherlv_2= 'email' otherlv_3= '=' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= '>' ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' otherlv_9= 'maintainer' otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMaintainerTagAccess().getEmailKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMaintainerTagAccess().getEqualsSignKeyword_3());
            		
            // InternalPackageXML.g:588:3: ( (lv_email_4_0= RULE_STRING ) )
            // InternalPackageXML.g:589:4: (lv_email_4_0= RULE_STRING )
            {
            // InternalPackageXML.g:589:4: (lv_email_4_0= RULE_STRING )
            // InternalPackageXML.g:590:5: lv_email_4_0= RULE_STRING
            {
            lv_email_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_email_4_0, grammarAccess.getMaintainerTagAccess().getEmailSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaintainerTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_4_0,
            						"org.spf.packagexml.PackageXML.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_5());
            		
            // InternalPackageXML.g:610:3: ( ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPackageXML.g:611:4: ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) )
            	    {
            	    // InternalPackageXML.g:611:4: ( (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING ) )
            	    // InternalPackageXML.g:612:5: (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING )
            	    {
            	    // InternalPackageXML.g:612:5: (lv_maintainerText_6_1= RULE_ID | lv_maintainerText_6_2= RULE_STRING )
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
            	            // InternalPackageXML.g:613:6: lv_maintainerText_6_1= RULE_ID
            	            {
            	            lv_maintainerText_6_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	            						newLeafNode(lv_maintainerText_6_1, grammarAccess.getMaintainerTagAccess().getMaintainerTextIDTerminalRuleCall_6_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMaintainerTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"maintainerText",
            	            							lv_maintainerText_6_1,
            	            							"org.spf.packagexml.PackageXML.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPackageXML.g:628:6: lv_maintainerText_6_2= RULE_STRING
            	            {
            	            lv_maintainerText_6_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	            						newLeafNode(lv_maintainerText_6_2, grammarAccess.getMaintainerTagAccess().getMaintainerTextSTRINGTerminalRuleCall_6_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getMaintainerTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"maintainerText",
            	            							lv_maintainerText_6_2,
            	            							"org.spf.packagexml.PackageXML.STRING");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMaintainerTagAccess().getLessThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getMaintainerTagAccess().getSolidusKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getMaintainerTagAccess().getMaintainerKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMaintainerTagAccess().getGreaterThanSignKeyword_10());
            		

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
    // $ANTLR end "ruleMaintainerTag"


    // $ANTLR start "entryRuleLicenseTag"
    // InternalPackageXML.g:665:1: entryRuleLicenseTag returns [EObject current=null] : iv_ruleLicenseTag= ruleLicenseTag EOF ;
    public final EObject entryRuleLicenseTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicenseTag = null;


        try {
            // InternalPackageXML.g:665:51: (iv_ruleLicenseTag= ruleLicenseTag EOF )
            // InternalPackageXML.g:666:2: iv_ruleLicenseTag= ruleLicenseTag EOF
            {
             newCompositeNode(grammarAccess.getLicenseTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLicenseTag=ruleLicenseTag();

            state._fsp--;

             current =iv_ruleLicenseTag; 
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
    // $ANTLR end "entryRuleLicenseTag"


    // $ANTLR start "ruleLicenseTag"
    // InternalPackageXML.g:672:1: ruleLicenseTag returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'license' otherlv_2= '>' ( (lv_license_3_0= RULE_ID ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'license' otherlv_7= '>' ) ;
    public final EObject ruleLicenseTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_license_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalPackageXML.g:678:2: ( (otherlv_0= '<' otherlv_1= 'license' otherlv_2= '>' ( (lv_license_3_0= RULE_ID ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'license' otherlv_7= '>' ) )
            // InternalPackageXML.g:679:2: (otherlv_0= '<' otherlv_1= 'license' otherlv_2= '>' ( (lv_license_3_0= RULE_ID ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'license' otherlv_7= '>' )
            {
            // InternalPackageXML.g:679:2: (otherlv_0= '<' otherlv_1= 'license' otherlv_2= '>' ( (lv_license_3_0= RULE_ID ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'license' otherlv_7= '>' )
            // InternalPackageXML.g:680:3: otherlv_0= '<' otherlv_1= 'license' otherlv_2= '>' ( (lv_license_3_0= RULE_ID ) ) otherlv_4= '<' otherlv_5= '/' otherlv_6= 'license' otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseTagAccess().getLicenseKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_2());
            		
            // InternalPackageXML.g:692:3: ( (lv_license_3_0= RULE_ID ) )
            // InternalPackageXML.g:693:4: (lv_license_3_0= RULE_ID )
            {
            // InternalPackageXML.g:693:4: (lv_license_3_0= RULE_ID )
            // InternalPackageXML.g:694:5: lv_license_3_0= RULE_ID
            {
            lv_license_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_license_3_0, grammarAccess.getLicenseTagAccess().getLicenseIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLicenseTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"license",
            						lv_license_3_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLicenseTagAccess().getLessThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getLicenseTagAccess().getSolidusKeyword_5());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getLicenseTagAccess().getLicenseKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLicenseTagAccess().getGreaterThanSignKeyword_7());
            		

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
    // $ANTLR end "ruleLicenseTag"


    // $ANTLR start "entryRuleDependencyTag"
    // InternalPackageXML.g:730:1: entryRuleDependencyTag returns [EObject current=null] : iv_ruleDependencyTag= ruleDependencyTag EOF ;
    public final EObject entryRuleDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyTag = null;


        try {
            // InternalPackageXML.g:730:54: (iv_ruleDependencyTag= ruleDependencyTag EOF )
            // InternalPackageXML.g:731:2: iv_ruleDependencyTag= ruleDependencyTag EOF
            {
             newCompositeNode(grammarAccess.getDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependencyTag=ruleDependencyTag();

            state._fsp--;

             current =iv_ruleDependencyTag; 
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
    // $ANTLR end "entryRuleDependencyTag"


    // $ANTLR start "ruleDependencyTag"
    // InternalPackageXML.g:737:1: ruleDependencyTag returns [EObject current=null] : (this_BuildDependDependencyTag_0= ruleBuildDependDependencyTag | this_ExecDependDependencyTag_1= ruleExecDependDependencyTag | this_BuildToolDependDependencyTag_2= ruleBuildToolDependDependencyTag | this_RunDependencyTag_3= ruleRunDependencyTag ) ;
    public final EObject ruleDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject this_BuildDependDependencyTag_0 = null;

        EObject this_ExecDependDependencyTag_1 = null;

        EObject this_BuildToolDependDependencyTag_2 = null;

        EObject this_RunDependencyTag_3 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:743:2: ( (this_BuildDependDependencyTag_0= ruleBuildDependDependencyTag | this_ExecDependDependencyTag_1= ruleExecDependDependencyTag | this_BuildToolDependDependencyTag_2= ruleBuildToolDependDependencyTag | this_RunDependencyTag_3= ruleRunDependencyTag ) )
            // InternalPackageXML.g:744:2: (this_BuildDependDependencyTag_0= ruleBuildDependDependencyTag | this_ExecDependDependencyTag_1= ruleExecDependDependencyTag | this_BuildToolDependDependencyTag_2= ruleBuildToolDependDependencyTag | this_RunDependencyTag_3= ruleRunDependencyTag )
            {
            // InternalPackageXML.g:744:2: (this_BuildDependDependencyTag_0= ruleBuildDependDependencyTag | this_ExecDependDependencyTag_1= ruleExecDependDependencyTag | this_BuildToolDependDependencyTag_2= ruleBuildToolDependDependencyTag | this_RunDependencyTag_3= ruleRunDependencyTag )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt7=1;
                    }
                    break;
                case 27:
                    {
                    alt7=4;
                    }
                    break;
                case 30:
                    {
                    alt7=3;
                    }
                    break;
                case 29:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalPackageXML.g:745:3: this_BuildDependDependencyTag_0= ruleBuildDependDependencyTag
                    {

                    			newCompositeNode(grammarAccess.getDependencyTagAccess().getBuildDependDependencyTagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildDependDependencyTag_0=ruleBuildDependDependencyTag();

                    state._fsp--;


                    			current = this_BuildDependDependencyTag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:754:3: this_ExecDependDependencyTag_1= ruleExecDependDependencyTag
                    {

                    			newCompositeNode(grammarAccess.getDependencyTagAccess().getExecDependDependencyTagParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecDependDependencyTag_1=ruleExecDependDependencyTag();

                    state._fsp--;


                    			current = this_ExecDependDependencyTag_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPackageXML.g:763:3: this_BuildToolDependDependencyTag_2= ruleBuildToolDependDependencyTag
                    {

                    			newCompositeNode(grammarAccess.getDependencyTagAccess().getBuildToolDependDependencyTagParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildToolDependDependencyTag_2=ruleBuildToolDependDependencyTag();

                    state._fsp--;


                    			current = this_BuildToolDependDependencyTag_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPackageXML.g:772:3: this_RunDependencyTag_3= ruleRunDependencyTag
                    {

                    			newCompositeNode(grammarAccess.getDependencyTagAccess().getRunDependencyTagParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunDependencyTag_3=ruleRunDependencyTag();

                    state._fsp--;


                    			current = this_RunDependencyTag_3;
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
    // $ANTLR end "ruleDependencyTag"


    // $ANTLR start "entryRuleRunDependencyTag"
    // InternalPackageXML.g:784:1: entryRuleRunDependencyTag returns [EObject current=null] : iv_ruleRunDependencyTag= ruleRunDependencyTag EOF ;
    public final EObject entryRuleRunDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunDependencyTag = null;


        try {
            // InternalPackageXML.g:784:57: (iv_ruleRunDependencyTag= ruleRunDependencyTag EOF )
            // InternalPackageXML.g:785:2: iv_ruleRunDependencyTag= ruleRunDependencyTag EOF
            {
             newCompositeNode(grammarAccess.getRunDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunDependencyTag=ruleRunDependencyTag();

            state._fsp--;

             current =iv_ruleRunDependencyTag; 
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
    // $ANTLR end "entryRuleRunDependencyTag"


    // $ANTLR start "ruleRunDependencyTag"
    // InternalPackageXML.g:791:1: ruleRunDependencyTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'run_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'run_depend' otherlv_8= '>' ) ;
    public final EObject ruleRunDependencyTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPackageXML.g:797:2: ( ( () otherlv_1= '<' otherlv_2= 'run_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'run_depend' otherlv_8= '>' ) )
            // InternalPackageXML.g:798:2: ( () otherlv_1= '<' otherlv_2= 'run_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'run_depend' otherlv_8= '>' )
            {
            // InternalPackageXML.g:798:2: ( () otherlv_1= '<' otherlv_2= 'run_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'run_depend' otherlv_8= '>' )
            // InternalPackageXML.g:799:3: () otherlv_1= '<' otherlv_2= 'run_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'run_depend' otherlv_8= '>'
            {
            // InternalPackageXML.g:799:3: ()
            // InternalPackageXML.g:800:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunDependencyTagAccess().getRunDependencyTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:818:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPackageXML.g:819:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPackageXML.g:819:4: (lv_name_4_0= RULE_ID )
            // InternalPackageXML.g:820:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getRunDependencyTagAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunDependencyTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getRunDependencyTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getRunDependencyTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getRunDependencyTagAccess().getRun_dependKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRunDependencyTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleRunDependencyTag"


    // $ANTLR start "entryRuleBuildDependDependencyTag"
    // InternalPackageXML.g:856:1: entryRuleBuildDependDependencyTag returns [EObject current=null] : iv_ruleBuildDependDependencyTag= ruleBuildDependDependencyTag EOF ;
    public final EObject entryRuleBuildDependDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildDependDependencyTag = null;


        try {
            // InternalPackageXML.g:856:65: (iv_ruleBuildDependDependencyTag= ruleBuildDependDependencyTag EOF )
            // InternalPackageXML.g:857:2: iv_ruleBuildDependDependencyTag= ruleBuildDependDependencyTag EOF
            {
             newCompositeNode(grammarAccess.getBuildDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildDependDependencyTag=ruleBuildDependDependencyTag();

            state._fsp--;

             current =iv_ruleBuildDependDependencyTag; 
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
    // $ANTLR end "entryRuleBuildDependDependencyTag"


    // $ANTLR start "ruleBuildDependDependencyTag"
    // InternalPackageXML.g:863:1: ruleBuildDependDependencyTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'build_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'build_depend' otherlv_8= '>' ) ;
    public final EObject ruleBuildDependDependencyTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPackageXML.g:869:2: ( ( () otherlv_1= '<' otherlv_2= 'build_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'build_depend' otherlv_8= '>' ) )
            // InternalPackageXML.g:870:2: ( () otherlv_1= '<' otherlv_2= 'build_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'build_depend' otherlv_8= '>' )
            {
            // InternalPackageXML.g:870:2: ( () otherlv_1= '<' otherlv_2= 'build_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'build_depend' otherlv_8= '>' )
            // InternalPackageXML.g:871:3: () otherlv_1= '<' otherlv_2= 'build_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'build_depend' otherlv_8= '>'
            {
            // InternalPackageXML.g:871:3: ()
            // InternalPackageXML.g:872:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildDependDependencyTagAccess().getBuildDependDependencyTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:890:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPackageXML.g:891:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPackageXML.g:891:4: (lv_name_4_0= RULE_ID )
            // InternalPackageXML.g:892:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBuildDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildDependDependencyTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getBuildDependDependencyTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getBuildDependDependencyTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getBuildDependDependencyTagAccess().getBuild_dependKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBuildDependDependencyTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleBuildDependDependencyTag"


    // $ANTLR start "entryRuleExecDependDependencyTag"
    // InternalPackageXML.g:928:1: entryRuleExecDependDependencyTag returns [EObject current=null] : iv_ruleExecDependDependencyTag= ruleExecDependDependencyTag EOF ;
    public final EObject entryRuleExecDependDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecDependDependencyTag = null;


        try {
            // InternalPackageXML.g:928:64: (iv_ruleExecDependDependencyTag= ruleExecDependDependencyTag EOF )
            // InternalPackageXML.g:929:2: iv_ruleExecDependDependencyTag= ruleExecDependDependencyTag EOF
            {
             newCompositeNode(grammarAccess.getExecDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecDependDependencyTag=ruleExecDependDependencyTag();

            state._fsp--;

             current =iv_ruleExecDependDependencyTag; 
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
    // $ANTLR end "entryRuleExecDependDependencyTag"


    // $ANTLR start "ruleExecDependDependencyTag"
    // InternalPackageXML.g:935:1: ruleExecDependDependencyTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'exec_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'exec_depend' otherlv_8= '>' ) ;
    public final EObject ruleExecDependDependencyTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPackageXML.g:941:2: ( ( () otherlv_1= '<' otherlv_2= 'exec_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'exec_depend' otherlv_8= '>' ) )
            // InternalPackageXML.g:942:2: ( () otherlv_1= '<' otherlv_2= 'exec_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'exec_depend' otherlv_8= '>' )
            {
            // InternalPackageXML.g:942:2: ( () otherlv_1= '<' otherlv_2= 'exec_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'exec_depend' otherlv_8= '>' )
            // InternalPackageXML.g:943:3: () otherlv_1= '<' otherlv_2= 'exec_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'exec_depend' otherlv_8= '>'
            {
            // InternalPackageXML.g:943:3: ()
            // InternalPackageXML.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExecDependDependencyTagAccess().getExecDependDependencyTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:962:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPackageXML.g:963:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPackageXML.g:963:4: (lv_name_4_0= RULE_ID )
            // InternalPackageXML.g:964:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getExecDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecDependDependencyTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getExecDependDependencyTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getExecDependDependencyTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getExecDependDependencyTagAccess().getExec_dependKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExecDependDependencyTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleExecDependDependencyTag"


    // $ANTLR start "entryRuleBuildToolDependDependencyTag"
    // InternalPackageXML.g:1000:1: entryRuleBuildToolDependDependencyTag returns [EObject current=null] : iv_ruleBuildToolDependDependencyTag= ruleBuildToolDependDependencyTag EOF ;
    public final EObject entryRuleBuildToolDependDependencyTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildToolDependDependencyTag = null;


        try {
            // InternalPackageXML.g:1000:69: (iv_ruleBuildToolDependDependencyTag= ruleBuildToolDependDependencyTag EOF )
            // InternalPackageXML.g:1001:2: iv_ruleBuildToolDependDependencyTag= ruleBuildToolDependDependencyTag EOF
            {
             newCompositeNode(grammarAccess.getBuildToolDependDependencyTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildToolDependDependencyTag=ruleBuildToolDependDependencyTag();

            state._fsp--;

             current =iv_ruleBuildToolDependDependencyTag; 
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
    // $ANTLR end "entryRuleBuildToolDependDependencyTag"


    // $ANTLR start "ruleBuildToolDependDependencyTag"
    // InternalPackageXML.g:1007:1: ruleBuildToolDependDependencyTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'buildtool_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'buildtool_depend' otherlv_8= '>' ) ;
    public final EObject ruleBuildToolDependDependencyTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPackageXML.g:1013:2: ( ( () otherlv_1= '<' otherlv_2= 'buildtool_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'buildtool_depend' otherlv_8= '>' ) )
            // InternalPackageXML.g:1014:2: ( () otherlv_1= '<' otherlv_2= 'buildtool_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'buildtool_depend' otherlv_8= '>' )
            {
            // InternalPackageXML.g:1014:2: ( () otherlv_1= '<' otherlv_2= 'buildtool_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'buildtool_depend' otherlv_8= '>' )
            // InternalPackageXML.g:1015:3: () otherlv_1= '<' otherlv_2= 'buildtool_depend' otherlv_3= '>' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '<' otherlv_6= '/' otherlv_7= 'buildtool_depend' otherlv_8= '>'
            {
            // InternalPackageXML.g:1015:3: ()
            // InternalPackageXML.g:1016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildToolDependDependencyTagAccess().getBuildToolDependDependencyTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:1034:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalPackageXML.g:1035:4: (lv_name_4_0= RULE_ID )
            {
            // InternalPackageXML.g:1035:4: (lv_name_4_0= RULE_ID )
            // InternalPackageXML.g:1036:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_4_0, grammarAccess.getBuildToolDependDependencyTagAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBuildToolDependDependencyTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getBuildToolDependDependencyTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getBuildToolDependDependencyTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getBuildToolDependDependencyTagAccess().getBuildtool_dependKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBuildToolDependDependencyTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleBuildToolDependDependencyTag"


    // $ANTLR start "entryRuleExportTag"
    // InternalPackageXML.g:1072:1: entryRuleExportTag returns [EObject current=null] : iv_ruleExportTag= ruleExportTag EOF ;
    public final EObject entryRuleExportTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportTag = null;


        try {
            // InternalPackageXML.g:1072:50: (iv_ruleExportTag= ruleExportTag EOF )
            // InternalPackageXML.g:1073:2: iv_ruleExportTag= ruleExportTag EOF
            {
             newCompositeNode(grammarAccess.getExportTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportTag=ruleExportTag();

            state._fsp--;

             current =iv_ruleExportTag; 
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
    // $ANTLR end "entryRuleExportTag"


    // $ANTLR start "ruleExportTag"
    // InternalPackageXML.g:1079:1: ruleExportTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'export' otherlv_3= '>' ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'export' otherlv_8= '>' ) ;
    public final EObject ruleExportTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_arbitrary_tags_4_0 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:1085:2: ( ( () otherlv_1= '<' otherlv_2= 'export' otherlv_3= '>' ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'export' otherlv_8= '>' ) )
            // InternalPackageXML.g:1086:2: ( () otherlv_1= '<' otherlv_2= 'export' otherlv_3= '>' ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'export' otherlv_8= '>' )
            {
            // InternalPackageXML.g:1086:2: ( () otherlv_1= '<' otherlv_2= 'export' otherlv_3= '>' ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'export' otherlv_8= '>' )
            // InternalPackageXML.g:1087:3: () otherlv_1= '<' otherlv_2= 'export' otherlv_3= '>' ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )* otherlv_5= '<' otherlv_6= '/' otherlv_7= 'export' otherlv_8= '>'
            {
            // InternalPackageXML.g:1087:3: ()
            // InternalPackageXML.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExportTagAccess().getExportTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getExportTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getExportTagAccess().getExportKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_3());
            		
            // InternalPackageXML.g:1106:3: ( (lv_arbitrary_tags_4_0= ruleArbitraryTag ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalPackageXML.g:1107:4: (lv_arbitrary_tags_4_0= ruleArbitraryTag )
            	    {
            	    // InternalPackageXML.g:1107:4: (lv_arbitrary_tags_4_0= ruleArbitraryTag )
            	    // InternalPackageXML.g:1108:5: lv_arbitrary_tags_4_0= ruleArbitraryTag
            	    {

            	    					newCompositeNode(grammarAccess.getExportTagAccess().getArbitrary_tagsArbitraryTagParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_arbitrary_tags_4_0=ruleArbitraryTag();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExportTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"arbitrary_tags",
            	    						lv_arbitrary_tags_4_0,
            	    						"org.spf.packagexml.PackageXML.ArbitraryTag");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getExportTagAccess().getLessThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getExportTagAccess().getSolidusKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getExportTagAccess().getExportKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExportTagAccess().getGreaterThanSignKeyword_8());
            		

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
    // $ANTLR end "ruleExportTag"


    // $ANTLR start "entryRuleAuthorTag"
    // InternalPackageXML.g:1145:1: entryRuleAuthorTag returns [EObject current=null] : iv_ruleAuthorTag= ruleAuthorTag EOF ;
    public final EObject entryRuleAuthorTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorTag = null;


        try {
            // InternalPackageXML.g:1145:50: (iv_ruleAuthorTag= ruleAuthorTag EOF )
            // InternalPackageXML.g:1146:2: iv_ruleAuthorTag= ruleAuthorTag EOF
            {
             newCompositeNode(grammarAccess.getAuthorTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthorTag=ruleAuthorTag();

            state._fsp--;

             current =iv_ruleAuthorTag; 
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
    // $ANTLR end "entryRuleAuthorTag"


    // $ANTLR start "ruleAuthorTag"
    // InternalPackageXML.g:1152:1: ruleAuthorTag returns [EObject current=null] : ( () otherlv_1= '<' otherlv_2= 'author' (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )* otherlv_8= '<' otherlv_9= '/' otherlv_10= 'author' otherlv_11= '>' ) ;
    public final EObject ruleAuthorTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_email_5_0=null;
        Token otherlv_6=null;
        Token lv_authorText_7_1=null;
        Token lv_authorText_7_2=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalPackageXML.g:1158:2: ( ( () otherlv_1= '<' otherlv_2= 'author' (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )* otherlv_8= '<' otherlv_9= '/' otherlv_10= 'author' otherlv_11= '>' ) )
            // InternalPackageXML.g:1159:2: ( () otherlv_1= '<' otherlv_2= 'author' (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )* otherlv_8= '<' otherlv_9= '/' otherlv_10= 'author' otherlv_11= '>' )
            {
            // InternalPackageXML.g:1159:2: ( () otherlv_1= '<' otherlv_2= 'author' (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )* otherlv_8= '<' otherlv_9= '/' otherlv_10= 'author' otherlv_11= '>' )
            // InternalPackageXML.g:1160:3: () otherlv_1= '<' otherlv_2= 'author' (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )? otherlv_6= '>' ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )* otherlv_8= '<' otherlv_9= '/' otherlv_10= 'author' otherlv_11= '>'
            {
            // InternalPackageXML.g:1160:3: ()
            // InternalPackageXML.g:1161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAuthorTagAccess().getAuthorTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getAuthorTagAccess().getAuthorKeyword_2());
            		
            // InternalPackageXML.g:1175:3: (otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPackageXML.g:1176:4: otherlv_3= 'email' otherlv_4= '=' ( (lv_email_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAuthorTagAccess().getEmailKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAuthorTagAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalPackageXML.g:1184:4: ( (lv_email_5_0= RULE_STRING ) )
                    // InternalPackageXML.g:1185:5: (lv_email_5_0= RULE_STRING )
                    {
                    // InternalPackageXML.g:1185:5: (lv_email_5_0= RULE_STRING )
                    // InternalPackageXML.g:1186:6: lv_email_5_0= RULE_STRING
                    {
                    lv_email_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

                    						newLeafNode(lv_email_5_0, grammarAccess.getAuthorTagAccess().getEmailSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAuthorTagRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"email",
                    							lv_email_5_0,
                    							"org.spf.packagexml.PackageXML.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_4());
            		
            // InternalPackageXML.g:1207:3: ( ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPackageXML.g:1208:4: ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) )
            	    {
            	    // InternalPackageXML.g:1208:4: ( (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING ) )
            	    // InternalPackageXML.g:1209:5: (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING )
            	    {
            	    // InternalPackageXML.g:1209:5: (lv_authorText_7_1= RULE_ID | lv_authorText_7_2= RULE_STRING )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_ID) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==RULE_STRING) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalPackageXML.g:1210:6: lv_authorText_7_1= RULE_ID
            	            {
            	            lv_authorText_7_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            	            						newLeafNode(lv_authorText_7_1, grammarAccess.getAuthorTagAccess().getAuthorTextIDTerminalRuleCall_5_0_0());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getAuthorTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"authorText",
            	            							lv_authorText_7_1,
            	            							"org.spf.packagexml.PackageXML.ID");
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalPackageXML.g:1225:6: lv_authorText_7_2= RULE_STRING
            	            {
            	            lv_authorText_7_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	            						newLeafNode(lv_authorText_7_2, grammarAccess.getAuthorTagAccess().getAuthorTextSTRINGTerminalRuleCall_5_0_1());
            	            					

            	            						if (current==null) {
            	            							current = createModelElement(grammarAccess.getAuthorTagRule());
            	            						}
            	            						addWithLastConsumed(
            	            							current,
            	            							"authorText",
            	            							lv_authorText_7_2,
            	            							"org.spf.packagexml.PackageXML.STRING");
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getAuthorTagAccess().getLessThanSignKeyword_6());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_9, grammarAccess.getAuthorTagAccess().getSolidusKeyword_7());
            		
            otherlv_10=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getAuthorTagAccess().getAuthorKeyword_8());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAuthorTagAccess().getGreaterThanSignKeyword_9());
            		

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
    // $ANTLR end "ruleAuthorTag"


    // $ANTLR start "entryRuleUrlTag"
    // InternalPackageXML.g:1262:1: entryRuleUrlTag returns [EObject current=null] : iv_ruleUrlTag= ruleUrlTag EOF ;
    public final EObject entryRuleUrlTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrlTag = null;


        try {
            // InternalPackageXML.g:1262:47: (iv_ruleUrlTag= ruleUrlTag EOF )
            // InternalPackageXML.g:1263:2: iv_ruleUrlTag= ruleUrlTag EOF
            {
             newCompositeNode(grammarAccess.getUrlTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrlTag=ruleUrlTag();

            state._fsp--;

             current =iv_ruleUrlTag; 
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
    // $ANTLR end "entryRuleUrlTag"


    // $ANTLR start "ruleUrlTag"
    // InternalPackageXML.g:1269:1: ruleUrlTag returns [EObject current=null] : (otherlv_0= '<' otherlv_1= 'url' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_url_6_0= RULE_ID ) ) otherlv_7= '<' otherlv_8= '/' otherlv_9= 'url' otherlv_10= '>' ) ;
    public final EObject ruleUrlTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token lv_url_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalPackageXML.g:1275:2: ( (otherlv_0= '<' otherlv_1= 'url' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_url_6_0= RULE_ID ) ) otherlv_7= '<' otherlv_8= '/' otherlv_9= 'url' otherlv_10= '>' ) )
            // InternalPackageXML.g:1276:2: (otherlv_0= '<' otherlv_1= 'url' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_url_6_0= RULE_ID ) ) otherlv_7= '<' otherlv_8= '/' otherlv_9= 'url' otherlv_10= '>' )
            {
            // InternalPackageXML.g:1276:2: (otherlv_0= '<' otherlv_1= 'url' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_url_6_0= RULE_ID ) ) otherlv_7= '<' otherlv_8= '/' otherlv_9= 'url' otherlv_10= '>' )
            // InternalPackageXML.g:1277:3: otherlv_0= '<' otherlv_1= 'url' otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= '>' ( (lv_url_6_0= RULE_ID ) ) otherlv_7= '<' otherlv_8= '/' otherlv_9= 'url' otherlv_10= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getUrlTagAccess().getLessThanSignKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getUrlTagAccess().getUrlKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getUrlTagAccess().getTypeKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getUrlTagAccess().getEqualsSignKeyword_3());
            		
            // InternalPackageXML.g:1293:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalPackageXML.g:1294:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalPackageXML.g:1294:4: (lv_type_4_0= RULE_STRING )
            // InternalPackageXML.g:1295:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_type_4_0, grammarAccess.getUrlTagAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrlTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.spf.packagexml.PackageXML.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_5());
            		
            // InternalPackageXML.g:1315:3: ( (lv_url_6_0= RULE_ID ) )
            // InternalPackageXML.g:1316:4: (lv_url_6_0= RULE_ID )
            {
            // InternalPackageXML.g:1316:4: (lv_url_6_0= RULE_ID )
            // InternalPackageXML.g:1317:5: lv_url_6_0= RULE_ID
            {
            lv_url_6_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_url_6_0, grammarAccess.getUrlTagAccess().getUrlIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUrlTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_6_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getUrlTagAccess().getLessThanSignKeyword_7());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getUrlTagAccess().getSolidusKeyword_8());
            		
            otherlv_9=(Token)match(input,33,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getUrlTagAccess().getUrlKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUrlTagAccess().getGreaterThanSignKeyword_10());
            		

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
    // $ANTLR end "ruleUrlTag"


    // $ANTLR start "entryRuleArbitraryTag"
    // InternalPackageXML.g:1353:1: entryRuleArbitraryTag returns [EObject current=null] : iv_ruleArbitraryTag= ruleArbitraryTag EOF ;
    public final EObject entryRuleArbitraryTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArbitraryTag = null;


        try {
            // InternalPackageXML.g:1353:53: (iv_ruleArbitraryTag= ruleArbitraryTag EOF )
            // InternalPackageXML.g:1354:2: iv_ruleArbitraryTag= ruleArbitraryTag EOF
            {
             newCompositeNode(grammarAccess.getArbitraryTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArbitraryTag=ruleArbitraryTag();

            state._fsp--;

             current =iv_ruleArbitraryTag; 
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
    // $ANTLR end "entryRuleArbitraryTag"


    // $ANTLR start "ruleArbitraryTag"
    // InternalPackageXML.g:1360:1: ruleArbitraryTag returns [EObject current=null] : (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) ) ) ;
    public final EObject ruleArbitraryTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_innerText_6_1=null;
        Token lv_innerText_6_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_ID_9=null;
        Token otherlv_10=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalPackageXML.g:1366:2: ( (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) ) ) )
            // InternalPackageXML.g:1367:2: (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) ) )
            {
            // InternalPackageXML.g:1367:2: (otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) ) )
            // InternalPackageXML.g:1368:3: otherlv_0= '<' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_0());
            		
            // InternalPackageXML.g:1372:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPackageXML.g:1373:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPackageXML.g:1373:4: (lv_name_1_0= RULE_ID )
            // InternalPackageXML.g:1374:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArbitraryTagAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArbitraryTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            // InternalPackageXML.g:1390:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPackageXML.g:1391:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalPackageXML.g:1391:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalPackageXML.g:1392:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getArbitraryTagAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getArbitraryTagRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"org.spf.packagexml.PackageXML.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalPackageXML.g:1409:3: ( (otherlv_3= '/' otherlv_4= '>' ) | (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==20) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPackageXML.g:1410:4: (otherlv_3= '/' otherlv_4= '>' )
                    {
                    // InternalPackageXML.g:1410:4: (otherlv_3= '/' otherlv_4= '>' )
                    // InternalPackageXML.g:1411:5: otherlv_3= '/' otherlv_4= '>'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    					newLeafNode(otherlv_3, grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_4, grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalPackageXML.g:1421:4: (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' )
                    {
                    // InternalPackageXML.g:1421:4: (otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>' )
                    // InternalPackageXML.g:1422:5: otherlv_5= '>' ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )* otherlv_7= '<' otherlv_8= '/' this_ID_9= RULE_ID otherlv_10= '>'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_17); 

                    					newLeafNode(otherlv_5, grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_0());
                    				
                    // InternalPackageXML.g:1426:5: ( ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalPackageXML.g:1427:6: ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) )
                    	    {
                    	    // InternalPackageXML.g:1427:6: ( (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING ) )
                    	    // InternalPackageXML.g:1428:7: (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING )
                    	    {
                    	    // InternalPackageXML.g:1428:7: (lv_innerText_6_1= RULE_ID | lv_innerText_6_2= RULE_STRING )
                    	    int alt13=2;
                    	    int LA13_0 = input.LA(1);

                    	    if ( (LA13_0==RULE_ID) ) {
                    	        alt13=1;
                    	    }
                    	    else if ( (LA13_0==RULE_STRING) ) {
                    	        alt13=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 13, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt13) {
                    	        case 1 :
                    	            // InternalPackageXML.g:1429:8: lv_innerText_6_1= RULE_ID
                    	            {
                    	            lv_innerText_6_1=(Token)match(input,RULE_ID,FOLLOW_17); 

                    	            								newLeafNode(lv_innerText_6_1, grammarAccess.getArbitraryTagAccess().getInnerTextIDTerminalRuleCall_3_1_1_0_0());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getArbitraryTagRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"innerText",
                    	            									lv_innerText_6_1,
                    	            									"org.spf.packagexml.PackageXML.ID");
                    	            							

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalPackageXML.g:1444:8: lv_innerText_6_2= RULE_STRING
                    	            {
                    	            lv_innerText_6_2=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	            								newLeafNode(lv_innerText_6_2, grammarAccess.getArbitraryTagAccess().getInnerTextSTRINGTerminalRuleCall_3_1_1_0_1());
                    	            							

                    	            								if (current==null) {
                    	            									current = createModelElement(grammarAccess.getArbitraryTagRule());
                    	            								}
                    	            								addWithLastConsumed(
                    	            									current,
                    	            									"innerText",
                    	            									lv_innerText_6_2,
                    	            									"org.spf.packagexml.PackageXML.STRING");
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_7, grammarAccess.getArbitraryTagAccess().getLessThanSignKeyword_3_1_2());
                    				
                    otherlv_8=(Token)match(input,21,FOLLOW_14); 

                    					newLeafNode(otherlv_8, grammarAccess.getArbitraryTagAccess().getSolidusKeyword_3_1_3());
                    				
                    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_11); 

                    					newLeafNode(this_ID_9, grammarAccess.getArbitraryTagAccess().getIDTerminalRuleCall_3_1_4());
                    				
                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getArbitraryTagAccess().getGreaterThanSignKeyword_3_1_5());
                    				

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
    // $ANTLR end "ruleArbitraryTag"


    // $ANTLR start "entryRuleAttribute"
    // InternalPackageXML.g:1483:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalPackageXML.g:1483:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalPackageXML.g:1484:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPackageXML.g:1490:1: ruleAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalPackageXML.g:1496:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalPackageXML.g:1497:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalPackageXML.g:1497:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalPackageXML.g:1498:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalPackageXML.g:1498:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalPackageXML.g:1499:4: (lv_key_0_0= RULE_ID )
            {
            // InternalPackageXML.g:1499:4: (lv_key_0_0= RULE_ID )
            // InternalPackageXML.g:1500:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_key_0_0, grammarAccess.getAttributeAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.spf.packagexml.PackageXML.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalPackageXML.g:1520:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalPackageXML.g:1521:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalPackageXML.g:1521:4: (lv_value_2_0= RULE_STRING )
            // InternalPackageXML.g:1522:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getAttributeAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.spf.packagexml.PackageXML.STRING");
            				

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
    // $ANTLR end "ruleAttribute"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\21\1\5\12\uffff";
    static final String dfa_3s = "\1\21\1\41\12\uffff";
    static final String dfa_4s = "\2\uffff\1\10\1\7\1\6\1\5\1\1\1\11\1\3\1\4\1\2\1\12";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\13\10\uffff\1\12\7\uffff\1\6\1\10\1\11\1\uffff\1\5\4\4\1\3\1\2\1\7",
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
            return "208:2: (this_NameTag_0= ruleNameTag | this_VersionTag_1= ruleVersionTag | this_DescriptionTag_2= ruleDescriptionTag | this_MaintainerTag_3= ruleMaintainerTag | this_LicenseTag_4= ruleLicenseTag | this_DependencyTag_5= ruleDependencyTag | this_ExportTag_6= ruleExportTag | this_AuthorTag_7= ruleAuthorTag | this_UrlTag_8= ruleUrlTag | this_ArbitraryTag_9= ruleArbitraryTag )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000300020L});

}