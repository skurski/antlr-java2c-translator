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
    :   member*
    ;

member
    : methodDeclaration
    | fieldDeclaration
    ;

methodDeclaration
    :   modifier? type methodName methodParameters ('[' ']')* methodBody
    ;

fieldDeclaration
    :   modifier? constant? variableDeclarator ';'
    ;

constant
    : 'static final'
    | 'final static'
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
    :   'return' expression? ';'                        #returnStatement
    ;

expression
    :   literal                                         #literalExpression
    |   expression op=('+'|'-'|'*'|'/') expression      #calcExpression
    |   expression op=('=='|'!=') expression            #equalityExpression
    ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
EQ  : '==';
NE  : '!=';

parExpression
    :   '(' expression ')'
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

// LEXER


INT : [0-9]+ ;
ID : [a-zA-Z0-9\.]+ ;
WS: [ \t\n\r]+ -> skip ;
