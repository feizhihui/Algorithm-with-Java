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
public class Main1006 {
    public static void main(String[] args) {
        int p=1;
        Scanner scan=new Scanner(System.in);
        while(true){
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int begin=scan.nextInt();
        if(a==b&&b==c&&c==begin&&a==-1) break;   
        for(int i=begin+1;;i++){
            if((i-a)%23==0&&(i-b)%28==0&&(i-c)%33==0){
                System.out.println("Case "+(p++)+": the next triple peak occurs in "+ (i-begin)+" days.");
                break;
            }            
        }
        }
    }
   
}
