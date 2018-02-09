/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.HashSet;
import java.util.Scanner;

public class Main1200 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nc = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println(countSubStr(s, n));
	}

	public static int countSubStr(String s, int subLen) {
		int count = 0;
		int size = s.length();

		HashSet< Integer> sub = new HashSet(100000);

		int hashCode = 0;
		for (int i = 0; i < size - (subLen - 1); i++) {
			String tmp = s.substring(i, i + subLen);
			hashCode = tmp.hashCode();
                        sub.add(hashCode);
		}
		return sub.size();
	}
}


