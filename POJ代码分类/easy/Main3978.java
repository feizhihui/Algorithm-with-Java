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
public class Main3978 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(a==-1&&b==-1){
                break;
            }
            int sum=0;
            for(int i=a;i<=b;i++){
                if(isPrime(i)) sum++;
            }
            System.out.println(sum);
            
        }
        
    }
    public static boolean isPrime(int x){   //>1的整数
        if(x==1) return false;
        if(x==2) return true;
        if(x%2==0) return false;
        for(int i=3;i*i<=x;i+=2){
            if(x%i==0) return false;
        }
        return true;
        
    }
    
}
