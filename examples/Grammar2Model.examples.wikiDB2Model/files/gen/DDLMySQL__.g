lexer grammar DDLMySQL;

T19 : 'SET' ;
T20 : ',' ;
T21 : ';' ;
T22 : '=' ;
T23 : 'GLOBAL' ;
T24 : 'SESSION' ;
T25 : '@' ;
T26 : 'USE' ;
T27 : 'CREATE' ;
T28 : 'DATABASE' ;
T29 : 'SCHEMA' ;
T30 : 'IF' ;
T31 : 'NOT' ;
T32 : 'EXISTS' ;
T33 : 'DEFAULT' ;
T34 : 'CHARACTER' ;
T35 : 'COLLATE' ;
T36 : 'TEMPORARY' ;
T37 : 'TABLE' ;
T38 : '(' ;
T39 : ')' ;
T40 : 'UNIQUE' ;
T41 : 'PRIMARY' ;
T42 : 'FULLTEXT' ;
T43 : 'INDEX' ;
T44 : 'KEY' ;
T45 : 'NULL' ;
T46 : 'ON' ;
T47 : 'UPDATE' ;
T48 : 'DELETE' ;
T49 : 'AUTO_INCREMENT' ;
T50 : 'COMMENT' ;
T51 : 'COLUMN_FORMAT' ;
T52 : 'FIXED' ;
T53 : 'DYNAMIC' ;
T54 : 'STORAGE' ;
T55 : 'DISK' ;
T56 : 'ASC' ;
T57 : 'DESC' ;
T58 : 'USING' ;
T59 : 'BTREE' ;
T60 : 'HASH' ;
T61 : 'RTREE' ;
T62 : 'KEY_BLOCK_SIZE' ;
T63 : 'WITH' ;
T64 : 'PARSER' ;
T65 : 'BIT' ;
T66 : 'TINYINT' ;
T67 : 'UNSIGNED' ;
T68 : 'ZEROFILL' ;
T69 : 'SMALLINT' ;
T70 : 'MEDIUMINT' ;
T71 : 'INT' ;
T72 : 'INTEGER' ;
T73 : 'BIGINT' ;
T74 : 'REAL' ;
T75 : 'DOUBLE' ;
T76 : 'FLOAT' ;
T77 : 'DECIMAL' ;
T78 : 'NUMERIC' ;
T79 : 'DATE' ;
T80 : 'TIME' ;
T81 : 'TIMESTAMP' ;
T82 : 'DATETIME' ;
T83 : 'YEAR' ;
T84 : 'CHAR' ;
T85 : 'VARCHAR' ;
T86 : 'BINARYTYPE' ;
T87 : 'VARBINARY' ;
T88 : 'TINYBLOB' ;
T89 : 'BLOB' ;
T90 : 'MEDIUMBLOB' ;
T91 : 'LONGBLOB' ;
T92 : 'TINYTEXT' ;
T93 : 'BYNARY' ;
T94 : 'TEXTVAR' ;
T95 : 'MEDIUMTEXT' ;
T96 : 'LONGTEXT' ;
T97 : 'ENUM' ;
T98 : 'ENGINE' ;
T99 : 'AVG_ROW_LENGTH' ;
T100 : 'CHARSET' ;
T101 : 'CHECKSUM' ;
T102 : 'CONNECTION' ;
T103 : 'DELAY_KEY_WRITE' ;
T104 : 'INDEX DIRECTORY' ;
T105 : 'INSERT_METHOD' ;
T106 : 'NO' ;
T107 : 'FIRST' ;
T108 : 'LAST' ;
T109 : 'MAX_ROWS' ;
T110 : 'MIN_ROWS' ;
T111 : 'PACK_KEYS' ;
T112 : 'ROW_FORMAT' ;
T113 : 'COMPRESSED' ;
T114 : 'REDUNDANT' ;
T115 : 'COMPACT' ;
T116 : 'TABLESPACE' ;
T117 : 'UNION' ;
T118 : 'REFERENCES' ;
T119 : 'MATCH' ;
T120 : 'FULL' ;
T121 : 'PARTIAL' ;
T122 : 'SIMPLE' ;
T123 : 'RESTRICT' ;
T124 : 'CASCADE' ;
T125 : 'ACTION' ;
T126 : 'DROP' ;
T127 : 'INSERT' ;
T128 : 'LOW_PRIORITY' ;
T129 : 'DELAYED' ;
T130 : 'HIGH_PRIORITY' ;
T131 : 'IGNORE' ;
T132 : 'INTO' ;
T133 : 'VALUES' ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4925
DOT			: '\u002E';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4926
SLASH		: '\u005C';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4927
OQUOTE		: '\u0060';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4928
QUOTE		: '\u0027';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4929
QVALUE 		: QUOTE (options {greedy=false;} : .)* QUOTE;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4930
DOUBLEQUOTE	: '\u0022';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4931
DQVALUE		: DOUBLEQUOTE (options {greedy=false;} : .)* DOUBLEQUOTE;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4932
NUMBER 		: ('+' | '-')? ('0'..'9')+;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4933
DECNUMBER	: ('+' | '-')?  NUMBER DOT NUMBER+;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4934
HEXNUMBER	: ('+' | '-')?  '0' ('x' | 'X') ('0'..'9' | 'a'..'f' | 'A'..'F')+;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4935
ID 			: ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | SLASH | '-')*;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4936
IDNUMBER 	: ('a'..'z' | 'A'..'Z' | '0'..'9') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4938
WS 			: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4939
ML_COMMENT:
	'/*' (options {greedy=false;} : .)* '*/' (';')? { $channel=HIDDEN;}
	;
	
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.wikiDB2Model/files/gen/DDLMySQL.ge3" 4943
OL_COMMENT: '--' ( options {greedy=false;} : . )* '\n'+ { $channel=HIDDEN;}
	;
