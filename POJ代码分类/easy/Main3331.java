/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * 高精度阶乘问题
 */
public class Main3331 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int k=scan.nextInt();
            int t=scan.nextInt();
            BigInteger sum=new BigInteger("1");
            for(int i=2;i<=k;i++){
                BigInteger bk=new BigInteger(i+"");
                sum=sum.multiply(bk);
            }
            String s=sum+"";
            int num=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==t+'0'){
                    num++;
                }
            }
            System.out.println(num);
            
        }
        
    }
    
}
