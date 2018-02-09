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
public class Main2209 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int m=scan.nextInt();
        int sum=0;
        for(int i=0;i<num;i++){
            int k=scan.nextInt();
            int s=(int)Math.pow(k, m);
             sum+=s>0?s:0;
        }
        System.out.println(sum);
        
    }
    
}
