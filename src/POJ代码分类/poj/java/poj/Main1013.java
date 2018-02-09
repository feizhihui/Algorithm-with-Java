/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * 天平问题
 */
public class Main1013 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        while (M-- != 0) {
            int[] map = new int[12];
            for (int i = 0; i < 3; i++) {
                String s1 = scan.next();
                String s2 = scan.next();
                String state = scan.next();
                if (state.equals("even")) {
                    for (int j = 0; j < s1.length(); j++) {
                        int c = s1.charAt(j) - 'A';
                        map[c] = 1;
                        c = s2.charAt(j) - 'A';
                        map[c] = 1;
                    }
                } else if (state.equals("up")) {
                    for (int j = 0; j < s1.length(); j++) {
                        int c = s1.charAt(j) - 'A';
                        if (map[c] == 0) {
                            map[c] = 2;
                        } else if (map[c] == -2) {
                            map[c] = 1;
                        }
                        c = s2.charAt(j) - 'A';
                        if (map[c] == 0) {
                            map[c] = -2;
                        } else if (map[c] == 2) {
                            map[c] = 1;
                        }

                    }
                    for (int k = 0; k < 12; k++) {
                        char c = (char) (k + 'A');
                        if (!s1.contains(c + "") && !s2.contains(c + "")) {
                            map[k] = 1;
                        }
                    }


                } else if (state.equals("down")) {
                    for (int j = 0; j < s1.length(); j++) {
                        int c = s1.charAt(j) - 'A';
                        if (map[c] == 0) {
                            map[c] = -2;
                        } else if (map[c] == 2) {
                            map[c] = 1;
                        }
                        c = s2.charAt(j) - 'A';
                        if (map[c] == 0) {
                            map[c] = 2;
                        } else if (map[c] == -2) {
                            map[c] = 1;
                        }

                    }
                    for (int k = 0; k < 12; k++) {
                        char c = (char) (k + 'A');
                        if (!s1.contains(c + "") && !s2.contains(c + "")) {
                            map[k] = 1;
                        }
                    }

                }

            }
            int k = 0, i;
            for (i = 0; i < 12; i++) {
//                System.out.print(map[i] + " ");
                if (map[i] != 0 && map[i] != 1) {
                                  break; 
                }
            }
                  String notice=map[i]>0?"heavy.":"light.";
                  System.out.println((char)(i+'A')+" is the counterfeit coin and it is "+notice);
        }

    }
}
