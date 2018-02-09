/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * buy low,buy lower,,求最长子序列并求它的条数
 */
public class Dp1021 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int max = 0;
        int[] dp = new int[m + 1];
        int[] a = new int[m + 1];
        int[]len=new int[m+1];
        for (int d = 1; d <= m; d++) {
            int w = scan.nextInt();      //输入的股份
            a[d] = w;                   //第d天的股份
            dp[d]=1;
            len[d]=1;
            for (int i = 1; i < d; i++) {
                if (a[i] > w) {
                    if(dp[i]+1==dp[d]) len[d]+=len[i];   //计算以a[d]结尾的最长连续递减序列的种数
                    dp[d] = Math.max(dp[i] + 1, dp[d]);
                }
            }
        }
        int t=0;
        for (int i = 1; i <= m; i++) {
            if(max<dp[i]){
                max=dp[i];               
                t=len[i];
            }else if(max==dp[i]){
                t+=len[i];
            }
        }
        System.out.println(max+" "+t);      
    } 
    
    
//    public static int recur(int[]a,int t,int num){       //a[t]前面num个连续的比a[t]大的数
//           int sum=0;
//           if(num==0) return 1;           
//           if(t<=1) return 0;
//           for(int i=t-1;i>=1;i--){
//               if(a[i]>a[t]){
//                   sum+=recur(a,i,num-1);
//               }   
//           }
//           return sum;     
//    }
//    
}
