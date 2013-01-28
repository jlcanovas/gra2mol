grammar Island;

options {
	backtrack=true;
}

mainRule:
	'eq' (label)? eqPart '.'
	;

label:
	'[' ID ']' COLON
	;

eqPart:
	  opsubplussub
	;

// Rules for Sorts
natSort:
	ID
	;

ordSort:
	ID
	;

// Rules for Operations
opsubplussub:
	 natSort 'plus' natSort  '=' natSort
	;


