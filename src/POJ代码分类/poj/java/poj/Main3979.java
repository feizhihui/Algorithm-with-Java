/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;
public class Main3979 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.next();
            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - '0';
            char ch = s.charAt(3);
            int c = s.charAt(4) - '0';
            int d = s.charAt(6) - '0';
            int x, y;
            if (ch == '+') {
                x = a * d + b * c;
            } else {
                x = a * d - b * c;
            }
            y = b * d;
            int t = gcd(x, y);
            if (t < 0) {
                t = -t;
            }
                if (x % y == 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println((x / t) + "/" + (y / t));
                }            
        }
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
