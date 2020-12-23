/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C0Interpreter;

import java.io.*;
/**
 *
 * @author h3cvdiuser
 */
public class Main {
    public static void main(String[] args){
        Data code;
        try{
             ReadFile a=new ReadFile("data\\test.txt");
             code=a.getData();
             //code.printData();
             GoInterpreter gi=new GoInterpreter(code,true);
             gi.run();
        }catch(IOException e){
            
        }
    }
}