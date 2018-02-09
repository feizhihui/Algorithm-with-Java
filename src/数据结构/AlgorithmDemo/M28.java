/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class M28 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        double t=0;
//        for(long i=n;i<=m;i++){
//            t+=1.0/(i*i);
//        }
        for(int i=n;i<=m;i++){
            t+=1.0/i/i;
        }        
        System.out.printf("%.5f\n",t);
    }
    
}
