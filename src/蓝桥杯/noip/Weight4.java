/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.noip;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Weight4 {
        static boolean[]b=new boolean[1001];
        static int[]a;
        static int[]p;
        static int sum;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        a=new int[7];  //1 2 3 5 10 20
        p=new int[7];
        for(int i=1;i<=6;i++){      
            a[i]=scan.nextInt();
        }
        p[1]=1;
        p[2]=2;
        p[3]=3;
        p[4]=5;
        p[5]=10;
        p[6]=20;
        recur(1);        
        int k=0;
        for(int i=1;i<=1000;i++){
            if(b[i]) k++;
        }
        System.out.println(k);
        
    }
    public static void recur(int x){
        if(x==7){
            b[sum]=true;
            return;
        }
        
          for(int i=0;i<=a[x];i++){
              sum+=i*p[x];
              recur(x+1);
              sum-=i*p[x];                            
          }         

        
    }
    
}
