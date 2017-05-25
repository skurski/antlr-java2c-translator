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
       classBody
    ;

classBody
    :   '{' (methodDeclaration)* '}'
    ;

methodDeclaration
    :   modifier? type methodName methodParameters ('[' ']')* methodBody
    ;

methodParameters
    :   '(' methodParametersDeclaration? ')'
    ;

methodParametersDeclaration
    :   type variableName (',' methodParametersDeclaration)?
    |   '...' variableName
    ;

modifier
    : 'public'
    | 'private'
    | 'protected'
    ;

methodBody : '{' instruction+ '}' ;

instruction
    :   localVariableDeclaration ';'
    |   statement
    ;

localVariableDeclaration
    :   type variableDeclarator
    ;

variableDeclarator
    :   variableName ('=' variableInitializer)?
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
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
    |   booleanLiteral
    |   'null'
    ;

booleanLiteral
   :   'true'
   |   'false'
   ;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
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
