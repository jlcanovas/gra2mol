// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/json.g 2012-02-21 18:30:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class jsonLexer extends Lexer {
    public static final int WS=7;
    public static final int T__15=15;
    public static final int LINE_COMMENT=9;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int DQVALUE=5;
    public static final int ID=4;
    public static final int COMMENT=8;
    public static final int DOUBLEQUOTE=6;
    public static final int EOF=-1;

    // delegates
    // delegators

    public jsonLexer() {;} 
    public jsonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public jsonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "files/gen/json.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:3:7: ( '[' )
            // files/gen/json.g:3:9: '['
            {
            match('['); 

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
            // files/gen/json.g:4:7: ( ',' )
            // files/gen/json.g:4:9: ','
            {
            match(','); 

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
            // files/gen/json.g:5:7: ( ']' )
            // files/gen/json.g:5:9: ']'
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
            // files/gen/json.g:6:7: ( '{' )
            // files/gen/json.g:6:9: '{'
            {
            match('{'); 

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
            // files/gen/json.g:7:7: ( '}' )
            // files/gen/json.g:7:9: '}'
            {
            match('}'); 

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
            // files/gen/json.g:8:7: ( ':' )
            // files/gen/json.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:379:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* )
            // files/gen/json.g:379:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // files/gen/json.g:379:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // files/gen/json.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "DOUBLEQUOTE"
    public final void mDOUBLEQUOTE() throws RecognitionException {
        try {
            int _type = DOUBLEQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:380:12: ( '\\u0022' )
            // files/gen/json.g:380:15: '\\u0022'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLEQUOTE"

    // $ANTLR start "DQVALUE"
    public final void mDQVALUE() throws RecognitionException {
        try {
            int _type = DQVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:381:8: ( DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE )
            // files/gen/json.g:381:12: DOUBLEQUOTE ( options {greedy=false; } : . )* DOUBLEQUOTE
            {
            mDOUBLEQUOTE(); 
            // files/gen/json.g:381:24: ( options {greedy=false; } : . )*
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
            	    // files/gen/json.g:381:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mDOUBLEQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DQVALUE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:383:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // files/gen/json.g:383:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // files/gen/json.g:383:8: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
            	    // files/gen/json.g:
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/json.g:384:8: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // files/gen/json.g:384:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // files/gen/json.g:384:17: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // files/gen/json.g:384:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
            // files/gen/json.g:385:13: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // files/gen/json.g:385:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // files/gen/json.g:385:21: (~ ( '\\n' | '\\r' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // files/gen/json.g:385:21: ~ ( '\\n' | '\\r' )
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
            	    break loop5;
                }
            } while (true);

            // files/gen/json.g:385:35: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // files/gen/json.g:385:35: '\\r'
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
        // files/gen/json.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | DOUBLEQUOTE | DQVALUE | WS | COMMENT | LINE_COMMENT )
        int alt7=12;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // files/gen/json.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // files/gen/json.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // files/gen/json.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // files/gen/json.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // files/gen/json.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // files/gen/json.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // files/gen/json.g:1:46: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // files/gen/json.g:1:49: DOUBLEQUOTE
                {
                mDOUBLEQUOTE(); 

                }
                break;
            case 9 :
                // files/gen/json.g:1:61: DQVALUE
                {
                mDQVALUE(); 

                }
                break;
            case 10 :
                // files/gen/json.g:1:69: WS
                {
                mWS(); 

                }
                break;
            case 11 :
                // files/gen/json.g:1:72: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 12 :
                // files/gen/json.g:1:80: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\10\uffff\1\13\6\uffff";
    static final String DFA7_eofS =
        "\17\uffff";
    static final String DFA7_minS =
        "\1\11\7\uffff\1\0\1\uffff\1\52\4\uffff";
    static final String DFA7_maxS =
        "\1\175\7\uffff\1\uffff\1\uffff\1\57\4\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\uffff\1\10\1"+
        "\11\1\13\1\14";
    static final String DFA7_specialS =
        "\10\uffff\1\0\6\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\1\uffff\1\10\11\uffff\1\2\2"+
            "\uffff\1\12\12\uffff\1\6\6\uffff\32\7\1\1\1\uffff\1\3\3\uffff"+
            "\32\7\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\14",
            "",
            "\1\15\4\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | ID | DOUBLEQUOTE | DQVALUE | WS | COMMENT | LINE_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_8 = input.LA(1);

                        s = -1;
                        if ( ((LA7_8>='\u0000' && LA7_8<='\uFFFF')) ) {s = 12;}

                        else s = 11;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}