/** 
 * An example grammar for a simple language
 */

grammar simpleGrammar;

options {
	backtrack=true; 
}

mainRule
	: statement*
	;

		
statement
	: print_statement
	;
	
print_statement
	: 'print' DQVAL
	;


DQUOTE : '\u0022';
DQVAL  : DQUOTE (options {greedy=false;} : .)* DQUOTE;

WS 	   : (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;    

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
