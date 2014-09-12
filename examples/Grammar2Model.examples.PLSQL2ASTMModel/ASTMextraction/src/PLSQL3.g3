/*******************************************************************************
 * Copyright (c) 2010
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Javier Canovas (jlcanovas@um.es) 
 *******************************************************************************/


/*******************************************************************************

DESCRIPTION:
		Oracle PL/SQL Grammar for ANTLR v3, target language Java
AUTHOR:
		Javier Canovas (jlcanovas@um.es)
DATE:
		03-Nov-2008
BASED ON:
		PLSQL3.g for ANTLR v3 and target language C#
		Andrey Kharitonkin (thikone@gmail.com)
		This grammar is for PL/SQL.
COMMENT:
		The grammar has been re-written from the same grammar
		created for target language C#, which fails for generating
		the parser.
KNOWN ISSUES:
		At the moment only supports CREATE PACKAGE and PACKAGE BODY.
		Symbol table and gate predicates needed to distinguish
			between function call and variable usage.

*******************************************************************************/

grammar PLSQL3;

options {
	k=*;
	backtrack=true;
	output=AST;
}

@members {
    private boolean isSql = false;
}

start_rule
	:	(create_package)* EOF
	;

alias
	:	( 'AS' )? sql_identifier 
	;

argument
	:	argument_name ( keyOUT | 'IN' keyOUT | 'IN' )? (argument_type )?
		( ( ASSIGN | 'DEFAULT' ) plsql_expression )?
	;

arguments
	:	argument ( COMMA argument )*
	;

argument_name
	:	identifier
	;

argument_type
	:	type_spec
	;

assignment_statement
	:	lvalue ASSIGN plsql_expression
//	|	function_call
	;

begin_block
	:	'BEGIN'
		( seq_of_statements )
		( 'EXCEPTION' ( exception_handler )+ )?
		'END'
	;

boolean_literal
	:	'TRUE' | 'FALSE'
	;

bracket_literals
	:	LPAREN literals RPAREN
	;
	
bracket_literals_list
	:	bracket_literals ( COMMA bracket_literals )*
	;

call_parameter
	:	( parameter_name ARROW )? nested_expression
	;

call_parameters
	:	call_parameter ( COMMA call_parameter )*
	;

case_expression
	:	'CASE' ( simple_case_expression | searched_case_expression ) ( else_case_expression )? 'END'
	;

case_statement
	:	( label_name )? 'CASE'^ ( simple_case_statement | searched_case_statement ) ( else_case_statement )? 'END' 'CASE' ( label_name )?
	;

cell_assignment
	:	measure_column LBRACK ( multi_column_for_loop | cell_assignment_exprs ) RBRACK
	;
	
cell_assignment_expr
	:	sql_condition | sql_expression | single_column_for_loop
	;	
	
cell_assignment_exprs
	:	cell_assignment_expr ( COMMA cell_assignment_expr )*
	;

cell_reference
	:	sql_identifier
	;

cell_reference_options
	:	( ( keyIGNORE | keyKEEP ) keyNAV )?
		( 'UNIQUE' ( keyDIMENSION | keySINGLE keyREFERENCE ) )?
	;

column_name
	:	sql_identifier
	;

column_spec
	:	sql_identifier ( DOT sql_identifier )* 
//	|	{ isSql }?
//		(	ASTERISK
//		|	sql_identifier ( DOT sql_identifier )* ( DOT ASTERISK )
//		)
//		( ( schema_name DOT )? table_name DOT )? column_name
	;

column_specs
	:	column_spec ( COMMA column_spec )*
	;

close_statement
	:	keyCLOSE cursor_name
	;

commit_statement
	:	'COMMIT'
	;

condition_and
	:	condition_not ( 'AND' condition_not )*
	;	

condition_between
	:	sql_expression ( 'NOT' )? 'BETWEEN' sql_expression 'AND' sql_expression
	;

condition_comparison
	:	LPAREN sql_expressions RPAREN ( outer_join_sign )? ( EQ | NOT_EQ ) LPAREN select_command RPAREN ( outer_join_sign )?
	|	( 'PRIOR' )? sql_expression ( outer_join_sign )? ( EQ | NOT_EQ | GTH | GEQ | LTH | LEQ ) ( 'PRIOR' )? ( sql_expression | LPAREN select_command RPAREN ) ( outer_join_sign )?
	;

condition_equals_path
	:	keyEQUALS_PATH LPAREN column_name COMMA path_string ( COMMA correlation_integer )? RPAREN
	;

condition_exists
	:	'EXISTS' LPAREN select_command RPAREN
	;
	
condition_expr
	:	condition_exists
	|	condition_is
	|	condition_comparison
	|	condition_group_comparison
	|	condition_in
	|	condition_is_a_set
	|	condition_is_any
	|	condition_is_empty
	|	condition_is_of_type
	|	condition_is_present
	|	condition_like
	|	condition_member
	|	condition_between
	|	condition_regexp_like
	|	condition_submultiset
	|	condition_equals_path
	|	condition_under_path
	|	condition_paren
	;

condition_group_comparison
	:	LPAREN sql_expressions RPAREN ( EQ | NOT_EQ ) ( 'ANY' | keySOME | 'ALL' ) LPAREN ( grouping_expression_list | select_command ) RPAREN
	|	sql_expression ( EQ | NOT_EQ | GTH | GEQ | LTH | LEQ ) ( 'ANY' | keySOME | 'ALL' ) LPAREN ( sql_expressions | select_command ) RPAREN
	;

