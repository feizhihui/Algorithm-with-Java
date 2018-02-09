/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/** dp经典题
 *
 * 动态规划 2593能过，2479java过不了
 * 联想到最大子段和的求法。s[i]表示以i为起点的最大的子段和，
 * t[i]表示以i结尾的最大的子段和。M1[i]表示1-i中的最大子段和，M2[i]表示i-n中的最大子段和。
 * 可知结果为res=max(M1[i]+M2[i+1])(1<=i<n);
 * 时间复杂度为O(n)。
 */
public class Main2593 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            if(n==0) break;
            int[] a = new int[n];
            int[] sl = new int[n];
            int[] sr = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            sl[0] = a[0];
            sr[n - 1] = a[n - 1];
            int[] m1 = new int[n];            
            int[] m2 = new int[n];
            m1[0] = sl[0];
            m2[n - 1] = sr[n - 1];
            for (int i = 1; i < n; i++) {   
                sl[i] = a[i] + (sl[i - 1] > 0 ? sl[i - 1] : 0);      //以i为末尾的左序列的最大和
                m1[i] = sl[i] > m1[i - 1] ? sl[i] : m1[i - 1];       //1到i中子序列最大值为m1[i]
            }
            for (int i = n - 2; i >= 0; i--) {   
                sr[i] = a[i] + (sr[i + 1] > 0 ? sr[i + 1] : 0);       //以i为开头的右序列的最大和
                m2[i]=sr[i]>m2[i+1]?sr[i]:m2[i+1];      //i到n-1中子序列最大值为m2[i]
            }

            int max=Integer.MIN_VALUE;
            for(int i=0;i<n-1;i++){
                if(max<m1[i]+m2[i+1]){
                    max=m1[i]+m2[i+1];
                }
            }
            System.out.println(max);

        }

    }
}
