/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3077 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int k=scan.nextInt();
            if(k<10){
                System.out.println(k);
                continue;
            }
            StringBuilder sb=new StringBuilder(k+"");
            int q=0,l;
            sb.reverse();
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)+q>='5') q=1;   
                else q=0;
            }
            if(sb.charAt(sb.length()-1)+q-'0'>=10){   //sb.charAt(sb.length()-1)+q  有进位
                System.out.print(1);
                for(int i=0;i<sb.length();i++){
                    System.out.print(0);
                }
                System.out.println();
            }else{
                for(int i=sb.length()-1;i>=0;i--){
                        if(i==sb.length()-1) System.out.print((char)(sb.charAt(i)+q));   //sb.charAt(sb.length()-1)+q 无进位
                        else System.out.print(0);
                }
                System.out.println();
            }   
        }  
    }
}
