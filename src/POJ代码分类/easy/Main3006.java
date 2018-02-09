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
public class Main3006 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            int d = scan.nextInt();
            int count = scan.nextInt();
            if(m+d+count==0) break;
            for (int i = 0;; i++) {
                if (isPrime(m+i*d)) {
                    count--;
                    if (count == 0) {
                        System.out.println(m+i*d);
                        break;
                    }
                }


            }
        }
    }

    public static boolean isPrime(int m) {
        if(m==1) return false;
        if(m==2) return true;
        if(m%2==0) return false;        
        for (int i = 3; i * i <= m; i+=2) {
            if (m % i == 0) {
                return false;
            }
        }
 
        return true;
    }
}
