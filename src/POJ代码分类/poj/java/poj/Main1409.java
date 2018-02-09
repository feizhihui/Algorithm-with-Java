/*
 * 回溯 深搜  判断数字字符,对应   
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main1409 {

    static String[] sh;
    static LinkedList<String> list;
    static String num;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            if(m==0) break;
            scan.nextLine();
            sh = new String[m];
            for (int i = 0; i < m; i++) {
                sh[i] = scan.nextLine();
            }
            Arrays.sort(sh);
            
            list = new LinkedList();
            num = scan.nextLine();
            test(0);
            System.out.println("--");
        }
    }

    public static void test(int k) {
        if (k >= num.length()) {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(list.size() - 1) + ".");
            return;
        }

        for (int i = 0; i < sh.length; i++) {
            int len = sh[i].length();
            if (k + len <= num.length()) {
                if (match(sh[i], k)) {
                    list.add(sh[i]);
                    test(k + len);
                    list.removeLast();
                }
            }
        }
    }

    public static boolean match(String si, int k) {
        for (int i = 0; i < si.length(); i++) {
            if (!cmatch(si.charAt(i), Integer.parseInt(""+num.charAt(k+i)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean cmatch(char c, int k) {
        if (k == 2) {
            if (c == 'a' || c == 'b' || c == 'c') {
                return true;
            }
        } else if (k == 3) {
            if (c == 'd' || c == 'e' || c == 'f') {
                return true;
            }
        } else if (k == 4) {
            if (c == 'g' || c == 'h' || c == 'i') {
                return true;
            }
        } else if (k == 5) {
            if (c == 'j' || c == 'k' || c == 'l') {
                return true;
            }
        } else if (k == 6) {
            if (c == 'm' || c == 'n' || c == 'o') {
                return true;
            }
        } else if (k == 7) {
            if (c == 'p' || c == 'q' || c == 'r' || c == 's') {
                return true;
            }
        } else if (k == 8) {
            if (c == 't' || c == 'u' || c == 'v') {
                return true;
            }
        } else if (k == 9) {
            if (c == 'w' || c == 'x' || c == 'y' || c == 'z') {
                return true;
            }
        }
        return false;
    }
}
