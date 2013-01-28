/** Delphi 7 grammar
  * Author: Javier Canovas (jlcanovas@um.es)
  * Notes:
  *  This grammar has been extracted from the grammar included in the help section
  *  of Borland Delphi 7 tool
  */
 
grammar delphi;

options {
	backtrack=true;
	memoize=true;
}

mainRule 
	:	program 
	| 	packageDecl 
	| 	library 
	|	unit
	;
	
program  
	:	('program' ident ('(' identList ')')? ';')? programBlock '.'
          ; 
          
unit 
	: 	'unit' ident (portabilityDirective)? ';' interfaceSection implementationSection initSection '.'
	;

packageDecl 	
	: 	'package' ident ';' (requiresClause)? (containsClause)? 'end' '.'
	;

library 
	: 	'library' ident ';' programBlock '.'
	;

programBlock 
	: 	(usesClause)? block
	;  

usesClause 
	: 	'uses' identList ';'
	;

portabilityDirective 
	: 	'platform'
    	|	'deprecated'
    	|	'library'
	;

interfaceSection 
	: 	'interface' (usesClause)? (interfaceDecl)*
	;

interfaceDecl 
	: 	constSection
    	|	typeSection
    	|	varSection
    	|	exportedHeading
	;

exportedHeading 
	: 	procedureHeading ';' (directive)?
	| 	functionHeading ';' (directive)?
	;

implementationSection 
	: 	'implementation' (usesClause)? (declSection)* (exportsStmt)*
	;

block 
	: 	(declSection)? (exportsStmt)* compoundStmt (exportsStmt)*
	;


exportsItem // modified
	: 	ident ('name' | 'index'  constExpr)? ('index' | 'name' constExpr)?
	;
exportsStmt 
	: 	'exports' exportsItem (',' exportsItem)*
	;


declSection 
	: 	labelDeclSection
    	|	constSection
    	| 	typeSection
    	| 	varSection
    	| 	procedureDeclSection
	;

labelDeclSection 
	: 	'label' labelId
	;

constSection 
	: 	'const' (constantDecl ';')*
	;

constantDecl 
	: 	ident '=' constExpr (portabilityDirective)?
    	|	ident ':' typeId '=' typedConstant (portabilityDirective)?
	;

typeSection 
	:	'type' (typeDecl ';')*
	;

typeDecl 
	: 	ident '=' ('type')? type (portabilityDirective)?
	|	ident '=' ('type')? restrictedType (portabilityDirective)?
	;

typedConstant 
	: 	(constExpr | arrayConstant | recordConstant)?
	;

arrayConstant 
	: 	'(' typedConstant ',' ')'
	;

recordConstant 
	: 	'(' (recordFieldConstant ';')* ')' 
	;

recordFieldConstant 
	: 	ident ':' typedConstant
	;

type 
	: 	typeId
    	|	simpleType
   	|	strucType
    	|	pointerType
    	|	stringType 
    	|	procedureType
   	|	variantType
    	|	classRefType
	;

restrictedType 
	: 	objectType
    	|	classType
    	|	interfaceType
	;

classRefType 
	: 	'class' 'of' typeId
	;

simpleType 
	: 	ordinalType 
	| 	realType
	;

realType 
	: 	'real48'
    	|	'real'
    	|	'single'
    	|	'double'
    	|	'extended'
    	|	'currency'
    	|	'comp'
	;

ordinalType 
	: 	subrangeType 
	| 	enumeratedType 
	| 	ordIdent
	;

ordIdent 
	: 	'shortint'
    	|	'smallint'
    	|	'integer'
    	|	'byte'
	| 	'longint'
   	|	'int64'
    	|	'word'
    	|	'boolean'
    	|	'char'
    	|	'widechar'
    	|	'longword'
    	|	'pchar'
	;

variantType 
	: 	'variant'
    	|	'olevariant'
	;

subrangeType 
	: 	constExpr '..' constExpr
	;

enumeratedType 
	: 	'(' (enumeratedTypeElement ',')* ')'
	;

enumeratedTypeElement 
	: 	ident ('=' constExpr )?
	;

stringType 
	: 	'string'
    	|	'ansistring'
    	|	'widestring'
    	|	'string' '(' constExpr ')'
	;

strucType 
	: 	('packed')? (arrayType | setType | fileType | recType ('packed')?)
	;

arrayType 
	: 	'array' ('[' ordinalType (',' ordinalType)* ']')? 'of' type (portabilityDirective)?
	;

recType 
	: 	'record' (fieldList)? 'end' (portabilityDirective) ?
	;

fieldList 
	: 	(fieldDecl ';')+ (variantSection)? (';')?
	;

fieldDecl 
	: 	identList ':' type (portabilityDirective)?
	;

variantSection 
	: 	'case' (ident ':')? typeId 'of' (recVariant ';')+
	;

