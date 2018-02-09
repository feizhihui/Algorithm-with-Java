/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

public class Main3752 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = 0, i, j, t = 0;
        int c = 0;
        char[][] ch = new char[m][n];
        loop:
        for (k = 0; k < (m + 1) / 2; k++) {

            for (i = k; i < n - k - 1; i++) {
                ch[k][i] = (char) (c++ % 26 + 'A');
                if (c >= m * n) {
                    break loop;
                }
            }

            for (j = k; j < m - k - 1; j++) {
                ch[j][i] = (char) (c++ % 26 + 'A');
                if (c >= m * n) {
                    break loop;
                }
            }

            for (i = n - k - 1; i > k; i--) {
                ch[j][i] = (char) (c++ % 26 + 'A');
                if (c >= m * n) {
                    break loop;
                }
            }

            for (j = m - k - 1; j > k; j--) {
                ch[j][i] = (char) (c++ % 26 + 'A');
                if (c >= m * n) {
                    break loop;
                }
            }

        }

        for (i = 0; i < m; i++) {
            System.out.print("   ");
            for (j = 0; j < n; j++) {
                System.out.print(ch[i][j]);
                if (j < n - 1) {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
