
COLON	: '\u003A';
DQUOTE 	: '\u0022';
ID      : ('a'..'z' | 'A'..'Z' | '_' | '+' | '@') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_' | '$' | '#' | '-' | COLON | '+' | '@')*;
STRING 	: DQUOTE (options {greedy=false;} : .)* DQUOTE;
WS 	   	: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};