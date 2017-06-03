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

modifier
    : 'public'
    | 'private'
    | 'protected'
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

methodBody
    : '{' instruction+ '}' ;

variableDeclarator
    :   type variableName ('=' variableInitializer)?
    ;

instruction
    :   variableDeclarator ';'
    |   statement
    ;

variableInitializer
    :   expression
    |   '\'' expression '\''
    ;

type
    :   primitiveType ('[' ']')*
    |   'void'
    ;

statement
    :   'return' expression? ';'                                            #returnStatement
    |   'if' parExpression '{' statement '}' ('else {' statement '}')?      #condStatement
    |   'while' parExpression '{' statement '}'                             #whileStatement
    |   expression ';'                                                      #statementExpression
    ;

expression
    :   literal                                                             #literalExpression
    |   expression op=('+'|'-'|'*'|'/') expression                          #calcExpression
    |   expression op=('=='|'!=') expression                                #equalityExpression
    |   expression op=('<='|'>='|'>'|'<') expression                        #notEqualExpression
    |   expression op=('++'|'--')                                           #incDecExpression
    ;

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

INT : [0-9]+ ;
ID : [a-zA-Z0-9\.]+ ;
WS: [ \t\n\r]+ -> skip ;
