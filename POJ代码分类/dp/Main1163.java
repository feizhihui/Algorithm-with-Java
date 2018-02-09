/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * 最大和三角问题dp解
 */
public class Main1163 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][]a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                a[i][j]=scan.nextInt();
            }
        }
        
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                a[i][j]=Math.max(a[i+1][j], a[i+1][j+1])+a[i][j];                
            }
        }
        System.out.println(a[0][0]);
        
    }
    
}
