/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

/**
 *
 * @author Administrator
 */
public class Main1517 {
    public static void main(String[] args) {
        System.out.println("n e ");
        System.out.println("- -----------");
        double sum=1;        
        for(int i=0;i<10;i++){
            if(i==0){
                System.out.println(i+" "+sum);
                continue;
            }
            int t=1;
            for(int j=1;j<=i;j++){
                t*=j;
            }
            sum+=1.0/t;
   //         System.out.println(i+" "+sum);
            System.out.printf("%d %10.9f\n", i, sum);

        }
    }
      
    
}
