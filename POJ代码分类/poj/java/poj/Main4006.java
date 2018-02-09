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
public class Main4006 {
    int[][] a;
    static int k ;
    int[] kk = new int[25];
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Main4006 m = new Main4006();
        k = scan.nextInt();
        int n = scan.nextInt();
        m.go(n);
        m.print();
    }

    public void go(int n) {
        a = new int[n][n];
        int k=1;
        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                a[i][j] = k++;
            }
            for (int j = i; j < n - i - 1; j++) {
                a[j][n - i - 1] = k++;
            }
            for (int j = i; j < n - i - 1; j++) {
                a[n - i - 1][n - j - 1] = k++;
            }
            for (int j = i; j < n - i - 1; j++) {
                a[n - j - 1][i] = k++;
            }
        }
        if (a[n / 2][n / 2] == 0) {
            a[n / 2][n / 2] = k;
        }
    }

    public void print() {
        for (int i = 0; i < k; i++) {
            kk[i] = a[scan.nextInt() - 1][scan.nextInt() - 1];
        }
        for(int i=0;i<k;i++){
            System.out.println(kk[i]);
        }
    }
}
