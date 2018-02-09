/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3386 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int a = scan.nextInt();
        int B = scan.nextInt();
        int b = scan.nextInt();
        int p = scan.nextInt();
        if (A + B <= p) {
            System.out.println("Yes");
        } else if (A <= p && a >= B||B <= p && b >= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
