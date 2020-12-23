/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C0Interpreter;

import java.util.*;

/**
 *
 * @author h3cvdiuser
 */
public class GoInterpreter {
    //原始数据
    Data data;
    
    List<DataStack> datastack;
    Stack<Integer> lastpos;
    int layer;
    int i;
    boolean fstpos=true;
    boolean print = true;
    boolean fstcal=true;

    GoInterpreter(Data datas, boolean b) {
        data = datas;
        print = b;
        datastack = new ArrayList<DataStack>();
        lastpos=new Stack<>();
    }

    public void run() {
        fstRun();
        for (i = 0; i < data.getLength(); i++) {
            if (print) {
                
                System.out.print("第" + (i+1) + "层:");
            }

            switch (data.getFct(i)) {
                case LIT:
                    LIT(data.getFst(i), data.getSed(i));
                    break; //可选
                case LOD:
                    //语句
                    LOD(data.getFst(i), data.getSed(i));
                    break; //可选
                case STO:
                    //语句
                    STO(data.getFst(i), data.getSed(i));
                    break; //可选
                case CAL:
                    //语句
                    CAL(data.getFst(i), data.getSed(i));
                    break; //可选
                case INT:
                    //语句
                    INT(data.getFst(i), data.getSed(i));
                    break; //可选
                case JMP:
                    //语句
                    JMP(data.getFst(i), data.getSed(i));
                    break; //可选
                case JPC:
                    //语句
                    JPC(data.getFst(i), data.getSed(i));
                    break; //可选
                case ADD:
                    //语句
                    ADD(data.getFst(i), data.getSed(i));
                    break; //可选
                case SUB:
                    //语句
                    SUB(data.getFst(i), data.getSed(i));
                    break; //可选
                case MUL:
                    //语句
                    MUL(data.getFst(i), data.getSed(i));
                    break; //可选
                case DIV:
                    //语句
                    DIV(data.getFst(i), data.getSed(i));
                    break; //可选
                case RED:
                    //语句
                    RED(data.getFst(i), data.getSed(i));
                    break; //可选
                case WRT:
                    //语句
                    WRT(data.getFst(i), data.getSed(i));
                    break; //可选
                case RET:
                    //语句
                    RET(data.getFst(i), data.getSed(i));
                    break; //可选
                //你可以有任意数量的case语句
                default: //可选
                    //语句
                    System.err.print("fct error");
            }
        }
    }

    void fstRun() {
        System.out.println("开始");
        layer = 0;
        datastack.add(new DataStack());
    }

    //将常数值取到栈顶，a为常数值
    void LIT(int fst, int sed) {
        if (print) {
            System.out.println("将常数值 " + sed + " 取到栈顶");
        }
        datastack.get(layer).setStackTop(sed);
    }

    //LOD t a	将变量值取到栈顶，a为相对地址，t为层数
    void LOD(int fst, int sed) {
        int top = datastack.get(fst).getStack(sed);
        if (print) {
            System.out.println("将变量值 " + top + " 取到栈顶");
        }
        datastack.get(layer).setStackTop(top);
    }

    //将栈顶内容送入某变量单元中，a为相对地址，t为层数
    void STO(int fst, int sed) {
        int num = datastack.get(layer).getStackTop();
        if (print) {
            System.out.println("将栈顶内容 " + num + " 送入某变量单元中");
        }
        //System.out.println(datastack.get(fst).stack[0]);
        //System.out.println(num);
        datastack.get(fst).setStack(sed, num);
    }

    //调用函数，a为函数地址
    void CAL(int fst, int sed) {
        if (print) {
            System.out.println("调用函数");
        }
        if(!fstcal){
            //lastpos = i;
            lastpos.push(i);
        }
        else{
            fstcal=false;
        }
        i = sed - 2;
        
        layer++;
        datastack.add(new DataStack());
    }

