/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3302 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- != 0) {
            String s=scan.nextLine();
            StringBuffer s1 = new StringBuffer(s);
            s=scan.nextLine();
            StringBuffer s2 = new StringBuffer(s);
            boolean b = test(s1, s2) || test(s1, s2.reverse());
            System.out.println(b?"YES":"NO");

        }

    }

    public static boolean test(StringBuffer s1, StringBuffer s2) {
        int t=0,k=0;
        for (int i = 0; i < s1.length(); i++) {
            k=i;
            t=0;
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(k)==s2.charAt(j)){
                   t++;        
                }else{
                    j--;
                }
                k++;
                if(t==s2.length()){
                    return true;
                }
                if(k==s1.length()){
                    break;
                }
                
            }
        }
        return false;
    }
}
