/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class M37 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        String s=scan.next();
        StringBuilder sb=new StringBuilder(s);
        int t=0,p=1;
        while(sb.length()!=0){
            int m=sb.charAt(sb.length()-1)-'0';
            t+=m*p;
            p*=b;
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(t);  
    }
    
}
