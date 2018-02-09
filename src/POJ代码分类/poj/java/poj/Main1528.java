/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1528 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        while(true){
            if(count==0) System.out.println("PERFECTION OUTPUT");
            int k=scan.nextInt();
            count++;
            if(k==0){
                System.out.println("END OF OUTPUT");
                break;
            }
            int sum=0;
            for(int i=1;i<k;i++){
                if(k%i==0)
                sum+=i;
            }
            if(sum>k) System.out.printf("%5d  ABUNDANT\n",k);
            else if(sum==k) System.out.printf("%5d  PERFECT\n",k);
            else if(sum<k) System.out.printf("%5d  DEFICIENT\n",k);
            
        }   
    }

}
