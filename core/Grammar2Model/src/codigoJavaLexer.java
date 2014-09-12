// $ANTLR 3.2 Sep 23, 2009 12:02:23 codigoJava.g 2012-05-14 12:46:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class codigoJavaLexer extends Lexer {
    public static final int WS=6;
    public static final int COMILLA_DOBLE=5;
    public static final int ID=4;
    public static final int EOF=-1;

    // delegates
    // delegators

    public codigoJavaLexer() {;} 
    public codigoJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public codigoJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "codigoJava.g"; }

    // $ANTLR start "COMILLA_DOBLE"
    public final void mCOMILLA_DOBLE() throws RecognitionException {
        try {
            int _type = COMILLA_DOBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // codigoJava.g:124:2: ( '\\\"' )
            // codigoJava.g:124:4: '\\\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMILLA_DOBLE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // codigoJava.g:127:5: ( ( ' ' | '!' | '#' .. '~' )* )
            // codigoJava.g:127:7: ( ' ' | '!' | '#' .. '~' )*
            {
            // codigoJava.g:127:7: ( ' ' | '!' | '#' .. '~' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=' ' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='~')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // codigoJava.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='~') ) {
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // codigoJava.g:129:5: ( ( '\\t' | '\\n' | '\\r' )+ )
            // codigoJava.g:129:7: ( '\\t' | '\\n' | '\\r' )+
            {
            // codigoJava.g:129:7: ( '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // codigoJava.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r' ) {
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

    public void mTokens() throws RecognitionException {
        // codigoJava.g:1:8: ( COMILLA_DOBLE | ID | WS )
        int alt3=3;
        switch ( input.LA(1) ) {
        case '\"':
            {
            alt3=1;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
            {
            alt3=3;
            }
            break;
        default:
            alt3=2;}

        switch (alt3) {
            case 1 :
                // codigoJava.g:1:10: COMILLA_DOBLE
                {
                mCOMILLA_DOBLE(); 

                }
                break;
            case 2 :
                // codigoJava.g:1:24: ID
                {
                mID(); 

                }
                break;
            case 3 :
                // codigoJava.g:1:27: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}