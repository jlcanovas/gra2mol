grammar GrammarShellForMancoosi_gen23;

options {
	backtrack=true;
	k=1;
}


mainRule
	: header (statement)*
	;

header
	: SHARP EXCL path  (param)? '\n'
	;


statement
	: template
	| command_statement
	| control_statement
	| loop_statement
	| redirection_statement
	;

template
	: templateA1
	| templateA2
	| templateA3
	| templateA4
	| templateA5
	| templateA6
	| templateA7
	| templateA8
	| templateA9
	| templateA10
	| templateA11
	| templateA12_13
	| templateA14
	| templateA15
	| templateA21
	| templateA22
	| templateA23
	| templateA26
	| templateA27
	| templateA30
	| templateA32
	| templateA33
	| templateA37
	| templateA38
	| templateA39
	| templateA40
	;

templateA1
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-desktop-database' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-desktop-database' param ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA2
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-desktop-database' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-desktop-database' param ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA3
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'install-docs' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'install-docs' param path ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA4
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'install-docs' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'install-docs' param param ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA5
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK param SLASH 'usr' SLASH 'lib' SLASH 'emacsen-common' SLASH 'emacs-package-install' RSBRACK ';' 'then' ('\n')? SLASH 'usr' SLASH 'lib' SLASH 'emacsen-common' SLASH 'emacs-package-install' param ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA6
	:  'if' ('\n')? LSBRACK param SLASH 'usr' SLASH 'lib' SLASH 'emacsen-common' SLASH 'emacs-package-remove' RSBRACK ';' 'then' ('\n')?  SLASH 'usr' SLASH 'lib' SLASH 'emacsen-common' SLASH 'emacs-package-remove' param ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA7
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'update-gconf-defaults' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-gconf-defaults' ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA8
	: 'if' ('\n')?  'which' 'update-gconf-defaults' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-gconf-defaults' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA9
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK  ';' 'then' ('\n')?  'gconf-schemas' DMINUS 'register' word ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA10
	:  'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 'then' ('\n')?  'gconf-schemas' DMINUS 'unregister' word ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA11
	:  'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK  ';' 'then' ('\n')? 'OLD_DIR' EQU  SLASH 'etc'  SLASH 'gconf'  SLASH 'schemas' ('\n')? 'SCHEMA_FILES' EQU DQUOTE ID DQUOTE '\n' 'if' ('\n')? LSBRACK ('\n')? param DOLLAR 'OLD_DIR' RSBRACK ';' 'then' ('\n')? 'for' ('\n')? 'SCHEMA' ('\n')? 'in' ('\n')? DOLLAR 'SCHEMA_FILES' ';' 'do' '\n'  'rm' param DOLLAR 'OLD_DIR' SLASH DOLLAR 'SCHEMA' '\n' 'done' ('\n' | ';')  'rmdir' param 
	DMINUS 'ignore-fail-on-non-empty' DOLLAR 'OLD_DIR' ('\n' | ';') 'fi' ('\n' | ';') 'fi' ('\n' | ';')
	; 

templateA12_13
	: 'if' ('\n')?  'which' 'update-icon-caches' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-icon-caches' (param)+ ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA14
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK  ';' 'then' ('\n')? 'install-info' DMINUS 'quiet' (param) ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA15
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? OR ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'upgrade' DQUOTE? RSBRACK ';' 'then' ('\n')? 'install-info' DMINUS 'quiet' DMINUS 'remove' (param) ('\n' | ';') 'fi' ('\n' | ';')
	;
// #ERROR_HANDLER# --> simple_command???
templateA21
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'purge' DQUOTE? RSBRACK ';' 'then' ('\n')? 'update-rc.d' param 'remove' GREAT path OR simple_command ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA22
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ';' 'then' ('\n')? 'ldconfig' ('\n' | ';') 'fi' ('\n' | ';') 
	;

templateA23
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ';' 'then' ('\n')? 'ldconfig' ('\n' | ';') 'fi' ('\n' | ';') 
	;
	
templateA26
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK param DQUOTE AP 'which' 'update-menus' DIGIT GREAT path AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-menus' ('\n' | ';') 'fi' ('\n' | ';')  	
 	;

templateA27
	:  'if' ('\n')? LSBRACK param DQUOTE AP 'which' 'update-menus' DIGIT GREAT path AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-menus' ('\n' | ';') 'fi' ('\n' | ';')  
	;

templateA30
	: 'PYTHON' EQU number ('\n' | ';') 'if' ('\n')? 'which' DOLLAR 'PYTHON' GREAT path DIGIT GREATAND DIGIT ('\n')? AND ('\n')?  LSBRACK param SLASH 'usr' SLASH 'lib' SLASH DOLLAR 'PYTHON' SLASH 'compileall.py' RSBRACK ';' 'then' ('\n')? 'DIRLIST' EQU DQUOTE param+ DQUOTE ( '\n' | ';' ) 'for' ('\n')? word 'in' DOLLAR 'DIRLIST' ';' 'do' '\n' DOLLAR 'PYTHON' SLASH 'usr' SLASH 'lib' SLASH DOLLAR 'PYTHON' SLASH 'compileall.py' param word ('\n' | ';') 'done' ('\n' | ';') 'fi' ('\n' | ';')
	;
	
