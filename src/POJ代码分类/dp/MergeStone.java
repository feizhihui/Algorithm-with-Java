/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 * 围成一圈的石子合并问题
 * j-i=d  d=0··m
 * dp[i][j]=max{dp[i][j],dp[i][k]+dp[k+1][j]+cos[i][j]}
 */
public class MergeStone {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[][]dp=new int[2*m+1][2*m+1];
        int[][]dy=new int[2*m+1][2*m+1];
        int[][]cos=new int[2*m+1][2*m+1];        
        int[]a=new int[2*m+1];
        //石头初始化
        for(int i=1;i<=m;i++){
            a[i]=scan.nextInt();
            a[m+i]=a[i];
        }
        //i到j石子权重
        for(int i=1;i<2*m+1;i++){
            for(int j=i;j<2*m+1;j++){
                for(int k=i;k<=j;k++){
                    cos[i][j]+=a[k];                    
                }  
            }            
        }
        // j-i=d
        for(int d=0;d<m;d++)
        for(int i=1;i<=2*m;i++){
            for(int j=i;j-i<=d&&j<=2*m;j++){
                if(i!=j) dy[i][j]=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){            
                    dp[i][j]=Math.max(dp[i][j],dp[i][k]+dp[k+1][j]+cos[i][j]);
                    dy[i][j]=Math.min(dy[i][j],dy[i][k]+dy[k+1][j]+cos[i][j]);
                } 
            }     
        }  
        int max=0,min=Integer.MAX_VALUE;
        for(int i=1;i<=m;i++){
            if(max<dp[i][i+m-1]){
                max=dp[i][i+m-1];
            }
            if(min>dy[i][i+m-1]){
                min=dy[i][i+m-1];
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}