recVariant 
	: 	constExpr ',' (constExpr)+ ':' '(' (fieldList) ')'
	;

setType 
	: 	'set' 'of' ordinalType (portabilityDirective)?
	;

fileType 
	: 	'file' 'of' typeId (portabilityDirective)?
	;

pointerType 
	: 	'^' typeId (portabilityDirective)?
	;

procedureType 
	: 	(procedureHeading | functionHeading) ('of' 'object')?
	;

varSection 
	: 	'var' (varDecl ';')+
	;

varDecl 
	: 	identList ':' type (('absolute' (ident | constExpr)) | '=' constExpr)? (portabilityDirective)?
//	| 	identList ':' type ('absolute' (ident) | '=' constExpr)? (portabilityDirective)?
	;

expression 
	: 	simpleExpression (relOp simpleExpression)*
	;

simpleExpression 
	: 	('+' | '-')? term (addOp term)*	
	;

term 
	: 	factor (mulOp factor)*
	;

factor 
	: 	designator ('(' exprList ')')?
   	|	'@' designator
    	|	number
    	|	string
    	|	'nil'
    	|	'(' expression ')'
    	|	'not' factor
    	|	setConstructor
    	|	typeId '(' expression ')'
	;

relOp 
	: 	'='
	|	'>'
    	|	'<'
    	|	'<='
    	|	'>='
    	|	'<>'
	|	'in'
    	|	'is'
    	|	'as'
	;

addOp 
	: 	'+'
    	|	'-'
    	|	'or'
    	|	'xor'
	;

mulOp 
	: 	'*'
   	|	'/'
    	|	'div'
    	|	'mod'
    	|	'and'
    	|	'shl'
    	|	'shr'
	;

designator 
	:	designatorSubPart ('.' designator)?
	;

designatorSubPart  // modified
	: 	designatorPart ( '[' exprList ']' | '^')*
	;

designatorPart // modified
	: 	ID 
	|	'&' reservedWord
	|	ID '(' ID '^' ')' // mine
	;
setConstructor 
	: 	'[' (setElement (',' setElement)*) ']'
	;

setElement 
	: 	expression ('..' expression)?
	;

exprList 
	: 	expression (',' expression)*
	;

statement 
	: 	(labelId ':')? (simpleStatement | structStmt) 
	;

stmtList 
	: 	(statement (';')?)*
	;
	
simpleStatement 
	:	designator ':=' expression 	
	|	designator ('(' (exprList) ')')?
	| 	'inherited'
    	|	'goto' labelId
	;

structStmt 
	: 	compoundStmt
    	|	conditionalStmt
    	|	loopStmt
    	|	withStmt
    	|	tryStmt
    	|	raiseStmt
    	|	assemblerStmt
	;

compoundStmt 
	: 	'begin' stmtList 'end'
	;

conditionalStmt  
	: 	ifStmt
	|	caseStmt
	;

ifStmt 
	: 	'if' expression 'then' statement  (';')? ('else' statement  (';')?)?
	;

caseStmt 
	: 	'case' expression 'of' caseSelector ';' (caseSelector ';')* ('else' stmtList) (';') 'end'
	;

caseSelector 
	: 	caseLabel (',' caseLabel)* ':' statement  (';')?
	;

caseLabel 
	: 	constExpr ('..' constExpr)?
	;

loopStmt 
	: 	repeatStmt
	|	whileStmt
	|	forStmt
	;

repeatStmt 
	: 	'repeat' statement  (';')? 'until' expression
	;

whileStmt 
	: 	'while' expression 'do' statement  (';')?
	;

forStmt 
	: 	'for' qualId ':=' expression ('to' | 'downto') expression 'do' statement  (';')?
	;

withStmt  // added simpleStatement
	: 	'with' identList 'do' statement (';')? // changed identList by expression
	;

tryStmt // Joined
	: 	'try' stmtList (';')? ('except' exceptionBlock |  'finally' stmtList) 'end'
	;

exceptionBlock 
	: 	('on' (ident ':')? type'id' 'do' statement (';')?)* (('else')? stmtList )?
	;

raiseStmt 
	: 	//'raise' (object)? ('at' address)?
		'raise' (ID)? ('at' ID)?
	;

assemblerStmt 
	: 	'asm'
    //|	<assemblylanguage>
    //	|	'end'
	;

procedureDeclSection 
	: 	procedureDecl
    	|	functionDecl
	;

procedureDecl 
	:	procedureHeading ';' (directive)? (portabilityDirective)? block ';'
	;

functionDecl 
	: 	functionHeading ';' (directive)? (portabilityDirective)? block ';'
	;

functionHeading 
	: 	('class')? 'function' ident (formalParameters)? ':' type
	;

procedureHeading 
	: 	('class')?'procedure' ident (formalParameters)?
	;

formalParameters 
	: 	'(' (formalParm (';' formalParm)*) ')'
	;

