/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 */
public class Main2924 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(), t = k;
        while (t-- != 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            BigInteger sum = new BigInteger("0");
            BigInteger N = new BigInteger(n + "");
            BigInteger M = new BigInteger(m + "");
            sum = N.add(M).multiply(M.subtract(N).add(new BigInteger("1"))).divide(new BigInteger("2"));
            System.out.println("Scenario #"+(k-t)+":");
            System.out.println(sum+"\n");
        }
    }
}
