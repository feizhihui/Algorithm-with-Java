/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.math.BigInteger;
import java.util.Scanner;

public class Poj1047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.next();
            int l = s.length();
            BigInteger bi = new BigInteger(l + 1 + "").multiply(new BigInteger(s));
            String ss = bi + "";
            int i;
            for (i = 0; i < l; i++) {
                if (ss.charAt(i) != '9') {
                    break;
                }
            }
            if (i == l) {
                System.out.println(s + " is cyclic");
            } else {
                System.out.println(s + " is not cyclic");
            }
        }
    }
}