condition_in
	:	LPAREN sql_expressions RPAREN ( 'NOT' )? 'IN' LPAREN ( grouping_expression_list | select_command ) RPAREN
	|	sql_expression ( 'NOT' )? 'IN' LPAREN ( expression_list | select_command ) RPAREN
	;

condition_is
	:	sql_expression 'IS' ( 'NOT' )? ( keyNAN | keyINFINITE | 'NULL' )
	;

condition_is_any
	:	( column_name 'IS' )? 'ANY'
	;

condition_is_empty
	:	nested_table_column_name 'IS' ( 'NOT' )? keyEMPTY
	;
	
condition_is_a_set
	:	nested_table_column_name 'IS' ( 'NOT' )? keyA 'SET'
	;
	
condition_is_of_type
	:	sql_expression 'IS' ( 'NOT' )? 'OF' ( keyTYPE )? LPAREN type_name RPAREN
	;

condition_is_present
	:	cell_reference 'IS' keyPRESENT
	;

condition_like
	:	sql_expression ( 'NOT' )? ( 'LIKE' | keyLIKEC | keyLIKE2 | keyLIKE4 ) sql_expression ( keyESCAPE sql_expression )?
	;

condition_member
	:	sql_expression ( 'NOT' )? keyMEMBER ( 'OF' )? nested_table_column_name
	;

condition_not
	:	'NOT' condition_expr
	|	condition_expr
	;

condition_or
	:	condition_and ( 'OR' condition_and )*
	;
		
condition_paren
	:	LPAREN sql_condition RPAREN
	;
	
condition_regexp_like
	:	keyREGEXP_LIKE LPAREN call_parameters RPAREN
	;

condition_submultiset
	:	nested_table_column_name ( 'NOT' )? keySUBMULTISET ( 'OF' )? nested_table_column_name
	;

condition_under_path
	:	keyUNDER_PATH LPAREN column_name ( COMMA levels )? COMMA path_string ( COMMA correlation_integer )? RPAREN
	;

correlation_integer
	:	integer
	;

create_package
	:	'CREATE' ( 'OR' keyREPLACE )?
		( package_spec | package_body )
	;

cursor_declaration
	:	keyCURSOR cursor_name
		( LPAREN parameter_specs RPAREN )?
		'IS' select_command SEMI
	;

cursor_expression
	:	keyCURSOR LPAREN subquery RPAREN
	;
	
cursor_loop_param
	:	record_name 'IN'
		(	cursor_name ( LPAREN plsql_expressions RPAREN )?
		|	LPAREN select_statement RPAREN
		)
	;
	
cursor_name
	:	identifier
	;

cursor_spec
	:	keyCURSOR cursor_name 
		( LPAREN parameter_specs RPAREN )?
		keyRETURN return_type SEMI! 
	;

datatype
	:	'BINARY_INTEGER' 
	|	'BINARY_FLOAT'
	|	'BINARY_DOUBLE'
	|	'NATURAL' 
	|	'POSITIVE' 
	|	( 'NUMBER' | 'NUMERIC' | 'DECIMAL' | 'DEC' ) ( LPAREN NUMBER ( COMMA NUMBER )? RPAREN )?
	|	'LONG' ( 'RAW')? ( LPAREN NUMBER RPAREN )?
	|	'RAW' ( LPAREN NUMBER RPAREN )?
	|	'BOOLEAN'
	|	'DATE'
	|	keyINTERVAL keyDAY ( LPAREN NUMBER RPAREN )? 'TO' keySECOND ( LPAREN NUMBER RPAREN )?
	|	keyINTERVAL keyYEAR ( LPAREN NUMBER RPAREN )? 'TO' keyMONTH
	|	( keyTIME | keyTIMESTAMP ) ( LPAREN NUMBER RPAREN )? ( 'WITH' ( keyLOCAL )? keyTIME keyZONE)?
	|	'INTEGER'
	|	'INT'
	|	'SMALLINT'
	|	'FLOAT' ( LPAREN NUMBER RPAREN )?
	|	'REAL'
	|	'DOUBLE' keyPRECISION
	|	'CHAR'      ( keyVARYING )? ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
	|	'VARCHAR'                   ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
	|	'VARCHAR2'                  ( LPAREN NUMBER ( keyBYTE | 'CHAR' )? RPAREN )? ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
	|	'CHARACTER' ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
	|	'NCHAR'     ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
	|	'NVARCHAR'  ( LPAREN NUMBER RPAREN )?
	|	'NVARCHAR2' ( LPAREN NUMBER RPAREN )?
	|	'NATIONAL'  ( 'CHARACTER' | 'CHAR' ) ( keyVARYING )? ( LPAREN NUMBER RPAREN )?
	|	'MLSLABEL'
	|	'PLS_INTEGER'
	|	'BLOB'
	|	'CLOB' ( 'CHARACTER' 'SET' ( identifier | column_spec CHARSET_ATTR ) )?
	|	'NCLOB'
	|	'BFILE'
	|	'ROWID' 
	|	'UROWID' ( LPAREN NUMBER RPAREN )?
	;

