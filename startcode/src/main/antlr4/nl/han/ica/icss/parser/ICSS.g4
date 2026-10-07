grammar ICSS;

//--- LEXER: ---

// IF support:
IF: 'if';
ELSE: 'else';
BOX_BRACKET_OPEN: '[';
BOX_BRACKET_CLOSE: ']';


//Literals
TRUE: 'TRUE';
FALSE: 'FALSE';
PIXELSIZE: [0-9]+ 'px';
PERCENTAGE: [0-9]+ '%';
SCALAR: [0-9]+;


//Color value takes precedence over id idents
COLOR: '#' [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f] [0-9a-f];

//Specific identifiers for id's and css classes
ID_IDENT: '#' [a-z0-9\-]+;
CLASS_IDENT: '.' [a-z0-9\-]+;

//General identifiers
LOWER_IDENT: [a-z] [a-z0-9\-]*;
CAPITAL_IDENT: [A-Z] [A-Za-z0-9_]*;

//All whitespace is skipped
WS: [ \t\r\n]+ -> skip;

//
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
SEMICOLON: ';';
COLON: ':';
PLUS: '+';
MIN: '-';
MUL: '*';
ASSIGNMENT_OPERATOR: ':=';

GREATER_THAN: '>';
LESS_THAN: '<';
TILDE: '~';
AT: '@';

// Keywords
AUTO: 'auto';

//--- PARSER: ---
stylesheet: (variableAssignment | statement | styleRule)* EOF;

class: CLASS_IDENT;
idSelector: ID_IDENT;
selector: (LOWER_IDENT | CAPITAL_IDENT);
universalSelector: MUL;
attributeSelector: BOX_BRACKET_OPEN attribute BOX_BRACKET_CLOSE;
attribute:; // moet nog over nagedacht worden, p[style] { ... }
pseudoClass: attribute ASSIGNMENT_OPERATOR property;
// pseudo-class is nog een beetje vaag, vereist meer onderzoek
pseudoElement: attribute ASSIGNMENT_OPERATOR property;
// pseudo-element is ook nog vaag, vereist meer onderzoek
atRule: AT LOWER_IDENT;
// erg vaag, heeft ook te maken met statements, moet nog onderzocht worden
variableAssignment: CAPITAL_IDENT ASSIGNMENT_OPERATOR value SEMICOLON;

combinator: PLUS | MIN | MUL | GREATER_THAN | LESS_THAN | TILDE;

bool: (TRUE | FALSE);
scale: SCALAR;
percentage: PERCENTAGE;
pixelSize: PIXELSIZE;
colorValue: COLOR;
nonOperatorValues: (bool | colorValue );
operatorValues: ( pixelSize | percentage | scale | CAPITAL_IDENT);
expression: expression (MUL) expression
          | expression(PLUS| MIN) expression
          | '(' expression ')'
          | operatorValues ;
value: expression | nonOperatorValues;

property: LOWER_IDENT;
declaration: property COLON value;
declarationBlock: (declaration SEMICOLON)* declaration SEMICOLON?;
// Semicolon is niet nodig op de laatste property in een block
// Ik denk dat het hier van waarde is om een soort switch te maken voor soorten property en verwachte value, denk colour met colour value
// Misschien melden wanneer het leeg is, maar geen error gooien?

styleRule: (class | idSelector | selector | universalSelector) OPEN_BRACE declarationBlock CLOSE_BRACE;
// Er moet nog nagedacht worden over het feit dat een css style rule kan bestaan uit meerdere klassen, id selectors of selectors
statement: atRule;


// https://www.codecademy.com/article/glossary-css
// https://www.impressivewebs.com/css-terms-definitions/
// https://teamtreehouse.com/community/does-the-semicolon-have-to-be-added-after-each-declaration-in-a-rule-or-is-it-optional