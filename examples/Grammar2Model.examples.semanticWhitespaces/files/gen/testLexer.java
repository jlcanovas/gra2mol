// $ANTLR 3.2 Sep 23, 2009 12:02:23 files/gen/test.g 2012-05-23 14:51:12

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testLexer extends Lexer {
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;

    // delegates
    // delegators

    public testLexer() {;} 
    public testLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public testLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "files/gen/test.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/test.g:3:6: ( 'HOLA' )
            // files/gen/test.g:3:8: 'HOLA'
            {
            match("HOLA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/test.g:4:6: ( ' ' )
            // files/gen/test.g:4:8: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/test.g:5:6: ( ';' )
            // files/gen/test.g:5:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // files/gen/test.g:76:3: ( ( 'a' .. 'z' ) ( 'a' .. 'z' )* )
            // files/gen/test.g:76:5: ( 'a' .. 'z' ) ( 'a' .. 'z' )*
            {
            // files/gen/test.g:76:5: ( 'a' .. 'z' )
            // files/gen/test.g:76:6: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // files/gen/test.g:76:16: ( 'a' .. 'z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // files/gen/test.g:76:17: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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

    public void mTokens() throws RecognitionException {
        // files/gen/test.g:1:8: ( T__5 | T__6 | T__7 | ID )
        int alt2=4;
        switch ( input.LA(1) ) {
        case 'H':
            {
            alt2=1;
            }
            break;
        case ' ':
            {
            alt2=2;
            }
            break;
        case ';':
            {
            alt2=3;
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt2=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // files/gen/test.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // files/gen/test.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // files/gen/test.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // files/gen/test.g:1:25: ID
                {
                mID(); 

                }
                break;

        }

    }


 

}