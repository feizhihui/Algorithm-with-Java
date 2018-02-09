/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

public class Cantor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            int k=1,s=0,m;
            while(true){
                s+=k;
                if(s>=n){
                    if(k%2==0){
                        m=k-(s-n);
                    }else{
                        m=s-n+1;
                    }            
                    System.out.printf("%d/%d\n",m,k-m+1);
                    break;
                }
                k++;
            }
        }
    }
}
