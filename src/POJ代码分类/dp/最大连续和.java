/*
 *
 * NOIP1451  求最大连续子序列的和
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class 最大连续和 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] dp = new int[m + 1];
        for (int i = 1; i <= m; i++) {      //以a[i]结尾的最大连续子序列的和
            int t = scan.nextInt();
            dp[i] = t;
            dp[i] = Math.max(dp[i - 1] + t, dp[i]);
        }
        System.out.println(dp[m]);
    }
}