declare_spec
	:	variable_declaration 
	|	subtype_declaration 
	|	cursor_declaration 
	|	exception_declaration 
	|	record_declaration 
	|	plsql_table_declaration 
	|	varray_declaration
	|	procedure_declaration 
	|	function_declaration
	|	type_declaration 
	|	pragma_declaration
	;

delete_command
	:	'DELETE' ( 'FROM' )? selected_table
		(	'WHERE'
			(	keyCURRENT_OF cursor_name
			|	sql_condition
			)
		)?
		( returning_clause )?
	;

displayed_column
	:	(	column_spec DOT ASTERISK
//		|	keyCOUNT LPAREN ( ASTERISK | 'DISTINCT' LPAREN sql_expression RPAREN ) RPAREN
//		|	
		|	sql_expression
		)
		( alias )?
	;

else_case_statement
	:	'ELSE' seq_of_statements
	;

else_case_expression
	:	'ELSE' nested_expression
	;	

exception_declaration
	:	exception_name 'EXCEPTION' SEMI
	;

exception_handler
	:	'WHEN' exception_names 'THEN'
		seq_of_statements
	;

exception_names
	:	exception_name ( 'OR' exception_name )*
	;

exception_name
	:	( exception_package_name DOT )? identifier
	;

exception_package_name
	:	identifier
	;

exit_statement
	:	keyEXIT ( label_name )? ( 'WHEN' plsql_condition )?
	;

fetch_statement
	:	'FETCH' cursor_name 'INTO' 
		(	variable_names
		|	record_name
		)
	;

field_name
	:	identifier
	;	

field_spec
	:	column_name type_spec
		('NOT' 'NULL')? 
		( ( ASSIGN | 'DEFAULT' ) plsql_expression)?
	;

field_specs
	:	field_spec ( COMMA field_spec )*
	;

function_body
	:	( proc_fun_start )? 'FUNCTION'^ function_name 
		( LPAREN arguments RPAREN )? 
		keyRETURN return_type ( 'IS' | 'AS' )
		//( keyPRAGMA keyAUTONOMOUS_TRANSACTION )?
		( declare_spec )* 
		( 'BEGIN' )
		( seq_of_statements )
		( 'EXCEPTION' ( exception_handler )+ )?
		'END' ( function_name )? SEMI
	;

function_call
	:	user_defined_function ( { input.LA(1) != LPAREN || input.LA(2) != PLUS || input.LA(3) != RPAREN }? LPAREN ( call_parameters )? RPAREN )?
//	|	//{ input.LA(1) == ID && input.LA(2) == LPAREN && input.LA(3) == ASTERISK && input.LA(4) == RPAREN }? 
//		{ isSql }?
//		keyCOUNT LPAREN ( ASTERISK | sql_expression ) RPAREN
//	|	{ isSql }?
//		'DISTINCT' LPAREN call_parameters RPAREN
	;

function_declaration
	:	function_body
	;

function_expression
	:	function_call ( DOT nested_expression )?
	|	{ isSql }?
		(	keyCOUNT LPAREN ( ASTERISK | nested_expression ) RPAREN
		|	'DISTINCT' ( LPAREN nested_expression RPAREN | nested_expression )
		)
	;

function_spec
   :	'FUNCTION' function_name 
		( LPAREN arguments RPAREN )?
		keyRETURN return_type ('DETERMINISTIC')? SEMI
	;

function_name
	:	identifier | QUOTED_STRING //( schema_name DOT )? identifier
	;

goto_statement
	:	'GOTO' label_name
	;

group_by_clause
	:	'GROUP' 'BY' group_by_exprs
	;

group_by_expr
	:	rollup_cube_clause
	|	grouping_sets_clause
	|	grouping_expression_list
	;
	
group_by_exprs
	:	group_by_expr ( COMMA group_by_expr )*
	;	

rollup_cube_clause
	:	( keyROLLUP | keyCUBE ) LPAREN grouping_expression_list RPAREN
	;

grouping_expression_list
	:	expression_list ( COMMA expression_list )*
	;
	
grouping_sets_clause
	:	keyGROUPING keySETS LPAREN grouping_expression_list RPAREN
	;

hierarchical_query_clause
	:	( 'START' 'WITH' sql_condition )? 'CONNECT' 'BY' ( keyNOCYCLE )? sql_condition
	;

host_variable
	:	identifier (DOT identifier)*
	;

identifier
	:	ID
	|	DOUBLEQUOTED_STRING 
//	|	keyword
   	;
   
inner_cross_join_clause
	:	( keyINNER )? keyJOIN table_name ( 'ON' sql_condition | keyUSING LPAREN column_specs RPAREN )
	|	( keyCROSS | keyNATURAL ( keyINNER ) ) keyJOIN table_name
	;
   
if_statement
	:	'IF'^ plsql_condition 'THEN' seq_of_statements
		( keyELSIF plsql_condition 'THEN' seq_of_statements	)*
		( 'ELSE' seq_of_statements )?
		'END' 'IF'
	;

index_name
	:	identifier
	;

insert_command
	:	'INSERT' 'INTO' table_reference_list
		( LPAREN column_specs RPAREN )?
		(	'VALUES' LPAREN plsql_expressions RPAREN
		|	select_statement
		)
		( returning_clause )?
	;

integer
	:	NUMBER
	;

join_clause
	:	table_name ( inner_cross_join_clause | outer_join_clause )+
	;

label_name
	:	identifier
	;

levels
	:	integer
	;

