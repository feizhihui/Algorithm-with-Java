/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2782 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int l=scan.nextInt(); 
        int[]a=new int[n];
        for(int i=0;i<n;i++) a[i]=scan.nextInt();
        Arrays.sort(a);
        int k=n-1;
        int sum=0;
        for(int i=0;i<=k;){
            if(a[i]+a[k]<=l){
                sum++;
                k--;
                i++;
            }else{
                sum++;
                k--;
            }
        }
        System.out.println(sum);
    }
    
}
