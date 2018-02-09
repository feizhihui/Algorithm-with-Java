/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;
   
import java.util.*;   
public class Main1002 {   
  
    public static char getNum(char c) {   
        if (Character.isDigit(c)) {               //判断字符是否是数字
            return c;   
        }   
        if (c == 'A' || c == 'B' || c == 'C') {   
            return '2';   
        }   
        if (c == 'D' || c == 'E' || c == 'F') {   
            return '3';   
        }   
        if (c == 'G' || c == 'H' || c == 'I') {   
            return '4';   
        }   
        if (c == 'J' || c == 'K' || c == 'L') {   
            return '5';   
        }   
        if (c == 'M' || c == 'N' || c == 'O') {   
            return '6';   
        }   
        if (c == 'P' || c == 'R' || c == 'S') {   
            return '7';   
        }   
        if (c == 'T' || c == 'U' || c == 'V') {   
            return '8';   
        }   
        if (c == 'W' || c == 'X' || c == 'Y') {   
            return '9';   
        }   
        return 0;   
    }   
  
    public static void main(String[] args) {   
        Scanner scan=new Scanner(System.in);  
        Map< String, Integer> tm = new TreeMap();   
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {   
            String s = scan.nextLine().replace("-", "");     //去掉字符串 的“-”  
            StringBuilder sb = new StringBuilder();   
            for (int k = 0; k < s.length(); k++) {   
                char c = getNum(s.charAt(k));   
                    sb.append(c);                       //拼装成数字串   
            }   
            String result = sb.toString().substring(0, 3) + '-' + sb.toString().substring(3);     //第3位第4位间补充“-”   
            if (tm.containsKey(result)) {                 //判断是否有重复，，将其加入Map<String,Integer>中,containKey则count++,fouze  put(count=1)
                int count = tm.get(result) + 1;   
                tm.put(result, count);   
            } else {   
                tm.put(result, 1);   
            }   
        }   
        Set se = tm.keySet();   
        Iterator it = se.iterator();   
        boolean flag = true;   
        while (it.hasNext()) {   
            String s = it.next().toString();   
            int count = tm.get(s);   
            if (count > 1) {   
                flag = false;   
                System.out.println(s + " " + count);   
            }   
        }   
        if (flag) {   
            System.out.println("No duplicates. ");   
        }   
    }   
}  
