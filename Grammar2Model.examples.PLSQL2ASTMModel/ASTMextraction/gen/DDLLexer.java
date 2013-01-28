// $ANTLR 3.0.1 /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3 2009-09-29 10:50:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
    public static final int ISNULL=7;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int ID=4;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int TYPE=5;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int NUMBER=6;
    public static final int T42=42;
    public static final int Tokens=43;
    public static final int T41=41;
    public static final int T40=40;
    public static final int WS=9;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public static final int STRING=8;
    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:3:5: ( 'CREATE TABLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:3:7: 'CREATE TABLE'
            {
            match("CREATE TABLE"); 


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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:4:5: ( '(' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:4:7: '('
            {
            match('('); 

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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:5:5: ( ',' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:5:7: ','
            {
            match(','); 

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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:6:5: ( ')' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:6:7: ')'
            {
            match(')'); 

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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:7:5: ( ';' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:7:7: ';'
            {
            match(';'); 

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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:8:5: ( 'ALTER TABLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:8:7: 'ALTER TABLE'
            {
            match("ALTER TABLE"); 


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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:9:5: ( 'ADD' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:9:7: 'ADD'
            {
            match("ADD"); 


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
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:10:5: ( 'ENABLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:10:7: 'ENABLE'
            {
            match("ENABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:11:5: ( 'CONSTRAINT' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:11:7: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:12:5: ( 'COMMENT ON' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:12:7: 'COMMENT ON'
            {
            match("COMMENT ON"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:13:5: ( 'TABLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:13:7: 'TABLE'
            {
            match("TABLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:14:5: ( 'COLUMN' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:14:7: 'COLUMN'
            {
            match("COLUMN"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:15:5: ( '.' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:15:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:16:5: ( 'IS' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:16:7: 'IS'
            {
            match("IS"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:17:5: ( 'CREATE SEQUENCE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:17:7: 'CREATE SEQUENCE'
            {
            match("CREATE SEQUENCE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:18:5: ( 'INCREMENT' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:18:7: 'INCREMENT'
            {
            match("INCREMENT"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:19:5: ( 'BY' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:19:7: 'BY'
            {
            match("BY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:20:5: ( 'START' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:20:7: 'START'
            {
            match("START"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:5: ( 'WITH' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:21:7: 'WITH'
            {
            match("WITH"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:22:5: ( 'MAXVALUE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:22:7: 'MAXVALUE'
            {
            match("MAXVALUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:23:5: ( 'NOMAXVALUE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:23:7: 'NOMAXVALUE'
            {
            match("NOMAXVALUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:24:5: ( 'MINVALUE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:24:7: 'MINVALUE'
            {
            match("MINVALUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:25:5: ( 'NOMINVALUE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:25:7: 'NOMINVALUE'
            {
            match("NOMINVALUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:26:5: ( 'CYCLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:26:7: 'CYCLE'
            {
            match("CYCLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:27:5: ( 'NOCYCLE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:27:7: 'NOCYCLE'
            {
            match("NOCYCLE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:28:5: ( 'CACHE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:28:7: 'CACHE'
            {
            match("CACHE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:29:5: ( 'NOCACHE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:29:7: 'NOCACHE'
            {
            match("NOCACHE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:30:5: ( 'ORDER' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:30:7: 'ORDER'
            {
            match("ORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:31:5: ( 'NOORDER' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:31:7: 'NOORDER'
            {
            match("NOORDER"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:32:5: ( 'PRIMARY KEY' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:32:7: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:33:5: ( 'UNIQUE' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:33:7: 'UNIQUE'
            {
            match("UNIQUE"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:34:5: ( 'FOREIGN KEY' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:34:7: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:35:5: ( 'REFERENCES' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:35:7: 'REFERENCES'
            {
            match("REFERENCES"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start ISNULL
    public final void mISNULL() throws RecognitionException {
        try {
            int _type = ISNULL;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1145:8: ( 'NULL' | 'NOT NULL' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='O') ) {
                    alt1=2;
                }
                else if ( (LA1_1=='U') ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1145:1: ISNULL : ( 'NULL' | 'NOT NULL' );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1145:1: ISNULL : ( 'NULL' | 'NOT NULL' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1145:10: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1145:19: 'NOT NULL'
                    {
                    match("NOT NULL"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ISNULL

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:8: ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | ( '0' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='0') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1148:1: NUMBER : ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | ( '0' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:10: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:10: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:11: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:11: ( '1' .. '9' )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:12: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:21: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:36: ( '0' )
                    {
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:36: ( '0' )
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1148:37: '0'
                    {
                    match('0'); 

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1151:6: ( 'NUMBER' | 'VARCHAR2' | 'DATE' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 'N':
                {
                alt4=1;
                }
                break;
            case 'V':
                {
                alt4=2;
                }
                break;
            case 'D':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1151:1: TYPE : ( 'NUMBER' | 'VARCHAR2' | 'DATE' );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1151:8: 'NUMBER'
                    {
                    match("NUMBER"); 


                    }
                    break;
                case 2 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1151:19: 'VARCHAR2'
                    {
                    match("VARCHAR2"); 


                    }
                    break;
                case 3 :
                    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1151:32: 'DATE'
                    {
                    match("DATE"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1154:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1154:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1154:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='#' && LA5_0<='$')||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1158:8: ( '\\'' (~ ( '\\'' ) )* '\\'' )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1158:10: '\\'' (~ ( '\\'' ) )* '\\''
            {
            match('\''); 
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1158:15: (~ ( '\\'' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1158:15: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop6;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1161:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1161:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1161:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
        // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:8: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | ISNULL | NUMBER | TYPE | ID | STRING | WS )
        int alt8=39;
        switch ( input.LA(1) ) {
        case 'C':
            {
            switch ( input.LA(2) ) {
            case 'A':
                {
                int LA8_27 = input.LA(3);

                if ( (LA8_27=='C') ) {
                    int LA8_51 = input.LA(4);

                    if ( (LA8_51=='H') ) {
                        int LA8_81 = input.LA(5);

                        if ( (LA8_81=='E') ) {
                            int LA8_111 = input.LA(6);

                            if ( ((LA8_111>='#' && LA8_111<='$')||(LA8_111>='0' && LA8_111<='9')||(LA8_111>='A' && LA8_111<='Z')||LA8_111=='_'||(LA8_111>='a' && LA8_111<='z')) ) {
                                alt8=37;
                            }
                            else {
                                alt8=26;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'Y':
                {
                int LA8_28 = input.LA(3);

                if ( (LA8_28=='C') ) {
                    int LA8_52 = input.LA(4);

                    if ( (LA8_52=='L') ) {
                        int LA8_82 = input.LA(5);

                        if ( (LA8_82=='E') ) {
                            int LA8_112 = input.LA(6);

                            if ( ((LA8_112>='#' && LA8_112<='$')||(LA8_112>='0' && LA8_112<='9')||(LA8_112>='A' && LA8_112<='Z')||LA8_112=='_'||(LA8_112>='a' && LA8_112<='z')) ) {
                                alt8=37;
                            }
                            else {
                                alt8=24;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'R':
                {
                int LA8_29 = input.LA(3);

                if ( (LA8_29=='E') ) {
                    int LA8_53 = input.LA(4);

                    if ( (LA8_53=='A') ) {
                        int LA8_83 = input.LA(5);

                        if ( (LA8_83=='T') ) {
                            int LA8_113 = input.LA(6);

                            if ( (LA8_113=='E') ) {
                                int LA8_140 = input.LA(7);

                                if ( (LA8_140==' ') ) {
                                    int LA8_163 = input.LA(8);

                                    if ( (LA8_163=='T') ) {
                                        alt8=1;
                                    }
                                    else if ( (LA8_163=='S') ) {
                                        alt8=15;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | ISNULL | NUMBER | TYPE | ID | STRING | WS );", 8, 163, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'O':
                {
                switch ( input.LA(3) ) {
                case 'L':
                    {
                    int LA8_54 = input.LA(4);

                    if ( (LA8_54=='U') ) {
                        int LA8_84 = input.LA(5);

                        if ( (LA8_84=='M') ) {
                            int LA8_114 = input.LA(6);

                            if ( (LA8_114=='N') ) {
                                int LA8_141 = input.LA(7);

                                if ( ((LA8_141>='#' && LA8_141<='$')||(LA8_141>='0' && LA8_141<='9')||(LA8_141>='A' && LA8_141<='Z')||LA8_141=='_'||(LA8_141>='a' && LA8_141<='z')) ) {
                                    alt8=37;
                                }
                                else {
                                    alt8=12;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                case 'M':
                    {
                    int LA8_55 = input.LA(4);

                    if ( (LA8_55=='M') ) {
                        int LA8_85 = input.LA(5);

                        if ( (LA8_85=='E') ) {
                            int LA8_115 = input.LA(6);

                            if ( (LA8_115=='N') ) {
                                int LA8_142 = input.LA(7);

                                if ( (LA8_142=='T') ) {
                                    int LA8_165 = input.LA(8);

                                    if ( (LA8_165==' ') ) {
                                        alt8=10;
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                case 'N':
                    {
                    int LA8_56 = input.LA(4);

                    if ( (LA8_56=='S') ) {
                        int LA8_86 = input.LA(5);

                        if ( (LA8_86=='T') ) {
                            int LA8_116 = input.LA(6);

                            if ( (LA8_116=='R') ) {
                                int LA8_143 = input.LA(7);

                                if ( (LA8_143=='A') ) {
                                    int LA8_166 = input.LA(8);

                                    if ( (LA8_166=='I') ) {
                                        int LA8_184 = input.LA(9);

                                        if ( (LA8_184=='N') ) {
                                            int LA8_197 = input.LA(10);

                                            if ( (LA8_197=='T') ) {
                                                int LA8_204 = input.LA(11);

                                                if ( ((LA8_204>='#' && LA8_204<='$')||(LA8_204>='0' && LA8_204<='9')||(LA8_204>='A' && LA8_204<='Z')||LA8_204=='_'||(LA8_204>='a' && LA8_204<='z')) ) {
                                                    alt8=37;
                                                }
                                                else {
                                                    alt8=9;}
                                            }
                                            else {
                                                alt8=37;}
                                        }
                                        else {
                                            alt8=37;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                default:
                    alt8=37;}

                }
                break;
            default:
                alt8=37;}

            }
            break;
        case '(':
            {
            alt8=2;
            }
            break;
        case ',':
            {
            alt8=3;
            }
            break;
        case ')':
            {
            alt8=4;
            }
            break;
        case ';':
            {
            alt8=5;
            }
            break;
        case 'A':
            {
            switch ( input.LA(2) ) {
            case 'L':
                {
                int LA8_31 = input.LA(3);

                if ( (LA8_31=='T') ) {
                    int LA8_57 = input.LA(4);

                    if ( (LA8_57=='E') ) {
                        int LA8_87 = input.LA(5);

                        if ( (LA8_87=='R') ) {
                            int LA8_117 = input.LA(6);

                            if ( (LA8_117==' ') ) {
                                alt8=6;
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'D':
                {
                int LA8_32 = input.LA(3);

                if ( (LA8_32=='D') ) {
                    int LA8_58 = input.LA(4);

                    if ( ((LA8_58>='#' && LA8_58<='$')||(LA8_58>='0' && LA8_58<='9')||(LA8_58>='A' && LA8_58<='Z')||LA8_58=='_'||(LA8_58>='a' && LA8_58<='z')) ) {
                        alt8=37;
                    }
                    else {
                        alt8=7;}
                }
                else {
                    alt8=37;}
                }
                break;
            default:
                alt8=37;}

            }
            break;
        case 'E':
            {
            int LA8_7 = input.LA(2);

            if ( (LA8_7=='N') ) {
                int LA8_33 = input.LA(3);

                if ( (LA8_33=='A') ) {
                    int LA8_59 = input.LA(4);

                    if ( (LA8_59=='B') ) {
                        int LA8_89 = input.LA(5);

                        if ( (LA8_89=='L') ) {
                            int LA8_118 = input.LA(6);

                            if ( (LA8_118=='E') ) {
                                int LA8_145 = input.LA(7);

                                if ( ((LA8_145>='#' && LA8_145<='$')||(LA8_145>='0' && LA8_145<='9')||(LA8_145>='A' && LA8_145<='Z')||LA8_145=='_'||(LA8_145>='a' && LA8_145<='z')) ) {
                                    alt8=37;
                                }
                                else {
                                    alt8=8;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'T':
            {
            int LA8_8 = input.LA(2);

            if ( (LA8_8=='A') ) {
                int LA8_34 = input.LA(3);

                if ( (LA8_34=='B') ) {
                    int LA8_60 = input.LA(4);

                    if ( (LA8_60=='L') ) {
                        int LA8_90 = input.LA(5);

                        if ( (LA8_90=='E') ) {
                            int LA8_119 = input.LA(6);

                            if ( ((LA8_119>='#' && LA8_119<='$')||(LA8_119>='0' && LA8_119<='9')||(LA8_119>='A' && LA8_119<='Z')||LA8_119=='_'||(LA8_119>='a' && LA8_119<='z')) ) {
                                alt8=37;
                            }
                            else {
                                alt8=11;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case '.':
            {
            alt8=13;
            }
            break;
        case 'I':
            {
            switch ( input.LA(2) ) {
            case 'N':
                {
                int LA8_35 = input.LA(3);

                if ( (LA8_35=='C') ) {
                    int LA8_61 = input.LA(4);

                    if ( (LA8_61=='R') ) {
                        int LA8_91 = input.LA(5);

                        if ( (LA8_91=='E') ) {
                            int LA8_120 = input.LA(6);

                            if ( (LA8_120=='M') ) {
                                int LA8_147 = input.LA(7);

                                if ( (LA8_147=='E') ) {
                                    int LA8_168 = input.LA(8);

                                    if ( (LA8_168=='N') ) {
                                        int LA8_185 = input.LA(9);

                                        if ( (LA8_185=='T') ) {
                                            int LA8_198 = input.LA(10);

                                            if ( ((LA8_198>='#' && LA8_198<='$')||(LA8_198>='0' && LA8_198<='9')||(LA8_198>='A' && LA8_198<='Z')||LA8_198=='_'||(LA8_198>='a' && LA8_198<='z')) ) {
                                                alt8=37;
                                            }
                                            else {
                                                alt8=16;}
                                        }
                                        else {
                                            alt8=37;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'S':
                {
                int LA8_36 = input.LA(3);

                if ( ((LA8_36>='#' && LA8_36<='$')||(LA8_36>='0' && LA8_36<='9')||(LA8_36>='A' && LA8_36<='Z')||LA8_36=='_'||(LA8_36>='a' && LA8_36<='z')) ) {
                    alt8=37;
                }
                else {
                    alt8=14;}
                }
                break;
            default:
                alt8=37;}

            }
            break;
        case 'B':
            {
            int LA8_11 = input.LA(2);

            if ( (LA8_11=='Y') ) {
                int LA8_37 = input.LA(3);

                if ( ((LA8_37>='#' && LA8_37<='$')||(LA8_37>='0' && LA8_37<='9')||(LA8_37>='A' && LA8_37<='Z')||LA8_37=='_'||(LA8_37>='a' && LA8_37<='z')) ) {
                    alt8=37;
                }
                else {
                    alt8=17;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'S':
            {
            int LA8_12 = input.LA(2);

            if ( (LA8_12=='T') ) {
                int LA8_38 = input.LA(3);

                if ( (LA8_38=='A') ) {
                    int LA8_64 = input.LA(4);

                    if ( (LA8_64=='R') ) {
                        int LA8_92 = input.LA(5);

                        if ( (LA8_92=='T') ) {
                            int LA8_121 = input.LA(6);

                            if ( ((LA8_121>='#' && LA8_121<='$')||(LA8_121>='0' && LA8_121<='9')||(LA8_121>='A' && LA8_121<='Z')||LA8_121=='_'||(LA8_121>='a' && LA8_121<='z')) ) {
                                alt8=37;
                            }
                            else {
                                alt8=18;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'W':
            {
            int LA8_13 = input.LA(2);

            if ( (LA8_13=='I') ) {
                int LA8_39 = input.LA(3);

                if ( (LA8_39=='T') ) {
                    int LA8_65 = input.LA(4);

                    if ( (LA8_65=='H') ) {
                        int LA8_93 = input.LA(5);

                        if ( ((LA8_93>='#' && LA8_93<='$')||(LA8_93>='0' && LA8_93<='9')||(LA8_93>='A' && LA8_93<='Z')||LA8_93=='_'||(LA8_93>='a' && LA8_93<='z')) ) {
                            alt8=37;
                        }
                        else {
                            alt8=19;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'M':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                int LA8_40 = input.LA(3);

                if ( (LA8_40=='N') ) {
                    int LA8_66 = input.LA(4);

                    if ( (LA8_66=='V') ) {
                        int LA8_94 = input.LA(5);

                        if ( (LA8_94=='A') ) {
                            int LA8_123 = input.LA(6);

                            if ( (LA8_123=='L') ) {
                                int LA8_149 = input.LA(7);

                                if ( (LA8_149=='U') ) {
                                    int LA8_169 = input.LA(8);

                                    if ( (LA8_169=='E') ) {
                                        int LA8_186 = input.LA(9);

                                        if ( ((LA8_186>='#' && LA8_186<='$')||(LA8_186>='0' && LA8_186<='9')||(LA8_186>='A' && LA8_186<='Z')||LA8_186=='_'||(LA8_186>='a' && LA8_186<='z')) ) {
                                            alt8=37;
                                        }
                                        else {
                                            alt8=22;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            case 'A':
                {
                int LA8_41 = input.LA(3);

                if ( (LA8_41=='X') ) {
                    int LA8_67 = input.LA(4);

                    if ( (LA8_67=='V') ) {
                        int LA8_95 = input.LA(5);

                        if ( (LA8_95=='A') ) {
                            int LA8_124 = input.LA(6);

                            if ( (LA8_124=='L') ) {
                                int LA8_150 = input.LA(7);

                                if ( (LA8_150=='U') ) {
                                    int LA8_170 = input.LA(8);

                                    if ( (LA8_170=='E') ) {
                                        int LA8_187 = input.LA(9);

                                        if ( ((LA8_187>='#' && LA8_187<='$')||(LA8_187>='0' && LA8_187<='9')||(LA8_187>='A' && LA8_187<='Z')||LA8_187=='_'||(LA8_187>='a' && LA8_187<='z')) ) {
                                            alt8=37;
                                        }
                                        else {
                                            alt8=20;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
                }
                break;
            default:
                alt8=37;}

            }
            break;
        case 'N':
            {
            switch ( input.LA(2) ) {
            case 'O':
                {
                switch ( input.LA(3) ) {
                case 'C':
                    {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA8_96 = input.LA(5);

                        if ( (LA8_96=='C') ) {
                            int LA8_125 = input.LA(6);

                            if ( (LA8_125=='H') ) {
                                int LA8_151 = input.LA(7);

                                if ( (LA8_151=='E') ) {
                                    int LA8_171 = input.LA(8);

                                    if ( ((LA8_171>='#' && LA8_171<='$')||(LA8_171>='0' && LA8_171<='9')||(LA8_171>='A' && LA8_171<='Z')||LA8_171=='_'||(LA8_171>='a' && LA8_171<='z')) ) {
                                        alt8=37;
                                    }
                                    else {
                                        alt8=27;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                        }
                        break;
                    case 'Y':
                        {
                        int LA8_97 = input.LA(5);

                        if ( (LA8_97=='C') ) {
                            int LA8_126 = input.LA(6);

                            if ( (LA8_126=='L') ) {
                                int LA8_152 = input.LA(7);

                                if ( (LA8_152=='E') ) {
                                    int LA8_172 = input.LA(8);

                                    if ( ((LA8_172>='#' && LA8_172<='$')||(LA8_172>='0' && LA8_172<='9')||(LA8_172>='A' && LA8_172<='Z')||LA8_172=='_'||(LA8_172>='a' && LA8_172<='z')) ) {
                                        alt8=37;
                                    }
                                    else {
                                        alt8=25;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                        }
                        break;
                    default:
                        alt8=37;}

                    }
                    break;
                case 'T':
                    {
                    int LA8_69 = input.LA(4);

                    if ( (LA8_69==' ') ) {
                        alt8=34;
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                case 'M':
                    {
                    switch ( input.LA(4) ) {
                    case 'A':
                        {
                        int LA8_99 = input.LA(5);

                        if ( (LA8_99=='X') ) {
                            int LA8_127 = input.LA(6);

                            if ( (LA8_127=='V') ) {
                                int LA8_153 = input.LA(7);

                                if ( (LA8_153=='A') ) {
                                    int LA8_173 = input.LA(8);

                                    if ( (LA8_173=='L') ) {
                                        int LA8_190 = input.LA(9);

                                        if ( (LA8_190=='U') ) {
                                            int LA8_201 = input.LA(10);

                                            if ( (LA8_201=='E') ) {
                                                int LA8_206 = input.LA(11);

                                                if ( ((LA8_206>='#' && LA8_206<='$')||(LA8_206>='0' && LA8_206<='9')||(LA8_206>='A' && LA8_206<='Z')||LA8_206=='_'||(LA8_206>='a' && LA8_206<='z')) ) {
                                                    alt8=37;
                                                }
                                                else {
                                                    alt8=21;}
                                            }
                                            else {
                                                alt8=37;}
                                        }
                                        else {
                                            alt8=37;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                        }
                        break;
                    case 'I':
                        {
                        int LA8_100 = input.LA(5);

                        if ( (LA8_100=='N') ) {
                            int LA8_128 = input.LA(6);

                            if ( (LA8_128=='V') ) {
                                int LA8_154 = input.LA(7);

                                if ( (LA8_154=='A') ) {
                                    int LA8_174 = input.LA(8);

                                    if ( (LA8_174=='L') ) {
                                        int LA8_191 = input.LA(9);

                                        if ( (LA8_191=='U') ) {
                                            int LA8_202 = input.LA(10);

                                            if ( (LA8_202=='E') ) {
                                                int LA8_207 = input.LA(11);

                                                if ( ((LA8_207>='#' && LA8_207<='$')||(LA8_207>='0' && LA8_207<='9')||(LA8_207>='A' && LA8_207<='Z')||LA8_207=='_'||(LA8_207>='a' && LA8_207<='z')) ) {
                                                    alt8=37;
                                                }
                                                else {
                                                    alt8=23;}
                                            }
                                            else {
                                                alt8=37;}
                                        }
                                        else {
                                            alt8=37;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                        }
                        break;
                    default:
                        alt8=37;}

                    }
                    break;
                case 'O':
                    {
                    int LA8_71 = input.LA(4);

                    if ( (LA8_71=='R') ) {
                        int LA8_101 = input.LA(5);

                        if ( (LA8_101=='D') ) {
                            int LA8_129 = input.LA(6);

                            if ( (LA8_129=='E') ) {
                                int LA8_155 = input.LA(7);

                                if ( (LA8_155=='R') ) {
                                    int LA8_175 = input.LA(8);

                                    if ( ((LA8_175>='#' && LA8_175<='$')||(LA8_175>='0' && LA8_175<='9')||(LA8_175>='A' && LA8_175<='Z')||LA8_175=='_'||(LA8_175>='a' && LA8_175<='z')) ) {
                                        alt8=37;
                                    }
                                    else {
                                        alt8=29;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                default:
                    alt8=37;}

                }
                break;
            case 'U':
                {
                switch ( input.LA(3) ) {
                case 'M':
                    {
                    int LA8_72 = input.LA(4);

                    if ( (LA8_72=='B') ) {
                        int LA8_102 = input.LA(5);

                        if ( (LA8_102=='E') ) {
                            int LA8_130 = input.LA(6);

                            if ( (LA8_130=='R') ) {
                                int LA8_156 = input.LA(7);

                                if ( ((LA8_156>='#' && LA8_156<='$')||(LA8_156>='0' && LA8_156<='9')||(LA8_156>='A' && LA8_156<='Z')||LA8_156=='_'||(LA8_156>='a' && LA8_156<='z')) ) {
                                    alt8=37;
                                }
                                else {
                                    alt8=36;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                case 'L':
                    {
                    int LA8_73 = input.LA(4);

                    if ( (LA8_73=='L') ) {
                        int LA8_103 = input.LA(5);

                        if ( ((LA8_103>='#' && LA8_103<='$')||(LA8_103>='0' && LA8_103<='9')||(LA8_103>='A' && LA8_103<='Z')||LA8_103=='_'||(LA8_103>='a' && LA8_103<='z')) ) {
                            alt8=37;
                        }
                        else {
                            alt8=34;}
                    }
                    else {
                        alt8=37;}
                    }
                    break;
                default:
                    alt8=37;}

                }
                break;
            default:
                alt8=37;}

            }
            break;
        case 'O':
            {
            int LA8_16 = input.LA(2);

            if ( (LA8_16=='R') ) {
                int LA8_44 = input.LA(3);

                if ( (LA8_44=='D') ) {
                    int LA8_74 = input.LA(4);

                    if ( (LA8_74=='E') ) {
                        int LA8_104 = input.LA(5);

                        if ( (LA8_104=='R') ) {
                            int LA8_131 = input.LA(6);

                            if ( ((LA8_131>='#' && LA8_131<='$')||(LA8_131>='0' && LA8_131<='9')||(LA8_131>='A' && LA8_131<='Z')||LA8_131=='_'||(LA8_131>='a' && LA8_131<='z')) ) {
                                alt8=37;
                            }
                            else {
                                alt8=28;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'P':
            {
            int LA8_17 = input.LA(2);

            if ( (LA8_17=='R') ) {
                int LA8_45 = input.LA(3);

                if ( (LA8_45=='I') ) {
                    int LA8_75 = input.LA(4);

                    if ( (LA8_75=='M') ) {
                        int LA8_105 = input.LA(5);

                        if ( (LA8_105=='A') ) {
                            int LA8_132 = input.LA(6);

                            if ( (LA8_132=='R') ) {
                                int LA8_158 = input.LA(7);

                                if ( (LA8_158=='Y') ) {
                                    int LA8_176 = input.LA(8);

                                    if ( (LA8_176==' ') ) {
                                        alt8=30;
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'U':
            {
            int LA8_18 = input.LA(2);

            if ( (LA8_18=='N') ) {
                int LA8_46 = input.LA(3);

                if ( (LA8_46=='I') ) {
                    int LA8_76 = input.LA(4);

                    if ( (LA8_76=='Q') ) {
                        int LA8_106 = input.LA(5);

                        if ( (LA8_106=='U') ) {
                            int LA8_133 = input.LA(6);

                            if ( (LA8_133=='E') ) {
                                int LA8_159 = input.LA(7);

                                if ( ((LA8_159>='#' && LA8_159<='$')||(LA8_159>='0' && LA8_159<='9')||(LA8_159>='A' && LA8_159<='Z')||LA8_159=='_'||(LA8_159>='a' && LA8_159<='z')) ) {
                                    alt8=37;
                                }
                                else {
                                    alt8=31;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'F':
            {
            int LA8_19 = input.LA(2);

            if ( (LA8_19=='O') ) {
                int LA8_47 = input.LA(3);

                if ( (LA8_47=='R') ) {
                    int LA8_77 = input.LA(4);

                    if ( (LA8_77=='E') ) {
                        int LA8_107 = input.LA(5);

                        if ( (LA8_107=='I') ) {
                            int LA8_134 = input.LA(6);

                            if ( (LA8_134=='G') ) {
                                int LA8_160 = input.LA(7);

                                if ( (LA8_160=='N') ) {
                                    int LA8_178 = input.LA(8);

                                    if ( (LA8_178==' ') ) {
                                        alt8=32;
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'R':
            {
            int LA8_20 = input.LA(2);

            if ( (LA8_20=='E') ) {
                int LA8_48 = input.LA(3);

                if ( (LA8_48=='F') ) {
                    int LA8_78 = input.LA(4);

                    if ( (LA8_78=='E') ) {
                        int LA8_108 = input.LA(5);

                        if ( (LA8_108=='R') ) {
                            int LA8_135 = input.LA(6);

                            if ( (LA8_135=='E') ) {
                                int LA8_161 = input.LA(7);

                                if ( (LA8_161=='N') ) {
                                    int LA8_179 = input.LA(8);

                                    if ( (LA8_179=='C') ) {
                                        int LA8_195 = input.LA(9);

                                        if ( (LA8_195=='E') ) {
                                            int LA8_203 = input.LA(10);

                                            if ( (LA8_203=='S') ) {
                                                int LA8_208 = input.LA(11);

                                                if ( ((LA8_208>='#' && LA8_208<='$')||(LA8_208>='0' && LA8_208<='9')||(LA8_208>='A' && LA8_208<='Z')||LA8_208=='_'||(LA8_208>='a' && LA8_208<='z')) ) {
                                                    alt8=37;
                                                }
                                                else {
                                                    alt8=33;}
                                            }
                                            else {
                                                alt8=37;}
                                        }
                                        else {
                                            alt8=37;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
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
            alt8=35;
            }
            break;
        case 'V':
            {
            int LA8_22 = input.LA(2);

            if ( (LA8_22=='A') ) {
                int LA8_49 = input.LA(3);

                if ( (LA8_49=='R') ) {
                    int LA8_79 = input.LA(4);

                    if ( (LA8_79=='C') ) {
                        int LA8_109 = input.LA(5);

                        if ( (LA8_109=='H') ) {
                            int LA8_136 = input.LA(6);

                            if ( (LA8_136=='A') ) {
                                int LA8_162 = input.LA(7);

                                if ( (LA8_162=='R') ) {
                                    int LA8_180 = input.LA(8);

                                    if ( (LA8_180=='2') ) {
                                        int LA8_196 = input.LA(9);

                                        if ( ((LA8_196>='#' && LA8_196<='$')||(LA8_196>='0' && LA8_196<='9')||(LA8_196>='A' && LA8_196<='Z')||LA8_196=='_'||(LA8_196>='a' && LA8_196<='z')) ) {
                                            alt8=37;
                                        }
                                        else {
                                            alt8=36;}
                                    }
                                    else {
                                        alt8=37;}
                                }
                                else {
                                    alt8=37;}
                            }
                            else {
                                alt8=37;}
                        }
                        else {
                            alt8=37;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'D':
            {
            int LA8_23 = input.LA(2);

            if ( (LA8_23=='A') ) {
                int LA8_50 = input.LA(3);

                if ( (LA8_50=='T') ) {
                    int LA8_80 = input.LA(4);

                    if ( (LA8_80=='E') ) {
                        int LA8_110 = input.LA(5);

                        if ( ((LA8_110>='#' && LA8_110<='$')||(LA8_110>='0' && LA8_110<='9')||(LA8_110>='A' && LA8_110<='Z')||LA8_110=='_'||(LA8_110>='a' && LA8_110<='z')) ) {
                            alt8=37;
                        }
                        else {
                            alt8=36;}
                    }
                    else {
                        alt8=37;}
                }
                else {
                    alt8=37;}
            }
            else {
                alt8=37;}
            }
            break;
        case 'G':
        case 'H':
        case 'J':
        case 'K':
        case 'L':
        case 'Q':
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
            alt8=37;
            }
            break;
        case '\'':
            {
            alt8=38;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt8=39;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | ISNULL | NUMBER | TYPE | ID | STRING | WS );", 8, 0, input);

            throw nvae;
        }

        switch (alt8) {
            case 1 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:86: T29
                {
                mT29(); 

                }
                break;
            case 21 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:90: T30
                {
                mT30(); 

                }
                break;
            case 22 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:94: T31
                {
                mT31(); 

                }
                break;
            case 23 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:98: T32
                {
                mT32(); 

                }
                break;
            case 24 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:102: T33
                {
                mT33(); 

                }
                break;
            case 25 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:106: T34
                {
                mT34(); 

                }
                break;
            case 26 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:110: T35
                {
                mT35(); 

                }
                break;
            case 27 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:114: T36
                {
                mT36(); 

                }
                break;
            case 28 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:118: T37
                {
                mT37(); 

                }
                break;
            case 29 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:122: T38
                {
                mT38(); 

                }
                break;
            case 30 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:126: T39
                {
                mT39(); 

                }
                break;
            case 31 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:130: T40
                {
                mT40(); 

                }
                break;
            case 32 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:134: T41
                {
                mT41(); 

                }
                break;
            case 33 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:138: T42
                {
                mT42(); 

                }
                break;
            case 34 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:142: ISNULL
                {
                mISNULL(); 

                }
                break;
            case 35 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:149: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 36 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:156: TYPE
                {
                mTYPE(); 

                }
                break;
            case 37 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:161: ID
                {
                mID(); 

                }
                break;
            case 38 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:164: STRING
                {
                mSTRING(); 

                }
                break;
            case 39 :
                // /home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3:1:171: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}