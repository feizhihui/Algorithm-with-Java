/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

/**
 *
 * @author Administrator
 */
public class M22 {
    public static void main(String[] args) {
        
        for(int i=100;i<1000;i++){
           int k,m,n;
           k=i%10;
           m=(i/10)%10;
           n=(i/100)%10;
           if(k*k*k+m*m*m+n*n*n==i){
               System.out.println(i);
           }
           
        }
        
        
    }
    
}
