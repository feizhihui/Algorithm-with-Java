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
public class Main2350 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int n=scan.nextInt();
            int[]a=new int[n];
            double sum=0;
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
                sum+=a[i];
            }
            sum/=n;
            int k=0;
            for(int i=0;i<n;i++){
                if(a[i]>sum) k++;
            }
            System.out.printf("%.3f%%\n",1.0*k/n*100); 
        }
    }
    
}
