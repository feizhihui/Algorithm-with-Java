/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.datahandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * 寻找第K小的数的问题
 */

public class Main2092 {              
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            int n=scan.nextInt();
            if(m==0&&n==0) break;
            int[]a=new int[10001];
            int[]key=new int[10001];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int t=scan.nextInt();
                    a[t]++;
                    key[t]=t;
                }
            }
            
            for(int i=1;i<10000;i++){
                int max=i,t;
                for(int j=i+1;j<=10000;j++){
                    if(a[max]<a[j]) max=j;               
                }
                if(max!=i){
                    t=a[i];
                    a[i]=a[max];
                    a[max]=t;
                    t=key[i];
                    key[i]=key[max];
                    key[max]=t;      
                }
            }
            int num=0,t=0,b=0;
            ArrayList<Integer>list=new ArrayList();
            for(int i=1;a[i]!=0;i++){
                if(t!=a[i]){
                    num++;
                    t=a[i];
                }
                if(num==2){
                    list.add(key[i]);
                    
                }
                
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i));
                if(i<list.size()-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}