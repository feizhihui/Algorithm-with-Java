/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hsoj1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion r=new Recursion();
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int[]a=new int[t];
        r.coding(a,t);         
          for(int i=0;i<a.length;i++){
              System.out.print(a[i]);                   
          }  
        
    }
    
    public void coding(int[]a,int n){
        if(n==0){
            print(a);
        }else{
            a[n-1]=0;
            coding(a,n-1);
            a[n-1]=1;
            coding(a,n-1);                         
        }
                       
    }
    
    public void print(int[]a){
          for(int i=0;i<a.length;i++){
              System.out.print(a[i]);                   
          }
         System.out.println();
              
    }
    
}
