/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

public class Main1658 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        while(k--!=0){
            int[]a=new int[4];
            for(int i=0;i<4;i++){
                a[i]=scan.nextInt();  
            }
             System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" ");
            if((a[1]-a[0]==a[2]-a[1])&&(a[2]-a[1]==a[3]-a[2])){
                System.out.println(2*a[3]-a[2]);   
                continue;
            }
            if((1.0*a[1]/a[0]==1.0*a[2]/a[1])&&(1.0*a[2]/a[1]==1.0*a[3]/a[2])){
                System.out.println((int)(a[3]*1.0*a[2]/a[1]));
                continue;
            }
        }
    }
    
}