link_name
	:	sql_identifier
	;

literal
	:	( PLUS | MINUS )? NUMBER
	|	QUOTED_STRING
	;
	
literals
	:	literal ( COMMA literal )*
	;

lock_mode
	:	'ROW' 'SHARE'
	|	'ROW' 'EXCLUSIVE'
	|	'SHARE' 'UPDATE'
	|	'SHARE'
	|	'SHARE' 'ROW' 'EXCLUSIVE'
	|	'EXCLUSIVE'
	;

lock_table_statement
	:	'LOCK' 'TABLE' table_reference_list
		'IN' lock_mode 'MODE' ( 'NOWAIT' )?
	;

loop_statement
	:	( LLABEL label_name RLABEL )?
		(	keyWHILE^ plsql_condition | 
			( 'FOR'^ ( numeric_loop_param | cursor_loop_param )	) 
		)?
		keyLOOP
		seq_of_statements
		'END' keyLOOP 
		( label_name )?
	;

lvalues
	:	lvalue ( COMMA lvalue )*
	;
lvalue
	:	variable_name
	|	record_name DOT field_name
	|	plsql_table_name LPAREN subscript RPAREN ( DOT field_name )*
	|	COLON host_variable ( COLON host_variable )?
	;

main_model
	:	( keyMAIN main_model_name )? model_column_clauses
		( cell_reference_options ) model_rules_clause
	;
	
main_model_name
	:	identifier
	;

measure_column
	:	column_name
	;

model_clause
	:	keyMODEL ( cell_reference_options )
		( return_rows_clause )?
		( reference_model )+ main_model
	;

model_column_clauses
	:	( query_partition_clause ( column_spec )? )?
		keyDIMENSION 'BY' LPAREN model_columns RPAREN
		keyMEASURES LPAREN model_columns RPAREN
	;
	
model_columns
	:	model_column ( COMMA model_column )*
	;
	
model_column
	:	sql_expression ( ( 'AS' )? column_spec )?
	;

model_rules_clause
	:	( keyRULES ( 'UPDATE' | keyUPSERT ( 'ALL' )? )? ( ( keyAUTOMATIC | keySEQUENTIAL ) 'ORDER' )? )?
		( keyITERATE LPAREN NUMBER RPAREN ( keyUNTIL LPAREN sql_condition RPAREN )? )?
		LPAREN model_rules_exprs RPAREN
	;

model_rules_expr
	:	( 'UPDATE' | keyUPSERT ( 'ALL' )? )? cell_assignment ( order_by_clause )? EQ sql_expression
	;

model_rules_exprs
	:	model_rules_expr ( COMMA model_rules_expr )*
	;

multi_column_for_loop
	:	'FOR' LPAREN column_specs RPAREN 'IN' LPAREN ( bracket_literals_list | subquery ) RPAREN
	;

nested_condition
	:	{  isSql }? condition_or
	|	{ !isSql }? expr_bool
	;

nested_table
	:	sql_identifier
	;

nested_table_column_name
	:	( schema_name DOT )? table_name DOT nested_table DOT column_name
	;

null_statement
	:	'NULL' 
	;

numeric_loop_param
	:	index_name 'IN' ( keyREVERSE )? integer_expr DOUBLEDOT integer_expr
	;

open_statement
	:	keyOPEN cursor_name ( LPAREN plsql_expressions RPAREN )?
	;

order_by_clause
	:	'ORDER' ( keySIBLINGS )? 'BY' order_by_exprs
	;

order_by_expr
	:	(	sql_expression
//		|	position
//		|	column_alias
		)
		( 'ASC' | 'DESC' )? ( keyNULLS keyFIRST | keyNULLS keyLAST )?
	;

order_by_exprs
	:	order_by_expr ( COMMA order_by_expr )*
	;

outer_join_clause
	:	( query_partition_clause )?
		(	outer_join_type keyJOIN
		|	keyNATURAL ( outer_join_type )? keyJOIN
		)
		table_name ( query_partition_clause )?
		( 'ON' sql_condition | keyUSING LPAREN column_specs RPAREN )?
	;

outer_join_sign
	:	LPAREN PLUS RPAREN
	;

outer_join_type
	:	( keyFULL | keyLEFT | keyRIGHT ) ( keyOUTER )?
	;
	
package_spec
	:	keyPACKAGE package_name ( 'IS' | 'AS' ) 
		( package_obj_spec )*
		'END' (package_name)? SEMI
	;
	
package_body
	:	keyPACKAGE ( keyBODY ) package_name ( 'IS' | 'AS' )
		( package_obj_body )*
		( 'BEGIN' seq_of_statements )?  
		'END' ( package_name )? SEMI
	;

package_name
	:	( schema_name DOT )? identifier 
	;

package_obj_spec
	:	variable_declaration 
	|	subtype_declaration 
	|	record_declaration 
	|	plsql_table_declaration 
	|	varray_declaration
	|	cursor_declaration 
	|	cursor_spec 
	|	procedure_spec 
	|	function_spec 
	|	exception_declaration 
	|	pragma_declaration
	;
	
package_obj_body
	:	variable_declaration 
	|	subtype_declaration 
	|	cursor_declaration 
	|	exception_declaration 
	|	record_declaration 
	|	plsql_table_declaration 
	|	varray_declaration
	|	procedure_body 
	|	function_body 
	|	pragma_declaration
	;
	
