grammar C0;    //定义规则文件grammar

//程序=program
//变量定义部分=var
//自定义函数定义部分=fun
//主函数=main
//分程序=other
//语句序列=senList
//语句=sen
//条件语句=if
//循环语句=while
//自定义函数调用语句= personal
//赋值语句=value
//返回语句=return
//读语句=read
//写语句=write
//表达式= exp
//自定义函数调用=perFun
//项= term
//因子= factor

//parser
prog:stat+;
stat: program;
program : var* (funvoid | funint)* main;
var: INTSYS ID (COMMA ID )* ENDSYS;
funvoid: VOIDSYS  ID LPARENTHESE RPARENTHESE other;

funint: INTSYS ID LPARENTHESE RPARENTHESE otherrt;

main:VOIDSYS MAINSYS LPARENTHESE RPARENTHESE other;

other:LBRACE var* senlist returnsysvoid RBRACE;
otherrt:LBRACE var* senlist returnsys RBRACE;
senlist : sen sen* ;

sen: ifsys              #Iffun
| whilesys              #Whilefun
| LBRACE senlist RBRACE #Senlistfun
| personal              #Personalfun
| value                 #Valuefun
| read                  #Readfun
| write                 #Writefun
;

ifsys: ifsysadd sen elsesyss? ;
ifsysadd:IFSYS LPARENTHESE exp RPARENTHESE;
elsesyss:ELSESYS sen;
whilesys:WHILESYS LPARENTHESE op=(ID|INT) RPARENTHESE sen ;
personal:perFun ENDSYS;
value: ID EQUALSYS exp ENDSYS;
returnsys:RETURNSYS LPARENTHESE exp RPARENTHESE ENDSYS;
returnsysvoid: (RETURNSYS ENDSYS)?;
read:SCANFSYS LPARENTHESE ID RPARENTHESE ENDSYS;
write:PRINTFSYS LPARENTHESE  exp RPARENTHESE ENDSYS;


exp:term expadd*;
expadd:AddSub term;
term : factor termadd*;
termadd : Mul factor;
factor : ID                     #Idfun
| LPARENTHESE exp RPARENTHESE   #Expfun
| INT                           #Intfun
| perFun                        #Perfuns
;

perFun:ID LPARENTHESE RPARENTHESE ;


//lexer
INTSYS:'int';
VOIDSYS:'void';
COMMA:',';
SCANFSYS:'scanf';
PRINTFSYS:'printf';
RETURNSYS:'return';
WHILESYS:'while';
MAINSYS:'main';
ENDSYS:';';
IFSYS:'if';
EQUALSYS:'=';
ELSESYS:'else';
LBRACE:'{';
RBRACE:'}';
LPARENTHESE:'(';
RPARENTHESE:')';
ID:    ( 'A'..'Z' | 'a'..'z' | '_' ) ( 'A'..'Z' | 'a'..'z' | '_'  | '0'..'9' )*;
INT:'0'..'9'+;
AddSub:('+'|'-');
Mul:('*'|'/');
WS : ( ' ' | '\t'| '\n' | '\r' |'\r'? '\n') + {skip();} ;



