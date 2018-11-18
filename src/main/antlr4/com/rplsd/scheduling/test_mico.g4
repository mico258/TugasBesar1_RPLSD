grammar test;
prule: expr+  WHITESPACE* '%';


WHITESPACE : ' ' -> skip;
fragment NUMBER : [0-9]+;
fragment CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;
SENTENCE : (WORD WHITESPACE*)+;
fragment BOOLEAN : [0-1];
NEWLINE : ('\r'? '\n' | '\r')+ ;

MAIN : COMMAND WHITESPACE* ';' NEWLINE*;
COMMAND : REQUIREMENT | AVAILIBILITY | CONSTRAINT;
REQUIREMENT : WHITESPACE* 'requirement' WHITESPACE+  SENTENCE;
AVAILIBILITY: WHITESPACE* 'availibility' WHITESPACE+ BOOLEAN;
CONSTRAINT : WHITESPACE* 'constraint' WHITESPACE+ NUMBER ':' NUMBER ' ' NUMBER ':' NUMBER;

expr : expr ('AND' | 'OR' | 'NOT') expr
 | expr expr
 | MAIN+
 | '(' expr ')'
 ;