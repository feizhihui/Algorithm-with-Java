/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1488 {
    public static void main(String[] args) {
        int p=0;
        Scanner scan=new Scanner(System.in);     
        while(scan.hasNextLine()){
            StringBuilder sb=new StringBuilder(scan.nextLine());
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='"'){
                    if(p%2==0){
                    sb.setCharAt(i,'`');
                    sb.insert(i+1,'`');
                    }else{
                    sb.setCharAt(i,'\'');
                    sb.insert(i+1,'\'');                       
                    }
                    p++;
                    i++;
                }                
            }  
            System.out.println(sb);
        }        
    } 
}
