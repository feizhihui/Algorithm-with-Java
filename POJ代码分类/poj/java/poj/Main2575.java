/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.HashSet;
import java.util.Scanner;

public class Main2575 {
    public static void main(String[] args) {
       
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int k=scan.nextInt();
            int[]a=new int[k];
            for(int i=0;i<k;i++){
                a[i]=scan.nextInt();
            }
            HashSet<Integer>hs=new HashSet();
            for(int i=1;i<k;i++){
                int t=a[i]-a[i-1];
                hs.add(Math.abs(t));
            }
            boolean b=true;
            for(int i=1;i<k;i++){
                if(!hs.contains(i)){
                    b=false;
                    break;
                }
            }
            if(b) System.out.println("Jolly");
            else System.out.println("Not jolly");

        }  
    }
    
}
