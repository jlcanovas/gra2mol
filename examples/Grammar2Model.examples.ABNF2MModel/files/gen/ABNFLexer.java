// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3 2009-05-13 11:37:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ABNFLexer extends Lexer {
    public static final int WS=8;
    public static final int ARROW=5;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int ABSTRACT=7;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T9=9;
    public static final int T15=15;
    public static final int ID=6;
    public static final int Tokens=18;
    public static final int T16=16;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int DOUBLEARROW=4;
    public ABNFLexer() {;} 
    public ABNFLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:3:4: ( ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:3:6: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:4:5: ( '[' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:4:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:5:5: ( '<' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:5:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:6:5: ( ':' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:6:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:7:5: ( '>' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:7:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:8:5: ( '*' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:8:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:9:5: ( '+' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:9:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:10:5: ( '?' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:10:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:11:5: ( ']' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:11:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start ABSTRACT
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:349:10: ( '!' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:349:12: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ABSTRACT

    // $ANTLR start ARROW
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:350:8: ( '->' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:350:10: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARROW

    // $ANTLR start DOUBLEARROW
    public final void mDOUBLEARROW() throws RecognitionException {
        try {
            int _type = DOUBLEARROW;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:351:13: ( '=>' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:351:15: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLEARROW

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:352:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:352:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:352:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='#' && LA1_0<='$')||LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:353:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:353:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:353:9: ( ' ' | '\\t' | '\\n' | '\\r' )+
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
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


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

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | ABSTRACT | ARROW | DOUBLEARROW | ID | WS )
        int alt3=14;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt3=1;
            }
            break;
        case '[':
            {
            alt3=2;
            }
            break;
        case '<':
            {
            alt3=3;
            }
            break;
        case ':':
            {
            alt3=4;
            }
            break;
        case '>':
            {
            alt3=5;
            }
            break;
        case '*':
            {
            alt3=6;
            }
            break;
        case '+':
            {
            alt3=7;
            }
            break;
        case '?':
            {
            alt3=8;
            }
            break;
        case ']':
            {
            alt3=9;
            }
            break;
        case '!':
            {
            alt3=10;
            }
            break;
        case '-':
            {
            alt3=11;
            }
            break;
        case '=':
            {
            alt3=12;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
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
            alt3=13;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | ABSTRACT | ARROW | DOUBLEARROW | ID | WS );", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:37: T16
                {
                mT16(); 

                }
                break;
            case 9 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:41: T17
                {
                mT17(); 

                }
                break;
            case 10 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:45: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 11 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:54: ARROW
                {
                mARROW(); 

                }
                break;
            case 12 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:60: DOUBLEARROW
                {
                mDOUBLEARROW(); 

                }
                break;
            case 13 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:72: ID
                {
                mID(); 

                }
                break;
            case 14 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3:1:75: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}