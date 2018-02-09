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
public class YhTriangle {
    
       
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        for(int i=0;i<k;i++){
            for(int j=i;j<k-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(printf(i,j)+" ");
            }
            System.out.println();
            
        }
    
    
    }
    
    public static int printf(int x,int y){
       if(y==0||y==x) return 1;
       else
        return printf(x-1,y-1)+printf(x-1,y);
    }
      
}
