/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.datahandling;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2453 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            if(m==0) break;
            String s=Integer.toBinaryString(m);
            System.out.println("0"+s);  //
            StringBuilder sb=new StringBuilder("0"+s);//?
            int b=0;
            loop:
            for(int i=sb.length()-2;i>=0;i--){
                if(sb.charAt(i)=='0')
                    for(int j=i+1;j<sb.length();j++){
                        if(sb.charAt(j)=='1'){
                            sb.setCharAt(i, '1');
                            sb.setCharAt(j, '0');
                            b=j;   //从b+1位起开始将一后移
                            break loop;
                        }
                    }
            }

            for(int i=b+1;i<sb.length()-1;i++){
                if(sb.charAt(i)=='1')
                for(int j=sb.length()-1;j>i;j--){
                    if(sb.charAt(j)=='0'){
                        sb.setCharAt(i, '0');
                        sb.setCharAt(j, '1');
                        break;
                    }
                    
                }
            }
            System.out.println(sb);  //
            int t=Integer.valueOf(sb.toString(), 2);
            System.out.println(t);
        }    
    }
}
