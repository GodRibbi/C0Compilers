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
public class DataStack {
    Stack<Integer> stacktop=new Stack<Integer>();
    int stack[];
    public void setStackLength(int num){
        stack=new int[num];
    }
    public void setStack(int index,int num){
        stack[index]=num;
    }
    public int getStack(int num){
        return stack[num];
    }
    public int getStackTop(){
        return stacktop.peek();
    }
    public int getStackSedTop(){
        stacktop.pop();
        int sedtop=stacktop.pop();
        return sedtop;
    }
    public void setStackTop(int num){
        stacktop.push(num);
    }

    @Override
    public String toString() {
        return "DataStack [stack=" + Arrays.toString(stack) + ", stacktop=" + stacktop + "]";
    }
    
}
