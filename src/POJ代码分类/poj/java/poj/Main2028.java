/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2028 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        while(!(m==0&&n==0)){
           int num=0;
           int[][]a=new int[m][];
            
           for(int i=0;i<m;i++){
                 int k=scan.nextInt();
                 a[i]=new int[k];
                 for(int j=0;j<k;j++){
                     a[i][j]=scan.nextInt();                     
                 }               
           }   
           int length=0;
           for(int i=0;i<a.length;i++){
               length+=a[i].length;
           }
           int[]array=new int[length];
           int k=0;
           for(int i=0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   array[k++]=a[i][j];
               }
           }
           int sum=0,day=0;
           for(int i=1;i<101;i++){
               int t=0;
               for(int j=0;j<array.length;j++){
                   if(i==array[j]) t++;
               }
               if(sum<t&&t>=n){
                   sum=t;
                   day=i;
               }
           }

            System.out.println(day);
  
            m=scan.nextInt();
            n=scan.nextInt();
            
        }  
    }
    
}
