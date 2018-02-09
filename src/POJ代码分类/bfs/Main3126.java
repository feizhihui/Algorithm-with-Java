/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 广搜法，素数
 */
public class Main3126 {

    static String s1;
    static String s2;
    static ArrayList<String> list;
    static ArrayList<String> old;
    static int num = 0;
    static boolean[] b = new boolean[10000];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1001; i < 10000; i = i + 2) {
            if (OddisPrime(i)) {
                b[i] = true;
            }
        }
        
        int m = scan.nextInt();

        while (m-- != 0) {
            s1 = scan.next();
            s2 = scan.next();
            list = new ArrayList();
            old = new ArrayList();
            old.add(s1);
            bfs();
            System.out.println(num);
            num = 0;
            for (int i = 1001; i < 10000; i = i + 2) {
                if (OddisPrime(i)) {
                    b[i] = true;
                }
            }
        }

    }

    public static void bfs() {
        if (old.contains(s2)) {
            return;
        }
        num++;
        for (int i = 0; i < old.size(); i++) {
            StringBuilder sb = new StringBuilder(old.get(i));
            for (int j = 0; j < 4; j++) {
                char c = sb.charAt(j);
                for (int k = 0; k <= 9; k++) {
                    if (j == 0 && k == 0 || j == 3 && k % 2 == 0 || c == k + '0') {
                        continue;
                    }
                    sb.setCharAt(j, (char) (k + '0'));
                    if (b[Integer.parseInt(sb.toString())]) {
                        b[Integer.parseInt(sb.toString())] = false;
                        list.add(sb.toString());

                    }
                    sb.setCharAt(j, c);
                }
            }
        }
        old = (ArrayList) list.clone();
        list = new ArrayList();
        bfs();
    }

    public static boolean OddisPrime(int t) {
        for (int i = 3; i * i <= t; i += 2) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }
}
