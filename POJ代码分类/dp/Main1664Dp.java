/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * M个同样的苹果放在N个同样的盘子里
 */
public class Main1664Dp {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t--!=0){
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[][]dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            dp[i][1]=1;
        }
        for(int i=1;i<=n;i++){
            dp[0][i]=1;
        }
        
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i>=j)
                dp[i][j]=dp[i][j-1]+dp[i-j][j];
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        System.out.println(dp[m][n]);
    }
    }
    
}
