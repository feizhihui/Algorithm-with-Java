/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

public class Main3224 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt(),n,t=0;
        n=m;
        int max=0;
        while(m--!=0){
            int sum=0;
            for(int i=0;i<n;i++){
                int score=scan.nextInt();
                if(score==3) sum++;
            }
            if(max<sum){
                max=sum;
                t=n-m;
            }
        }
        System.out.println(t);
    }
}
