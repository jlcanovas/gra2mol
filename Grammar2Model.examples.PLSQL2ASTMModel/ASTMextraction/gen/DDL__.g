lexer grammar DDL;

T10 : 'CREATE TABLE' ;
T11 : '(' ;
T12 : ',' ;
T13 : ')' ;
T14 : ';' ;
T15 : 'ALTER TABLE' ;
T16 : 'ADD' ;
T17 : 'ENABLE' ;
T18 : 'CONSTRAINT' ;
T19 : 'COMMENT ON' ;
T20 : 'TABLE' ;
T21 : 'COLUMN' ;
T22 : '.' ;
T23 : 'IS' ;
T24 : 'CREATE SEQUENCE' ;
T25 : 'INCREMENT' ;
T26 : 'BY' ;
T27 : 'START' ;
T28 : 'WITH' ;
T29 : 'MAXVALUE' ;
T30 : 'NOMAXVALUE' ;
T31 : 'MINVALUE' ;
T32 : 'NOMINVALUE' ;
T33 : 'CYCLE' ;
T34 : 'NOCYCLE' ;
T35 : 'CACHE' ;
T36 : 'NOCACHE' ;
T37 : 'ORDER' ;
T38 : 'NOORDER' ;
T39 : 'PRIMARY KEY' ;
T40 : 'UNIQUE' ;
T41 : 'FOREIGN KEY' ;
T42 : 'REFERENCES' ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1145
ISNULL : 'NULL' | 'NOT NULL'
;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1148
NUMBER : (('1'..'9')('0'..'9')*) | ('0')
;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1151
TYPE : 'NUMBER' | 'VARCHAR2' | 'DATE' 
;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1154
ID : ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
  // ~(WS)+
;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1158
STRING : '\'' ~('\'')* '\''
;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/DDL.ge3" 1161
WS : (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;}
;