parameter_spec
	:	parameter_name ( 'IN' )? ( type_spec )?
	;
	
parameter_specs
	:	parameter_spec ( COMMA parameter_spec )*
	;

parameter_name
	:	identifier
	;

path_string
	:	QUOTED_STRING
	;

pattern
	:	QUOTED_STRING
	;

plsql_block
	:	( LLABEL label_name RLABEL )?
		( ( keyDECLARE )? (declare_spec)+ )? 
		( 'BEGIN' )
		seq_of_statements
		( 'EXCEPTION' ( exception_handler )+ )? 
		( 'END' ( label_name )? )
	;

plsql_condition
@init { isSql = false; }
	:	expr_bool
	;

plsql_table_declaration
	:	table_type_dec
//	|	table_var_dec
	;

plsql_table_name
	:	identifier ( DOT identifier )*
	;


pragma_declaration
	:	keyPRAGMA 
		(	keyRESTRICT_REFERENCES LPAREN ( 'DEFAULT' | function_name ) ( COMMA pragma_param )+ RPAREN 
		|	keyEXCEPTION_INIT LPAREN exception_name COMMA literal RPAREN
		|	keyAUTONOMOUS_TRANSACTION
		|	keySERIALLY_REUSABLE
		|	keyBUILTIN LPAREN pragma_params RPAREN
		|	keyFIPSFLAG LPAREN pragma_params RPAREN
		|	keyINTERFACE LPAREN pragma_params RPAREN
		|	keyNEW_NAMES LPAREN pragma_params RPAREN
		|	keyTIMESTAMP LPAREN pragma_params RPAREN
		)
		SEMI
	;

pragma_param
	:	( PLUS | MINUS )? NUMBER
	|	QUOTED_STRING
	|	identifier
	;	

pragma_params
	:	pragma_param ( COMMA pragma_param )*
	;

proc_fun_start
	:	'CREATE' ( 'OR' keyREPLACE )?
	;

procedure_body
	:	( proc_fun_start )? 'PROCEDURE'^ procedure_name 
		( LPAREN argument ( COMMA argument )* RPAREN )? 
		( 'IS' | 'AS' )
		//( keyPRAGMA keyAUTONOMOUS_TRANSACTION )?
		( declare_spec )* 
		( 'BEGIN' )
		( seq_of_statements )
		( 'EXCEPTION' ( exception_handler )* )?
		'END' ( procedure_name )? SEMI
	;

procedure_declaration
	:	procedure_body
	;

procedure_name
	:	identifier | QUOTED_STRING //( schema_name DOT )? identifier
	;

procedure_spec: 
	'PROCEDURE' procedure_name 
	( LPAREN arguments RPAREN )? SEMI
	;

query_partition_clause
	:	keyPARTITION 'BY' expression_list
	;

quoted_string
	:	QUOTED_STRING
	;

raise_statement
	:	keyRAISE ( exception_name )?
	;

record_declaration
	:	record_type_dec 
//	|	record_var_dec
	;

record_name
	:	identifier
	;

record_type_dec
	:	keyTYPE type_name 'IS' keyRECORD 
		LPAREN field_specs RPAREN SEMI
	;

reference_model
	:	keyREFERENCE reference_model_name 'ON' LPAREN subquery RPAREN
		model_column_clauses ( cell_reference_options )
	;
reference_model_name
	:	identifier
	;

return_rows_clause
	:	keyRETURN ( keyUPDATED | 'ALL' ) 'ROWS'
	;

return_type
	:	type_spec
	;

returning_clause
	:	( keyRETURN | keyRETURNING ) select_list ( keyBULK keyCOLLECT )? 'INTO' lvalues
	;

return_statement
	:	keyRETURN ( plsql_expression )?
	;

rollback_statement
	:	keyROLLBACK ( keyWORK )?
		( 'TO' ( 'SAVEPOINT' )? savepoint_name )?
		( 'COMMENT' quoted_string )?
	;

savepoint_name
	:	identifier
	;

savepoint_statement
	:	'SAVEPOINT' savepoint_name
	;

searched_case_statement
	:	( 'WHEN' plsql_expression 'THEN' seq_of_statements )+
	;

searched_case_expression
	:	( 'WHEN' nested_condition 'THEN' nested_expression )+
	;

select_command
	:	select_statement // ( 'UNION' select_statement )*
	;

select_expression
	:	
		'SELECT' ( 'DISTINCT' | 'UNIQUE' | 'ALL' )? select_list
		( keyBULK keyCOLLECT )?
		( 'INTO' lvalues )?
		'FROM' ( table_reference_list | join_clause | LPAREN join_clause RPAREN )
		( where_clause )? ( hierarchical_query_clause )? ( group_by_clause )?
		( 'HAVING' sql_condition )? ( model_clause )?
		(	(	'UNION' ( 'ALL' )?
			|	'INTERSECT'
			|	'MINUS'
			)
			(	select_expression //LPAREN subquery RPAREN
			|	subquery
			)
		)?
		( order_by_clause )?
	;

select_list
	:	ASTERISK
	|	displayed_column ( COMMA displayed_column )*
	;	

select_statement
	:	select_expression 
//	|	LPAREN select_command RPAREN )
	;

selected_table
	:	( table_spec | ( 'TABLE' | keyTHE )? subquery ) ( alias )?
	;

