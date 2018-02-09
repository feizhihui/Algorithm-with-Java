/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * 连续数字串，最大乘积的dp算法
 */
public class MultiMax {  //1032

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
        int m=scan.nextInt();       //插入m个乘号
        String s=scan.next();
        int n=s.length();
        int[][]cos=new int[n+1][n+1];
        int[][]dp=new int[m+1][n+1];    
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                cos[i+1][j+1]=Integer.parseInt(s.substring(i,j+1));  
            }
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=1;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                for(int k=i;k<j;k++){
                    dp[i][j]=Math.max(dp[i][j], dp[i-1][k]*cos[k+1][j]);         //dp[i][j]为以j为结尾，组成i个数                  
                }
            }
        }
        System.out.println(dp[m][n]);      
        }
    }
}
