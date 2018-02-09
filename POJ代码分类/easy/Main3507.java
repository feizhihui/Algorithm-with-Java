/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3507 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            double sum=0;
            int max=0,min=Integer.MAX_VALUE;
            int b=0;
            for(int i=0;i<6;i++){
                int t=scan.nextInt();
                if(t==0) b++;  
                if(max<t) max=t;
                if(min>t) min=t;
                sum+=t;
            }
            if(b==6) break;
            sum=(sum-max-min)/4;
            int ss=(int)sum;
            if(sum==ss) System.out.println(ss);
            else System.out.println(sum);
            
        }    
    }
}
