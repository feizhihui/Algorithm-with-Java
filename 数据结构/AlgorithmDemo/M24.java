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
public class M24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=n;i>0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>0;j--){
                System.out.print("#");
            }
            System.out.println("");
            
        }
        
    }  
}
