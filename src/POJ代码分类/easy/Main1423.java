/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * tle, 用公式AC
 */
public class Main1423 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int k=scan.nextInt();
            BigInteger bi=new BigInteger("1");
            for(int i=1;i<=k;i++){
                bi=bi.multiply(new BigInteger(i+""));                
            }
            System.out.println((bi+"").length());
            
        }
    }
    
}
