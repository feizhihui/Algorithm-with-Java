/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Quanpailie {
    public static int num=1;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        LinkedList lj = new LinkedList();
        LinkedList lz = new LinkedList();
        for (char c : s.toCharArray()) {
            if(c!=' '){  
              lj.add(c);
            }
        }
        lz.add(lj.removeFirst());
        hjf(lj, lz);
    }

    public static void hjf(LinkedList lj1, LinkedList lz1) {
        LinkedList lj = new LinkedList();
        LinkedList lz = new LinkedList();
        for (int i = 0; i < lj1.size(); i++) {
            lj.add(lj1.get(i));
        }
        for (int i = 0; i < lz1.size(); i++) {
            lz.add(lz1.get(i));
        }

        for (int j = 0; j < lz.size(); j++) {
            if (lz.get(j) == '*') {
                lz.remove(j);
                j--;
            }
        }
        if (lj.size() == 0) {
            System.out.println(lz + "----------------------------------------------------------------"+num++);
            return;
        }

        ftrim(lz);
        char c = (char) lj.removeFirst();
        for (int i = 0; i < lz.size(); i++) {

            if (lz.get(i) == '*') {
                lz.set(i, c);
                hjf(lj, lz);
                lz.set(i, '*');
            }

        }
    }

    public static void ftrim(LinkedList sb) {
        int t = 2 * sb.size() + 1;
        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                sb.add(i, '*');
            }
        }
    }
}
