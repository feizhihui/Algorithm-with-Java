/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;
public class Main3768 {
    static char[][] arr;
    static char[][] temp;
    static int l, a ;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            a = scan.nextInt();
            if(a==0) break;
            temp = new char[a][a];
            scan.nextLine();
            for (int i = 0; i < a; i++) {
                temp[i] = scan.nextLine().toCharArray();
            }
            int n = scan.nextInt();
            l = (int) Math.pow(a, n);
            arr = new char[l][l];
            recur(l, 0, 0);
            int m = 0;
            for (int i = 0; i < l; i++) {
                System.out.println(String.valueOf(arr[i]));
            }
        }
    }
    public static void recur(int lr, int x, int y) {
        if (lr == a) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    arr[x + i][y + j] = temp[i][j];
                }
            }
            return;
        } else {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (temp[i][j] != ' ') {
                        recur(lr / a, x + i * lr / a, y + j * lr / a);
                    }
                }
            }
        }
    }
}
