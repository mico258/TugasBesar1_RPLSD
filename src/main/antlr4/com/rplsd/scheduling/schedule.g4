grammar schedule;

// top level parser 
schedule: 'begin' NEWLINE* kelas*  NEWLINE* 'end' NEWLINE* 'begin' NEWLINE* ruangkelas*  NEWLINE* 'end';

// medium level parser kelas
kelas: WHITESPACE* BRACKET_OPEN NEWLINE* matkul NEWLINE* fitur* WHITESPACE* BRACKET_CLOSE WHITESPACE* NEWLINE*;
matkul : SENTENCE TITIK_KOMA;
fitur     : WHITESPACE* (requirement|availability|capacity) WHITESPACE* NEWLINE*;

ruangkelas: WHITESPACE* BRACKET_OPEN NEWLINE* ruangan WHITESPACE* BRACKET_CLOSE WHITESPACE* NEWLINE*;
ruangan: WHITESPACE* NUMBER WHITESPACE* NUMBER WHITESPACE* NUMBER WHITESPACE* TITIK_KOMA;

// atomic parser for kelas
capacity: CAPACITY;
requirement: REQUIREMENT;

availability: BRACKET_OPEN WHITESPACE* jadwal* WHITESPACE* BRACKET_CLOSE TITIK_KOMA;
jadwal: NUMBER WHITESPACE* NUMBER WHITESPACE* NUMBER TITIK_KOMA;


// lexer for feature
RUANGAN : WHITESPACE*  ('ruangan') (SENTENCE|NUMBER) WHITESPACE+ NUMBER WHITESPACE+ NUMBER WHITESPACE+
                   TITIK_KOMA;
REQUIREMENT : WHITESPACE* ('requirement') WHITESPACE+  NUMBER WHITESPACE+ TITIK_KOMA;
CAPACITY : WHITESPACE* ('capacity') WHITESPACE+  NUMBER WHITESPACE+ TITIK_KOMA;
// SKIP
WHITESPACE : ' ' -> skip;
NEWLINE : ('\r'? '\n' | '\r')+ -> skip ;

// fundamentals
TITIK_KOMA : ';';
BRACKET_OPEN : ('{');
BRACKET_CLOSE : ('}');

NUMBER : [0-9]+;
CHAR : [a-z]|[A-z]|'_';
WORD : CHAR+;
SENTENCE : (WORD WHITESPACE*)+;
BOOLEAN : [0-1];











