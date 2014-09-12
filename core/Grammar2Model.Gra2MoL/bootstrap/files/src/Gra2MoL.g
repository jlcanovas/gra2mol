grammar Gra2MoL;

options {
	output=template;
}

// Parser rules
	
transformation 
	:	('grammar' ':' sourceGrammar=DQVALUE ';')? 
		('metamodel' ':' targetMetamodel=DQVALUE ';')?
		hDef=hash* rDef=rule* 
	;
	
hash 
	:	 'hash' ID hashValue (',' hashValue)* 'end_hash'
	;
	
hashValue 
	:	hashValuePart '->' hashValuePart
	|	'default' '->' hashValuePart
	;

hashValuePart 
	:	DQVALUE
	|	'G' '(' ID ')'
	|	'MM' '(' normalName ')'
	;	
	
rule
	:	ruleType ruleName fromElement contextElement? toElement? queryList initList 'end_rule'
	;

ruleType 
	:	'rule'
	|	'skip_rule'
	|	'copy_rule'
	|	'mixin_rule'
	;

ruleName
	:	(QUOTE)? ID (QUOTE)?
	;

fromElement
	: 	'from' id ('[' 'unique' ']')? ('{' filterExpression '}')? (filterUnit)? (ID)?
	;
	
contextElement
	: 	'context' ID (',' ID)*
	;

toElement
	: 	'to' normalName (al=ID)?
	;

normalName
	: 	ID ((DOT | DDOTS) ID)*
	;

queryList
	:	'queries' query*
	;

query
	:	ID ':' ( '{' queryControl '}' )? ('(' ID ')')? filterUnit ';'
	;  
	
queryControl
	:	'for' 'each' ID 'in' ID
	|	'greater' (ID ('[' NUMBER ']')? DOT)? ID 
	;
	
filterUnit 
	:	filterUnitElement ('{' filterExpression '}')? (filterUnit)?
	;

filterUnitElement 
	: 	TRIPLEBAR filterElement (filterOperation)?
	|	DOUBLEBAR filterElement (filterOperation)?
	|	BAR filterElement (filterOperation)?
	; 

filterOperation
	: '[' 'first' ']'	
	| '[' NUMBER ']'
	| '[' 'last' ']'
	| DOT
	| '[' 'unique' ']'
	;

filterExpression
	:	filterExpressionAlt (AND filterExpressionAlt)* 
	;

filterExpressionAlt
	:	filterExpressionNot (OR filterExpressionNot)* 
	;
	
filterExpressionNot
	:	(NOT)? filterExpressionAtom
	;
		
filterExpressionAtom
	:	('all')? expressionElement DOT filterExpressionOperator ('(' param (',' param)* ')')?
	|  '(' filterExpression ')'
	;

filterExpressionOperator
	:	ID
	;
	
expressionElement
	: 	AT '[' NUMBER ']' 
	|	ID ('[' (NUMBER | 'last') ']')?
	;
	
filterElement
	:	AL id 
	| 	id  
	;
	
initList
	:	('mapping' | 'mappings' | 'do') init*
	;
	
init
	:	initName '=' initElementValue ';'
	|	'if' '(' filterExpression ')' 'then' init* (elsePart)? 'end_if'
	| 	'skip' ID ';'
	;

elsePart
	:   'else' init*
	;

initName
	: v=id (DOT ID)*
	;
	
initElementValue
	: ID 
	| DQVALUE 
	| NUMBER 
	| ID DOT ID ('*' | '[' param ']')?
	| param PLUS param (PLUS param)* 
	| 'new' normalName
	| 'map' ID '(' param  ')'
	| 'extract' ID 
	| 'extractID' ID 		
	| 'execute' ID ID	
	| 'removeQuotes' ID DOT ID ('[' param ']')?	
	| 'count' ID 
	| 'convertHexToString' ID DOT ID 		
	| 'ext' normalName ('(' param (',' param)? ')')?		
	;	
	
param 
	: id1=ID ('[' pExt1=paramExtension ']')? DOT id2=ID ('[' pExt2=paramExtension ']')? 
	| ID 
	| DQVALUE 
 	| NUMBER	
	;	

paramExtension
	: 'last'
	| NUMBER 
	| ext1=ID
	;

id
	: IDESC 
	| ID 
	;
	
// Lexer rules
AND: '\u0026\u0026';
OR: '\u007C\u007C';
AT: '\u0040';
AL: '\u0023';
DOT: '\u002E';
PLUS: '\u002B';
NOT: '\u0021';
DDOTS: '\u003A\u003A';
QUOTE: '\u0027';
DOUBLEQUOTE: '\u0022';
BAR: '\u002F';
DOUBLEBAR: '\u002F\u002F';
TRIPLEBAR: '\u002F\u002F\u002F';
DQVALUE:
	DOUBLEQUOTE (options {greedy=false;} : .)* DOUBLEQUOTE
	;
OPERATION:
	('+'|'-'|'*'|'\u002F')
	;
ID: 
	('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
	;
IDESC: 
	'_' ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
	;	
NUMBER:
	('+' | '-')? ('0'..'9')+
	;
WS: 
	( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
	;	
ML_COMMENT:
	'/*' (options {greedy=false;} : .)* '*/' { $channel=HIDDEN;}
	;
	
OL_COMMENT: '--' ( options {greedy=false;} : . )* '\n'+ { $channel=HIDDEN;}
	;

