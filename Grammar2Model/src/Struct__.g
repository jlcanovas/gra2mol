lexer grammar Struct;

T6 : 'struct' ;
T7 : ',' ;
T8 : '{' ;
T9 : '}' ;
T10 : ':' ;
T11 : ';' ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Struct.g3" 17
ID: 
	('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
	;
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Struct.g3" 20
WS: 
	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
	;	