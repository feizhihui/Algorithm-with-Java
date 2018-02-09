/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.datahandling;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * k^n=p        输入n,p  输出k
 */
public class Main2109 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BigInteger two=new BigInteger("2");
        BigInteger one=new BigInteger("1");
        while(scan.hasNext()){
            int n=scan.nextInt();
            BigInteger p=scan.nextBigInteger();
            if(n==1){
                System.out.println(p);
                continue;
            }
            
            BigInteger pn=one,pm=p;
            while(true){
                 BigInteger x=pm.add(pn).divide(two);
                 BigInteger resu=x.pow(n);
                 if(resu.equals(p)||pm.equals(pn)){
                     System.out.println(x);
                     break;
                 }
        
                 if(resu.compareTo(p)==1){
                     pm=x.subtract(one);
                 }
                 if(resu.compareTo(p)==-1){
                     pn=x.add(one);
                 }
                
            }          
        }
        
    }
    
}
