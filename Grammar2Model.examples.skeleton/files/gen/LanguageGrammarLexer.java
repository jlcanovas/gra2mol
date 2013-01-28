// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/LanguageGrammar.g 2011-12-05 16:50:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LanguageGrammarLexer extends Lexer {
    public static final int WS=6;
    public static final int LINE_COMMENT=8;
    public static final int DQUOTE=5;
    public static final int DQVAL=4;
    public static final int COMMENT=7;
    public static final int EOF=-1;
    public static final int T__9=9;

    // delegates
    // delegators

    public LanguageGrammarLexer() {;} 
    public LanguageGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LanguageGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "files/gen/LanguageGrammar.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:3:6: ( 'print' )
            // files/gen/LanguageGrammar.g:3:8: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "DQUOTE"
    public final void mDQUOTE() throws RecognitionException {
        try {
            int _type = DQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:95:8: ( '\\u0022' )
            // files/gen/LanguageGrammar.g:95:10: '\\u0022'
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

    // $ANTLR start "DQVAL"
    public final void mDQVAL() throws RecognitionException {
        try {
            int _type = DQVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:96:8: ( DQUOTE ( options {greedy=false; } : . )* DQUOTE )
            // files/gen/LanguageGrammar.g:96:10: DQUOTE ( options {greedy=false; } : . )* DQUOTE
            {
            mDQUOTE(); 
            // files/gen/LanguageGrammar.g:96:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // files/gen/LanguageGrammar.g:96:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "DQVAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:98:8: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // files/gen/LanguageGrammar.g:98:10: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // files/gen/LanguageGrammar.g:98:10: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // files/gen/LanguageGrammar.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:100:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // files/gen/LanguageGrammar.g:100:7: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // files/gen/LanguageGrammar.g:100:12: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // files/gen/LanguageGrammar.g:100:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/LanguageGrammar.g:104:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // files/gen/LanguageGrammar.g:104:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // files/gen/LanguageGrammar.g:104:12: (~ ( '\\n' | '\\r' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // files/gen/LanguageGrammar.g:104:12: ~ ( '\\n' | '\\r' )
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
            	    break loop4;
                }
            } while (true);

            // files/gen/LanguageGrammar.g:104:26: ( '\\r' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // files/gen/LanguageGrammar.g:104:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // files/gen/LanguageGrammar.g:1:8: ( T__9 | DQUOTE | DQVAL | WS | COMMENT | LINE_COMMENT )
        int alt6=6;
        switch ( input.LA(1) ) {
        case 'p':
            {
            alt6=1;
            }
            break;
        case '\"':
            {
            int LA6_2 = input.LA(2);

            if ( ((LA6_2>='\u0000' && LA6_2<='\uFFFF')) ) {
                alt6=3;
            }
            else {
                alt6=2;}
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=4;
            }
            break;
        case '/':
            {
            int LA6_4 = input.LA(2);

            if ( (LA6_4=='*') ) {
                alt6=5;
            }
            else if ( (LA6_4=='/') ) {
                alt6=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 4, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // files/gen/LanguageGrammar.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // files/gen/LanguageGrammar.g:1:15: DQUOTE
                {
                mDQUOTE(); 

                }
                break;
            case 3 :
                // files/gen/LanguageGrammar.g:1:22: DQVAL
                {
                mDQVAL(); 

                }
                break;
            case 4 :
                // files/gen/LanguageGrammar.g:1:28: WS
                {
                mWS(); 

                }
                break;
            case 5 :
                // files/gen/LanguageGrammar.g:1:31: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 6 :
                // files/gen/LanguageGrammar.g:1:39: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


 

}