package org.spf.packagexml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPackageXMLLexer extends Lexer {
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

    public InternalPackageXMLLexer() {;} 
    public InternalPackageXMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPackageXMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPackageXML.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:11:7: ( '<?' )
            // InternalPackageXML.g:11:9: '<?'
            {
            match("<?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:12:7: ( 'xml' )
            // InternalPackageXML.g:12:9: 'xml'
            {
            match("xml"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:13:7: ( 'version' )
            // InternalPackageXML.g:13:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:14:7: ( '=' )
            // InternalPackageXML.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:15:7: ( '?>' )
            // InternalPackageXML.g:15:9: '?>'
            {
            match("?>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:16:7: ( '<' )
            // InternalPackageXML.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:17:7: ( 'package' )
            // InternalPackageXML.g:17:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:18:7: ( 'format' )
            // InternalPackageXML.g:18:9: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:19:7: ( '>' )
            // InternalPackageXML.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:20:7: ( '/' )
            // InternalPackageXML.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:21:7: ( 'name' )
            // InternalPackageXML.g:21:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:22:7: ( 'description' )
            // InternalPackageXML.g:22:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:23:7: ( 'maintainer' )
            // InternalPackageXML.g:23:9: 'maintainer'
            {
            match("maintainer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:24:7: ( 'email' )
            // InternalPackageXML.g:24:9: 'email'
            {
            match("email"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:25:7: ( 'license' )
            // InternalPackageXML.g:25:9: 'license'
            {
            match("license"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:26:7: ( 'run_depend' )
            // InternalPackageXML.g:26:9: 'run_depend'
            {
            match("run_depend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:27:7: ( 'build_depend' )
            // InternalPackageXML.g:27:9: 'build_depend'
            {
            match("build_depend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:28:7: ( 'exec_depend' )
            // InternalPackageXML.g:28:9: 'exec_depend'
            {
            match("exec_depend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:29:7: ( 'buildtool_depend' )
            // InternalPackageXML.g:29:9: 'buildtool_depend'
            {
            match("buildtool_depend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:30:7: ( 'export' )
            // InternalPackageXML.g:30:9: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:31:7: ( 'author' )
            // InternalPackageXML.g:31:9: 'author'
            {
            match("author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:32:7: ( 'url' )
            // InternalPackageXML.g:32:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:33:7: ( 'type' )
            // InternalPackageXML.g:33:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_VERSION_TERMINAL"
    public final void mRULE_VERSION_TERMINAL() throws RecognitionException {
        try {
            int _type = RULE_VERSION_TERMINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1541:23: ( RULE_INT ( '.' RULE_INT )* )
            // InternalPackageXML.g:1541:25: RULE_INT ( '.' RULE_INT )*
            {
            mRULE_INT(); 
            // InternalPackageXML.g:1541:34: ( '.' RULE_INT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPackageXML.g:1541:35: '.' RULE_INT
            	    {
            	    match('.'); 
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION_TERMINAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1543:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '.' | ',' | ':' | '/' )* )
            // InternalPackageXML.g:1543:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '.' | ',' | ':' | '/' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalPackageXML.g:1543:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' | '.' | ',' | ':' | '/' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=',' && LA2_0<=':')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPackageXML.g:
            	    {
            	    if ( (input.LA(1)>=',' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalPackageXML.g:1545:19: ( ( '0' .. '9' )+ )
            // InternalPackageXML.g:1545:21: ( '0' .. '9' )+
            {
            // InternalPackageXML.g:1545:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPackageXML.g:1545:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1547:13: ( '\"' (~ ( '\"' ) )* '\"' )
            // InternalPackageXML.g:1547:15: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // InternalPackageXML.g:1547:19: (~ ( '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPackageXML.g:1547:19: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1549:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPackageXML.g:1549:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPackageXML.g:1549:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPackageXML.g:1549:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1551:17: ( '<!--' (~ ( ( '\\n' | '\\r' ) ) )* '-->' ( ( '\\r' )? '\\n' )? )
            // InternalPackageXML.g:1551:19: '<!--' (~ ( ( '\\n' | '\\r' ) ) )* '-->' ( ( '\\r' )? '\\n' )?
            {
            match("<!--"); 

            // InternalPackageXML.g:1551:26: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='-') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='-') ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3=='>') ) {
                            int LA6_4 = input.LA(4);

                            if ( ((LA6_4>='\u0000' && LA6_4<='\t')||(LA6_4>='\u000B' && LA6_4<='\f')||(LA6_4>='\u000E' && LA6_4<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_3>='\u0000' && LA6_3<='\t')||(LA6_3>='\u000B' && LA6_3<='\f')||(LA6_3>='\u000E' && LA6_3<='=')||(LA6_3>='?' && LA6_3<='\uFFFF')) ) {
                            alt6=1;
                        }


                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='\t')||(LA6_1>='\u000B' && LA6_1<='\f')||(LA6_1>='\u000E' && LA6_1<=',')||(LA6_1>='.' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<=',')||(LA6_0>='.' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPackageXML.g:1551:26: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("-->"); 

            // InternalPackageXML.g:1551:48: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPackageXML.g:1551:49: ( '\\r' )? '\\n'
                    {
                    // InternalPackageXML.g:1551:49: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalPackageXML.g:1551:49: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1553:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPackageXML.g:1553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPackageXML.g:1553:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPackageXML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPackageXML.g:1555:16: ( . )
            // InternalPackageXML.g:1555:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPackageXML.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_VERSION_TERMINAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=30;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalPackageXML.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalPackageXML.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalPackageXML.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalPackageXML.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalPackageXML.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalPackageXML.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalPackageXML.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalPackageXML.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalPackageXML.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalPackageXML.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalPackageXML.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalPackageXML.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalPackageXML.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalPackageXML.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalPackageXML.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalPackageXML.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalPackageXML.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalPackageXML.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalPackageXML.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalPackageXML.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalPackageXML.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalPackageXML.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalPackageXML.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalPackageXML.g:1:148: RULE_VERSION_TERMINAL
                {
                mRULE_VERSION_TERMINAL(); 

                }
                break;
            case 25 :
                // InternalPackageXML.g:1:170: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalPackageXML.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalPackageXML.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalPackageXML.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalPackageXML.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalPackageXML.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\33\2\35\1\uffff\1\30\2\35\1\uffff\1\45\12\35\2\uffff\1\30\5\uffff\1\35\1\uffff\1\35\2\uffff\2\35\3\uffff\13\35\3\uffff\1\104\15\35\1\122\1\35\1\uffff\3\35\1\127\11\35\1\uffff\1\141\3\35\1\uffff\2\35\1\147\6\35\1\uffff\2\35\1\161\2\35\1\uffff\1\35\1\165\4\35\1\172\1\173\1\174\1\uffff\3\35\1\uffff\1\u0080\3\35\3\uffff\3\35\1\uffff\12\35\1\u0091\1\35\1\u0093\2\35\1\u0096\1\uffff\1\u0097\1\uffff\2\35\2\uffff\1\u009a\1\35\1\uffff\3\35\1\u009f\1\uffff";
    static final String DFA10_eofS =
        "\u00a0\uffff";
    static final String DFA10_minS =
        "\1\0\1\41\1\155\1\145\1\uffff\1\76\1\141\1\157\1\uffff\1\52\1\141\1\145\1\141\1\155\1\151\3\165\1\162\1\171\2\uffff\1\0\5\uffff\1\154\1\uffff\1\162\2\uffff\1\143\1\162\3\uffff\1\155\1\163\1\151\1\141\1\145\1\143\1\156\1\151\1\164\1\154\1\160\3\uffff\1\54\1\163\1\153\1\155\1\145\1\143\1\156\1\151\1\143\1\157\1\145\1\137\1\154\1\150\1\54\1\145\1\uffff\1\151\2\141\1\54\1\162\1\164\1\154\1\137\1\162\1\156\2\144\1\157\1\uffff\1\54\1\157\1\147\1\164\1\uffff\1\151\1\141\1\54\1\144\1\164\1\163\1\145\1\137\1\162\1\uffff\1\156\1\145\1\54\1\160\1\151\1\uffff\1\145\1\54\1\145\1\160\1\144\1\157\3\54\1\uffff\1\164\1\156\1\160\1\uffff\1\54\2\145\1\157\3\uffff\1\151\2\145\1\uffff\1\156\1\160\1\154\1\157\1\162\1\156\1\144\1\145\1\137\1\156\1\54\1\144\1\54\1\156\1\144\1\54\1\uffff\1\54\1\uffff\1\144\1\145\2\uffff\1\54\1\160\1\uffff\1\145\1\156\1\144\1\54\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\77\1\155\1\145\1\uffff\1\76\1\141\1\157\1\uffff\1\52\1\141\1\145\1\141\1\170\1\151\3\165\1\162\1\171\2\uffff\1\uffff\5\uffff\1\154\1\uffff\1\162\2\uffff\1\143\1\162\3\uffff\1\155\1\163\1\151\1\141\1\160\1\143\1\156\1\151\1\164\1\154\1\160\3\uffff\1\172\1\163\1\153\1\155\1\145\1\143\1\156\1\151\1\143\1\157\1\145\1\137\1\154\1\150\1\172\1\145\1\uffff\1\151\2\141\1\172\1\162\1\164\1\154\1\137\1\162\1\156\2\144\1\157\1\uffff\1\172\1\157\1\147\1\164\1\uffff\1\151\1\141\1\172\1\144\1\164\1\163\1\145\1\164\1\162\1\uffff\1\156\1\145\1\172\1\160\1\151\1\uffff\1\145\1\172\1\145\1\160\1\144\1\157\3\172\1\uffff\1\164\1\156\1\160\1\uffff\1\172\2\145\1\157\3\uffff\1\151\2\145\1\uffff\1\156\1\160\1\154\1\157\1\162\1\156\1\144\1\145\1\137\1\156\1\172\1\144\1\172\1\156\1\144\1\172\1\uffff\1\172\1\uffff\1\144\1\145\2\uffff\1\172\1\160\1\uffff\1\145\1\156\1\144\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\4\3\uffff\1\11\13\uffff\1\30\1\31\1\uffff\1\35\1\36\1\1\1\34\1\6\1\uffff\1\31\1\uffff\1\4\1\5\2\uffff\1\11\1\33\1\12\13\uffff\1\30\1\32\1\35\20\uffff\1\2\15\uffff\1\26\4\uffff\1\13\11\uffff\1\27\5\uffff\1\16\11\uffff\1\10\3\uffff\1\24\4\uffff\1\25\1\3\1\7\3\uffff\1\17\20\uffff\1\15\1\uffff\1\20\2\uffff\1\14\1\22\2\uffff\1\21\4\uffff\1\23";
    static final String DFA10_specialS =
        "\1\1\25\uffff\1\0\u0089\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\26\14\30\1\11\12\24\2\30\1\1\1\4\1\10\1\5\1\30\32\25\4\30\1\25\1\30\1\21\1\20\1\25\1\13\1\15\1\7\5\25\1\16\1\14\1\12\1\25\1\6\1\25\1\17\1\25\1\23\1\22\1\3\1\25\1\2\2\25\uff85\30",
            "\1\32\35\uffff\1\31",
            "\1\34",
            "\1\36",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\12\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "\0\62",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "",
            "\1\65",
            "",
            "",
            "\1\66",
            "\1\67",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74\12\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154\24\uffff\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\162",
            "\1\163",
            "",
            "\1\164",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0092",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0094",
            "\1\u0095",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\17\35\6\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_VERSION_TERMINAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_22 = input.LA(1);

                        s = -1;
                        if ( ((LA10_22>='\u0000' && LA10_22<='\uFFFF')) ) {s = 50;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='<') ) {s = 1;}

                        else if ( (LA10_0=='x') ) {s = 2;}

                        else if ( (LA10_0=='v') ) {s = 3;}

                        else if ( (LA10_0=='=') ) {s = 4;}

                        else if ( (LA10_0=='?') ) {s = 5;}

                        else if ( (LA10_0=='p') ) {s = 6;}

                        else if ( (LA10_0=='f') ) {s = 7;}

                        else if ( (LA10_0=='>') ) {s = 8;}

                        else if ( (LA10_0=='/') ) {s = 9;}

                        else if ( (LA10_0=='n') ) {s = 10;}

                        else if ( (LA10_0=='d') ) {s = 11;}

                        else if ( (LA10_0=='m') ) {s = 12;}

                        else if ( (LA10_0=='e') ) {s = 13;}

                        else if ( (LA10_0=='l') ) {s = 14;}

                        else if ( (LA10_0=='r') ) {s = 15;}

                        else if ( (LA10_0=='b') ) {s = 16;}

                        else if ( (LA10_0=='a') ) {s = 17;}

                        else if ( (LA10_0=='u') ) {s = 18;}

                        else if ( (LA10_0=='t') ) {s = 19;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 20;}

                        else if ( ((LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='c'||(LA10_0>='g' && LA10_0<='k')||LA10_0=='o'||LA10_0=='q'||LA10_0=='s'||LA10_0=='w'||(LA10_0>='y' && LA10_0<='z')) ) {s = 21;}

                        else if ( (LA10_0=='\"') ) {s = 22;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 23;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='.')||(LA10_0>=':' && LA10_0<=';')||LA10_0=='@'||(LA10_0>='[' && LA10_0<='^')||LA10_0=='`'||(LA10_0>='{' && LA10_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}