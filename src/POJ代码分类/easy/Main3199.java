/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;
public class Main3199 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            int n=scan.nextInt();
            if(m==0&&n==0) break;
            System.out.println(BigInteger.valueOf(m).pow(n));
        }
        
    }
    
}
