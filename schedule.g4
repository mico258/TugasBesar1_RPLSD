grammar schedule;
schedule: 'begin' NEWLINE* kelas*  NEWLINE* 'end';

kelas: matkul NEWLINE* fitur* WHITESPACE* ('%') NEWLINE*;

matkul : WORD ';';
fitur     : (configuration|requirement|availibility) WHITESPACE* NEWLINE*;
configuration : CONFIGURATION;
requirement: REQUIREMENT;
availibility: AVAILIBILITY;

CONFIGURATION : WHITESPACE*  ('configuration') WHITESPACE+ NUMBER+ WHITESPACE* '|' WHITESPACE* SENTENCE ';';
REQUIREMENT : WHITESPACE* ('requirement') WHITESPACE+  SENTENCE ';';
AVAILIBILITY: WHITESPACE* ('availibility') WHITESPACE+ BOOLEAN ';';


WHITESPACE : ' ' -> skip;
NUMBER : [0-9]+;
CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;
SENTENCE : (WORD WHITESPACE*)+;
BOOLEAN : [0-1];
NEWLINE : ('\r'? '\n' | '\r')+ ;










