grammar AjfGrammar;

fragment SINGLE_SPACE   : '\u0020'; // ' '
fragment TABULATION     : '\u0009'; // '\t'
fragment LINE_FEED      : '\u000A'; // '\n'
fragment CARRAIGE_RETURN: '\u000D'; // '\r'

Odd_Numer_Okt: [0][1-7]*[1357];
Odd_Number_Dec: [13579] | [1-9]+[0-9]*[13579];
Odd_Numer_Hex: [0][x][0-9A-Fa-f]*[13579BDFbdf];


LP  : '(' ;
RP  : ')' ;
POW : '^' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%';
ADD : '+' ;
SUB : '-' ;


WhiteSpace    : ( SINGLE_SPACE | TABULATION )+ -> skip;
NewLine       : ( CARRAIGE_RETURN | LINE_FEED )+ -> skip;

number: (Odd_Numer_Okt | Odd_Number_Dec | Odd_Numer_Hex);

expression: op = LP expression op = RP
          | op = SUB expression
          | expression op = POW expression
          | expression op = (MUL|DIV|MOD) expression
          | expression op = (ADD|SUB) expression
          | number
          ;