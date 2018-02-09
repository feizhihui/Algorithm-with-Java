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
public class Main2739 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 1;
        while (true) {
            n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int t = 0;

            for (int i = 2; i <= n; i++) {
                int sum = 0;
                if (isPrime(i)) {
                    for (int j = i; j <= n; j++) {
                        if (isPrime(j)) {
                            sum += j;
                            if (sum == n) {
                                t++;
                                break;
                            }
                            if (sum > n) {
                                break;
                            }
                        }


                    }
                }
            }
            System.out.println(t);

        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
