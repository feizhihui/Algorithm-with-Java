/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * 木板桌外延伸
 */
public class Main1607 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Cards  Overhang ");
        while(scan.hasNext()){
            double sum=0;
            int k=scan.nextInt();
            for(int i=1;i<=k;i++){
                sum+=1.0/(2*i);
            }
            System.out.printf("%5d     %.3f\n",k,sum);
            System.out.printf("%5d%10.3f\n",k,sum);
        }
        
    }
    
}
