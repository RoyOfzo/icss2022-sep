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

//--- PARSER: ---
stylesheet: (variableAssignment | statement | styleRule)* EOF;

classSelector: CLASS_IDENT;
idSelector: ID_IDENT;
tagSelector: (LOWER_IDENT | CAPITAL_IDENT);
attributeSelector: BOX_BRACKET_OPEN attribute BOX_BRACKET_CLOSE;
variableAssignment: variable ASSIGNMENT_OPERATOR value SEMICOLON;
universalSelector: MUL;

//Waarschijnlijk onnodig, maar zou interessant zijn om te implementeren
attribute:; // moet nog over nagedacht worden, p[style] { ... }
pseudoClass: attribute ASSIGNMENT_OPERATOR property;
// pseudo-class is nog een beetje vaag, vereist meer onderzoek
pseudoElement: attribute ASSIGNMENT_OPERATOR property;
// pseudo-element is ook nog vaag, vereist meer onderzoek
atRule: AT LOWER_IDENT;
// erg vaag, heeft ook te maken met statements, moet nog onderzocht worden

variable: CAPITAL_IDENT;
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
declarationBlock: (declaration SEMICOLON | ifClause )* (declaration SEMICOLON?)?;
// Semicolon is niet nodig op de laatste property in een block
// Ik denk dat het hier van waarde is om een soort switch te maken voor soorten property en verwachte value, denk colour met colour value
// Misschien melden wanneer het leeg is, maar geen error gooien?

ifClause: IF BOX_BRACKET_OPEN variable BOX_BRACKET_CLOSE OPEN_BRACE declarationBlock CLOSE_BRACE elseClause?;
elseClause: ELSE OPEN_BRACE declarationBlock CLOSE_BRACE;

styleRule: (classSelector | idSelector | tagSelector | universalSelector | attributeSelector)+ OPEN_BRACE declarationBlock CLOSE_BRACE;
statement: atRule;


// https://www.codecademy.com/article/glossary-css
// https://www.impressivewebs.com/css-terms-definitions/
// https://teamtreehouse.com/community/does-the-semicolon-have-to-be-added-after-each-declaration-in-a-rule-or-is-it-optional