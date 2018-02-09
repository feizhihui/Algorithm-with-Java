/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.greedy;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1018 {

    static class Pro {
        int b;
        int p;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        while (m-- != 0) {
            int n = scan.nextInt();
            int num = 0;
            int maxb = 0;
            Pro[][] a = new Pro[n + 1][];
            int[][] dp = new int[n][1010];             //dp[i][b]代表前i个产品，最小b -》 若不存在dp[i][j],则重新赋值，若存在，选取较小的
            for (int i = 0; i < n; i++) {
                num = scan.nextInt();
                a[i] = new Pro[num];
                for (int j = 0; j < num; j++) {
                    a[i][j] = new Pro();
                    a[i][j].b = scan.nextInt();
                    a[i][j].p = scan.nextInt();
                    if (maxb < a[i][j].b) {
                        maxb = a[i][j].b;                 //maxb为全局变量，为前i层最大的b
                    }
                    if (i == 0) {
                        dp[i][a[i][j].b] = a[i][j].p;
                    }
                }
                if (i == 0) {
                    continue;
                }
                int tb = 0;
                for (int j = 1; j < maxb + 1; j++) {
                    if (dp[i - 1][j] != 0) {                 //证明存在dp[i-1][j]
                        for (int k = 0; k < num; k++) {
                            tb = Math.min(j, a[i][k].b);              //  min~~~~~~~~~~~~~~~~？？？？？？？？  看清题意
                            if (dp[i][tb] == 0) {
                                dp[i][tb] = dp[i - 1][j] + a[i][k].p;
                            } else {
                                dp[i][tb] = Math.min(dp[i][tb], dp[i - 1][j] + a[i][k].p);
                            }
                        }
                    }
                }
            }
            double max = 0;
            for (int k = 1; k < maxb + 1; k++) {
                if (dp[n - 1][k] != 0) {
                    if (max < 1.0 * k / dp[n - 1][k]) {
                        max = 1.0 * k / dp[n - 1][k];
                    }
                }
            }
            System.out.println(String.format("%.3f",max));
        }
    }
}
