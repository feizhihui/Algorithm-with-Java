/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

public class Main1493 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        scan.nextLine();
        while(k!=0){
            int num=25;
            char[][]a=new char[k][25];
            int sum=0;
            
            for(int i=0;i<k;i++){
              String s=scan.nextLine();
              a[i]=s.toCharArray(); 
              int t=0;    
              for(int j=0;j<25;j++){
                  if(a[i][j]==' '){
                      t++;
                  }
              }
              sum+=t;
              if(num>t) num=t;              
            }
            sum-=k*num;
            System.out.println(sum);       
            k=scan.nextInt();
            scan.nextLine();
        }  
    }
}
