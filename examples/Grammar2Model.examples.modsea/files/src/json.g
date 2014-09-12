//*******************************************************************************
// * Copyright (c) 2008, 2012
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *    Javier Canovas (jlcanovas@um.es) 
// *******************************************************************************/

grammar json;

options {
	backtrack=true;
}  

mainRule: 
	complexElement | singleElement;

complexElement:
	'[' singleElement (',' singleElement)* ']';

singleElement:
	'{' pairValue (',' pairValue)* '}';

pairValue:
	lhs ':' rhs;

lhs:
	value | complexElement | singleElement;

rhs:
	value | complexElement | singleElement;

value:
	ID | DQVALUE;
	
ID: 			('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*;
DOUBLEQUOTE: 	'\u0022';
DQVALUE: 		DOUBLEQUOTE (options {greedy=false;} : .)* DOUBLEQUOTE;

WS: 			(' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;};
COMMENT: 		'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};    
LINE_COMMENT: 	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
	