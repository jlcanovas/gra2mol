grammar DDL;

data_definition :
	(create_table | alter_table | create_sequence | comment)+
;

create_table :
	'CREATE TABLE' ID
	'('
		column (',' column)*
		(',' constraint)*
	')' ';'
;

column :
	ID TYPE ('(' NUMBER ')')? ISNULL?
;

alter_table :
	'ALTER TABLE' tabname
		((add='ADD' constraint) | (enable='ENABLE' 'CONSTRAINT') ID)
	';'
;

comment :
	'COMMENT ON' (('TABLE' tabname) | ('COLUMN' ID '.' colname)) 'IS' STRING ';'
;

create_sequence :
	'CREATE SEQUENCE' ID sequence_options* ';'
;

sequence_options :
	increment='INCREMENT' 'BY' NUMBER | start='START' 'WITH' NUMBER |
	maxvalue='MAXVALUE' NUMBER | nomaxvalue='NOMAXVALUE' |
	minvalue='MINVALUE' NUMBER | nominvalue='NOMINVALUE' |
	cycle='CYCLE' | nocycle='NOCYCLE' |
	cache='CACHE' NUMBER | nocache='NOCACHE' |
	order='ORDER' | noorder='NOORDER'
;

constraint :
	'CONSTRAINT' ID (primary_key | unique_key | foreign_key)
;

primary_key :
	'PRIMARY KEY' '(' colname (',' colname)* ')'
;

unique_key :
	'UNIQUE' '(' colname (',' colname)* ')'
;

foreign_key :
	'FOREIGN KEY' '(' colname ')'
	'REFERENCES' tabname '(' colname ')'
;

colname :
	ID
;

tabname :
	(ID '.')? basename=ID
;

ISNULL : 'NULL' | 'NOT NULL'
;

NUMBER : (('1'..'9')('0'..'9')*) | ('0')
;

TYPE : 'NUMBER' | 'VARCHAR2' | 'DATE' 
;

ID : ('a'..'z' | 'A'..'Z') ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
  // ~(WS)+
;

STRING : '\'' ~('\'')* '\''
;

WS : (' ' | '\t' | '\n' | '\r')+ {$channel=HIDDEN;}
;