seq_of_statements
	:	statement SEMI ( statement SEMI )*
	;

set_transaction_command
	:	'SET' keyTRANSACTION keyREAD keyONLY
	;
	
schema_name
	:	sql_identifier
	;
	
simple_expression
	:	boolean_literal
	|	'SQL' ( FOUND_ATTR | NOTFOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR )
	|	column_spec
	|	QUOTED_STRING
	|	NUMBER
	| 	COLON host_variable ( COLON host_variable )? //// Mio
//	| 	COLON host_variable ( DOT host_variable )? //// Mio
//	|	sequence_name DOT ( 'CURRVAL' | 'NEXTVAL' )
//	|	'ROWID'
//	|	'ROWNUM'
	|	'NULL'
	;
	
simple_case_statement
	:	plsql_expression ( 'WHEN' plsql_expression 'THEN' seq_of_statements )+
	;

simple_case_expression
	:	nested_expression ( 'WHEN' nested_expression 'THEN' nested_expression )+
	;

single_column_for_loop
	:	'FOR' column_name
		(	'IN' LPAREN ( literals | subquery ) RPAREN
		|	( 'LIKE' pattern )? 'FROM' literal 'TO' literal ( keyINCREMENT | keyDECREMENT ) literal
		)
	;

sql_condition
@init { isSql = true; }
	:	condition_or
//	|	column 'IS' 'NOT' 'NULL' // TODO must be any boolean expression with table columns
	;
	
sql_identifier
	:	identifier
	|	'ROWID'
//	|	'ROWNUM'
	;	
	
sql_statement
	:	sql_command
	;

sql_command
	:	to_modify_data
	|	to_control_data
	;

subquery
	:	LPAREN select_command RPAREN
	;

subscript
	:	plsql_expression 
	;

subtype_declaration 
	:	keySUBTYPE type_spec 'IS' type_spec ( 'NOT' 'NULL' | keyRANGE literal DOUBLEDOT literal )? SEMI
	;
	
statement
	:	assignment_statement
	|	exit_statement
	|	goto_statement
	|	case_statement
	|	if_statement 
	|	loop_statement 
	|	null_statement
	|	raise_statement
	|	return_statement
	|	sql_statement
	|	plsql_block
//	|	begin_block
	|	function_call
	;

table_name
	:	sql_identifier
	;

table_reference_list
	:	selected_table ( COMMA selected_table )*
	;

table_spec
	:	( schema_name DOT )? table_name ( AT_SIGN link_name )?
	;

table_type_dec
	:	keyTYPE type_name 'IS' 'TABLE' 
		'OF' type_spec ( 'NOT' 'NULL' )?
		(	'INDEX' 'BY' 
			(	'BINARY_INTEGER'
			|	'PLS_INTEGER'
			|	'VARCHAR2' LPAREN integer RPAREN
			)
		)?
		SEMI
	;

to_modify_data
	:	select_command
	|	insert_command
	|	update_command
	|	delete_command
	|	set_transaction_command
	;

to_control_data
	:	close_statement
	|	commit_statement
	|	fetch_statement
	|	lock_table_statement
	|	open_statement
	|	rollback_statement
	|	savepoint_statement
	;
	
type_declaration 
	:	keyTYPE type_spec 'IS' ( keyNEW )? ( type_spec ( 'NOT' 'NULL' )? | LPAREN plsql_expressions RPAREN ) SEMI
	;

type_name
	:	identifier ( DOT identifier )*
	;

type_spec
	:	datatype 
//	|	variable_name TYPE_ATTR
	|	column_spec TYPE_ATTR
//	|	package_name DOT variable_name
	|	table_spec ROWTYPE_ATTR
//	|	keyREF ( keyCURSOR | type_name )
	|	type_name ( LPAREN NUMBER RPAREN )?
	;
update_column_specs
	:	update_column_spec ( COMMA update_column_spec )*
	;

update_column_spec
	:	column_spec EQ sql_expression
	;

update_command
	:	'UPDATE' selected_table
		'SET' 
		(	update_nested_column_specs
		|	update_column_specs
		)
		(	'WHERE'
			(	keyCURRENT_OF cursor_name
			|	sql_condition
			)
		)?
		( returning_clause )?
	;

update_nested_column_specs
	:	update_nested_column_spec ( COMMA update_nested_column_spec )*
	;

update_nested_column_spec
	:	LPAREN column_specs RPAREN EQ subquery
	;

user_defined_function
	:	sql_identifier ( DOT sql_identifier )* ( DOT ( 'EXISTS' | 'PRIOR' | 'DELETE' ) )? //( ( schema_name DOT )? package_name DOT )? identifier // sql_identifier ( DOT sql_identifier )*
	;

variable_declaration
	:	variable_name ('CONSTANT')?
		type_spec ('NOT' 'NULL')? 
		( ( ASSIGN | 'DEFAULT' ) plsql_expression)? SEMI
	;

variable_expression
	:	variable_name
	;
	
variable_name
	:	identifier
	;
	
variable_names
	:	variable_name ( COMMA variable_name )*
	;

varray_declaration
	:	keyTYPE type_name 'IS' 
		( keyVARRAY | keyVARYING keyARRAY ) LPAREN integer RPAREN
		'OF' type_spec ( 'NOT' 'NULL' )?
	;

where_clause
	:	'WHERE' sql_condition
	;

	

