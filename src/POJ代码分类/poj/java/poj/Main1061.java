package com.java.poj;

import java.util.Scanner;

public class Main1061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int l = scan.nextInt();
        x = x % l;
        y = y % l;
        if (m == n && x != y) {
            System.out.println("Impossible");
            return;
        }
        if (x < y) {
            int h = x;
            x = y;
            y = h;
            h = m;
            m = n;
            n = h;
        }
        System.out.println(x + " " + y + " " + m + " " + n);
        if (m > n) {
            for (int i = 1;; i++) {
                if(m*i%l==x&&n*i%l==y){
                      System.out.println("Impossible");   
                      return;                   
                }               
                if ((m - n) * i %l== l - (x - y)) {   //12345 54333 10001 20008 11111111
                    System.out.println(i);
                    return;
                }
            }
        } else {
            for (int i = 1;; i++) {
                if ((n - m) * i%l == x - y) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
