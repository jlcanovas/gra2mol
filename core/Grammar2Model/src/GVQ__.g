lexer grammar GVQ;
@header {
	package gts.modernization.parser.views;
}

T12 : 'rule' ;
T13 : 'end_rule' ;
T14 : 'creates' ;
T15 : 'queries' ;
T16 : ':' ;
T17 : ';' ;
T18 : '[' ;
T19 : ']' ;
T20 : '(' ;
T21 : ',' ;
T22 : ')' ;
T23 : 'init' ;
T24 : '=' ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 151
DOT: '\u002E';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 152
QUOTE: '\u0027';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 153
DOUBLEQUOTE: '\u0022';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 154
BAR: '\u002F';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 155
DOUBLEBAR: '\u002F\u002F';
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 156
OPERATION:
	('+'|'-'|'*'|'\u002F')
	;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 159
ID: 
	('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
	;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\G2M.g3" 162
WS: 
	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
	;	
