
package com.java.poj;
/*
 * 该方法超时，详细请见 http://www.java3z.com/cwbwebhome/article/article18/resport012.html?id=3821
 * 
 * 有n种面值的货币(1<=n<=100)，
 * 面值分别为A1,A2~An，
 * 每种面值的货币分别有C1,C2,C3...Cn 个(1<=Ai<=100000,1<=Ci<=1000)，
 * 问用这些货币能表示出1~m(m<=100000)中的几种面值。
 */

import java.util.Scanner;

public class Main1742 {
       static int[]a;
       static int[]c;
       static int n,m;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        int k=0;
        n = scan.nextInt();
        m = scan.nextInt();
        a = new int[n];
        c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scan.nextInt();
        }
        for (int j = 0; j < n; j++) {
            c[j]=scan.nextInt();
        }
        while(m!=0){
            if(recur(m,n)==true){
               k++; 
            }    
            m--;
        }          
        System.out.println(k);
        }
    }
    
    public static boolean recur(int x,int n) {   //x面值能否用剩余的钱币表示， n为只用判断前n张钱币与x的关系
        for(int i=n;i>0;i--){
            if(x<a[i-1]) continue;
            for(int j=c[i-1];j>0;j--){
                if(x-a[i-1]*j<0) continue;
                if(x-a[i-1]*j==0) return true;
                if(x-a[i-1]*j>0){
                    c[i-1]-=j;
                    boolean b=recur(x-a[i-1]*j,i-1);        
                    c[i-1]+=j;     
                    if(b) return b;
                }            
            }           
        }        
        return false;
    }
}
