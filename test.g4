grammar test;
prule: MAIN;


WHITESPACE : ' ' -> skip;
NUMBER : [0-9]+;
CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;

