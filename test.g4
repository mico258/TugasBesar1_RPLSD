grammar test;
prule: OPERATION;

OPERATION: WHITESPACE* NUMBER  WHITESPACE* '+' WHITESPACE* NUMBER;
WHITESPACE : ' ' -> skip;
NUMBER : [0-9]+;
CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;

