grammar ABNF;

options {
	backtrack=true;
}  

abnf_definition
	:	rule*
	;
	
rule
	:	hierarchy_rule
	|	specification_rule
	;

hierarchy_rule
	: 	classId (DOUBLEARROW subclassId)+ ';'
	;

specification_rule
	: 	classId ARROW attribute* ';'
	;
	
classId
	:	ID
	;
	
subclassId
	: 	ID
	| 	ABSTRACT ID
	;

attribute
	:	(OPTA='[')? (SEM='<')? NAME=ID ':' TYPE=ID ('>')? (MULTA='*' | MULTB='+' | OPTB='?')? (']')?
	;
	
	
ABSTRACT	: '!';
ARROW		: '->';
DOUBLEARROW	: '=>';
ID 			: ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | '-')*;
WS 			: (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
