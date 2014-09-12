lexer grammar Sql;

T30 : 'SHOW' ;
T31 : 'ERRORS' ;
T32 : 'CREATE' ;
T33 : 'OR' ;
T34 : 'REPLACE' ;
T35 : 'PACKAGE' ;
T36 : 'IS' ;
T37 : 'AS' ;
T38 : 'END' ;
T39 : 'CONSTANT' ;
T40 : 'NOT NULL' ;
T41 : 'DEFAULT' ;
T42 : 'PROCEDURE' ;
T43 : 'FUNCTION' ;
T44 : 'RETURN' ;
T45 : 'DETERMINISTIC' ;
T46 : 'IN' ;
T47 : 'OUT' ;
T48 : 'INOUT' ;
T49 : 'NUMBER' ;
T50 : 'CHAR' ;
T51 : 'BOOLEAN' ;
T52 : 'DATE' ;
T53 : 'VARCHAR2' ;
T54 : 'VARCHAR' ;
T55 : 'ROWTYPE' ;
T56 : 'TYPE' ;
T57 : 'PRAGMA' ;
T58 : 'RESTRICT_REFERENCES' ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 80
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 81
ANY_CHARACTER: 'a' .. 'z' ;    
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 82
QUOTED_STRING: '\'' ( ~'\'' )* '\'';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 83
SEMI: ';'; 
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 84
COLON: ':';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 85
DOT: '.' ; 
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 86
COMMA: ',' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 87
ASTERISK: '*' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 88
AT_SIGN: '@' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 89
OPEN_PAREN: '(' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 90
CLOSE_PAREN: ')' ;    
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 91
PLUS: '+' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 92
MINUS: '-' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 93
DIVIDE: '/' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 94
EQ: '=' ; 
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 95
PERCENTAGE : '%' ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 96
DOUBLEDOT: '..';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 97
START_LABEL: '<<' ;	
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 98
END_LABEL: '>>'	;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 99
ASSIGNMENT_EQ: ':='	;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 100
NUMBER 
    :
        ( PLUS | MINUS )?
        ( ( N DOT N ) => N DOT N | DOT N | N )
        ( 'e' ( PLUS | MINUS )? N )?
    ;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 106
protected N : '0' .. '9' ( '0' .. '9' )* ; 
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 107
IDENTIFIER 
    : 
        ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
    ;  
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 111
COMMENT: '/*' ( options {greedy=false;} : . )* '*/';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Sql.g3" 112
LINECOMMENT: '--' ( options {greedy=false;} : . )* '\n' { $channel = HIDDEN; } ; 