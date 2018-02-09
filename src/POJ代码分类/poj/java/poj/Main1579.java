
package com.java.poj;

import java.util.Scanner;
/*
 * 动态规划代替递归
 */


public class Main1579 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] w = new int[21][21][21];
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 21; k++) {
                    if (i == 0 || j == 0 || k == 0) {
                        w[i][j][k] = 1;
                    } else {
                        if (i < j && j < k) {
                            w[i][j][k] = w[i][j][k - 1] + w[i][j - 1][k - 1] - w[i][j - 1][k];
                        } else {
                            w[i][j][k] = w[i - 1][j][k] + w[i - 1][j - 1][k] + w[i - 1][j][k - 1] - w[i - 1][j - 1][k - 1];
                        }
                    }
                }
            }
        }
        String s;
        int result;
        while(!(s=scan.nextLine()).equals("-1 -1 -1")){
            String[] str=s.split(" ");
            int i=Integer.parseInt(str[0]);
            int j=Integer.parseInt(str[1]);
            int k=Integer.parseInt(str[2]);
            if(i<=0||j<=0||k<=0){
                result=1;
            }else{
                if(i>20||j>20||k>20){
                    result=w[20][20][20];
                }else{
                    result=w[i][j][k];
                }   
            }           
             System.out.println("w("+i+", "+j+", "+k+") = "+result);
        }
    }
}
