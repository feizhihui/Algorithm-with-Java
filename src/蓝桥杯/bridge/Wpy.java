/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.bridge;

import java.util.Scanner;

public class Wpy {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < k; i++) {
            String s = scan.nextLine();
            int l = (int) Math.ceil(s.length() / 6.0);
            char[][] ch = new char[l][6];

            int m = 0;
            loop:
            for (int j = 0; j < l; j++) {
                for (int g = 0; g < 6; g++) {
                    if (m == s.length()) {
                        break loop;
                    }
                    ch[j][g] = s.charAt(m++);
                }
            }
            int[] a = new int[6];
            int t = 0;
            for (int j = 0; j < 6; j++) {
                for (int g = 0; g < l; g++) {
                    a[j] += ch[g][j];
                }
            }
            for (int j = 0; j < 6; j++) {
                int q = 0;
                if (a[j] >= 10) {
                    while (a[j] > 0) {
                        q += a[j] % 10;
                        a[j] /= 10;
                    }
                }
                a[j] = q;
                if (q >=10) {
                    j--;
                }
            }

            for (int j = 0; j < 6; j++) {

                System.out.print(a[j] + "  ");
            }
            System.out.println();


        }
    }
}
