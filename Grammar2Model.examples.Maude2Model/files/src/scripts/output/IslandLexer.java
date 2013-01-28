// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g 2010-01-31 19:51:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class IslandLexer extends Lexer {
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int DQUOTE=7;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int COLON=5;
    public static final int T__19=19;
    public static final int WS=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int STRING=6;

    // delegates
    // delegators

    public IslandLexer() {;} 
    public IslandLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public IslandLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:3:6: ( 'eq' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:3:8: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:4:7: ( '.' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:4:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:5:7: ( '[' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:5:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:6:7: ( ']' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:6:9: ']'
            {
            match(']'); 

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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:7:7: ( 'name' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:7:9: 'name'
            {
            match("name"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:8:7: ( '(' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:8:9: '('
            {
            match('('); 

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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:9:7: ( ')' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:9:9: ')'
            {
            match(')'); 

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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:10:7: ( '=' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:10:9: '='
            {
            match('='); 

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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:11:7: ( 'packages' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:11:9: 'packages'
            {
            match("packages"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:12:7: ( 'subPackages' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:12:9: 'subPackages'
            {
            match("subPackages"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:13:7: ( 'metamodel' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:13:9: 'metamodel'
            {
            match("metamodel"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:14:7: ( 'superPackage' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:14:9: 'superPackage'
            {
            match("superPackage"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:15:7: ( 'classes' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:15:9: 'classes'
            {
            match("classes"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:16:7: ( '@MPNs@' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:16:9: '@MPNs@'
            {
            match("@MPNs@"); 


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
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:17:7: ( 'MPNs' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:17:9: 'MPNs'
            {
            match("MPNs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:129:8: ( '\\u0022' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:129:10: '\\u0022'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQUOTE"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:130:8: ( '\\u003A' )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:130:10: '\\u003A'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:131:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '@' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | COLON | '+' | '@' )* )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:131:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '@' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | COLON | '+' | '@' )*
            {
            if ( input.LA(1)=='+'||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:131:50: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' | COLON | '+' | '@' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='+'||LA1_0=='-'||(LA1_0>='0' && LA1_0<=':')||(LA1_0>='@' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='+'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:132:8: ( DQUOTE ( options {greedy=false; } : . )* DQUOTE )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:132:10: DQUOTE ( options {greedy=false; } : . )* DQUOTE
            {
            mDQUOTE(); 
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:132:17: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\"') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:132:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mDQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:133:8: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:133:10: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:133:10: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | DQUOTE | COLON | ID | STRING | WS )
        int alt4=20;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:99: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 17 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:106: COLON
                {
                mCOLON(); 

                }
                break;
            case 18 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:112: ID
                {
                mID(); 

                }
                break;
            case 19 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:115: STRING
                {
                mSTRING(); 

                }
                break;
            case 20 :
                // /Users/jlcanovas/Desktop/eclipse-3.5-64b/workspace/Grammar2Model.examples.Maude2Model/files/src/scripts/Island.g:1:122: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\21\3\uffff\1\21\3\uffff\6\21\1\33\3\uffff\1\35\7\21\3"+
        "\uffff\10\21\1\56\6\21\1\65\1\uffff\6\21\1\uffff\5\21\1\101\4\21"+
        "\1\106\1\uffff\1\107\3\21\2\uffff\2\21\1\115\2\21\1\uffff\1\120"+
        "\1\21\1\uffff\1\122\1\uffff";
    static final String DFA4_eofS =
        "\123\uffff";
    static final String DFA4_minS =
        "\1\11\1\161\3\uffff\1\141\3\uffff\1\141\1\165\1\145\1\154\1\115"+
        "\1\120\1\0\3\uffff\1\43\1\155\1\143\1\142\1\164\1\141\1\120\1\116"+
        "\3\uffff\1\145\1\153\1\120\1\145\1\141\1\163\1\116\1\163\1\43\2"+
        "\141\1\162\1\155\2\163\1\43\1\uffff\1\147\1\143\1\120\1\157\1\145"+
        "\1\100\1\uffff\1\145\1\153\1\141\1\144\1\163\1\43\1\163\1\141\1"+
        "\143\1\145\1\43\1\uffff\1\43\1\147\1\153\1\154\2\uffff\1\145\1\141"+
        "\1\43\1\163\1\147\1\uffff\1\43\1\145\1\uffff\1\43\1\uffff";
    static final String DFA4_maxS =
        "\1\172\1\161\3\uffff\1\141\3\uffff\1\141\1\165\1\145\1\154\1\115"+
        "\1\120\1\uffff\3\uffff\1\172\1\155\1\143\1\160\1\164\1\141\1\120"+
        "\1\116\3\uffff\1\145\1\153\1\120\1\145\1\141\1\163\1\116\1\163\1"+
        "\172\2\141\1\162\1\155\2\163\1\172\1\uffff\1\147\1\143\1\120\1\157"+
        "\1\145\1\100\1\uffff\1\145\1\153\1\141\1\144\1\163\1\172\1\163\1"+
        "\141\1\143\1\145\1\172\1\uffff\1\172\1\147\1\153\1\154\2\uffff\1"+
        "\145\1\141\1\172\1\163\1\147\1\uffff\1\172\1\145\1\uffff\1\172\1"+
        "\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\7\uffff\1\21\1\22\1\24"+
        "\10\uffff\1\20\1\23\1\1\20\uffff\1\5\6\uffff\1\17\13\uffff\1\16"+
        "\4\uffff\1\15\1\11\5\uffff\1\13\2\uffff\1\12\1\uffff\1\14";
    static final String DFA4_specialS =
        "\17\uffff\1\0\103\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\17\5\uffff\1\6\1"+
            "\7\1\uffff\1\21\2\uffff\1\2\13\uffff\1\20\2\uffff\1\10\2\uffff"+
            "\1\15\14\21\1\16\15\21\1\3\1\uffff\1\4\1\uffff\1\21\1\uffff"+
            "\2\21\1\14\1\21\1\1\7\21\1\13\1\5\1\21\1\11\2\21\1\12\7\21",
            "\1\23",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\0\34",
            "",
            "",
            "",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\36",
            "\1\37",
            "\1\40\15\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\116",
            "\1\117",
            "",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            "\1\121",
            "",
            "\2\21\6\uffff\1\21\1\uffff\1\21\2\uffff\13\21\5\uffff\33\21"+
            "\4\uffff\1\21\1\uffff\32\21",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | DQUOTE | COLON | ID | STRING | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_15 = input.LA(1);

                        s = -1;
                        if ( ((LA4_15>='\u0000' && LA4_15<='\uFFFF')) ) {s = 28;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}