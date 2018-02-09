/*
 * 出一个区间，求区间内每一个数按规则（奇数取3n+1，偶数取n/2）变换最后变成1的步数，求最大的一个步数。
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1207 {
    static int k1,k2;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Main1207 mm=new Main1207();
        while(true){
        int m=scan.nextInt();
        int n=scan.nextInt();      
        int h1=m,h2=n;
        if(m>n){
            int t=m;
            m=n;
            n=t;
        }
        
        for(int i=m;i<=n;i++){
            mm.recur(i);
            if(k2>k1){
                k1=k2;              
            } 
            k2=0;       
        }
            System.out.println(h1+" "+h2+" "+k1);
            k1=0;
        }
        
    }
    
    public void recur(int n){       
        if(n==1){
            k2++;
        }else if(n%2==0){
            k2++;
           recur(n/2);
        }else if(n%2!=0){
            k2++;
            recur(3*n+1);
            
        }
      }
    
}
