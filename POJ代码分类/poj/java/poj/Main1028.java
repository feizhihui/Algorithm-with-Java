
package com.java.poj;
/*
 * 模仿WebBruser
 */


import java.util.Scanner;
import java.util.Stack;

public class Main1028 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> sta = new Stack();
        Stack<String> sav = new Stack();
        sta.push("http://www.acm.org/ ");
        while (true) {
            String s = scan.nextLine();
            if (s.equals("QUIT")) {
                break;
            }
            if (s.startsWith("VISIT")) {
                sta.push(s.substring(6));
                sav.removeAllElements();
                System.out.println(s.substring(6));
            } else if (s.equals("BACK")) {
                if (sta.size()==1) {
                    System.out.println("Ignored");
                    continue;
                }
                sav.push(sta.pop());
                System.out.println(sta.peek());
            } else if (s.equals("FORWARD")) {
                if (sav.isEmpty()) {
                    System.out.println("Ignored");
                    continue;
                }
                sta.push(sav.pop());
                System.out.println(sta.peek());
            }
        }
    }
}
