package com.java.poj;

import java.util.Scanner;

public class Main3974 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (true) {
            String ss = scan.nextLine();
            if ("END".equals(ss)) {
                break;
            }
            String s = "";
            for (int i = 0; i < ss.length(); i++) {
                s += "*" + ss.charAt(i);
            }
            s += "*";
            char[]ch=s.toCharArray();
            int[] r = new int[s.length()];
            int i = 0, j = 0;
            while (i < s.length()) {
                while (i + j < s.length() && i - j >= 0 && ch[i+j] == ch[i-j]) //两边延伸j-1个
                {
                    j++;
                }
                r[i] = j - 1;       //不是那个位置，则减一,j为试探位置
                int k = 1;
                while (k <= r[i] && r[i - k] != r[i] - k) {
                    r[i + k] = Math.min(r[i - k], r[i] - k);
                    k++;
                }
                i += k;
                j=j-k;
            }
            int l = 0;
            for (i = 0; i < s.length(); i++) {
                l = Math.max(l, r[i] * 2 + 1);
            }
            System.out.println("Case " + (count++) + ":" + l / 2);
        }
    }
}
