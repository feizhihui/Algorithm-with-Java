
package com.java.poj;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PojSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[]a=new int[m];
        int g=0;
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
        }
        
        for(int i=0;i<m;i++){
            int t=a[i];
            for(int j=0;j<m;j++){
                if(j==i) continue;
                for(int k=j;k<m;k++){
                    if(k==j||k==i) continue;
                    if(t==(a[k]+a[j])){
                        g++;
                        System.out.println(a[i]+"="+a[k]+"+"+a[j]);
                    }
                    
                }
                
            }
            
        }
    
        
        System.out.println(g);
        
        
    }
}





