/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C0Interpreter;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author h3cvdiuser
 */
public class ReadFile {
    Data datas;
     ReadFile(String pos) throws IOException {
        File f = new File(pos);
        FileInputStream fip = new FileInputStream(f);
        ArrayList<String> data = new ArrayList<String>();
        Scanner scanner = new Scanner(new InputStreamReader(fip, "UTF-8"));
        while(scanner.hasNext()){
            data.add(scanner.next());
        }
        datas=new Data(data);
        scanner.close();
        fip.close();
    }
     public Data getData(){
         return datas;
     }
}
