/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.*;
public class TransPC{

   private long dp[][]=new long[201][201];

   public TransPC(){
     init();
    }
   private  void init(){
      for(int i=1;i< 201;i++)
    {
        dp[i][i]=dp[1][i]=dp[i][0]=dp[0][i]=1;
    }
    for(int i=2;i< 201;i++)
    {
        for(int j=i+1;j< 201;j++)
        {

            dp[i][j]=dp[i-1][j-1]+dp[i][j-i];
        }
    }
   }
 
  public long dp(int k,int n){
     return dp[k][n];
  }
    
  
   public static void main(String args[]){
       Scanner in=new Scanner(System.in);
       TransPC m=new TransPC();
       while(true){
         int n=in.nextInt();
         int k=in.nextInt();
         if(n==0 && k==0) break;
         System.out.println(m.dp(k,n));
        }
     }
}