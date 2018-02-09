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
public class Quanpailie1 {

    private static int num = 1;
    private static LinkedList lo = new LinkedList();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        LinkedList<Character> lj = new LinkedList();
        LinkedList<Character> lz = new LinkedList();

        for (char c : s.toCharArray()) {
            boolean b = false;
            if (c != ' ') {
                for (int i = 0; i < lj.size(); i++) {
                    if (c == lj.get(i)) {
                        b = true;
                        lj.addFirst(lj.remove(i));
                    }
                }
                if (b) {
                    lj.addFirst(c);
                } else {
                    lj.addLast(c);
                }
            }
        }
        boolean b1 = true, b2 = false;
        System.out.println(lj);
        if (lj.size() > 1) {
            for (int i = lj.size() - 1; i >= 0; i--) {
                if (i > 0 && lj.get(i) != lj.get(i - 1) && b1) {
                    continue;
                }
                if (i > 0 && lj.get(i) == lj.get(i - 1)) {
                    b2 = true;
                }
                b1 = false;
                if (b2 && i >= 0) {
                    lo.add(lj.remove(i));
                }
            }
        }
   //     System.out.println(lo);
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
            //      System.out.println(lz + "----------------------------------------------------------------"+num++);
            insert(lo, lz);
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

    public static void insert(LinkedList lj1, LinkedList lz1) {
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
            System.out.println(lz + "----------------------------------------------------------------" + num++);
            return;
        }
        LinkedList lnew = new LinkedList();
        for (int i = 0; i < lj.size(); i++) {
            if (i + 1 < lj.size() && lj.get(i) == lj.get(i + 1)) {
                lnew.add(lj.remove(i));
                i--;
                continue;
            }
            lnew.add(lj.remove(i));
            break;
        }

        ftrim(lnew);
        for (int i = 0; i < lnew.size(); i++) { 
            if (lnew.get(i) == '*') {
                lnew.remove(i);
                lnew.addAll(i, lz);
                insert(lj, lnew);
             
                lnew.set(i, '*');
                for (int j = 1; j < lz.size(); j++) {
                    lnew.remove(i + 1);
                }
            }
        }
    }
}
