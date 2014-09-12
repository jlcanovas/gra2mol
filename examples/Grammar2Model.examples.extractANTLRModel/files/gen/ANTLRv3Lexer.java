// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3 2009-01-12 17:09:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ANTLRv3Lexer extends Lexer {
    public static final int BACKTRACK_SEMPRED=35;
    public static final int DOUBLE_ANGLE_STRING_LITERAL=51;
    public static final int LEXER_GRAMMAR=24;
    public static final int EOA=19;
    public static final int ARGLIST=22;
    public static final int EOF=-1;
    public static final int SEMPRED=32;
    public static final int ACTION=45;
    public static final int EOB=18;
    public static final int TOKEN_REF=42;
    public static final int RET=23;
    public static final int STRING_LITERAL=43;
    public static final int ARG=21;
    public static final int EOR=17;
    public static final int ARG_ACTION=48;
    public static final int DOUBLE_QUOTE_STRING_LITERAL=50;
    public static final int NESTED_ARG_ACTION=58;
    public static final int ACTION_CHAR_LITERAL=60;
    public static final int INITACTION=28;
    public static final int RULE=7;
    public static final int ACTION_ESC=62;
    public static final int PARSER_GRAMMAR=25;
    public static final int SRC=52;
    public static final int CHAR_RANGE=14;
    public static final int INT=47;
    public static final int EPSILON=15;
    public static final int REWRITE=40;
    public static final int WS=64;
    public static final int COMBINED_GRAMMAR=27;
    public static final int LEXER=6;
    public static final int SL_COMMENT=53;
    public static final int TREE_GRAMMAR=26;
    public static final int CLOSURE=10;
    public static final int PARSER=5;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int NESTED_ACTION=61;
    public static final int T77=77;
    public static final int T78=78;
    public static final int ESC=56;
    public static final int FRAGMENT=36;
    public static final int ID=20;
    public static final int TREE_BEGIN=37;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int ML_COMMENT=54;
    public static final int T65=65;
    public static final int T66=66;
    public static final int ALT=16;
    public static final int T67=67;
    public static final int T68=68;
    public static final int SCOPE=31;
    public static final int T69=69;
    public static final int DOC_COMMENT=4;
    public static final int TOKENS=41;
    public static final int RANGE=13;
    public static final int WS_LOOP=63;
    public static final int GATED_SEMPRED=33;
    public static final int LITERAL_CHAR=55;
    public static final int BANG=39;
    public static final int ACTION_STRING_LITERAL=59;
    public static final int Tokens=94;
    public static final int T93=93;
    public static final int T92=92;
    public static final int ROOT=38;
    public static final int RULE_REF=49;
    public static final int T91=91;
    public static final int T90=90;
    public static final int SYNPRED=12;
    public static final int OPTIONAL=9;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int CHAR_LITERAL=44;
    public static final int T87=87;
    public static final int LABEL=29;
    public static final int TEMPLATE=30;
    public static final int SYN_SEMPRED=34;
    public static final int XDIGIT=57;
    public static final int BLOCK=8;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T83=83;
    public static final int T82=82;
    public static final int POSITIVE_CLOSURE=11;
    public static final int OPTIONS=46;
    public ANTLRv3Lexer() {;} 
    public ANTLRv3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3"; }

    // $ANTLR start SCOPE
    public final void mSCOPE() throws RecognitionException {
        try {
            int _type = SCOPE;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3:7: ( 'scope' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3:9: 'scope'
            {
            match("scope"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SCOPE

    // $ANTLR start FRAGMENT
    public final void mFRAGMENT() throws RecognitionException {
        try {
            int _type = FRAGMENT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:4:10: ( 'fragment' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:4:12: 'fragment'
            {
            match("fragment"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FRAGMENT

    // $ANTLR start TREE_BEGIN
    public final void mTREE_BEGIN() throws RecognitionException {
        try {
            int _type = TREE_BEGIN;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:5:12: ( '^(' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:5:14: '^('
            {
            match("^("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TREE_BEGIN

    // $ANTLR start ROOT
    public final void mROOT() throws RecognitionException {
        try {
            int _type = ROOT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:6:6: ( '^' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:6:8: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ROOT

    // $ANTLR start BANG
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:7:6: ( '!' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:7:8: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BANG

    // $ANTLR start RANGE
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:8:7: ( '..' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:8:9: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RANGE

    // $ANTLR start REWRITE
    public final void mREWRITE() throws RecognitionException {
        try {
            int _type = REWRITE;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:9:9: ( '->' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:9:11: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end REWRITE

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:10:5: ( 'lexer' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:10:7: 'lexer'
            {
            match("lexer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:11:5: ( 'parser' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:11:7: 'parser'
            {
            match("parser"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:12:5: ( 'tree' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:12:7: 'tree'
            {
            match("tree"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:13:5: ( 'grammar' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:13:7: 'grammar'
            {
            match("grammar"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:14:5: ( ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:14:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:15:5: ( '}' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:15:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:16:5: ( '=' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:16:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:17:5: ( '@' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:17:7: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:18:5: ( '::' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:18:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:19:5: ( '*' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:19:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:20:5: ( 'protected' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:20:7: 'protected'
            {
            match("protected"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:21:5: ( 'public' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:21:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:22:5: ( 'private' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:22:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:23:5: ( 'returns' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:23:7: 'returns'
            {
            match("returns"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:24:5: ( ':' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:24:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:25:5: ( 'throws' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:25:7: 'throws'
            {
            match("throws"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:26:5: ( ',' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:26:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:27:5: ( '(' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:27:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:28:5: ( '|' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:28:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:29:5: ( ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:29:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:30:5: ( 'catch' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:30:7: 'catch'
            {
            match("catch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:31:5: ( 'finally' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:31:7: 'finally'
            {
            match("finally"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:32:5: ( '+=' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:32:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:33:5: ( '=>' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:33:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:34:5: ( '~' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:34:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:35:5: ( '?' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:35:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:36:5: ( '+' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:36:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:37:5: ( '.' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:37:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:38:5: ( '$' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:38:7: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start SL_COMMENT
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3051:3: ( '//' ( ' $ANTLR ' SRC | (~ ( '\\r' | '\\n' ) )* ) ( '\\r' )? '\\n' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3051:5: '//' ( ' $ANTLR ' SRC | (~ ( '\\r' | '\\n' ) )* ) ( '\\r' )? '\\n'
            {
            match("//"); 

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3052:5: ( ' $ANTLR ' SRC | (~ ( '\\r' | '\\n' ) )* )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3052:7: ' $ANTLR ' SRC
                    {
                    match(" $ANTLR "); 

                    mSRC(); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3053:6: (~ ( '\\r' | '\\n' ) )*
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3053:6: (~ ( '\\r' | '\\n' ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFE')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3053:6: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
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
                    break;

            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3055:3: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3055:3: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SL_COMMENT

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3060:2: ( '/*' ( . )* '*/' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3060:4: '/*' ( . )* '*/'
            {
            match("/*"); 

            if (input.LA(1)=='*') _type=DOC_COMMENT; else channel=HIDDEN;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3060:74: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFE')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3060:74: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start CHAR_LITERAL
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3064:2: ( '\\'' LITERAL_CHAR '\\'' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3064:4: '\\'' LITERAL_CHAR '\\''
            {
            match('\''); 
            mLITERAL_CHAR(); 
            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR_LITERAL

    // $ANTLR start STRING_LITERAL
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3068:2: ( '\\'' LITERAL_CHAR ( LITERAL_CHAR )* '\\'' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3068:4: '\\'' LITERAL_CHAR ( LITERAL_CHAR )* '\\''
            {
            match('\''); 
            mLITERAL_CHAR(); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3068:22: ( LITERAL_CHAR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3068:22: LITERAL_CHAR
            	    {
            	    mLITERAL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_LITERAL

    // $ANTLR start LITERAL_CHAR
    public final void mLITERAL_CHAR() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3073:2: ( ESC | ~ ( '\\'' | '\\\\' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFE')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3071:1: fragment LITERAL_CHAR : ( ESC | ~ ( '\\'' | '\\\\' ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3073:4: ESC
                    {
                    mESC(); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3074:4: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end LITERAL_CHAR

    // $ANTLR start DOUBLE_QUOTE_STRING_LITERAL
    public final void mDOUBLE_QUOTE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE_STRING_LITERAL;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3078:2: ( '\"' ( LITERAL_CHAR )* '\"' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3078:4: '\"' ( LITERAL_CHAR )* '\"'
            {
            match('\"'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3078:8: ( LITERAL_CHAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\"') ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>='\u0000' && LA7_1<='&')||(LA7_1>='(' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3078:8: LITERAL_CHAR
            	    {
            	    mLITERAL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_QUOTE_STRING_LITERAL

    // $ANTLR start DOUBLE_ANGLE_STRING_LITERAL
    public final void mDOUBLE_ANGLE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = DOUBLE_ANGLE_STRING_LITERAL;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3082:2: ( '<<' ( . )* '>>' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3082:4: '<<' ( . )* '>>'
            {
            match("<<"); 

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3082:9: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='>') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='>') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='=')||(LA8_1>='?' && LA8_1<='\uFFFE')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='=')||(LA8_0>='?' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3082:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE_ANGLE_STRING_LITERAL

    // $ANTLR start ESC
    public final void mESC() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3086:5: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . ) )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3086:7: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . )
            {
            match('\\'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3087:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . )
            int alt9=11;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='n') ) {
                alt9=1;
            }
            else if ( (LA9_0=='r') ) {
                alt9=2;
            }
            else if ( (LA9_0=='t') ) {
                alt9=3;
            }
            else if ( (LA9_0=='b') ) {
                alt9=4;
            }
            else if ( (LA9_0=='f') ) {
                alt9=5;
            }
            else if ( (LA9_0=='\"') ) {
                alt9=6;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=7;
            }
            else if ( (LA9_0=='\\') ) {
                alt9=8;
            }
            else if ( (LA9_0=='>') ) {
                alt9=9;
            }
            else if ( (LA9_0=='u') ) {
                int LA9_10 = input.LA(2);

                if ( ((LA9_10>='0' && LA9_10<='9')||(LA9_10>='A' && LA9_10<='F')||(LA9_10>='a' && LA9_10<='f')) ) {
                    alt9=10;
                }
                else {
                    alt9=11;}
            }
            else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='=')||(LA9_0>='?' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='a')||(LA9_0>='c' && LA9_0<='e')||(LA9_0>='g' && LA9_0<='m')||(LA9_0>='o' && LA9_0<='q')||LA9_0=='s'||(LA9_0>='v' && LA9_0<='\uFFFE')) ) {
                alt9=11;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3087:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' XDIGIT XDIGIT XDIGIT XDIGIT | . )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3087:5: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3088:5: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3089:5: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3090:5: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3091:5: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3092:5: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3093:5: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3094:5: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3095:5: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 10 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3096:5: 'u' XDIGIT XDIGIT XDIGIT XDIGIT
                    {
                    match('u'); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 
                    mXDIGIT(); 

                    }
                    break;
                case 11 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3097:5: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESC

    // $ANTLR start XDIGIT
    public final void mXDIGIT() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3102:8: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end XDIGIT

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3108:5: ( ( '0' .. '9' )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3108:7: ( '0' .. '9' )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3108:7: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3108:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start ARG_ACTION
    public final void mARG_ACTION() throws RecognitionException {
        try {
            int _type = ARG_ACTION;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3112:2: ( NESTED_ARG_ACTION )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3112:4: NESTED_ARG_ACTION
            {
            mNESTED_ARG_ACTION(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ARG_ACTION

    // $ANTLR start NESTED_ARG_ACTION
    public final void mNESTED_ARG_ACTION() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3116:19: ( '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )* ']' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3117:2: '[' ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )* ']'
            {
            match('['); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3118:2: ( options {greedy=false; k=1; } : NESTED_ARG_ACTION | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==']') ) {
                    alt11=5;
                }
                else if ( (LA11_0=='[') ) {
                    alt11=1;
                }
                else if ( (LA11_0=='\"') ) {
                    alt11=2;
                }
                else if ( (LA11_0=='\'') ) {
                    alt11=3;
                }
                else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='Z')||LA11_0=='\\'||(LA11_0>='^' && LA11_0<='\uFFFE')) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3119:4: NESTED_ARG_ACTION
            	    {
            	    mNESTED_ARG_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3120:4: ACTION_STRING_LITERAL
            	    {
            	    mACTION_STRING_LITERAL(); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3121:4: ACTION_CHAR_LITERAL
            	    {
            	    mACTION_CHAR_LITERAL(); 

            	    }
            	    break;
            	case 4 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3122:4: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(']'); 
            setText(getText().substring(1, getText().length()-1));

            }

        }
        finally {
        }
    }
    // $ANTLR end NESTED_ARG_ACTION

    // $ANTLR start ACTION
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3129:2: ( NESTED_ACTION ( '?' )? )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3129:4: NESTED_ACTION ( '?' )?
            {
            mNESTED_ACTION(); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3129:18: ( '?' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='?') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3129:20: '?'
                    {
                    match('?'); 
                    _type = SEMPRED;

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ACTION

    // $ANTLR start NESTED_ACTION
    public final void mNESTED_ACTION() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3133:15: ( '{' ( options {greedy=false; k=3; } : NESTED_ACTION | SL_COMMENT | ML_COMMENT | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )* '}' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3134:2: '{' ( options {greedy=false; k=3; } : NESTED_ACTION | SL_COMMENT | ML_COMMENT | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )* '}'
            {
            match('{'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3135:2: ( options {greedy=false; k=3; } : NESTED_ACTION | SL_COMMENT | ML_COMMENT | ACTION_STRING_LITERAL | ACTION_CHAR_LITERAL | . )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='}') ) {
                    alt13=7;
                }
                else if ( (LA13_0=='{') ) {
                    alt13=1;
                }
                else if ( (LA13_0=='/') ) {
                    int LA13_3 = input.LA(2);

                    if ( (LA13_3=='/') ) {
                        int LA13_7 = input.LA(3);

                        if ( (LA13_7=='/') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='*') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='}') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='{') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='\"') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='\'') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7==' ') ) {
                            alt13=2;
                        }
                        else if ( ((LA13_7>='\u0000' && LA13_7<='\t')||(LA13_7>='\u000B' && LA13_7<='\f')||(LA13_7>='\u000E' && LA13_7<='\u001F')||LA13_7=='!'||(LA13_7>='#' && LA13_7<='&')||(LA13_7>='(' && LA13_7<=')')||(LA13_7>='+' && LA13_7<='.')||(LA13_7>='0' && LA13_7<='z')||LA13_7=='|'||(LA13_7>='~' && LA13_7<='\uFFFE')) ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='\r') ) {
                            alt13=2;
                        }
                        else if ( (LA13_7=='\n') ) {
                            alt13=2;
                        }


                    }
                    else if ( (LA13_3=='*') ) {
                        int LA13_8 = input.LA(3);

                        if ( (LA13_8=='}') ) {
                            alt13=3;
                        }
                        else if ( (LA13_8=='{') ) {
                            alt13=3;
                        }
                        else if ( (LA13_8=='/') ) {
                            alt13=3;
                        }
                        else if ( (LA13_8=='\"') ) {
                            alt13=3;
                        }
                        else if ( (LA13_8=='\'') ) {
                            alt13=3;
                        }
                        else if ( (LA13_8=='*') ) {
                            alt13=3;
                        }
                        else if ( ((LA13_8>='\u0000' && LA13_8<='!')||(LA13_8>='#' && LA13_8<='&')||(LA13_8>='(' && LA13_8<=')')||(LA13_8>='+' && LA13_8<='.')||(LA13_8>='0' && LA13_8<='z')||LA13_8=='|'||(LA13_8>='~' && LA13_8<='\uFFFE')) ) {
                            alt13=3;
                        }


                    }
                    else if ( ((LA13_3>='\u0000' && LA13_3<=')')||(LA13_3>='+' && LA13_3<='.')||(LA13_3>='0' && LA13_3<='\uFFFE')) ) {
                        alt13=6;
                    }


                }
                else if ( (LA13_0=='\"') ) {
                    int LA13_4 = input.LA(2);

                    if ( (LA13_4=='}') ) {
                        alt13=6;
                    }
                    else if ( (LA13_4=='{') ) {
                        int LA13_15 = input.LA(3);

                        if ( (LA13_15=='}') ) {
                            alt13=4;
                        }
                        else if ( (LA13_15=='{') ) {
                            alt13=4;
                        }
                        else if ( (LA13_15=='/') ) {
                            alt13=4;
                        }
                        else if ( (LA13_15=='\"') ) {
                            alt13=4;
                        }
                        else if ( (LA13_15=='\'') ) {
                            alt13=4;
                        }
                        else if ( (LA13_15=='\\') ) {
                            alt13=4;
                        }
                        else if ( ((LA13_15>='\u0000' && LA13_15<='!')||(LA13_15>='#' && LA13_15<='&')||(LA13_15>='(' && LA13_15<='.')||(LA13_15>='0' && LA13_15<='[')||(LA13_15>=']' && LA13_15<='z')||LA13_15=='|'||(LA13_15>='~' && LA13_15<='\uFFFE')) ) {
                            alt13=4;
                        }


                    }
                    else if ( (LA13_4=='/') ) {
                        int LA13_16 = input.LA(3);

                        if ( (LA13_16=='/') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='*') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='}') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='{') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='\"') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='\'') ) {
                            alt13=4;
                        }
                        else if ( (LA13_16=='\\') ) {
                            alt13=4;
                        }
                        else if ( ((LA13_16>='\u0000' && LA13_16<='!')||(LA13_16>='#' && LA13_16<='&')||(LA13_16>='(' && LA13_16<=')')||(LA13_16>='+' && LA13_16<='.')||(LA13_16>='0' && LA13_16<='[')||(LA13_16>=']' && LA13_16<='z')||LA13_16=='|'||(LA13_16>='~' && LA13_16<='\uFFFE')) ) {
                            alt13=4;
                        }


                    }
                    else if ( (LA13_4=='\"') ) {
                        alt13=6;
                    }
                    else if ( (LA13_4=='\'') ) {
                        int LA13_18 = input.LA(3);

                        if ( (LA13_18=='}') ) {
                            alt13=4;
                        }
                        else if ( (LA13_18=='{') ) {
                            alt13=4;
                        }
                        else if ( (LA13_18=='/') ) {
                            alt13=4;
                        }
                        else if ( (LA13_18=='\"') ) {
                            alt13=4;
                        }
                        else if ( (LA13_18=='\'') ) {
                            alt13=4;
                        }
                        else if ( (LA13_18=='\\') ) {
                            alt13=4;
                        }
                        else if ( ((LA13_18>='\u0000' && LA13_18<='!')||(LA13_18>='#' && LA13_18<='&')||(LA13_18>='(' && LA13_18<='.')||(LA13_18>='0' && LA13_18<='[')||(LA13_18>=']' && LA13_18<='z')||LA13_18=='|'||(LA13_18>='~' && LA13_18<='\uFFFE')) ) {
                            alt13=4;
                        }


                    }
                    else if ( (LA13_4=='\\') ) {
                        int LA13_19 = input.LA(3);

                        if ( (LA13_19=='\'') ) {
                            alt13=4;
                        }
                        else if ( (LA13_19=='}') ) {
                            alt13=4;
                        }
                        else if ( (LA13_19=='\"') ) {
                            alt13=4;
                        }
                        else if ( (LA13_19=='{') ) {
                            alt13=4;
                        }
                        else if ( (LA13_19=='/') ) {
                            alt13=4;
                        }
                        else if ( ((LA13_19>='\u0000' && LA13_19<='!')||(LA13_19>='#' && LA13_19<='&')||(LA13_19>='(' && LA13_19<='.')||(LA13_19>='0' && LA13_19<='z')||LA13_19=='|'||(LA13_19>='~' && LA13_19<='\uFFFE')) ) {
                            alt13=4;
                        }


                    }
                    else if ( ((LA13_4>='\u0000' && LA13_4<='!')||(LA13_4>='#' && LA13_4<='&')||(LA13_4>='(' && LA13_4<='.')||(LA13_4>='0' && LA13_4<='[')||(LA13_4>=']' && LA13_4<='z')||LA13_4=='|'||(LA13_4>='~' && LA13_4<='\uFFFE')) ) {
                        int LA13_20 = input.LA(3);

                        if ( (LA13_20=='}') ) {
                            alt13=4;
                        }
                        else if ( (LA13_20=='{') ) {
                            alt13=4;
                        }
                        else if ( (LA13_20=='/') ) {
                            alt13=4;
                        }
                        else if ( (LA13_20=='\"') ) {
                            alt13=4;
                        }
                        else if ( (LA13_20=='\'') ) {
                            alt13=4;
                        }
                        else if ( (LA13_20=='\\') ) {
                            alt13=4;
                        }
                        else if ( ((LA13_20>='\u0000' && LA13_20<='!')||(LA13_20>='#' && LA13_20<='&')||(LA13_20>='(' && LA13_20<='.')||(LA13_20>='0' && LA13_20<='[')||(LA13_20>=']' && LA13_20<='z')||LA13_20=='|'||(LA13_20>='~' && LA13_20<='\uFFFE')) ) {
                            alt13=4;
                        }


                    }


                }
                else if ( (LA13_0=='\'') ) {
                    int LA13_5 = input.LA(2);

                    if ( (LA13_5=='}') ) {
                        alt13=6;
                    }
                    else if ( (LA13_5=='{') ) {
                        int LA13_22 = input.LA(3);

                        if ( ((LA13_22>='\u0000' && LA13_22<='&')||(LA13_22>='(' && LA13_22<='\uFFFE')) ) {
                            alt13=6;
                        }
                        else if ( (LA13_22=='\'') ) {
                            alt13=5;
                        }


                    }
                    else if ( (LA13_5=='/') ) {
                        int LA13_23 = input.LA(3);

                        if ( ((LA13_23>='\u0000' && LA13_23<='&')||(LA13_23>='(' && LA13_23<='\uFFFE')) ) {
                            alt13=6;
                        }
                        else if ( (LA13_23=='\'') ) {
                            alt13=5;
                        }


                    }
                    else if ( (LA13_5=='\"') ) {
                        int LA13_24 = input.LA(3);

                        if ( ((LA13_24>='\u0000' && LA13_24<='&')||(LA13_24>='(' && LA13_24<='\uFFFE')) ) {
                            alt13=6;
                        }
                        else if ( (LA13_24=='\'') ) {
                            alt13=5;
                        }


                    }
                    else if ( (LA13_5=='\'') ) {
                        alt13=6;
                    }
                    else if ( (LA13_5=='\\') ) {
                        int LA13_26 = input.LA(3);

                        if ( (LA13_26=='}') ) {
                            alt13=5;
                        }
                        else if ( (LA13_26=='\"') ) {
                            alt13=5;
                        }
                        else if ( (LA13_26=='\'') ) {
                            alt13=5;
                        }
                        else if ( (LA13_26=='{') ) {
                            alt13=5;
                        }
                        else if ( (LA13_26=='/') ) {
                            alt13=5;
                        }
                        else if ( ((LA13_26>='\u0000' && LA13_26<='!')||(LA13_26>='#' && LA13_26<='&')||(LA13_26>='(' && LA13_26<='.')||(LA13_26>='0' && LA13_26<='z')||LA13_26=='|'||(LA13_26>='~' && LA13_26<='\uFFFE')) ) {
                            alt13=5;
                        }


                    }
                    else if ( ((LA13_5>='\u0000' && LA13_5<='!')||(LA13_5>='#' && LA13_5<='&')||(LA13_5>='(' && LA13_5<='.')||(LA13_5>='0' && LA13_5<='[')||(LA13_5>=']' && LA13_5<='z')||LA13_5=='|'||(LA13_5>='~' && LA13_5<='\uFFFE')) ) {
                        int LA13_27 = input.LA(3);

                        if ( ((LA13_27>='\u0000' && LA13_27<='&')||(LA13_27>='(' && LA13_27<='\uFFFE')) ) {
                            alt13=6;
                        }
                        else if ( (LA13_27=='\'') ) {
                            alt13=5;
                        }


                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='.')||(LA13_0>='0' && LA13_0<='z')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFE')) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3136:4: NESTED_ACTION
            	    {
            	    mNESTED_ACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3137:4: SL_COMMENT
            	    {
            	    mSL_COMMENT(); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3138:4: ML_COMMENT
            	    {
            	    mML_COMMENT(); 

            	    }
            	    break;
            	case 4 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3139:4: ACTION_STRING_LITERAL
            	    {
            	    mACTION_STRING_LITERAL(); 

            	    }
            	    break;
            	case 5 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3140:4: ACTION_CHAR_LITERAL
            	    {
            	    mACTION_CHAR_LITERAL(); 

            	    }
            	    break;
            	case 6 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3141:4: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('}'); 
            channel = DEFAULT_TOKEN_CHANNEL;

            }

        }
        finally {
        }
    }
    // $ANTLR end NESTED_ACTION

    // $ANTLR start ACTION_CHAR_LITERAL
    public final void mACTION_CHAR_LITERAL() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3149:2: ( '\\'' ( ACTION_ESC | ~ ( '\\\\' | '\\'' ) ) '\\'' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3149:4: '\\'' ( ACTION_ESC | ~ ( '\\\\' | '\\'' ) ) '\\''
            {
            match('\''); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3149:9: ( ACTION_ESC | ~ ( '\\\\' | '\\'' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\\') ) {
                alt14=1;
            }
            else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFE')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3149:9: ( ACTION_ESC | ~ ( '\\\\' | '\\'' ) )", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3149:10: ACTION_ESC
                    {
                    mACTION_ESC(); 

                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3149:21: ~ ( '\\\\' | '\\'' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end ACTION_CHAR_LITERAL

    // $ANTLR start ACTION_STRING_LITERAL
    public final void mACTION_STRING_LITERAL() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3154:2: ( '\"' ( ACTION_ESC | ~ ( '\\\\' | '\"' ) )+ '\"' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3154:4: '\"' ( ACTION_ESC | ~ ( '\\\\' | '\"' ) )+ '\"'
            {
            match('\"'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3154:8: ( ACTION_ESC | ~ ( '\\\\' | '\"' ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\\') ) {
                    alt15=1;
                }
                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFE')) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3154:9: ACTION_ESC
            	    {
            	    mACTION_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3154:20: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end ACTION_STRING_LITERAL

    // $ANTLR start ACTION_ESC
    public final void mACTION_ESC() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3159:2: ( '\\\\\\'' | '\\\\\"' | '\\\\' ~ ( '\\'' | '\"' ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\\') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='\'') ) {
                    alt16=1;
                }
                else if ( ((LA16_1>='\u0000' && LA16_1<='!')||(LA16_1>='#' && LA16_1<='&')||(LA16_1>='(' && LA16_1<='\uFFFE')) ) {
                    alt16=3;
                }
                else if ( (LA16_1=='\"') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("3157:1: fragment ACTION_ESC : ( '\\\\\\'' | '\\\\\"' | '\\\\' ~ ( '\\'' | '\"' ) );", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3157:1: fragment ACTION_ESC : ( '\\\\\\'' | '\\\\\"' | '\\\\' ~ ( '\\'' | '\"' ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3159:4: '\\\\\\''
                    {
                    match("\\\'"); 


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3160:4: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3161:4: '\\\\' ~ ( '\\'' | '\"' )
                    {
                    match('\\'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end ACTION_ESC

    // $ANTLR start TOKEN_REF
    public final void mTOKEN_REF() throws RecognitionException {
        try {
            int _type = TOKEN_REF;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3165:2: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3165:4: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('A','Z'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3165:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop17;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKEN_REF

    // $ANTLR start RULE_REF
    public final void mRULE_REF() throws RecognitionException {
        try {
            int _type = RULE_REF;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3169:2: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3169:4: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            matchRange('a','z'); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3169:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop18;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_REF

    // $ANTLR start OPTIONS
    public final void mOPTIONS() throws RecognitionException {
        try {
            int _type = OPTIONS;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3176:2: ( 'options' WS_LOOP '{' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3176:4: 'options' WS_LOOP '{'
            {
            match("options"); 

            mWS_LOOP(); 
            match('{'); 
            channel=DEFAULT_TOKEN_CHANNEL;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OPTIONS

    // $ANTLR start TOKENS
    public final void mTOKENS() throws RecognitionException {
        try {
            int _type = TOKENS;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3180:2: ( 'tokens' WS_LOOP '{' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3180:4: 'tokens' WS_LOOP '{'
            {
            match("tokens"); 

            mWS_LOOP(); 
            match('{'); 
            channel=DEFAULT_TOKEN_CHANNEL;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TOKENS

    // $ANTLR start SRC
    public final void mSRC() throws RecognitionException {
        try {
            Token file=null;
            Token line=null;

            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3188:5: ( 'src' ' ' file= ACTION_STRING_LITERAL ' ' line= INT )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3188:7: 'src' ' ' file= ACTION_STRING_LITERAL ' ' line= INT
            {
            match("src"); 

            match(' '); 
            int fileStart970 = getCharIndex();
            mACTION_STRING_LITERAL(); 
            file = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, fileStart970, getCharIndex()-1);
            match(' '); 
            int lineStart976 = getCharIndex();
            mINT(); 
            line = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, lineStart976, getCharIndex()-1);
            channel=HIDDEN;

            }

        }
        finally {
        }
    }
    // $ANTLR end SRC

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3191:4: ( ( ' ' | '\\t' | ( '\\r' )? '\\n' )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3191:6: ( ' ' | '\\t' | ( '\\r' )? '\\n' )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3191:6: ( ' ' | '\\t' | ( '\\r' )? '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt20=1;
                    }
                    break;
                case '\t':
                    {
                    alt20=2;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3191:8: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3192:5: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3193:5: ( '\\r' )? '\\n'
            	    {
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3193:5: ( '\\r' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0=='\r') ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3193:5: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start WS_LOOP
    public final void mWS_LOOP() throws RecognitionException {
        try {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3200:2: ( ( WS | SL_COMMENT | ML_COMMENT )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3200:4: ( WS | SL_COMMENT | ML_COMMENT )*
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3200:4: ( WS | SL_COMMENT | ML_COMMENT )*
            loop21:
            do {
                int alt21=4;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {
                    alt21=1;
                }
                else if ( (LA21_0=='/') ) {
                    int LA21_3 = input.LA(2);

                    if ( (LA21_3=='*') ) {
                        alt21=3;
                    }
                    else if ( (LA21_3=='/') ) {
                        alt21=2;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3200:6: WS
            	    {
            	    mWS(); 

            	    }
            	    break;
            	case 2 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3201:5: SL_COMMENT
            	    {
            	    mSL_COMMENT(); 

            	    }
            	    break;
            	case 3 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:3202:5: ML_COMMENT
            	    {
            	    mML_COMMENT(); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            channel=HIDDEN;

            }

        }
        finally {
        }
    }
    // $ANTLR end WS_LOOP

    public void mTokens() throws RecognitionException {
        // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:8: ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS )
        int alt22=50;
        switch ( input.LA(1) ) {
        case 's':
            {
            int LA22_1 = input.LA(2);

            if ( (LA22_1=='c') ) {
                int LA22_38 = input.LA(3);

                if ( (LA22_38=='o') ) {
                    int LA22_66 = input.LA(4);

                    if ( (LA22_66=='p') ) {
                        int LA22_94 = input.LA(5);

                        if ( (LA22_94=='e') ) {
                            int LA22_111 = input.LA(6);

                            if ( ((LA22_111>='0' && LA22_111<='9')||(LA22_111>='A' && LA22_111<='Z')||LA22_111=='_'||(LA22_111>='a' && LA22_111<='z')) ) {
                                alt22=47;
                            }
                            else {
                                alt22=1;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA22_39 = input.LA(3);

                if ( (LA22_39=='a') ) {
                    int LA22_67 = input.LA(4);

                    if ( (LA22_67=='g') ) {
                        int LA22_95 = input.LA(5);

                        if ( (LA22_95=='m') ) {
                            int LA22_112 = input.LA(6);

                            if ( (LA22_112=='e') ) {
                                int LA22_128 = input.LA(7);

                                if ( (LA22_128=='n') ) {
                                    int LA22_142 = input.LA(8);

                                    if ( (LA22_142=='t') ) {
                                        int LA22_154 = input.LA(9);

                                        if ( ((LA22_154>='0' && LA22_154<='9')||(LA22_154>='A' && LA22_154<='Z')||LA22_154=='_'||(LA22_154>='a' && LA22_154<='z')) ) {
                                            alt22=47;
                                        }
                                        else {
                                            alt22=2;}
                                    }
                                    else {
                                        alt22=47;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            case 'i':
                {
                int LA22_40 = input.LA(3);

                if ( (LA22_40=='n') ) {
                    int LA22_68 = input.LA(4);

                    if ( (LA22_68=='a') ) {
                        int LA22_96 = input.LA(5);

                        if ( (LA22_96=='l') ) {
                            int LA22_113 = input.LA(6);

                            if ( (LA22_113=='l') ) {
                                int LA22_129 = input.LA(7);

                                if ( (LA22_129=='y') ) {
                                    int LA22_143 = input.LA(8);

                                    if ( ((LA22_143>='0' && LA22_143<='9')||(LA22_143>='A' && LA22_143<='Z')||LA22_143=='_'||(LA22_143>='a' && LA22_143<='z')) ) {
                                        alt22=47;
                                    }
                                    else {
                                        alt22=29;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            default:
                alt22=47;}

            }
            break;
        case '^':
            {
            int LA22_3 = input.LA(2);

            if ( (LA22_3=='(') ) {
                alt22=3;
            }
            else {
                alt22=4;}
            }
            break;
        case '!':
            {
            alt22=5;
            }
            break;
        case '.':
            {
            int LA22_5 = input.LA(2);

            if ( (LA22_5=='.') ) {
                alt22=6;
            }
            else {
                alt22=35;}
            }
            break;
        case '-':
            {
            alt22=7;
            }
            break;
        case 'l':
            {
            int LA22_7 = input.LA(2);

            if ( (LA22_7=='e') ) {
                int LA22_45 = input.LA(3);

                if ( (LA22_45=='x') ) {
                    int LA22_69 = input.LA(4);

                    if ( (LA22_69=='e') ) {
                        int LA22_97 = input.LA(5);

                        if ( (LA22_97=='r') ) {
                            int LA22_114 = input.LA(6);

                            if ( ((LA22_114>='0' && LA22_114<='9')||(LA22_114>='A' && LA22_114<='Z')||LA22_114=='_'||(LA22_114>='a' && LA22_114<='z')) ) {
                                alt22=47;
                            }
                            else {
                                alt22=8;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case 'p':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA22_46 = input.LA(3);

                if ( (LA22_46=='r') ) {
                    int LA22_70 = input.LA(4);

                    if ( (LA22_70=='s') ) {
                        int LA22_98 = input.LA(5);

                        if ( (LA22_98=='e') ) {
                            int LA22_115 = input.LA(6);

                            if ( (LA22_115=='r') ) {
                                int LA22_131 = input.LA(7);

                                if ( ((LA22_131>='0' && LA22_131<='9')||(LA22_131>='A' && LA22_131<='Z')||LA22_131=='_'||(LA22_131>='a' && LA22_131<='z')) ) {
                                    alt22=47;
                                }
                                else {
                                    alt22=9;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'o':
                    {
                    int LA22_71 = input.LA(4);

                    if ( (LA22_71=='t') ) {
                        int LA22_99 = input.LA(5);

                        if ( (LA22_99=='e') ) {
                            int LA22_116 = input.LA(6);

                            if ( (LA22_116=='c') ) {
                                int LA22_132 = input.LA(7);

                                if ( (LA22_132=='t') ) {
                                    int LA22_145 = input.LA(8);

                                    if ( (LA22_145=='e') ) {
                                        int LA22_156 = input.LA(9);

                                        if ( (LA22_156=='d') ) {
                                            int LA22_162 = input.LA(10);

                                            if ( ((LA22_162>='0' && LA22_162<='9')||(LA22_162>='A' && LA22_162<='Z')||LA22_162=='_'||(LA22_162>='a' && LA22_162<='z')) ) {
                                                alt22=47;
                                            }
                                            else {
                                                alt22=18;}
                                        }
                                        else {
                                            alt22=47;}
                                    }
                                    else {
                                        alt22=47;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                    }
                    break;
                case 'i':
                    {
                    int LA22_72 = input.LA(4);

                    if ( (LA22_72=='v') ) {
                        int LA22_100 = input.LA(5);

                        if ( (LA22_100=='a') ) {
                            int LA22_117 = input.LA(6);

                            if ( (LA22_117=='t') ) {
                                int LA22_133 = input.LA(7);

                                if ( (LA22_133=='e') ) {
                                    int LA22_146 = input.LA(8);

                                    if ( ((LA22_146>='0' && LA22_146<='9')||(LA22_146>='A' && LA22_146<='Z')||LA22_146=='_'||(LA22_146>='a' && LA22_146<='z')) ) {
                                        alt22=47;
                                    }
                                    else {
                                        alt22=20;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                    }
                    break;
                default:
                    alt22=47;}

                }
                break;
            case 'u':
                {
                int LA22_48 = input.LA(3);

                if ( (LA22_48=='b') ) {
                    int LA22_73 = input.LA(4);

                    if ( (LA22_73=='l') ) {
                        int LA22_101 = input.LA(5);

                        if ( (LA22_101=='i') ) {
                            int LA22_118 = input.LA(6);

                            if ( (LA22_118=='c') ) {
                                int LA22_134 = input.LA(7);

                                if ( ((LA22_134>='0' && LA22_134<='9')||(LA22_134>='A' && LA22_134<='Z')||LA22_134=='_'||(LA22_134>='a' && LA22_134<='z')) ) {
                                    alt22=47;
                                }
                                else {
                                    alt22=19;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            default:
                alt22=47;}

            }
            break;
        case 't':
            {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA22_49 = input.LA(3);

                if ( (LA22_49=='k') ) {
                    int LA22_74 = input.LA(4);

                    if ( (LA22_74=='e') ) {
                        int LA22_102 = input.LA(5);

                        if ( (LA22_102=='n') ) {
                            int LA22_119 = input.LA(6);

                            if ( (LA22_119=='s') ) {
                                int LA22_135 = input.LA(7);

                                if ( ((LA22_135>='\t' && LA22_135<='\n')||LA22_135=='\r'||LA22_135==' '||LA22_135=='/'||LA22_135=='{') ) {
                                    alt22=49;
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            case 'r':
                {
                int LA22_50 = input.LA(3);

                if ( (LA22_50=='e') ) {
                    int LA22_75 = input.LA(4);

                    if ( (LA22_75=='e') ) {
                        int LA22_103 = input.LA(5);

                        if ( ((LA22_103>='0' && LA22_103<='9')||(LA22_103>='A' && LA22_103<='Z')||LA22_103=='_'||(LA22_103>='a' && LA22_103<='z')) ) {
                            alt22=47;
                        }
                        else {
                            alt22=10;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            case 'h':
                {
                int LA22_51 = input.LA(3);

                if ( (LA22_51=='r') ) {
                    int LA22_76 = input.LA(4);

                    if ( (LA22_76=='o') ) {
                        int LA22_104 = input.LA(5);

                        if ( (LA22_104=='w') ) {
                            int LA22_121 = input.LA(6);

                            if ( (LA22_121=='s') ) {
                                int LA22_136 = input.LA(7);

                                if ( ((LA22_136>='0' && LA22_136<='9')||(LA22_136>='A' && LA22_136<='Z')||LA22_136=='_'||(LA22_136>='a' && LA22_136<='z')) ) {
                                    alt22=47;
                                }
                                else {
                                    alt22=23;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
                }
                break;
            default:
                alt22=47;}

            }
            break;
        case 'g':
            {
            int LA22_10 = input.LA(2);

            if ( (LA22_10=='r') ) {
                int LA22_52 = input.LA(3);

                if ( (LA22_52=='a') ) {
                    int LA22_77 = input.LA(4);

                    if ( (LA22_77=='m') ) {
                        int LA22_105 = input.LA(5);

                        if ( (LA22_105=='m') ) {
                            int LA22_122 = input.LA(6);

                            if ( (LA22_122=='a') ) {
                                int LA22_137 = input.LA(7);

                                if ( (LA22_137=='r') ) {
                                    int LA22_150 = input.LA(8);

                                    if ( ((LA22_150>='0' && LA22_150<='9')||(LA22_150>='A' && LA22_150<='Z')||LA22_150=='_'||(LA22_150>='a' && LA22_150<='z')) ) {
                                        alt22=47;
                                    }
                                    else {
                                        alt22=11;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case ';':
            {
            alt22=12;
            }
            break;
        case '}':
            {
            alt22=13;
            }
            break;
        case '=':
            {
            int LA22_13 = input.LA(2);

            if ( (LA22_13=='>') ) {
                alt22=31;
            }
            else {
                alt22=14;}
            }
            break;
        case '@':
            {
            alt22=15;
            }
            break;
        case ':':
            {
            int LA22_15 = input.LA(2);

            if ( (LA22_15==':') ) {
                alt22=16;
            }
            else {
                alt22=22;}
            }
            break;
        case '*':
            {
            alt22=17;
            }
            break;
        case 'r':
            {
            int LA22_17 = input.LA(2);

            if ( (LA22_17=='e') ) {
                int LA22_57 = input.LA(3);

                if ( (LA22_57=='t') ) {
                    int LA22_78 = input.LA(4);

                    if ( (LA22_78=='u') ) {
                        int LA22_106 = input.LA(5);

                        if ( (LA22_106=='r') ) {
                            int LA22_123 = input.LA(6);

                            if ( (LA22_123=='n') ) {
                                int LA22_138 = input.LA(7);

                                if ( (LA22_138=='s') ) {
                                    int LA22_151 = input.LA(8);

                                    if ( ((LA22_151>='0' && LA22_151<='9')||(LA22_151>='A' && LA22_151<='Z')||LA22_151=='_'||(LA22_151>='a' && LA22_151<='z')) ) {
                                        alt22=47;
                                    }
                                    else {
                                        alt22=21;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case ',':
            {
            alt22=24;
            }
            break;
        case '(':
            {
            alt22=25;
            }
            break;
        case '|':
            {
            alt22=26;
            }
            break;
        case ')':
            {
            alt22=27;
            }
            break;
        case 'c':
            {
            int LA22_22 = input.LA(2);

            if ( (LA22_22=='a') ) {
                int LA22_58 = input.LA(3);

                if ( (LA22_58=='t') ) {
                    int LA22_79 = input.LA(4);

                    if ( (LA22_79=='c') ) {
                        int LA22_107 = input.LA(5);

                        if ( (LA22_107=='h') ) {
                            int LA22_124 = input.LA(6);

                            if ( ((LA22_124>='0' && LA22_124<='9')||(LA22_124>='A' && LA22_124<='Z')||LA22_124=='_'||(LA22_124>='a' && LA22_124<='z')) ) {
                                alt22=47;
                            }
                            else {
                                alt22=28;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case '+':
            {
            int LA22_23 = input.LA(2);

            if ( (LA22_23=='=') ) {
                alt22=30;
            }
            else {
                alt22=34;}
            }
            break;
        case '~':
            {
            alt22=32;
            }
            break;
        case '?':
            {
            alt22=33;
            }
            break;
        case '$':
            {
            alt22=36;
            }
            break;
        case '/':
            {
            int LA22_27 = input.LA(2);

            if ( (LA22_27=='*') ) {
                alt22=38;
            }
            else if ( (LA22_27=='/') ) {
                alt22=37;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 27, input);

                throw nvae;
            }
            }
            break;
        case '\'':
            {
            int LA22_28 = input.LA(2);

            if ( (LA22_28=='\\') ) {
                int LA22_63 = input.LA(3);

                if ( (LA22_63=='n') ) {
                    int LA22_80 = input.LA(4);

                    if ( (LA22_80=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_80>='\u0000' && LA22_80<='&')||(LA22_80>='(' && LA22_80<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 80, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='r') ) {
                    int LA22_81 = input.LA(4);

                    if ( (LA22_81=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_81>='\u0000' && LA22_81<='&')||(LA22_81>='(' && LA22_81<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 81, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='t') ) {
                    int LA22_82 = input.LA(4);

                    if ( (LA22_82=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_82>='\u0000' && LA22_82<='&')||(LA22_82>='(' && LA22_82<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 82, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='b') ) {
                    int LA22_83 = input.LA(4);

                    if ( ((LA22_83>='\u0000' && LA22_83<='&')||(LA22_83>='(' && LA22_83<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else if ( (LA22_83=='\'') ) {
                        alt22=39;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 83, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='f') ) {
                    int LA22_84 = input.LA(4);

                    if ( ((LA22_84>='\u0000' && LA22_84<='&')||(LA22_84>='(' && LA22_84<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else if ( (LA22_84=='\'') ) {
                        alt22=39;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 84, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='\"') ) {
                    int LA22_85 = input.LA(4);

                    if ( (LA22_85=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_85>='\u0000' && LA22_85<='&')||(LA22_85>='(' && LA22_85<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 85, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='\'') ) {
                    int LA22_86 = input.LA(4);

                    if ( (LA22_86=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_86>='\u0000' && LA22_86<='&')||(LA22_86>='(' && LA22_86<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 86, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='\\') ) {
                    int LA22_87 = input.LA(4);

                    if ( (LA22_87=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_87>='\u0000' && LA22_87<='&')||(LA22_87>='(' && LA22_87<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 87, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='>') ) {
                    int LA22_88 = input.LA(4);

                    if ( (LA22_88=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_88>='\u0000' && LA22_88<='&')||(LA22_88>='(' && LA22_88<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 88, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_63=='u') ) {
                    int LA22_89 = input.LA(4);

                    if ( ((LA22_89>='0' && LA22_89<='9')||(LA22_89>='A' && LA22_89<='F')||(LA22_89>='a' && LA22_89<='f')) ) {
                        int LA22_108 = input.LA(5);

                        if ( ((LA22_108>='0' && LA22_108<='9')||(LA22_108>='A' && LA22_108<='F')||(LA22_108>='a' && LA22_108<='f')) ) {
                            int LA22_125 = input.LA(6);

                            if ( ((LA22_125>='\u0000' && LA22_125<='/')||(LA22_125>=':' && LA22_125<='@')||(LA22_125>='G' && LA22_125<='`')||(LA22_125>='g' && LA22_125<='\uFFFE')) ) {
                                alt22=40;
                            }
                            else if ( ((LA22_125>='0' && LA22_125<='9')||(LA22_125>='A' && LA22_125<='F')||(LA22_125>='a' && LA22_125<='f')) ) {
                                int LA22_140 = input.LA(7);

                                if ( ((LA22_140>='\u0000' && LA22_140<='/')||(LA22_140>=':' && LA22_140<='@')||(LA22_140>='G' && LA22_140<='`')||(LA22_140>='g' && LA22_140<='\uFFFE')) ) {
                                    alt22=40;
                                }
                                else if ( ((LA22_140>='0' && LA22_140<='9')||(LA22_140>='A' && LA22_140<='F')||(LA22_140>='a' && LA22_140<='f')) ) {
                                    int LA22_152 = input.LA(8);

                                    if ( (LA22_152=='\'') ) {
                                        alt22=39;
                                    }
                                    else if ( ((LA22_152>='\u0000' && LA22_152<='&')||(LA22_152>='(' && LA22_152<='\uFFFE')) ) {
                                        alt22=40;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 152, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 140, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 125, input);

                                throw nvae;
                            }
                        }
                        else if ( ((LA22_108>='\u0000' && LA22_108<='/')||(LA22_108>=':' && LA22_108<='@')||(LA22_108>='G' && LA22_108<='`')||(LA22_108>='g' && LA22_108<='\uFFFE')) ) {
                            alt22=40;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 108, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA22_89=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_89>='\u0000' && LA22_89<='&')||(LA22_89>='(' && LA22_89<='/')||(LA22_89>=':' && LA22_89<='@')||(LA22_89>='G' && LA22_89<='`')||(LA22_89>='g' && LA22_89<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 89, input);

                        throw nvae;
                    }
                }
                else if ( ((LA22_63>='\u0000' && LA22_63<='!')||(LA22_63>='#' && LA22_63<='&')||(LA22_63>='(' && LA22_63<='=')||(LA22_63>='?' && LA22_63<='[')||(LA22_63>=']' && LA22_63<='a')||(LA22_63>='c' && LA22_63<='e')||(LA22_63>='g' && LA22_63<='m')||(LA22_63>='o' && LA22_63<='q')||LA22_63=='s'||(LA22_63>='v' && LA22_63<='\uFFFE')) ) {
                    int LA22_90 = input.LA(4);

                    if ( (LA22_90=='\'') ) {
                        alt22=39;
                    }
                    else if ( ((LA22_90>='\u0000' && LA22_90<='&')||(LA22_90>='(' && LA22_90<='\uFFFE')) ) {
                        alt22=40;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 90, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 63, input);

                    throw nvae;
                }
            }
            else if ( ((LA22_28>='\u0000' && LA22_28<='&')||(LA22_28>='(' && LA22_28<='[')||(LA22_28>=']' && LA22_28<='\uFFFE')) ) {
                int LA22_64 = input.LA(3);

                if ( (LA22_64=='\'') ) {
                    alt22=39;
                }
                else if ( ((LA22_64>='\u0000' && LA22_64<='&')||(LA22_64>='(' && LA22_64<='\uFFFE')) ) {
                    alt22=40;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 64, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 28, input);

                throw nvae;
            }
            }
            break;
        case '\"':
            {
            alt22=41;
            }
            break;
        case '<':
            {
            alt22=42;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt22=43;
            }
            break;
        case '[':
            {
            alt22=44;
            }
            break;
        case '{':
            {
            alt22=45;
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
            {
            alt22=46;
            }
            break;
        case 'o':
            {
            int LA22_35 = input.LA(2);

            if ( (LA22_35=='p') ) {
                int LA22_65 = input.LA(3);

                if ( (LA22_65=='t') ) {
                    int LA22_93 = input.LA(4);

                    if ( (LA22_93=='i') ) {
                        int LA22_110 = input.LA(5);

                        if ( (LA22_110=='o') ) {
                            int LA22_126 = input.LA(6);

                            if ( (LA22_126=='n') ) {
                                int LA22_141 = input.LA(7);

                                if ( (LA22_141=='s') ) {
                                    int LA22_153 = input.LA(8);

                                    if ( ((LA22_153>='\t' && LA22_153<='\n')||LA22_153=='\r'||LA22_153==' '||LA22_153=='/'||LA22_153=='{') ) {
                                        alt22=48;
                                    }
                                    else {
                                        alt22=47;}
                                }
                                else {
                                    alt22=47;}
                            }
                            else {
                                alt22=47;}
                        }
                        else {
                            alt22=47;}
                    }
                    else {
                        alt22=47;}
                }
                else {
                    alt22=47;}
            }
            else {
                alt22=47;}
            }
            break;
        case 'a':
        case 'b':
        case 'd':
        case 'e':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'q':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt22=47;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt22=50;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( SCOPE | FRAGMENT | TREE_BEGIN | ROOT | BANG | RANGE | REWRITE | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | SL_COMMENT | ML_COMMENT | CHAR_LITERAL | STRING_LITERAL | DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL | INT | ARG_ACTION | ACTION | TOKEN_REF | RULE_REF | OPTIONS | TOKENS | WS );", 22, 0, input);

            throw nvae;
        }

        switch (alt22) {
            case 1 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:10: SCOPE
                {
                mSCOPE(); 

                }
                break;
            case 2 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:16: FRAGMENT
                {
                mFRAGMENT(); 

                }
                break;
            case 3 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:25: TREE_BEGIN
                {
                mTREE_BEGIN(); 

                }
                break;
            case 4 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:36: ROOT
                {
                mROOT(); 

                }
                break;
            case 5 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:41: BANG
                {
                mBANG(); 

                }
                break;
            case 6 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:46: RANGE
                {
                mRANGE(); 

                }
                break;
            case 7 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:52: REWRITE
                {
                mREWRITE(); 

                }
                break;
            case 8 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:60: T65
                {
                mT65(); 

                }
                break;
            case 9 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:64: T66
                {
                mT66(); 

                }
                break;
            case 10 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:68: T67
                {
                mT67(); 

                }
                break;
            case 11 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:72: T68
                {
                mT68(); 

                }
                break;
            case 12 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:76: T69
                {
                mT69(); 

                }
                break;
            case 13 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:80: T70
                {
                mT70(); 

                }
                break;
            case 14 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:84: T71
                {
                mT71(); 

                }
                break;
            case 15 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:88: T72
                {
                mT72(); 

                }
                break;
            case 16 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:92: T73
                {
                mT73(); 

                }
                break;
            case 17 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:96: T74
                {
                mT74(); 

                }
                break;
            case 18 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:100: T75
                {
                mT75(); 

                }
                break;
            case 19 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:104: T76
                {
                mT76(); 

                }
                break;
            case 20 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:108: T77
                {
                mT77(); 

                }
                break;
            case 21 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:112: T78
                {
                mT78(); 

                }
                break;
            case 22 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:116: T79
                {
                mT79(); 

                }
                break;
            case 23 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:120: T80
                {
                mT80(); 

                }
                break;
            case 24 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:124: T81
                {
                mT81(); 

                }
                break;
            case 25 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:128: T82
                {
                mT82(); 

                }
                break;
            case 26 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:132: T83
                {
                mT83(); 

                }
                break;
            case 27 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:136: T84
                {
                mT84(); 

                }
                break;
            case 28 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:140: T85
                {
                mT85(); 

                }
                break;
            case 29 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:144: T86
                {
                mT86(); 

                }
                break;
            case 30 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:148: T87
                {
                mT87(); 

                }
                break;
            case 31 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:152: T88
                {
                mT88(); 

                }
                break;
            case 32 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:156: T89
                {
                mT89(); 

                }
                break;
            case 33 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:160: T90
                {
                mT90(); 

                }
                break;
            case 34 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:164: T91
                {
                mT91(); 

                }
                break;
            case 35 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:168: T92
                {
                mT92(); 

                }
                break;
            case 36 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:172: T93
                {
                mT93(); 

                }
                break;
            case 37 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:176: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;
            case 38 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:187: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 39 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:198: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 40 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:211: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 41 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:226: DOUBLE_QUOTE_STRING_LITERAL
                {
                mDOUBLE_QUOTE_STRING_LITERAL(); 

                }
                break;
            case 42 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:254: DOUBLE_ANGLE_STRING_LITERAL
                {
                mDOUBLE_ANGLE_STRING_LITERAL(); 

                }
                break;
            case 43 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:282: INT
                {
                mINT(); 

                }
                break;
            case 44 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:286: ARG_ACTION
                {
                mARG_ACTION(); 

                }
                break;
            case 45 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:297: ACTION
                {
                mACTION(); 

                }
                break;
            case 46 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:304: TOKEN_REF
                {
                mTOKEN_REF(); 

                }
                break;
            case 47 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:314: RULE_REF
                {
                mRULE_REF(); 

                }
                break;
            case 48 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:323: OPTIONS
                {
                mOPTIONS(); 

                }
                break;
            case 49 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:331: TOKENS
                {
                mTOKENS(); 

                }
                break;
            case 50 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3:1:338: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\20\uffff\1\2\6\uffff\1\2\4\uffff";
    static final String DFA2_eofS =
        "\34\uffff";
    static final String DFA2_minS =
        "\2\0\1\uffff\20\0\1\uffff\7\0\1\uffff";
    static final String DFA2_maxS =
        "\2\ufffe\1\uffff\20\ufffe\1\uffff\7\ufffe\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\20\uffff\1\1\7\uffff\1\1";
    static final String DFA2_specialS =
        "\34\uffff}>";
    static final String[] DFA2_transitionS = {
            "\40\2\1\1\uffde\2",
            "\44\2\1\3\uffda\2",
            "",
            "\101\2\1\4\uffbd\2",
            "\116\2\1\5\uffb0\2",
            "\124\2\1\6\uffaa\2",
            "\114\2\1\7\uffb2\2",
            "\122\2\1\10\uffac\2",
            "\40\2\1\11\uffde\2",
            "\163\2\1\12\uff8b\2",
            "\162\2\1\13\uff8c\2",
            "\143\2\1\14\uff9b\2",
            "\40\2\1\15\uffde\2",
            "\42\2\1\16\uffdc\2",
            "\12\22\1\20\2\22\1\17\24\22\1\2\71\22\1\21\uffa2\22",
            "\12\23\1\20\ufff4\23",
            "\uffff\23",
            "\12\30\1\27\2\30\1\26\24\30\1\24\4\30\1\25\uffd7\30",
            "\12\22\1\20\2\22\1\17\24\22\1\31\71\22\1\21\uffa2\22",
            "",
            "\12\22\1\20\2\22\1\17\24\22\1\31\71\22\1\21\uffa2\22",
            "\12\22\1\20\2\22\1\17\24\22\1\31\71\22\1\21\uffa2\22",
            "\12\23\1\20\ufff4\23",
            "\uffff\23",
            "\12\22\1\20\2\22\1\17\24\22\1\31\71\22\1\21\uffa2\22",
            "\40\2\1\32\uffde\2",
            "\60\2\12\33\uffc5\2",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "3052:5: ( ' $ANTLR ' SRC | (~ ( '\\r' | '\\n' ) )* )";
        }
    }
 

}