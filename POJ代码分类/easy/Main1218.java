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
public class Main1218 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int k=scan.nextInt();
            int i;
            for(i=1;i*i<=k;i++);
            System.out.println(i-1);  
        }
    }
    
}
