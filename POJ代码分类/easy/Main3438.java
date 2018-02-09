/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * 按相邻相同字符 拆分字符串
 */
public class Main3438 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.nextLine();
        while (m-- != 0) {
            LinkedList<String> list = new LinkedList();
            String s = scan.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int k = 1;
                for (int j = i+1; j < s.length(); j++) {
                    if (c == s.charAt(j)) {
                        ++k;
                    }else break;
                }
                list.add(k + "" + c);
                i += k-1;
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();

        }
    }
}
