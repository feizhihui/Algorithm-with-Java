/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *       dp[i][j]=dp[i][j-1]+dp[i-j][j]     //f（无最大划分数）+f（有一个最大划分数）
 *poj 1664 分苹果
 * dp(m,n)  m个苹果n个盘子         
 * 若m<n dp(m,n)=dp(n,n)
 * 若m==n dp(m,n)=dp(m,n-1)+1；
 * 若m>n  dp[i][j]=dp[i][j-1]+dp[i-j][j]     //f（无最大划分数）+f（有一个最大划分数）
 * 若m==1 or n==1 dp[i][j]=1；
 */
public class IntDiv {
    static int[][]dp=new int[12][12];
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        inti();
        int k=scan.nextInt();
        while(k--!=0)
        System.out.println(dp[scan.nextInt()][scan.nextInt()]);       //  dp(m,n)  m个苹果n个盘子
        
    }
    public static void inti(){
        //dp[i][j]=dp[i][j-1]+dp[i-j][j];
        for(int i=1;i<12;i++){
            for(int j=1;j<12;j++){
                if(i==1&&j==1) dp[i][j]=1;
                else if(i>j)     dp[i][j]=dp[i][j-1]+dp[i-j][j];
                else if(i==j)    dp[i][j]=dp[i][j-1]+1;
                else if(i<j)  dp[i][j]=dp[i][i];
            }
        }      
}
}