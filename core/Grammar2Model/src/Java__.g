lexer grammar Java;
@members {
protected boolean enumIsKeyword = true;
}

T24 : 'package' ;
T25 : ';' ;
T26 : 'import' ;
T27 : 'static' ;
T28 : '.' ;
T29 : '*' ;
T30 : 'class' ;
T31 : 'extends' ;
T32 : 'implements' ;
T33 : '<' ;
T34 : ',' ;
T35 : '>' ;
T36 : '&' ;
T37 : '{' ;
T38 : '}' ;
T39 : 'interface' ;
T40 : 'void' ;
T41 : '[' ;
T42 : ']' ;
T43 : 'throws' ;
T44 : '=' ;
T45 : 'public' ;
T46 : 'protected' ;
T47 : 'private' ;
T48 : 'abstract' ;
T49 : 'final' ;
T50 : 'native' ;
T51 : 'synchronized' ;
T52 : 'transient' ;
T53 : 'volatile' ;
T54 : 'strictfp' ;
T55 : 'boolean' ;
T56 : 'char' ;
T57 : 'byte' ;
T58 : 'short' ;
T59 : 'int' ;
T60 : 'long' ;
T61 : 'float' ;
T62 : 'double' ;
T63 : '?' ;
T64 : 'super' ;
T65 : '(' ;
T66 : ')' ;
T67 : '...' ;
T68 : 'null' ;
T69 : 'true' ;
T70 : 'false' ;
T71 : '@' ;
T72 : 'default' ;
T73 : 'assert' ;
T74 : ':' ;
T75 : 'if' ;
T76 : 'else' ;
T77 : 'for' ;
T78 : 'while' ;
T79 : 'do' ;
T80 : 'try' ;
T81 : 'finally' ;
T82 : 'switch' ;
T83 : 'return' ;
T84 : 'throw' ;
T85 : 'break' ;
T86 : 'continue' ;
T87 : 'catch' ;
T88 : 'case' ;
T89 : '+=' ;
T90 : '-=' ;
T91 : '*=' ;
T92 : '/=' ;
T93 : '&=' ;
T94 : '|=' ;
T95 : '^=' ;
T96 : '%=' ;
T97 : '||' ;
T98 : '&&' ;
T99 : '|' ;
T100 : '^' ;
T101 : '==' ;
T102 : '!=' ;
T103 : 'instanceof' ;
T104 : '+' ;
T105 : '-' ;
T106 : '/' ;
T107 : '%' ;
T108 : '++' ;
T109 : '--' ;
T110 : '~' ;
T111 : '!' ;
T112 : 'this' ;
T113 : 'new' ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 764
HexLiteral : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 766
DecimalLiteral : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 768
OctalLiteral : '0' ('0'..'7')+ IntegerTypeSuffix? ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 770
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 773
fragment
IntegerTypeSuffix : ('l'|'L') ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 776
FloatingPointLiteral
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 783
fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 786
fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 789
CharacterLiteral
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 793
StringLiteral
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 797
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UnicodeEscape
    |   OctalEscape
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 804
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 811
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 816
ENUM:	'enum' {if ( !enumIsKeyword ) $type=Identifier;}
	;
	
// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 819
Identifier 
    :   Letter (Letter|JavaIDDigit)*
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 823
/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |
       '\u0041'..'\u005a' |
       '\u005f' |
       '\u0061'..'\u007a' |
       '\u00c0'..'\u00d6' |
       '\u00d8'..'\u00f6' |
       '\u00f8'..'\u00ff' |
       '\u0100'..'\u1fff' |
       '\u3040'..'\u318f' |
       '\u3300'..'\u337f' |
       '\u3400'..'\u3d2d' |
       '\u4e00'..'\u9fff' |
       '\uf900'..'\ufaff'
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 843
fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |
       '\u0660'..'\u0669' |
       '\u06f0'..'\u06f9' |
       '\u0966'..'\u096f' |
       '\u09e6'..'\u09ef' |
       '\u0a66'..'\u0a6f' |
       '\u0ae6'..'\u0aef' |
       '\u0b66'..'\u0b6f' |
       '\u0be7'..'\u0bef' |
       '\u0c66'..'\u0c6f' |
       '\u0ce6'..'\u0cef' |
       '\u0d66'..'\u0d6f' |
       '\u0e50'..'\u0e59' |
       '\u0ed0'..'\u0ed9' |
       '\u1040'..'\u1049'
   ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 862
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 865
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

// $ANTLR src "C:\eclipses\eclipse-3.3-ANTLR\workspace\Grammar2Model\src\Java.g3" 869
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
