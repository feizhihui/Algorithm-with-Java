/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.greedy;

import java.util.Scanner;

/**
 *
 * 贪心 装箱问题
 */
public class Main1017 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
        int[]a=new int[7];
        int[]p={0,7,6,5},q={0,5,3,1};
        
        for(int i=1;i<=6;i++){
            a[i]=scan.nextInt();
        }
        if(a[1]==0&&a[2]==0&&a[3]==0&&a[4]==0&&a[5]==0&&a[6]==0) break;
        int n=a[6]+a[5]+a[4]+(a[3]+3)/4;
        if(a[2]<q[a[3]%4]+5*a[4]){        //a[2]能插入剩余空间
            int t=(q[a[3]%4]+5*a[4]-a[2])*4+a[5]*11+p[a[3]%4];     //剩余的1*1；
            if(a[1]>t){
                n+=(a[1]-t+35)/36;
            }            
        }else if(a[2]>q[a[3]%4]+5*a[4]){                     //a[2]不能插入剩余空间
            int t=a[2]-(q[a[3]%4]+5*a[4]);
            n+=(t+8)/9;
            t=36-(t%9==0?9:t%9)*4+a[5]*11+p[a[3]%4];
            if(a[1]>t){
                n+=(a[1]-t+35)/36;
            }
            
        }else{ 
            int t=a[5]*11+p[a[3]%4];
            if(a[1]>t){          
                n+=(a[1]-t+35)/36;
            }
            
        }
        System.out.println(n);
        
        }
    }
    
}
