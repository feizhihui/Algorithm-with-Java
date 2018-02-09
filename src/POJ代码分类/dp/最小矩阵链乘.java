/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;
/*
 * 最小矩阵链乘
 */
import java.util.Scanner;

public class 最小矩阵链乘 {
       
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][]a=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=scan.nextInt();
            a[i][1]=scan.nextInt();            
        }
        System.out.println(min(0,n-1,a));
            
    }
    public static int min(int i,int j,int[][]a){
        if(i==j){
            return 0;
        }        
        int min=999999999;
        for(int k=i;k<j;k++){
             min=Math.min(min,min(i,k,a)+min(k+1,j,a)+a[i][0]*a[k][1]*a[j][1]);
        }
        return min;
    }
    
}
