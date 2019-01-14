/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javatypesex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This is a demo (entry point)
 * @author student
 */
public class JavaTypesEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sout + tab
        //System.out.println("Hello World!");
        
        byte by1 = 127;
        byte by2 = -128;
        short sh1 = 4235;
        int i1 = 1323424535;
        long l1 = 13234245355645767L;
        
        float f1 = 10.12f;
        double d1 = 123.254436d;
        
        char ch1 = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(ch1++);
        }
        
        boolean b1 = true;
        
        int[] iArray = { 1, -1, 10, 25, 100, 0, 11, -34, 76};
        
        for (int i : iArray) {
            if ((i < 0) == b1) {
                System.out.println(i);
            }
        }
        
        List list = new ArrayList(){};//new ArrayList(Arrays.asList(iArray)){};
        list.add(1);
        list.add(10);
        list.add(-1);
        //instanceof
        list.stream().filter((t) -> {
            return (int)t > 0;
        }).forEach((t) -> {
            System.out.println(t);
        });
    }
    
}
