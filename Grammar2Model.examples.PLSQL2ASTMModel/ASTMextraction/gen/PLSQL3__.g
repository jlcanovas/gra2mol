lexer grammar PLSQL3;

T50 : 'AS' ;
T51 : 'IN' ;
T52 : 'DEFAULT' ;
T53 : 'BEGIN' ;
T54 : 'EXCEPTION' ;
T55 : 'END' ;
T56 : 'TRUE' ;
T57 : 'FALSE' ;
T58 : 'CASE' ;
T59 : 'UNIQUE' ;
T60 : 'COMMIT' ;
T61 : 'AND' ;
T62 : 'NOT' ;
T63 : 'BETWEEN' ;
T64 : 'PRIOR' ;
T65 : 'EXISTS' ;
T66 : 'ANY' ;
T67 : 'ALL' ;
T68 : 'IS' ;
T69 : 'NULL' ;
T70 : 'SET' ;
T71 : 'OF' ;
T72 : 'LIKE' ;
T73 : 'OR' ;
T74 : 'CREATE' ;
T75 : 'BINARY_INTEGER' ;
T76 : 'BINARY_FLOAT' ;
T77 : 'BINARY_DOUBLE' ;
T78 : 'NATURAL' ;
T79 : 'POSITIVE' ;
T80 : 'NUMBER' ;
T81 : 'NUMERIC' ;
T82 : 'DECIMAL' ;
T83 : 'DEC' ;
T84 : 'LONG' ;
T85 : 'RAW' ;
T86 : 'BOOLEAN' ;
T87 : 'DATE' ;
T88 : 'TO' ;
T89 : 'WITH' ;
T90 : 'INTEGER' ;
T91 : 'INT' ;
T92 : 'SMALLINT' ;
T93 : 'FLOAT' ;
T94 : 'REAL' ;
T95 : 'DOUBLE' ;
T96 : 'CHAR' ;
T97 : 'CHARACTER' ;
T98 : 'VARCHAR' ;
T99 : 'VARCHAR2' ;
T100 : 'NCHAR' ;
T101 : 'NVARCHAR' ;
T102 : 'NVARCHAR2' ;
T103 : 'NATIONAL' ;
T104 : 'MLSLABEL' ;
T105 : 'PLS_INTEGER' ;
T106 : 'BLOB' ;
T107 : 'CLOB' ;
T108 : 'NCLOB' ;
T109 : 'BFILE' ;
T110 : 'ROWID' ;
T111 : 'UROWID' ;
T112 : 'DELETE' ;
T113 : 'FROM' ;
T114 : 'WHERE' ;
T115 : 'ELSE' ;
T116 : 'WHEN' ;
T117 : 'THEN' ;
T118 : 'FETCH' ;
T119 : 'INTO' ;
T120 : 'FUNCTION' ;
T121 : 'DISTINCT' ;
T122 : 'DETERMINISTIC' ;
T123 : 'GOTO' ;
T124 : 'GROUP' ;
T125 : 'BY' ;
T126 : 'START' ;
T127 : 'CONNECT' ;
T128 : 'ON' ;
T129 : 'IF' ;
T130 : 'INSERT' ;
T131 : 'VALUES' ;
T132 : 'ROW' ;
T133 : 'SHARE' ;
T134 : 'EXCLUSIVE' ;
T135 : 'UPDATE' ;
T136 : 'LOCK' ;
T137 : 'TABLE' ;
T138 : 'MODE' ;
T139 : 'NOWAIT' ;
T140 : 'FOR' ;
T141 : 'ORDER' ;
T142 : 'ASC' ;
T143 : 'DESC' ;
T144 : 'PROCEDURE' ;
T145 : 'ROWS' ;
T146 : 'SAVEPOINT' ;
T147 : 'COMMENT' ;
T148 : 'SELECT' ;
T149 : 'HAVING' ;
T150 : 'UNION' ;
T151 : 'INTERSECT' ;
T152 : 'MINUS' ;
T153 : 'SQL' ;
T154 : 'INDEX' ;
T155 : 'CONSTANT' ;
T156 : 'A' ;
T157 : 'AUTOMATIC' ;
T158 : 'COUNT' ;
T159 : 'CROSS' ;
T160 : 'CUBE' ;
T161 : 'CURRENT_OF' ;
T162 : 'DAY' ;
T163 : 'DBTIMEZONE' ;
T164 : 'DECLARE' ;
T165 : 'DECREMENT' ;
T166 : 'DIMENSION' ;
T167 : 'EMPTY' ;
T168 : 'EQUALS_PATH' ;
T169 : 'ESCAPE' ;
T170 : 'FIRST' ;
T171 : 'FULL' ;
T172 : 'GROUPING' ;
T173 : 'IGNORE' ;
T174 : 'INCREMENT' ;
T175 : 'INFINITE' ;
T176 : 'INNER' ;
T177 : 'INTERVAL' ;
T178 : 'ITERATE' ;
T179 : 'JOIN' ;
T180 : 'KEEP' ;
T181 : 'LAST' ;
T182 : 'LEFT' ;
T183 : 'LIKE2' ;
T184 : 'LIKE4' ;
T185 : 'LIKEC' ;
T186 : 'LOCAL' ;
T187 : 'MAIN' ;
T188 : 'MEASURES' ;
T189 : 'MEMBER' ;
T190 : 'MODEL' ;
T191 : 'MONTH' ;
T192 : 'NAN' ;
T193 : 'NAV' ;
T194 : 'NOCYCLE' ;
T195 : 'NULLS' ;
T196 : 'ONLY' ;
T197 : 'OUTER' ;
T198 : 'PARTITION' ;
T199 : 'PRECISION' ;
T200 : 'PRESENT' ;
T201 : 'REFERENCE' ;
T202 : 'REGEXP_LIKE' ;
T203 : 'RIGHT' ;
T204 : 'ROLLUP' ;
T205 : 'RULES' ;
T206 : 'SECOND' ;
T207 : 'SECONDS' ;
T208 : 'SEQUENTIAL' ;
T209 : 'SESSIONTIMEZONE' ;
T210 : 'SETS' ;
T211 : 'SIBLINGS' ;
T212 : 'SINGLE' ;
T213 : 'SOME' ;
T214 : 'SUBMULTISET' ;
T215 : 'TIME' ;
T216 : 'TIMESTAMP' ;
T217 : 'THE' ;
T218 : 'UNDER_PATH' ;
T219 : 'UNTIL' ;
T220 : 'UPDATED' ;
T221 : 'UPSERT' ;
T222 : 'WAIT' ;
T223 : 'YEAR' ;
T224 : 'ZONE' ;
T225 : 'ARRAY' ;
T226 : 'AUTONOMOUS_TRANSACTION' ;
T227 : 'BODY' ;
T228 : 'BUILTIN' ;
T229 : 'BULK' ;
T230 : 'BYTE' ;
T231 : 'CLOSE' ;
T232 : 'COLLECT' ;
T233 : 'CURSOR' ;
T234 : 'ELSIF' ;
T235 : 'EXCEPTION_INIT' ;
T236 : 'EXIT' ;
T237 : 'FIPSFLAG' ;
T238 : 'INTERFACE' ;
T239 : 'LOOP' ;
T240 : 'NEW' ;
T241 : 'NEW_NAMES' ;
T242 : 'OPEN' ;
T243 : 'OUT' ;
T244 : 'PACKAGE' ;
T245 : 'PRAGMA' ;
T246 : 'RAISE' ;
T247 : 'RANGE' ;
T248 : 'READ' ;
T249 : 'RECORD' ;
T250 : 'REF' ;
T251 : 'REPLACE' ;
T252 : 'RESTRICT_REFERENCES' ;
T253 : 'RETURN' ;
T254 : 'RETURNING' ;
T255 : 'REVERSE' ;
T256 : 'ROLLBACK' ;
T257 : 'SERIALLY_REUSABLE' ;
T258 : 'SUBTYPE' ;
T259 : 'TRANSACTION' ;
T260 : 'TYPE' ;
T261 : 'USING' ;
T262 : 'VARRAY' ;
T263 : 'VARYING' ;
T264 : 'WHILE' ;
T265 : 'WORK' ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18783
QUOTED_STRING
	:	( 'n' )? '\'' ( '\'\'' | ~('\'') )* '\''
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18786
ID /*options { testLiterals=true; }*/
    :	('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
    |	DOUBLEQUOTED_STRING
    ;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18790
SEMI
	:	';'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18793
COLON
	:	':'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18796
DOUBLEDOT
	:	POINT POINT
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18799
DOT
	:	POINT
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18802
fragment
POINT
	:	'.'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18806
COMMA
	:	','
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18809
EXPONENT
	:	'**'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18812
ASTERISK
	:	'*'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18815
AT_SIGN
	:	'@'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18818
RPAREN
	:	')'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18821
LPAREN
	:	'('
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18824
RBRACK
	:	']'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18827
LBRACK
	:	'['
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18830
PLUS
	:	'+'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18833
MINUS
	:	'-'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18836
DIVIDE
	:	'/'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18839
EQ
	:	'='
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18842
PERCENTAGE
	:	'%'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18845
LLABEL
	:	'<<'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18848
RLABEL
	:	'>>'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18851
ASSIGN
	:	':='
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18854
ARROW
	:	'=>'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18857
VERTBAR
	:	'|'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18860
DOUBLEVERTBAR
	:	'||'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18863
NOT_EQ
	:	'<>' | '!=' | '^='
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18866
LTH
	:	'<'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18869
LEQ
	:	'<='
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18872
GTH
	:	'>'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18875
GEQ
	:	'>='
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18878
NUMBER
	:	(	N POINT N |	POINT N	| N	) ( 'E' ( PLUS | MINUS )? N )?
    ;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18881
fragment
N
	: '0' .. '9' ( '0' .. '9' )*
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18885
QUOTE
	:	'\''
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18888
fragment
DOUBLEQUOTED_STRING
	:	'"' ( ~('"') )* '"'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18892
WS	:	(' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18894
SL_COMMENT
	:	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18897
ML_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18900
TYPE_ATTR
	:	'%TYPE'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18903
ROWTYPE_ATTR
	:	'%ROWTYPE'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18906
NOTFOUND_ATTR
	:	'%NOTFOUND'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18909
FOUND_ATTR
	:	'%FOUND'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18912
ISOPEN_ATTR
	:	'%ISOPEN'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18915
ROWCOUNT_ATTR
	:	'%ROWCOUNT'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18918
BULK_ROWCOUNT_ATTR
	:	'%BULK_ROWCOUNT'
	;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.PLSQL2ASTMModel/ASTMextraction/gen/PLSQL3.ge3" 18921
CHARSET_ATTR
	:	'%CHARSET'
	;
