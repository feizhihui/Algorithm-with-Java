/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * poj 2363  求立方体组成的具有最小表面积的长方体
 */
public class Main2363 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int n=scan.nextInt();
            int sum=Integer.MAX_VALUE;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                for(int j=i;j<=n;j++){
                    if(n/i%j==0)
                    for(int k=j;k<=n;k++){
                        if(n/i/j%k==0&&n==i*j*k){
                            if(sum>2*(i*j+j*k+k*i)){
                                sum=2*(i*j+j*k+k*i);
                            }
                        }
                        
                    }
                }
            }
            System.out.println(sum);
        }
    }
    
}
