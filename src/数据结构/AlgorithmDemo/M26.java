/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

public class M26 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double t=0;
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            t+=1.0/i; 
        }
        System.out.printf("%.3f\n",t);;
    }
    
}
