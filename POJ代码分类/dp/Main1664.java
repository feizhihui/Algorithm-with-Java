
package com.java.dp;

/*
 * M个同样的苹果放在N个同样的盘子里
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main1664 {
    static int[][]save;
    static int num=0;
    static int[]a;
    static int n=0,m=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        while(k--!=0){
        m=scan.nextInt();
        n=scan.nextInt();
        save=new int[100000][n];
        a=new int[n];
        load(m,n,0);
        System.out.println(num);
        num=0;
        }
        
    }
    public static void load(int x,int y,int k){
        if(y==1){
            int sum=0;
            for(int i=0;i<n-1;i++) sum+=a[i];            
            a[n-1]=m-sum;
            int[]b=a.clone();
            Arrays.sort(b);
            for(int i=0;i<num;i++){
                boolean boo=true;
                for(int j=0;j<n;j++){
                    if(b[j]!=save[i][j]){
                        boo=false;        //有一个不等则false
                        break;
                    }
                }
                if(boo)
                return;
            }
            save[num]=b;
            num++;
            return;
        }
        for(int i=0;i<=x;i++){
            a[k]=i;
            load(x-i,y-1,k+1);            
        }
        
    }
    
}
