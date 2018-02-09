/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

public class Main1003 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        while(!s.equals("0.00")){
           double sum=0;
           double d=Double.valueOf(s);
           for(int i=2;;i++){
               sum+=1.0/i;
               if(sum>=d){
                   System.out.println(i-1+" card(s)");      
                   break;
               }               
           }
           s=scan.next();
        }       
    }  
}
