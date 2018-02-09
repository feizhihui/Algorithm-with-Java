/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

/**
 *
 * @author Administrator
 */
public class Main1316 {
    public static void main(String[] args) {
        byte[]a=new byte[10100];
        int m;
        for(int i=1;i<=10000;i++){
                m = i + i % 10 + (i / 10) % 10 + (i / 100) % 10+(i/1000)%10;
                a[m] = 1;
        }
        for(int i=1;i<=10000;i++){
            if(a[i]==0){
                System.out.println(i);
            }
        }     
    }
    
}
