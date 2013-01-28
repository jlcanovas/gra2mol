lexer grammar ANTLRv3;

SCOPE : 'scope' ;
FRAGMENT : 'fragment' ;
TREE_BEGIN : '^(' ;
ROOT : '^' ;
BANG : '!' ;
RANGE : '..' ;
REWRITE : '->' ;
T65 : 'lexer' ;
T66 : 'parser' ;
T67 : 'tree' ;
T68 : 'grammar' ;
T69 : ';' ;
T70 : '}' ;
T71 : '=' ;
T72 : '@' ;
T73 : '::' ;
T74 : '*' ;
T75 : 'protected' ;
T76 : 'public' ;
T77 : 'private' ;
T78 : 'returns' ;
T79 : ':' ;
T80 : 'throws' ;
T81 : ',' ;
T82 : '(' ;
T83 : '|' ;
T84 : ')' ;
T85 : 'catch' ;
T86 : 'finally' ;
T87 : '+=' ;
T88 : '=>' ;
T89 : '~' ;
T90 : '?' ;
T91 : '+' ;
T92 : '.' ;
T93 : '$' ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3050
SL_COMMENT
 	:	'//'
 	 	(	' $ANTLR ' SRC // src directive
 		|	~('\r'|'\n')*
		)
		'\r'? '\n'
		{$channel=HIDDEN;}
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3059
ML_COMMENT
	:	'/*' {if (input.LA(1)=='*') $type=DOC_COMMENT; else $channel=HIDDEN;} .* '*/'
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3063
CHAR_LITERAL
	:	'\'' LITERAL_CHAR '\''
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3067
STRING_LITERAL
	:	'\'' LITERAL_CHAR LITERAL_CHAR* '\''
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3071
fragment
LITERAL_CHAR
	:	ESC
	|	~('\''|'\\')
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3077
DOUBLE_QUOTE_STRING_LITERAL
	:	'"' LITERAL_CHAR* '"'
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3081
DOUBLE_ANGLE_STRING_LITERAL
	:	'<<' .* '>>'
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3085
fragment
ESC	:	'\\'
		(	'n'
		|	'r'
		|	't'
		|	'b'
		|	'f'
		|	'"'
		|	'\''
		|	'\\'
		|	'>'
		|	'u' XDIGIT XDIGIT XDIGIT XDIGIT
		|	. // unknown, leave as it is
		)
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3101
fragment
XDIGIT :
		'0' .. '9'
	|	'a' .. 'f'
	|	'A' .. 'F'
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3108
INT	:	'0'..'9'+
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3111
ARG_ACTION
	:	NESTED_ARG_ACTION
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3115
fragment
NESTED_ARG_ACTION :
	'['
	(	options {greedy=false; k=1;}
	:	NESTED_ARG_ACTION
	|	ACTION_STRING_LITERAL
	|	ACTION_CHAR_LITERAL
	|	.
	)*
	']'
	{setText(getText().substring(1, getText().length()-1));}
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3128
ACTION
	:	NESTED_ACTION ( '?' {$type = SEMPRED;} )?
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3132
fragment
NESTED_ACTION :
	'{'
	(	options {greedy=false; k=3;}
	:	NESTED_ACTION
	|	SL_COMMENT
	|	ML_COMMENT
	|	ACTION_STRING_LITERAL
	|	ACTION_CHAR_LITERAL
	|	.
	)*
	'}'
	{$channel = DEFAULT_TOKEN_CHANNEL;}
   ;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3147
fragment
ACTION_CHAR_LITERAL
	:	'\'' (ACTION_ESC|~('\\'|'\'')) '\''
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3152
fragment
ACTION_STRING_LITERAL
	:	'"' (ACTION_ESC|~('\\'|'"'))+ '"'
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3157
fragment
ACTION_ESC
	:	'\\\''
	|	'\\"'
	|	'\\' ~('\''|'"')
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3164
TOKEN_REF
	:	'A'..'Z' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3168
RULE_REF
	:	'a'..'z' ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3172
/** Match the start of an options section.  Don't allow normal
 *  action processing on the {...} as it's not a action.
 */
OPTIONS
	:	'options' WS_LOOP '{' {$channel=DEFAULT_TOKEN_CHANNEL;} // WS_LOOP sets channel
	;
	
// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3179
TOKENS
	:	'tokens' WS_LOOP '{' {$channel=DEFAULT_TOKEN_CHANNEL;}
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3183
/** Reset the file and line information; useful when the grammar
 *  has been generated so that errors are shown relative to the
 *  original file like the old C preprocessor used to do.
 */
fragment
SRC	:	'src' ' ' file=ACTION_STRING_LITERAL ' ' line=INT {$channel=HIDDEN;}
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3191
WS	:	(	' '
		|	'\t'
		|	'\r'? '\n'
		)+
		{$channel=HIDDEN;}
	;

// $ANTLR src "/home/jlcanovas/workspace/Grammar2Model.examples.extractANTLRModel/files/gen/ANTLRv3.ge3" 3198
fragment
WS_LOOP
	:	(	WS
		|	SL_COMMENT
		|	ML_COMMENT
		)*
		{$channel=HIDDEN;}
	;

