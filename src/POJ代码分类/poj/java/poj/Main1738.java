/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1738 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            if (m == 0) {
                break;
            }
            int[][] dy = new int[m + 1][m + 1];
            int[][] cos = new int[m + 1][m + 1];
            int[] a = new int[m + 1];
            for (int i = 1; i <= m; i++) {
                a[i] = scan.nextInt();
            }

            for (int i = 1; i < m + 1; i++) {
                for (int j = i; j < m + 1; j++) {
                    for (int k = i; k <= j; k++) {
                        cos[i][j] += a[k];
                    }
                }
            }
            for (int d = 0; d < m; d++) {
                for (int i = 1; i <= m; i++) {
                    for (int j = i; j - i <= d && j <= m; j++) {
                        if (i != j) {
                            dy[i][j] = Integer.MAX_VALUE;
                        }
                        for (int k = i; k < j; k++) {
                            dy[i][j] = Math.min(dy[i][j], dy[i][k] + dy[k + 1][j] + cos[i][j]);
                        }
                    }
                }
            }

            System.out.println(dy[1][m]);
        }
    }
}
