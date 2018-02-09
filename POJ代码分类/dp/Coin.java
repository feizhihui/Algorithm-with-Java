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
public class Coin {

    static int[] a;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int s = scan.nextInt();
            int m = scan.nextInt();
            a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
            }
            Arrays.sort(a);
            System.out.println("min  " + Able(s, m - 1));
            System.out.println("max  " + Can(s, 0,m-1));

        }
    }

    public static int Able(int s, int m) {
        if (s == 0) {
            return 0;
        }
        if (s > 0 && m < 0) {
            return -1;
        }

        for (int i = m; i >= 0; i--) {
            if (s >= a[i]) {
                int t = s / a[i];               //t张最大钱币
                for (int j = t; j >= 0; j--) {
                    int h = Able(s - j * a[i], i - 1);
                    if (h >= 0) {
                        return h + j;
                    }
                }

            }
        }
        return -1;
    }

    public static int Can(int s, int m,int p) {  //从m开始算
        if (s == 0) {
            return 0;
        }
        if ( m >p) {
            return -1;
        }

        for (int i = m; i <=p; i++) {
            if (s >= a[i]) {
                int t = s / a[i];               //t张最小钱币
                for (int j = t; j >= 0; j--) {
                    int h = Can(s - j * a[i], i + 1,p);
                    if (h >= 0) {
                        return h + j;
                    }
                }
            }
        }
        return -1;
    }
}
