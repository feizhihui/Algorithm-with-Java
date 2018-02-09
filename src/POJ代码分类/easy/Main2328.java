/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;


public class Main2328 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int max=11,min=0;
        while(true){
            int k=scan.nextInt();
            if(k==0) break;
            scan.nextLine();
            String s=scan.nextLine();
            if(s.equals("too high")){
                if(max>k)
                max=k;
            }else if(s.equals("too low")){
                if(min<k)
                min=k;
            }else if(s.equals("right on")){
                if(k<max&&k>min) System.out.println("Stan may be honest");
                else System.out.println("Stan is dishonest");
                max=11;min=0;
            }
            
        }
        
    }
    
}
