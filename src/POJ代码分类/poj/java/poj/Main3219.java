/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

public class Main3219 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);                  
        int n,k,m;
        while(scan.hasNext()){
            n=scan.nextInt();
            k=scan.nextInt();
            m=n-k;
            if(fei(n)>fei(k)+fei(m)) System.out.println("0");
            else System.out.println("1");         
        }                
    }    
    public static int fe(int x){
        int num=0;
        for(int i=2;i<=x;i+=2){
            int j=i;
            while(j%2==0){
                num++;
                j/=2;
            }  
        }        
        return num;
    }
    public static int fei(int x){
        int y=0;
        while(x>0){
            y+=(x/=2);
        }
        return y;
    }
    
}
