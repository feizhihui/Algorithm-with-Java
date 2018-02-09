/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1503 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BigInteger sum=new BigInteger("0");
        while(true){
            BigInteger bi=scan.nextBigInteger();
            if(bi.equals(new BigInteger("0"))){
                break;
            }
            sum=sum.add(bi);
        }
        System.out.println(sum);
        
    }
    
}
