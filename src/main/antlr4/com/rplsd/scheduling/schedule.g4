grammar schedule;

// top level parser 
schedule: 'begin' NEWLINE* kelas*  NEWLINE* 'end';

// medium level parser
kelas: WHITESPACE* BRACKET_OPEN NEWLINE* matkul NEWLINE* fitur* WHITESPACE* BRACKET_CLOSE WHITESPACE* NEWLINE*;
matkul : WORD TITIK_KOMA;
fitur     : WHITESPACE* (configuration|requirement|availibility|constraint) WHITESPACE* NEWLINE*;

// atomic parser
configuration : CONFIGURATION;
requirement: REQUIREMENT;
availibility: AVAILIBILITY;
constraint: CONSTRAINT;

// lexer for feature
CONFIGURATION : WHITESPACE*  ('configuration') WHITESPACE+ ('capacity=')NUMBER+ WHITESPACE* VERTICAL
                                WHITESPACE* ('facility=') (SENTENCE|NUMBER)* TITIK_KOMA;
REQUIREMENT : WHITESPACE* ('requirement') WHITESPACE+  SENTENCE TITIK_KOMA;
AVAILIBILITY: WHITESPACE* ('availibility') WHITESPACE+ BOOLEAN TITIK_KOMA;
CONSTRAINT : WHITESPACE* ('constraint') WHITESPACE+ NUMBER ':' NUMBER ' ' NUMBER ':' NUMBER TITIK_KOMA;

// SKIP
WHITESPACE : ' ' -> skip;
NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

// fundamentals
TITIK_KOMA : (';');
BRACKET_OPEN : ('{');
BRACKET_CLOSE : ('}');
VERTICAL : ('|');

NUMBER : [0-9]+;
CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;
SENTENCE : (WORD WHITESPACE*)+;
BOOLEAN : [0-1];











