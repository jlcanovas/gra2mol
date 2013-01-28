// $ANTLR 3.2 Sep 23, 2009 12:02:23 api2mol.g 2010-04-14 09:48:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class api2molLexer extends Lexer {
    public static final int COLON=4;
    public static final int RPAREN=11;
    public static final int WS=16;
    public static final int SLASH=13;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int LINE_COMMENT=15;
    public static final int COMMA=10;
    public static final int RCURLY=6;
    public static final int LCURLY=5;
    public static final int ID=7;
    public static final int DOT=8;
    public static final int COMMENT=14;
    public static final int EOF=-1;
    public static final int SEMI=12;
    public static final int LPAREN=9;

    // delegates
    // delegators

    public api2molLexer() {;} 
    public api2molLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public api2molLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "api2mol.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:3:7: ( '@new' )
            // api2mol.g:3:9: '@new'
            {
            match("@new"); 


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
            // api2mol.g:4:7: ( '@multiple' )
            // api2mol.g:4:9: '@multiple'
            {
            match("@multiple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:510:8: ( '\\u005C' )
            // api2mol.g:510:10: '\\u005C'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:511:8: ( '\\u002C' )
            // api2mol.g:511:10: '\\u002C'
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:512:8: ( '\\u003B' )
            // api2mol.g:512:10: '\\u003B'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:513:8: ( '\\u003A' )
            // api2mol.g:513:10: '\\u003A'
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

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:514:8: ( '\\u0028' )
            // api2mol.g:514:10: '\\u0028'
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:515:8: ( '\\u0029' )
            // api2mol.g:515:10: '\\u0029'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:516:8: ( '\\u007B' )
            // api2mol.g:516:10: '\\u007B'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:517:8: ( '\\u007D' )
            // api2mol.g:517:10: '\\u007D'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:518:8: ( '\\u002E' )
            // api2mol.g:518:10: '\\u002E'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:519:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // api2mol.g:519:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // api2mol.g:519:38: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // api2mol.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:521:11: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // api2mol.g:521:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // api2mol.g:521:21: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // api2mol.g:521:49: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // api2mol.g:522:15: ( '--' (~ ( '\\n' | '\\r' ) )* '\\n' )
            // api2mol.g:522:18: '--' (~ ( '\\n' | '\\r' ) )* '\\n'
            {
            match("--"); 

            // api2mol.g:522:23: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // api2mol.g:522:23: ~ ( '\\n' | '\\r' )
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
            	    break loop3;
                }
            } while (true);

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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // api2mol.g:523:8: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // api2mol.g:523:12: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

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
        // api2mol.g:1:8: ( T__17 | T__18 | SLASH | COMMA | SEMI | COLON | LPAREN | RPAREN | LCURLY | RCURLY | DOT | ID | COMMENT | LINE_COMMENT | WS )
        int alt4=15;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // api2mol.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // api2mol.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // api2mol.g:1:22: SLASH
                {
                mSLASH(); 

                }
                break;
            case 4 :
                // api2mol.g:1:28: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 5 :
                // api2mol.g:1:34: SEMI
                {
                mSEMI(); 

                }
                break;
            case 6 :
                // api2mol.g:1:39: COLON
                {
                mCOLON(); 

                }
                break;
            case 7 :
                // api2mol.g:1:45: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 8 :
                // api2mol.g:1:52: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 9 :
                // api2mol.g:1:59: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 10 :
                // api2mol.g:1:66: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 11 :
                // api2mol.g:1:73: DOT
                {
                mDOT(); 

                }
                break;
            case 12 :
                // api2mol.g:1:77: ID
                {
                mID(); 

                }
                break;
            case 13 :
                // api2mol.g:1:80: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 14 :
                // api2mol.g:1:88: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 15 :
                // api2mol.g:1:101: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\21\uffff";
    static final String DFA4_eofS =
        "\21\uffff";
    static final String DFA4_minS =
        "\1\11\1\155\17\uffff";
    static final String DFA4_maxS =
        "\1\175\1\156\17\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\1\1\1\2";
    static final String DFA4_specialS =
        "\21\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\7\uffff\1\6\1\7\2\uffff\1\3"+
            "\1\15\1\12\1\14\12\uffff\1\5\1\4\4\uffff\1\1\32\13\1\uffff\1"+
            "\2\2\uffff\1\13\1\uffff\32\13\1\10\1\uffff\1\11",
            "\1\20\1\17",
            "",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__17 | T__18 | SLASH | COMMA | SEMI | COLON | LPAREN | RPAREN | LCURLY | RCURLY | DOT | ID | COMMENT | LINE_COMMENT | WS );";
        }
    }
 

}