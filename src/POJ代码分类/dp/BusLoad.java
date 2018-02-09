/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * 看球的巴士,,求解决问题的最少bus
 */
public class BusLoad {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int d=scan.nextInt();
        scan.nextLine();
        char[]ca=new char[m+1];
        int[]countH=new int[m+1];
        int[]dp=new int[m+1];
        for(int i=1;i<=m;i++){
            String s=scan.next();
            if(s.equals("H")){
                ca[i]='H';
                countH[i]=countH[i-1]+1;
            }else{
                ca[i]='J';
                countH[i]=countH[i-1];
            } 
           dp[i]=m;                            //边界问题
            for(int j=0;j<i;j++){             //j+1 ~ i 为一组(加一辆车,以第i个为结尾找最优子集),前j个为一组（dp[j]辆车）
                int t=Math.abs(i-j-2*(countH[i]-countH[j]));
                if(t<=d||t==i-j){
                    dp[i]=Math.min(dp[i], dp[j]+1);
                }
            }
        } 
        for(int i=1;i<=m;i++)
        System.out.print(dp[i]+" ");
        System.out.println();
        System.out.println(dp[m]);
    } 
}
