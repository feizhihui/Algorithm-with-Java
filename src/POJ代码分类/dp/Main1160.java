/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * m个村庄选择n个建立post office，，分成n块区域,进行二维dp
 */
public class Main1160 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();  //m villages
        int n=scan.nextInt();  //n post offices
        int[]a=new int[m+1];
        int[][]dp=new int[n+1][m+1];
        int[][]dist=new int[m+1][m+1];
        
        for(int i=0;i<m;i++){
            a[i+1]=scan.nextInt();
        }
        for(int i=1;i<=m;i++){
            for(int j=i;j<=m;j++){
                int cen=a[(i+j)/2];
                for(int k=i;k<=j;k++){
                    dist[i][j]+=Math.abs(cen-a[k]);
                }
            }
        }
      
        for(int i=1;i<=n;i++){    // i个office
            for(int j=i;j<=m;j++){         //j个village
                for(int k=1;k<j;k++){      
                    if(i==1){
                        dp[i][j]=dist[1][j];
                        continue;
                    }
                    if(dp[i][j]==0) dp[i][j]=Integer.MAX_VALUE;
                    dp[i][j]=Math.min(dp[i][j],dp[i-1][j-k]+dist[j-k+1][j]);
                }       
            }
        }
       
        System.out.println(dp[n][m]);
    }
}

