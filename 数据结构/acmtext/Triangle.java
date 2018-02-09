/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         int k=1;
         System.out.println();
         
         for(int i=0;i<n;i++){         //一排打印2i-1
             for(int m=0;m<i;m++) System.out.print(" ");
             for(int j=0;j<n*2-1-2*i;j++){
                 if(k>5){ k=1;}
                 System.out.print(k);
                 k++;             
            }
            System.out.println();
         }
    }
    
}