/*---------------------------------------------------------------------*/
/* Expressions */
expression_list
	:	LPAREN sql_expressions RPAREN
	|	sql_expressions
	;

plsql_expressions
	:	plsql_expression ( COMMA plsql_expression )*
	;
	
plsql_expression
@init { isSql = false; }
	:	expr_bool
	;

sql_expressions
	:	sql_expression ( COMMA sql_expression )*
	;
	
sql_expression
@init { isSql = true; }
	:	expr_add
	;
	
nested_expressions
	:	nested_expression ( COMMA nested_expression )*
	;
	
nested_expression
	:	{  isSql }? sql_expression
	|	{ !isSql }? plsql_expression
	;
	
expr_bool
	:	expr_or ( 'OR' expr_or )*
	;
	
expr_or
	:	expr_and ( 'AND' expr_and )*
	;
	
expr_and
	:	( 'NOT' )? expr_not
	;
	
expr_not
	:	expr_add 
		(	relational_op expr_add
		|	FOUND_ATTR | NOTFOUND_ATTR | ISOPEN_ATTR | ROWCOUNT_ATTR | BULK_ROWCOUNT_ATTR
		|	'IS' ( 'NOT' )? 'NULL'
		|	( 'NOT' )? 'LIKE' expr_add
		|	( 'NOT' )? 'BETWEEN' expr_add 'AND' expr_add
		|	( 'NOT' )? 'IN' LPAREN nested_expressions RPAREN
		)*
	;
	
relational_op
	:	EQ | LTH | GTH | NOT_EQ | LEQ | GEQ
	;
	
expr_add
	:	expr_mul ( ( PLUS | MINUS | DOUBLEVERTBAR ) expr_mul )*
	;
	
expr_mul
	:	expr_sign ( ( ASTERISK | DIVIDE ) expr_sign )*
	;
	
expr_sign
	:	( PLUS | MINUS )? expr_pow
	;

expr_paren
	:	LPAREN nested_expression RPAREN
	;
	
expr_pow
	:	expr_expr ( EXPONENT expr_expr )*
	;
	
expr_expr
	:	expr_paren
	|	function_expression
//	|	( compound_expression ) => compound_expression
	|	case_expression
	|	cursor_expression
	|	simple_expression
	|	select_expression
//	|	( special_expression ) => special_expression
//	|	datetime_expression
//	|	interval_expression
//	|	object_access_expression
//	|	scalar_subquery_expression
//	|	model_expression
//	|	type_constructor_expression
//	|	variable_expression
//	:	'NULL' | NUMBER | QUOTED_STRING | IDENTIFIER
	;

integer_expr
	:	sql_expression
	;


/* Keys */

