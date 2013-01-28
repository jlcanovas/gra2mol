// $ANTLR 3.2 Sep 23, 2009 12:02:23 gra2mol/gen/Company.g 2012-03-07 11:09:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CompanyLexer extends Lexer {
    public static final int WS=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int FLOAT=5;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int STRING=4;

    // delegates
    // delegators

    public CompanyLexer() {;} 
    public CompanyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CompanyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "gra2mol/gen/Company.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:3:6: ( 'company' )
            // gra2mol/gen/Company.g:3:8: 'company'
            {
            match("company"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:4:6: ( '{' )
            // gra2mol/gen/Company.g:4:8: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:5:6: ( '}' )
            // gra2mol/gen/Company.g:5:8: '}'
            {
            match('}'); 

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
            // gra2mol/gen/Company.g:6:7: ( 'department' )
            // gra2mol/gen/Company.g:6:9: 'department'
            {
            match("department"); 


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
            // gra2mol/gen/Company.g:7:7: ( 'manager' )
            // gra2mol/gen/Company.g:7:9: 'manager'
            {
            match("manager"); 


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
            // gra2mol/gen/Company.g:8:7: ( 'employee' )
            // gra2mol/gen/Company.g:8:9: 'employee'
            {
            match("employee"); 


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
            // gra2mol/gen/Company.g:9:7: ( 'address' )
            // gra2mol/gen/Company.g:9:9: 'address'
            {
            match("address"); 


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
            // gra2mol/gen/Company.g:10:7: ( 'salary' )
            // gra2mol/gen/Company.g:10:9: 'salary'
            {
            match("salary"); 


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
            // gra2mol/gen/Company.g:11:7: ( 'mentor' )
            // gra2mol/gen/Company.g:11:9: 'mentor'
            {
            match("mentor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:331:9: ( '\"' (~ '\"' )* '\"' )
            // gra2mol/gen/Company.g:331:13: '\"' (~ '\"' )* '\"'
            {
            match('\"'); 
            // gra2mol/gen/Company.g:331:17: (~ '\"' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // gra2mol/gen/Company.g:331:18: ~ '\"'
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
            	    break loop1;
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
    // $ANTLR end "STRING"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:332:9: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // gra2mol/gen/Company.g:332:13: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // gra2mol/gen/Company.g:332:13: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // gra2mol/gen/Company.g:332:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            // gra2mol/gen/Company.g:332:25: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // gra2mol/gen/Company.g:332:26: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // gra2mol/gen/Company.g:332:30: ( '0' .. '9' )+
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
                    	    // gra2mol/gen/Company.g:332:31: '0' .. '9'
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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // gra2mol/gen/Company.g:333:9: ( ( ' ' | ( '\\r' )? '\\n' | '\\t' )+ )
            // gra2mol/gen/Company.g:333:13: ( ' ' | ( '\\r' )? '\\n' | '\\t' )+
            {
            // gra2mol/gen/Company.g:333:13: ( ' ' | ( '\\r' )? '\\n' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt6=1;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt6=2;
                    }
                    break;
                case '\t':
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // gra2mol/gen/Company.g:333:14: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // gra2mol/gen/Company.g:333:18: ( '\\r' )? '\\n'
            	    {
            	    // gra2mol/gen/Company.g:333:18: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // gra2mol/gen/Company.g:333:18: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // gra2mol/gen/Company.g:333:29: '\\t'
            	    {
            	    match('\t'); 

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

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // gra2mol/gen/Company.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | STRING | FLOAT | WS )
        int alt7=12;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // gra2mol/gen/Company.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // gra2mol/gen/Company.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // gra2mol/gen/Company.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // gra2mol/gen/Company.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // gra2mol/gen/Company.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // gra2mol/gen/Company.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // gra2mol/gen/Company.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // gra2mol/gen/Company.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // gra2mol/gen/Company.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // gra2mol/gen/Company.g:1:61: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // gra2mol/gen/Company.g:1:68: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 12 :
                // gra2mol/gen/Company.g:1:74: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\11\4\uffff\1\141\10\uffff";
    static final String DFA7_maxS =
        "\1\175\4\uffff\1\145\10\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\12\1\13\1\14\1\5"+
        "\1\11";
    static final String DFA7_specialS =
        "\16\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\13\2\uffff\1\13\22\uffff\1\13\1\uffff\1\11\15\uffff\12\12"+
            "\47\uffff\1\7\1\uffff\1\1\1\4\1\6\7\uffff\1\5\5\uffff\1\10\7"+
            "\uffff\1\2\1\uffff\1\3",
            "",
            "",
            "",
            "",
            "\1\14\3\uffff\1\15",
            "",
            "",
            "",
            "",
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
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | STRING | FLOAT | WS );";
        }
    }
 

}