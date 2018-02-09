/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.datahandling;

import java.util.Scanner;

/**
 *
 * Skew进制转换
 */
public class Main1565 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.next();
            if(s.equals("0")) break;
            int sum=0;
            for(int i=0;i<s.length();i++){
                int c=s.charAt(i)-'0';
                sum+=c*((1<<(s.length()-i))-1);
            }
            System.out.println(sum);
            
            
            
            
        }
        
        
    }
    
}
