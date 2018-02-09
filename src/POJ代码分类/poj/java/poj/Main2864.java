/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;


public class Main2864 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        while(!(n==0&&d==0)){
            int[][]a=new int[d][n];
            for(int i=0;i<d;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=scan.nextInt(); 
                }
            }
            boolean b=false;
            for(int i=0;i<n;i++){
                int sum=0;
                for(int j=0;j<d;j++){
                    sum+=a[j][i];
                }
                if(sum==d){
                    b=true;
                    break;
                }
            }
            if(b){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            n=scan.nextInt();
            d=scan.nextInt();
            
        }
        
    }   
}
