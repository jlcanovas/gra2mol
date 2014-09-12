/** 
 * An example grammar for iMacros
 */

grammar iMacros;

options {
	backtrack=true; 
}

mainRule
	: version_statement? statement*
	;

version_statement
	: 'VERSION' version_attr*
	;
		
statement
	: tag_statement | url_statement | tab_statement
	; 
	
tag_statement
	: 'TAG' tag_attr*
	; 

url_statement
	: 'URL' url_attr*
	;
	
tab_statement
	: 'TAB' tab_attr*
	;
	
version_attr
	: 'BUILD' '='DQVAL
	;
	
tag_attr
	: ('TYPE' | 'ATTR' | 'POS' | 'CONTENT') '='DQVAL
	;
	
url_attr
	: 'GOTO' '='DQVAL
	;
	
tab_attr
	: 'T' '='DQVAL
	;

DAPOSTROPHE : '\u0027';
DQVAL  : (options {greedy=false;} : ~(' ')+);

WS	: (options {greedy=false;} : ' '+) {$channel=HIDDEN;};