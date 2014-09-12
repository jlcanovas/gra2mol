/** 
 * Grammar of Aemilia language
 **/

grammar simpleGrammar;

options {
	backtrack=true; 
}

archi_type 
	: 'ARCHI_TYPE' word archi_header archi_elem_types archi_topology 'END';

archi_header
	: '(' 'void' ')' | '(' init_constant_list ')';
	
init_constant_list
	: init_constant (',' init_constant)*;
	
init_constant
	: 'const' dataType constName ':=' expr;
	
constName
	: word;
	
archi_elem_types
	: 'ARCHI_ELEM_TYPES' (elem_type)+;
	
elem_type
	: 'ELEM_TYPE' word et_header 
	  'BEHAVIOR' behavior_equation_list
	  'INPUT_INTERACTIONS' interaction_list_input 
	  'OUTPUT_INTERACTIONS' interaction_list_output;
	  
et_header
	: '(' 'void' ')' | '(' constant_list ')';
	
constant_list
	: constant (',' constant)*;
	
constant
	: 'const' dataType constName;
	
interaction_list_input
	: 'void'
	| interaction (';' interaction)*;
	
interaction_list_output
	: 'void'
	| interaction (';' interaction)*;
	
interaction
	: (interaction_type interactionName);
	
interaction_type
	: 'UNI' | 'AND' | 'OR';
	
behavior_equation_list
	: first_equation equations_list? ;
	
first_equation
	: eqName '(' behavior_header_first ')' '=' processTerm ';'?;
	
equations_list
	: equations*;
	
equations
	: eqName '(' behavior_header ')' '=' processTerm ';'?;
	
eqName
	: word;
	
behavior_header_first
	: ('void' | leftSide_first) ';' ('void' | rightSide);
	
behavior_header
	: ('void' | leftSide) ';' ('void' | rightSide);
	
leftSide_first
	: varInit (',' varInit)*;

varInit
	: normalType word ':=' expr;
	
leftSide
	: var (',' var)*;
	
var
	: normalType word;
	
rightSide
	:local (',' local)*;
	
local
	: 'local' normalType word;

processTerm : 'stop'
			 | action '.' process_term_1
			 | 'choice' '{' process_term_2 (',' process_term_2 )* '}';
			 
process_term_1 : processTerm
			   | behavEqInvocation;
			   
behavEqInvocation :
			 word '(' expressionList? ')';
			 
expressionList
	: expr (',' expr)*;
			   
process_term_2 : (condExpr)? processTerm;

condExpr
	:  'cond' '(' expr ')' '->';

action : '<' actionName action_type? ',' action_rate '>';

actionName : word;

action_type : '?' '(' word* (',' word)* ')'
			| '!' '(' expr* (',' expr)* ')';
			
action_rate : 'exp' '(' expr ')'
			| 'inf' '(' expr ',' expr ')'
			| 'inf'
			| '_' '(' expr ',' expr ')'
			| '_';
	
archi_topology
	: 'ARCHI_TOPOLOGY' archi_elem_instances archi_interactions archi_attachments;

archi_elem_instances
	: 'ARCHI_ELEM_INSTANCES' (instances)+;
	
instances
	: istanceName ':' elementType '(' parList? ')' ';'?; 
	
istanceNameFrom
	: word;
	
istanceNameTo
	: word;
	
istanceName
	: word;
	
elementType
	: word;
	
parList
	: word  (',' word)*;
	
archi_interactions
	: 'ARCHI_INTERACTIONS' (archi_interaction_list);
	
archi_interaction_list
	: archi_interaction (';' archi_interaction)*;
	
archi_interaction
	: istanceName '.' interactionName;

archi_attachments
	: 'ARCHI_ATTACHMENTS' (attachment_list);

attachment_list
	: attachment (';' attachment)*;

attachment
	: 'FROM' istanceNameFrom '.' interactionNameFrom 'TO' istanceNameTo '.' interactionNameTo 
	;
	
interactionNameFrom
	: word;
	
interactionNameTo
	: word;
	
interactionName
	: word;

dataType
	: normalType | specialType;
	
normalType
	: 'integer' 
	  | 'integer' '(' DIGIT ',' DIGIT ')' 
	  | 'real' 
	  | 'boolean' 
	  | 'list' '(' elemType ')' 
	  | 'array' '(' DIGIT ',' elemType ')'
	  | 'record' '(' recordList? ')';
	  
elemType
	: 'integer' | 'real' | 'boolean' | 'list' | 'array' | 'record';
	
recordList
	: typeName elemName (',' typeName elemName )*;
	
typeName :'integer' | 'real' | 'boolean' | 'list' | 'array' | 'record' | 'prio' | 'rate' | 'weight';

elemName : word;
	
specialType
	: 'prio' | 'rate' | 'weight';
	
expr 
	: arithExpr
	| relationalExpr
	| booleanExpr
	| numGenExpr
	| mathExpr
	| listExpr
	| arrayExpr
	| recordExpr
	| term
	;
	
arithExpr
	: term arithOp term
	;
	
arithOp
	: '+'| '-'| '*'| '/';
	
relationalExpr
	: term relatOp term
	;
	
relatOp
	: '=' | '!=' | '<' | '<=' | '>' | '>=';
	
booleanExpr 
	: term? boolOp term
	;
	
boolOp
	: '&&'| '||' | '!';
	
mathExpr
	: mathOp '('expressionList? ')'
	;
	
mathOp
	: 'mod' 
	| 'abs' 
	| 'ceil'
	| 'floor' 
	| 'min' 
	| 'max'
	| 'power' 
	| 'epower' 
	| 'loge' 
	| 'log10' 
	| 'sqrt' 
	| 'sin' 
	| 'cos'
	; 
	
numGenExpr
	: numGenOp '(' expressionList? ')'
	;
	
numGenOp
	: 'c_uniform' 
	| 'erlang' 
	| 'gamma'
	| 'exponential' 
	| 'weibull'
	| 'beta' 
	| 'normal' 
	| 'pareto' 
	| 'b_pareto' 
	| 'd_uniform'
	| 'bernoulli' 
	| 'binomial' 
	| 'poisson' 
	| 'neg_binomial'
	| 'geometric'
	| 'pascal'
	;
	
listExpr
	: listOp '(' expressionList? ')'
	;
	
listOp
	: 'list_cons'
	| 'first'
	| 'tail'
	| 'concat'
	| 'insert'
	| 'remove' 
	| 'length' 
	;
	
arrayExpr
	: arrayOp '(' expressionList? ')'
	;
	
arrayOp
	: 'array_cons' | 'read' | 'write';
	
recordExpr
	: recordOp '(' expressionList? ')'
	;
	
recordOp
	: 'record_cons' | 'get' | 'put';
	
term
	: word | number;
	

word : LETTER DIGIT? LETTER?;

LETTER : ('a'..'z' | 'A'..'Z' | '_')+;

number : DIGIT+ ('.'? DIGIT*)?;
			    
DIGIT : ('0'..'9')+; 

DQUOTE : '\u0022';

DQVAL  : DQUOTE (options {greedy=false;} : .)* DQUOTE;

WS 	   : (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};

COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;    

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
 