    //INT 0 a	在运行栈中为被调用的过程开辟a个单元的数据区
    void INT(int fst, int sed) {
        if (print) {
            System.out.println("在运行栈中为被调用的过程开辟 "
                    + sed + " 个单元的数据区");
        }
        datastack.get(layer).setStackLength(sed);
        if(fstpos){
            lastpos.push(-1);
            fstpos=false;
        }
        
    }

    //无条件跳转至a地址
    void JMP(int fst, int sed) {
        if (print) {
            System.out.println("无条件跳转至 " + sed + " 地址");
        }
        i = sed - 2;
    }

    //JPC 0 a	条件跳转，当栈顶值为0，则跳转至a地址，否则顺序执行
    void JPC(int fst, int sed) {
        if (print) {
            System.out.println("条件跳转，当栈顶值为0，则跳转至 "
                    + sed + " 地址，否则顺序执行");
        }
        //System.out.println(datastack.get(layer).getStackTop());
        if (datastack.get(layer).getStackTop() == 0) {
            i = sed - 2;
        }
    }

    //ADD 0 0	次栈顶与栈顶相加，退两个栈元素，结果值进栈
    void ADD(int fst, int sed) {
        int top = datastack.get(layer).getStackTop();
        int sedtop = datastack.get(layer).getStackSedTop();
        int ans = top + sedtop;
        datastack.get(layer).setStackTop(ans);
        if (print) {
            System.out.println("次栈顶 "
                    + sedtop + " 与栈顶 "
                    + top + " 相加，退两个栈元素，结果值 "
                    + ans + " 进栈");
        }
    }

    //次栈顶减去栈顶，退两个栈元素，结果值进栈
    void SUB(int fst, int sed) {
        int top = datastack.get(layer).getStackTop();
        int sedtop = datastack.get(layer).getStackSedTop();
        int ans = sedtop - top;
        datastack.get(layer).setStackTop(ans);
        if (print) {
            System.out.println("次栈顶 "
                    + sedtop + " 与栈顶 "
                    + top + " 相减，退两个栈元素，结果值 "
                    + ans + " 进栈");
        }
    }

    void MUL(int fst, int sed) {
        int top = datastack.get(layer).getStackTop();
        int sedtop = datastack.get(layer).getStackSedTop();
        int ans = sedtop * top;
        datastack.get(layer).setStackTop(ans);
        //System.out.println(layer);
        if (print) {
            System.out.println("次栈顶 "
                    + sedtop + " 与栈顶 "
                    + top + " 相乘，退两个栈元素，结果值 "
                    + ans + " 进栈");
        }
    }

    void DIV(int fst, int sed) {
        int top = datastack.get(layer).getStackTop();
        int sedtop = datastack.get(layer).getStackSedTop();
        int ans = sedtop / top;
        datastack.get(layer).setStackTop(ans);
        if (print) {
            System.out.println("次栈顶 "
                    + sedtop + " 与栈顶 "
                    + top + " 相除，退两个栈元素，结果值 "
                    + ans + " 进栈");
        }
    }

    //从命令行读入一个输入置于栈顶
    void RED(int fst, int sed) {
        int print1;
        System.out.println("输入一个数字");
        Scanner sc = new Scanner(System.in);
        print1 = sc.nextInt();
        if (print) {
            System.out.println("从命令行读入一个输入 "
                    + print1 + " 置于栈顶");
        }
        datastack.get(layer).setStackTop(print1);
        sc.close();
    }

    //栈顶值输出至屏幕并换行
    void WRT(int fst, int sed) {
        int top = datastack.get(layer).getStackTop();
        System.out.println(top);
        if (print) {
            System.out.println("栈顶值 "
                    + top + " 输出至屏幕并换行");
        }
    }

    //RET 0 0	函数调用结束后,返回调用点并退栈
    void RET(int fst, int sed) {
        //System.out.println(datastack.get(0).getLastpos());
        if (lastpos.peek() == -1) {
            System.out.println("运行结束");
        } 
        else {
            i = lastpos.pop();
            //datastack.remove(layer);
            //System.out.println(datastack.get(1));
            layer--;
        }
        if (print) {
            System.out.println("函数调用结束后,返回调用点并退栈");
        }
    }
}
