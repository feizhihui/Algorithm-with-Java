/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * 简单凸包
 */
public class Main2365 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double r=scan.nextDouble();
        double[]x=new double[n];
        double[]y=new double[n];
        for(int i=0;i<n;i++){
            x[i]=scan.nextDouble();
            y[i]=scan.nextDouble();
        }     
            double sum=Math.PI*2*r;
            for(int i=0;i<n;i++){
                if(i+1<n)
                sum+=Math.sqrt(Math.pow((x[i+1]-x[i]), 2)+Math.pow(y[i+1]-y[i], 2));
                else 
                sum+=Math.sqrt(Math.pow((x[0]-x[n-1]), 2)+Math.pow(y[0]-y[n-1], 2));
            }
            System.out.printf("%.2f\n",sum);  
        }
    
    
}
