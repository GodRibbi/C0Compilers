/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C0Interpreter;


import java.util.ArrayList;

/**
 *
 * @author h3cvdiuser
 */

public class Data {

    Fct fct[];
    int fst[];
    int sed[];
    int length;

    Data(ArrayList<String> codes) {
        length = codes.size() / 3;;
        fct = new Fct[length];
        fst = new int[length];
        sed = new int[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            switch (codes.get(index)) {
                case "LIT":
                    fct[i] =Fct.LIT;
                    break; //可选
                case "LOD":
                    //语句
                    fct[i] =Fct.LOD;
                    break; //可选
                case "STO":
                    //语句
                    fct[i] =Fct.STO;
                    break; //可选
                case "CAL":
                    //语句
                    fct[i] =Fct.CAL;
                    break; //可选
                case "INT":
                    //语句
                    fct[i] =Fct.INT;
                    break; //可选
                case "JMP":
                    //语句
                    fct[i] =Fct.JMP;
                    break; //可选
                case "JPC":
                    //语句
                    fct[i] =Fct.JPC;
                    break; //可选
                case "ADD":
                    //语句
                    fct[i] =Fct.ADD;
                    break; //可选
                case "SUB":
                    //语句
                    fct[i] =Fct.SUB;
                    break; //可选
                case "MUL":
                    //语句
                    fct[i] =Fct.MUL;
                    break; //可选
                case "DIV":
                    //语句
                    fct[i] =Fct.DIV;
                    break; //可选
                case "RED":
                    //语句
                    fct[i] =Fct.RED;
                    break; //可选
                case "WRT":
                    //语句
                    fct[i] =Fct.WRT;
                    break; //可选
                case "RET":
                    //语句
                    fct[i] =Fct.RET;
                    break; //可选
                //你可以有任意数量的case语句
                default: //可选
                //语句
                    System.err.print("fct error");
            }
            index++;
            fst[i]=Integer.parseInt(codes.get(index));
            index++;
            sed[i]=Integer.parseInt(codes.get(index));
            index++;
        }
    }
    public void printData(){
        for (int i = 0; i < length; i++) {
            System.out.print(fct[i]);
            System.out.print(" ");
            System.out.print(fst[i]);
            System.out.print(" ");
            System.out.println(sed[i]);
        }
    }
    public int getLength(){
        return length;
    }
    public Fct getFct(int num){
        return fct[num];
    }
    public int getFst(int num){
        return fst[num];
    }
    public int getSed(int num){
        return sed[num];
    }
}
