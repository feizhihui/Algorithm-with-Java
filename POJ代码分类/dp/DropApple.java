/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DropApple {
    static class Coords{
        int x;
        int y;
        int t;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int v=scan.nextInt();
        Coords[]a=new Coords[m+1];
        a[0]=new Coords();
        int maxt=0,max=0;
        for(int i=1;i<=m;i++){
            a[i]=new Coords();
            a[i].x=scan.nextInt();
            a[i].y=scan.nextInt();
            a[i].t=scan.nextInt();
            if(maxt<a[i].t) maxt=a[i].t;
        }
        int[][]dp=new int[maxt+1][m+1];
        
        for(int i=1;i<=maxt;i++){     //当前时间
            for(int j=1;j<=m;j++){        //选择了当前这个
                if(i==a[j].t)
                for(int k=0;k<=m;k++){               //前一个
                    if(j!=k&&Math.abs(a[j].x-a[k].x)+Math.abs(a[j].y-a[k].y)<=v*Math.abs(i-a[k].t)&&a[j].t>a[k].t){
                        dp[i][j]=Math.max(dp[i][j], dp[a[k].t][k]+1);
                    }                    
                }
                System.out.print(dp[i][j]+" ");
                if(max<dp[i][j]) max=dp[i][j];
            }
            System.out.println();
        }
        
        System.out.println(max);
    
    }
    
}