keyA                             : 'A';
keyAUTOMATIC                     : 'AUTOMATIC';
keyCOUNT                         : 'COUNT';
keyCROSS                         : 'CROSS';
keyCUBE                          : 'CUBE';
keyCURRENT_OF                    : 'CURRENT_OF';
keyDAY                           : 'DAY';
keyDBTIMEZONE                    : 'DBTIMEZONE';
keyDECLARE						 : 'DECLARE';
keyDECREMENT                     : 'DECREMENT';
keyDIMENSION                     : 'DIMENSION';
keyEMPTY                         : 'EMPTY';
keyEQUALS_PATH                   : 'EQUALS_PATH';
keyESCAPE                        : 'ESCAPE';
keyFIRST                         : 'FIRST';
keyFULL                          : 'FULL';
keyGROUPING                      : 'GROUPING';
keyIGNORE                        : 'IGNORE';
keyINCREMENT                     : 'INCREMENT';
keyINFINITE                      : 'INFINITE';
keyINNER                         : 'INNER';
keyINTERVAL                      : 'INTERVAL';
keyITERATE                       : 'ITERATE';
keyJOIN                          : 'JOIN';
keyKEEP                          : 'KEEP';
keyLAST                          : 'LAST';
keyLEFT                          : 'LEFT';
keyLIKE2                         : 'LIKE2';
keyLIKE4                         : 'LIKE4';
keyLIKEC                         : 'LIKEC';
keyLOCAL                         : 'LOCAL';
keyMAIN                          : 'MAIN';
keyMEASURES                      : 'MEASURES';
keyMEMBER                        : 'MEMBER';
keyMODEL                         : 'MODEL';
keyMONTH                         : 'MONTH';
keyNAN                           : 'NAN';
keyNATURAL                       : 'NATURAL';
keyNAV                           : 'NAV';
keyNOCYCLE                       : 'NOCYCLE';
keyNULLS                         : 'NULLS';
keyONLY                          : 'ONLY';
keyOUTER                         : 'OUTER';
keyPARTITION                     : 'PARTITION';
keyPRECISION                     : 'PRECISION';
keyPRESENT                       : 'PRESENT';
keyREFERENCE                     : 'REFERENCE';
keyREGEXP_LIKE                   : 'REGEXP_LIKE';
keyRIGHT                         : 'RIGHT';
keyROLLUP                        : 'ROLLUP';
keyRULES                         : 'RULES';
keySECOND                        : 'SECOND';
keySECONDS                       : 'SECONDS';
keySEQUENTIAL                    : 'SEQUENTIAL';
keySESSIONTIMEZONE               : 'SESSIONTIMEZONE';
keySETS                          : 'SETS';
keySIBLINGS                      : 'SIBLINGS';
keySINGLE                        : 'SINGLE';
keySOME                          : 'SOME';
keySUBMULTISET                   : 'SUBMULTISET';
keyTIME                          : 'TIME';
keyTIMESTAMP                     : 'TIMESTAMP';
keyTHE                           : 'THE';
keyUNDER_PATH                    : 'UNDER_PATH';
keyUNTIL                         : 'UNTIL';
keyUPDATED                       : 'UPDATED';
keyUPSERT                        : 'UPSERT';
keyWAIT                          : 'WAIT';
keyYEAR                          : 'YEAR';
keyZONE                          : 'ZONE';
keyARRAY                         : 'ARRAY';
keyAUTONOMOUS_TRANSACTION        : 'AUTONOMOUS_TRANSACTION';
keyBODY                          : 'BODY';
keyBUILTIN                       : 'BUILTIN';
keyBULK                          : 'BULK';
keyBYTE                          : 'BYTE';
keyCLOSE                         : 'CLOSE';
keyCOLLECT                       : 'COLLECT';
keyCURSOR                        : 'CURSOR';
keyELSIF                         : 'ELSIF'; 
keyEXCEPTION_INIT                : 'EXCEPTION_INIT';
keyEXIT                          : 'EXIT';
keyFIPSFLAG                      : 'FIPSFLAG';
keyFUNCTION                      : 'FUNCTION';
keyINTERFACE                     : 'INTERFACE';
keyLOOP                          : 'LOOP'; 
keyNEW                           : 'NEW';
keyNEW_NAMES                     : 'NEW_NAMES';
keyOPEN                          : 'OPEN';
keyOUT                           : 'OUT'; 
keyPACKAGE                       : 'PACKAGE'; 
keyPRAGMA                        : 'PRAGMA'; 
keyRAISE                         : 'RAISE'; 
keyRANGE                         : 'RANGE';
keyREAD                          : 'READ';
keyRECORD                        : 'RECORD'; 
keyREF                           : 'REF';
keyREPLACE                       : 'REPLACE';
keyRESTRICT_REFERENCES           : 'RESTRICT_REFERENCES';
keyRETURN                        : 'RETURN'; 
keyRETURNING                     : 'RETURNING'; 
keyREVERSE                       : 'REVERSE';
keyROLLBACK                      : 'ROLLBACK';
keySERIALLY_REUSABLE             : 'SERIALLY_REUSABLE';
keySUBTYPE                       : 'SUBTYPE';
keyTRANSACTION                   : 'TRANSACTION';
keyTYPE                          : 'TYPE';
keyUSING                         : 'USING';
keyVARRAY                        : 'VARRAY';
keyVARYING                       : 'VARYING';
keyWHILE                         : 'WHILE'; 
keyWORK                          : 'WORK';

/* Lexer Rules */

QUOTED_STRING
	:	( 'n' )? '\'' ( '\'\'' | ~('\'') )* '\''
	;
ID /*options { testLiterals=true; }*/
    :	('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
    |	DOUBLEQUOTED_STRING
    ;
SEMI
	:	';'
	;
COLON
	:	':'
	;
DOUBLEDOT
	:	POINT POINT
	;
DOT
	:	POINT
	;
fragment
POINT
	:	'.'
	;
COMMA
	:	','
	;
EXPONENT
	:	'**'
	;
ASTERISK
	:	'*'
	;
AT_SIGN
	:	'@'
	;
RPAREN
	:	')'
	;
LPAREN
	:	'('
	;
RBRACK
	:	']'
	;
LBRACK
	:	'['
	;
PLUS
	:	'+'
	;
MINUS
	:	'-'
	;
DIVIDE
	:	'/'
	;
EQ
	:	'='
	;
PERCENTAGE
	:	'%'
	;
LLABEL
	:	'<<'
	;
RLABEL
	:	'>>'
	;
ASSIGN
	:	':='
	;
ARROW
	:	'=>'
	;
VERTBAR
	:	'|'
	;
DOUBLEVERTBAR
	:	'||'
	;
NOT_EQ
	:	'<>' | '!=' | '^='
	;
LTH
	:	'<'
	;
LEQ
	:	'<='
	;
GTH
	:	'>'
	;
GEQ
	:	'>='
	;
NUMBER
	:	(	N POINT N |	POINT N	| N	) ( 'E' ( PLUS | MINUS )? N )?
    ;
fragment
N
	: '0' .. '9' ( '0' .. '9' )*
	;
QUOTE
	:	'\''
	;
fragment
DOUBLEQUOTED_STRING
	:	'"' ( ~('"') )* '"'
	;
WS	:	(' '|'\r'|'\t'|'\n') {$channel=HIDDEN;}
	;
SL_COMMENT
	:	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;
ML_COMMENT
	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	;
TYPE_ATTR
	:	'%TYPE'
	;
ROWTYPE_ATTR
	:	'%ROWTYPE'
	;
NOTFOUND_ATTR
	:	'%NOTFOUND'
	;
FOUND_ATTR
	:	'%FOUND'
	;
ISOPEN_ATTR
	:	'%ISOPEN'
	;
ROWCOUNT_ATTR
	:	'%ROWCOUNT'
	;
BULK_ROWCOUNT_ATTR
	:	'%BULK_ROWCOUNT'
	;
CHARSET_ATTR
	:	'%CHARSET'
	;
