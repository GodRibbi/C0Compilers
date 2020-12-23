/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C0Interpreter;

/**
 *
 * @author h3cvdiuser
 */
public enum Fct {
    LIT,// 0 a	将常数值取到栈顶，a为常数值
    LOD,// t a	将变量值取到栈顶，a为相对地址，t为层数
    STO,// t a	将栈顶内容送入某变量单元中，a为相对地址，t为层数
    CAL,//0 a	调用函数，a为函数地址
    INT,// 0 a	在运行栈中为被调用的过程开辟a个单元的数据区
    JMP,// 0 a	无条件跳转至a地址
    JPC,// 0 a	条件跳转，当栈顶值为0，则跳转至a地址，否则顺序执行
    ADD,// 0 0	次栈顶与栈顶相加，退两个栈元素，结果值进栈
    SUB,// 0 0	次栈顶减去栈顶，退两个栈元素，结果值进栈
    MUL,// 0 0	次栈顶乘以栈顶，退两个栈元素，结果值进栈
    DIV,// 0 0	次栈顶除以栈顶，退两个栈元素，结果值进栈
    RED,// 0 0	从命令行读入一个输入置于栈顶
    WRT,// 0 0	栈顶值输出至屏幕并换行
    RET// 0 0	函数调用结束后,返回调用点并退栈
};
