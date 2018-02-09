/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Quanpailie;

import java.util.*;


/**
 *
 * @author Administrator
 */
public class Main1 {

    static Set<String>se;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            char[] ch = scan.next().toCharArray();
            Arrays.sort(ch);
            se=new TreeSet();              //剔除重复
            StringBuilder set = new StringBuilder(new String(ch));
            dfs(new StringBuilder(), set);
            for(String s:se){
               System.out.println(s);
            }
        }
    }

    public static void dfs(StringBuilder sb, StringBuilder set) {
        if (set.length() == 0) {
         //       System.out.println(sb);
                se.add(sb.toString());
                return;    
        }
        for (int i = 0; i < set.length(); i++) {
            char c = set.charAt(i);
            dfs((sb.append(c)), (set.deleteCharAt(i)));       //new StringBuilder
            sb.deleteCharAt(sb.length() - 1);
            set.insert(i, c);            //insert 和set 不同
        }

    }
}