templateA32
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'scrollkeeper-update' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'scrollkeeper-update' param ('\n' | ';') 'fi' ('\n' | ';')	
 	;

templateA33
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'remove' DQUOTE? RSBRACK ('\n')? AND ('\n')? 'which' 'scrollkeeper-update' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'scrollkeeper-update' param ('\n' | ';') 'fi' ('\n' | ';')	
 	;

templateA37
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK param DQUOTE AP 'which' 'update-mime-database'  GREAT path AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-mime-database' SLASH 'usr' SLASH 'share' SLASH' mime' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA38
	:  'if' ('\n')? LSBRACK param DQUOTE AP 'which' 'update-mime-database' DIGIT GREAT path AP DQUOTE RSBRACK ';' 'then' ('\n')? 'update-mime-database' SLASH 'usr' SLASH 'share' SLASH 'mime' ('\n' | ';') 'fi' ('\n' | ';')	
 	;

templateA39
	: 'if' ('\n')? LSBRACK DQUOTE? input_variable DQUOTE? EQU DQUOTE? 'configure' DQUOTE? RSBRACK ('\n')? AND ('\n')? LSBRACK param DQUOTE AP 'which' 'update-mime' DIGIT GREAT path AP DQUOTE RSBRACK ';' 'then'  ('\n')? 'update-mime' ('\n' | ';') 'fi' ('\n' | ';')
	;

templateA40
	:  'if' ('\n')?  'which' 'update-mime' GREAT path DIGIT GREATAND DIGIT ';' 'then' ('\n')? 'update-mime' param ('\n' | ';') 'fi' ('\n' | ';')
	;

token_template
	: 'update-desktop-database'
	| 'which'
	| 'configure'
	| 'remove'
	| 'install-docs'
	| 'upgrade'
	| 'update-gconf-defaults'
	| 'register'
	| 'unregister'
	| 'OLD_DIR'
	| 'SCHEMA_FILES'
	| 'SCHEMA'
	| 'purge'
	| 'rm'
	| 'rmdir'
	| 'ignore-fail-on-non-empty'
	| 'update-icon-cache'
	| 'quiet'
	| 'install-info'
	| 'update-rc.d'
	| 'ldconfig'
	| 'update-menus'
	| 'PYTHON'
	| 'DIRLIST'
	| 'scrollkeeper-update'
	| 'update-mime-database'
	| 'usr'
	| 'share'
	| 'mime'
	| 'lib'
	| 'compileall.py'
	| 'emacsen-common'
	| 'emacs-package-install'
	| 'emacs-package-remove'
	| 'etc'
	| 'gconf'
	| 'schemas'
	;

redirection_statement
	: statement_group redirection ('\n' | ';')
	;

redirection
	: (GREAT
	//| LESS
	| DIGIT GREAT
	//| NUMBER LESS
	| DGREAT
	//| NUMBER DGREAT
	| DLESS
	//| LESSAND
	//| NUMBER LESSAND
	| GREATAND
	| DIGIT GREATAND
	//| DLESSDASH
	//| NUMBER DLESSDASH
	//| LESSAND
	//| NUMBER LESSAND
	| GREATAND
	| DIGIT GREATAND
	//| DLESSDASH
	//| NUMBER DLESSDASH
	| ANDGREAT
	//| NUMBER LESSGREAT
	//| LESSGREAT
	//| CLOBBER
	//| NUMBER CLOBBER
	//| NUMBER DLESS
	) ( path | word)
	| LESSAND DIGIT
	| DIGIT LESSAND DIGIT
	| GREATAND DIGIT
	| DIGIT GREATAND DIGIT
	//| GREATAND MINUS
	//| NUMBER GREATAND MINUS
	//| LESSAND MINUS
	//| NUMBER LESSAND MINUS
	;
	
statement_group
	: LPAR ('\n')? statement* RPAR
	| LGRAF ('\n')? statement* (';')? RGRAF
	;

	
command_statement
	: list_of_commands ('\n' | ';')
 	;
	
command_name
	: ID
	| path
	| DOT
	| token_template
	;

nestedCommand
	: command_name param* 
	;

control_statement
	: if_statement
	| case_statement
	;
   
loop_statement
	: for_statement
	| until_statement
	| while_statement
	;
    
until_statement
	: 'until' ('\n')? condition (';')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;


while_statement
	: 'while' ('\n')? condition (';')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;

case_statement
	: 'case' ('\n')? (DQUOTE)? word (DQUOTE)? 'in' ('\n')? body_case+ 'esac' ('\n' | ';')
	;
	
body_case
	: word ('\n')? (VBAR word)* ('\n')? RPAR ('\n')? (statement)* ('\n')? DSEMI ('\n')?
	;

