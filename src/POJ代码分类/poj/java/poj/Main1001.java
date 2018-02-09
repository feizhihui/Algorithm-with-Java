/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;
import java.math.*;

public class Main1001{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			BigDecimal bd = new BigDecimal(sc.next());
			BigDecimal result = bd.pow(sc.nextInt());
			String s = result.stripTrailingZeros().toPlainString();
			if(s.startsWith("0"))
				s=s.substring(1);
			System.out.println(s);                    
		}
	}
}

