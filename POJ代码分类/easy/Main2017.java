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
public class Main2017 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            if(m==-1) break;
            int sum=0;
            int t=0;
            for(int i=0;i<m;i++){
                int x=scan.nextInt();
                int y=scan.nextInt();
                sum+=x*(y-t);
                t=y;                
            }
            System.out.println(sum+" miles");
        }
        
    }
    
}