if_statement
	: 'if' ('\n')? condition (';')? 'then' ('\n')? statement* ifelse_branch* else_branch?  'fi' ('\n' | ';')
	;

ifelse_branch
	: 'elif' ('\n')? condition (';')? 'then' ('\n')? statement*
	;
	
else_branch
	: 'else' ('\n')? statement*
	;

condition
	: conditional_expr_list ((AND | OR) command_expr_list)*
	| command_expr_list ((AND | OR) conditional_expr_list)*
	;

conditional_expr_list
	: conditional_expression ((AND | OR) ('\n')? conditional_expression)*
	;
	
command_expr_list
	: pipeline ((AND | OR) ('\n')? pipeline)*
	;

for_statement
	: 'for' ('\n')? word 'in' word (';')? 'do' ('\n')? statement* 'done' ('\n' | ';')
	;

assignment_statement
	: word EQU param
	| word EQU DQUOTE param+ DQUOTE
	;
	
conditional_expression
	:  LSBRACK EXCL? (boolean_expression | command_expression)  RSBRACK
	;

boolean_expression
	: DQUOTE? word DQUOTE? (EQU | NOTEQU) DQUOTE? (word | path) DQUOTE?
	;

command_expression
	: param DQUOTE? (param)+ DQUOTE?
	;

substitution_variable
	: DOLLAR LGRAF ID RGRAF
	;

input_variable
	: DOLLAR DIGIT
	;
	
in_command_variable
	: DOLLAR ID
	;	

in_assignment_variable_or_simple_string
	: ID
	;
	
external_variable
	: UNDERSCORE ID
	| DOLLAR UNDERSCORE ID
	;
	
special_variable
	: DOLLAR QMARK
	| DOLLAR DOLLAR
	| DOLLAR EXCL
	;
	
shell_variable
	: DOLLAR 'HOME'
	| DOLLAR 'PATH'
	| DOLLAR 'PS' DIGIT
	;
	
simple_command
	: command_name (DQUOTE? param+ DQUOTE?)*
	| assignment_statement
	;
	 
param
	: MINUS word
	| DMINUS word?
	| path
	| word
	| redirection
	| COLON
	| AP nestedCommand AP
	| number
	| command_name
	;

word
	: input_variable
	| in_assignment_variable_or_simple_string
	| in_command_variable
	| shell_variable
	| special_variable
	| external_variable
	| substitution_variable
	| token_template
	;
	
pipeline
	: ('time')? simple_command (VBAR ('\n')? simple_command)*
	;

list_of_commands
	: pipeline ((AND | OR) pipeline)*
	| asynchronous
	;

asynchronous
	: pipeline (AMPERSAND pipeline)* (AMPERSAND)?
	;


element_path 
	: ID
	| token_template
	;

path
	: (DOLLAR)? (element_path)? (SLASH (DOLLAR)? element_path)+ SLASH?
	;

 number	: DIGIT+ ((DOT | MINUS) DIGIT+)*
 	;


DIGIT	: '0'..'9';

ID	: ('a'..'z' | 'A'..'Z' | '*' | '+')( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | UNDERSCORE | MINUS | QMARK | DOT | '+' | LSBRACK | RSBRACK)*;

AMPERSAND 	: '&';

COLON	: ':';

SCOLON	: ';';

VBAR	: '|';

DOLLAR	: '$';	

UNDERSCORE : '_';	

QMARK 	: '?';

SHARP	: '#';

EXCL	: '!';	

MINUS	: '-';

SLASH	: '/';

BSLASH	: '\\';

DMINUS	: '--';

AND	: '&&';

OR	: '||';

LSBRACK	: '[';

RSBRACK	: ']';

LPAR	: '(';

RPAR	: ')';

LGRAF	: '{';

RGRAF	: '}';

DQUOTE	: '"';

DOT	: '.';

AP      	: '\u0060';

EQU	: '=';

NOTEQU	: '!=';

DLESS	: '<<';

DGREAT	: '>>';

LESSAND	: '<&';

GREATAND	: '>&';

LESSGREAT	: '<>';

DLESSDASH	: '<<-';

CLOBBER	: '>|';

LESS	: '<';

GREAT	: '>';

ANDGREAT	: '&>';

DSEMI	: ';;';

DDOT	: '..';

COMMENT
@init {
    skip();
}	
	: {getCharPositionInLine()>0}? =>  ~(BSLASH) SHARP ~(EXCL) (~('\n' | '\r'))* '\r'?
	| {getCharPositionInLine()==0}? => ( ' ' | '\t')* SHARP ~(EXCL) (~('\n' | '\r'))* '\r'? '\n'
	;
	
BLANKLINE
	:  {getCharPositionInLine()==0}? => ( ' ' | '\t')* '\n' {skip();};

NOTNEWLINE	: (BSLASH '\n') {skip();};

WS 	: ( ' ' | '\t')+ { $channel=HIDDEN;};

