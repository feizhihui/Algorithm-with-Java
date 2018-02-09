/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;
/**
 *
 * 凸多边形的最优三角形剖分
 */
public class 最优三角形剖分 {
    static int m;
    static int[]a;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        m=scan.nextInt();
        a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();            
        }
        System.out.println(f(1,m));
        
    }
    public static int f(int i,int j){
        if(j-i==2){
            return w(i,i+1,j);            
        }
        int sum=0;
        for(int k=i+1;k<j;k++){
            int m=f(i,k);
            int n=f(k,j);
            if(sum<m+n+w(i,k,j)){
                sum=m+n+w(i,k,j);                   //动态转移方程
            }
        }
        return sum;
        
    }
    public static int w(int x,int y,int z){
        return a[x-1]+a[y-1]+a[z-1];
    } 
}
