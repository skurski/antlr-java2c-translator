grammar Java;

compilation
    :   packageDeclaration? importDeclaration* typeDeclaration*
        EOF
    ;

packageDeclaration
    :   'package' qualifiedName ';'
    ;

importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;

typeDeclaration
    :   classModifier* ( classDeclaration )
    |   ';'
    ;

classModifier
    :   'public'
    |   'protected'
    |   'abstract'
    ;

classDeclaration
    : 'class' className
       '{' classBodyDeclaration '}'
    ;

classBodyDeclaration
    :   methodDeclaration*
    |   fieldDeclaration*
    ;

methodDeclaration
    :   modifier? type methodName methodParameters ('[' ']')* methodBody
    ;

fieldDeclaration
    :   modifier? variableDeclarator ';'
    ;

methodParameters
    :   '(' methodParametersDeclaration? ')'
    ;

methodParametersDeclaration
    :   type variableName (',' methodParametersDeclaration)?
    ;

modifier
    : 'public'
    | 'private'
    | 'protected'
    ;

methodBody : '{' instruction+ '}' ;

instruction
    :   variableDeclarator ';'
    |   statement
    ;

variableDeclarator
    :   type variableName ('=' variableInitializer)?
    ;

variableInitializer
    :   expression
    ;

type
    :   primitiveType ('[' ']')*
    |   'void'
    ;

statement
    :   'return' expression? ';'
    |   ';'
    ;

expression
    :   literal
    |   expression ('++' | '--')
    |   ('+'|'-'|'++'|'--') expression
    |   ('~'|'!') expression
    |   '(' type ')' expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    |   expression ('<' '=' | '>' '=' | '>' | '<') expression
    |   expression 'instanceof' type
    |   expression ('==' | '!=') expression
    |   expression '&' expression
    |   expression '^' expression
    |   expression '|' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    ;

literal
    :   INT
    |   variableName
    |   'null'
    ;

primitiveType
    :   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

className : ID ;
methodName : ID ;
qualifiedName : ID ;
variableName : ID ('[' ']')* ;

INT : [0-9]+ ;
ID : [a-zA-Z0-9\.]+ ;
WS: [ \t\n\r]+ -> skip ;
