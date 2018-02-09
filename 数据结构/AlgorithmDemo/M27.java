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
public class M27 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double p=0;
        for(int i=1;i<=1000000;i++){
           p+=1.0/(2*i-1)*Math.pow(-1,i+1);      
        }
        System.out.println(p);  
        
        System.out.println(Math.PI/4+"=PI/4="+Math.atan(1));
    }
}
