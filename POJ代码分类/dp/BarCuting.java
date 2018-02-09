/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BarCuting {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int len=scan.nextInt();
        int[]size=new int[m];
        int[]price=new int[m];
        int[]dp=new int[len+1];
        for(int i=0;i<m;i++){
            size[i]=scan.nextInt();
            price[i]=scan.nextInt();
        }
        for(int i=1;i<=len;i++){
            for(int j=0;j<m;j++){
                if(i>=size[j]){
                    dp[i]=Math.max(dp[i-size[j]]+price[j], dp[i]);
                }                
            }
            
        }
        System.out.println(dp[len]);
        
    }
}
