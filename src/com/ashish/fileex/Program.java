/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ashish.fileex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aasick
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /**
             * FileWriter writer = new
             * FileWriter("c:/users/Aasick/desktop/file.txt");
             * writer.write("This is java Programming"); writer.close();*
             */
            String path = "c:/users/Aasick/desktop/file.txt";
            /**
             * FileReader reader = new FileReader(path); int i=0; while
             * ((i=reader.read())!=-1){ System.out.print((char)i); }
             * reader.close();*
             */
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                double x = Double.parseDouble(tokens[0]);
                String cmd = tokens[1];
                double y = Double.parseDouble(tokens[2]);
  
                switch (cmd) {
                    case "+":
                                               
                        System.out.println(x+y);
                        break;
                       
                    case "-":
                        
                        System.out.println(x-y);
                        break;
                    case "*":
                        System.out.println(x * y);
                        break;
                    case "/":
                        System.out.println(x / y);
                        break;
                    case "^":
                        double total = 1;
                        for (double i = 1; i <= y; i++) {
                            total = total * x;
                        }
                        System.out.println(total);
                        break;

                    case "@":
                        
                        //Double d = new Double(1.23);
                        //int i = d.intValue();
                        
                        double prdct = 1;
                        for (double i = 1; i <=y; i++) {
                            
                            prdct = x * i;
                            
                        Double d = new Double(prdct);
                        int j = d.intValue();
                        Double e = new Double(x);
                        int k = d.intValue();
                        Double f = new Double(i);
                        int l = d.intValue();
                        
                            System.out.println(k + "*" + l + "=" + j);
                        }
                        
                        break;
                }

            }
            reader.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}