formalParm 
	: 	('var' | 'const' | 'out')? parameter
	;

parameter 
	: 	identList (':' (('array' 'of')? type | 'file'))? // changed simpleType by type, deleted string alternative
	| 	ident ':' type '=' constExpr // changed simpleType by type
	;

directive 
	: 	'cdecl'
    	|	'register'
    	|	'dynamic'
    	|	'virtual'
    	|	'export'
    	|	'external'
    	|	'near'
    	|	'far'
    	|	'forward'
	|	'message' constExpr
    	|	'override'
    	|	'overload'
   	|	'pascal'
   	|	'reintroduce'
    	|	'safecall'
    	|	'stdcall'
    	|	'varargs'
    	|	'local'
    	|	'abstract'
	;

objectType 
	: 	'object' (objHeritage)? (objFieldList)? (methodList)? 'end'
	;

objHeritage 
	: 	'(' qualId ')'
	;

methodList 
	: 	(methodHeading (';' 'virtual')? (';' directive)*) ';'
	;

methodHeading 
	: 	procedureHeading
	|	functionHeading
	|	constructorHeading
    	|	destructorHeading
	;

constructorHeading 
	: 	'constructor' ident (formalParameters)?
	;

destructorHeading 	
	: 	'destructor' ident (formalParameters)?
	;

objFieldList 
	: 	(identList ':' type) ';'
	;

initSection 
	: 	'initialization' stmtList ('finalization' stmtList)? 'end'
    	|	'begin' stmtList 'end'
    	|	'end'
	;

classType 
	: 	'class' (classHeritage)? (classVisibility)? (classFieldList)? (classMethodList)? (classPropertyList)? 'end'
	;

classHeritage 
	: 	'(' identList ')'
	;

classVisibility 
	: 	'public' 
	| 	'protected' 
	| 	'private' 
	| 	'published'
	;

classFieldList 
	: 	classField+
	;

classField
	:	 classVisibility? objFieldList
	;

classMethodList 
	: 	classMethod+
	;
	
classMethod
	:	classVisibility? methodList
	;

classPropertyList  
	: 	classProperty+
	;
	
classProperty
	:	classVisibility 
	|	classVisibility? propertyList
	;
	
propertyList 
	: 	'property' ident (propertyInterface)? (propertySpecifiers)? (portabilityDirective)? ';'
	;

propertyInterface 
	: 	(propertyParameterList)? ':' ident
	;

propertyParameterList 
	: 	'[' identList ':' typeId ';' (identList ':' typeId ';')* ']' 
	;

propertySpecifiers  // Modified constExpr
	: 	('index' constExpr)? ('read' ident)? ('write' ident)? ('stored' (ident | constExpr))? (('default' constExpr) | 'nodefault')? ('implements' typeId)?
	;

interfaceType 
	: 	'interface' (interfaceHeritage) (classMethodList) (classPropertyList)* 'end'
	;

interfaceHeritage 
	: 	'(' identList ')'
	;

requiresClause 
	: 	'requires' identList* ';'
	;

containsClause 
	: 	'contains' identList* ';'
	;

identList 
	: 	ident (',' ident)*
	;

qualId 
	: 	(unitId '.')? ident
	;

typeId  //modified
	: 	(unitId '.')? qualId
	;

ident  // modified
	: 	ID ('.' ID)*
	|	'&' reservedWord
	|	ID '(' ID '^' ')' // mine
	;

reservedWord
	: 	ID
	;

constExpr  // modified
	: 	expression
	|	'(' constExpr (',' constExpr)*')'
	|	'(' recordConstExpr (',' recordConstExpr)* ')'
	;

recordConstExpr // added
	:	ident ':' constExpr
	;

unitId // modified
	: 	ID
	;

labelId  // modified
	: 	ID
	|	INT
	|	HEX
	;

number 
	: 	INT
	|	'#' INT
	;

string   
	: 	QVALUE
	|	DQVALUE
	;

// Lexer tokens
SLASH 			:	 '\u005C';
QUOTE			:	 '\u0027';
ID 				:	 ('a'..'z' | 'A'..'Z' | '_') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' | SLASH | '-')*;
DOUBLEQUOTE		: 	'\u0022';
DQVALUE			: 	DOUBLEQUOTE (options {greedy=false;} : .)* DOUBLEQUOTE;
QVALUE			: 	QUOTE (options {greedy=false;} : .)* QUOTE;
HEX				:	('+' | '-')?  '0' ('x' | 'X') ('0'..'9' | 'a'..'f' | 'A'..'F')+;
INT				: 	('+' | '-')? ('0'..'9')+;
COMMENT			:  	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
MORECOMMENT	:  	 '{' ( options {greedy=false;} : . )* '}' {$channel=HIDDEN;};
LINE_COMMENT		: 	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} ;
WS  				:  	(' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;};    