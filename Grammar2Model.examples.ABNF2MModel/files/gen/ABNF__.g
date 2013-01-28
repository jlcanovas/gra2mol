lexer grammar ABNF;

T9 : ';' ;
T10 : '[' ;
T11 : '<' ;
T12 : ':' ;
T13 : '>' ;
T14 : '*' ;
T15 : '+' ;
T16 : '?' ;
T17 : ']' ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3" 349
ABSTRACT	: '!';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3" 350
ARROW		: '->';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3" 351
DOUBLEARROW	: '=>';
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3" 352
ID 			: ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-')*;
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.ABNF2MModel/files/gen/ABNF.ge3" 353
WS 			: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
