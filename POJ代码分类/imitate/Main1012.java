/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.imitate;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1012 {

    static int k;
    static boolean[] b;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
        k = scan.nextInt();
        if(k==0) break;
        loop:
        for (int m = (3*k)/2+1;; m++) {
            b = new boolean[2 * k + 1];
            int count = 0, num = 0;
            for (int i = 1; i <= 2 * k; i++) {
                if (!b[i]) {
                    count++;
                }
                if (count == m) {
                    b[i] = true;
                    num++;
                    if (num == k) {
                        if (isOver()) {
                            System.out.println(m);
                            break loop;
                        } else {
                            break;
                        }
                    }
                    count = 0;

                }
                if (i == 2 * k) {
                    i = 0;
                }

            }
        }
        }
    }

    public static boolean isOver() {
        for (int i = 1; i <= k; i++) {
            if (b[i]) {
                return false;
            }
        }
        return true;
    }
}
