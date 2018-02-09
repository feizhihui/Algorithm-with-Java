/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divideAndConquer;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[]a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
        }                
        merge(a,0,m);
        for(int i=0;i<m;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();        
    }
    
    public static void merge(int[]a,int x,int y){        //左闭右开区间
        if(y-x==1) return;
        int n=x+(y-x)/2;        
        merge(a,x,n);
        merge(a,n,y);
        int[]arr=new int[y-x];
        int k=0,t=0;
        for(int i=0;i<y-x;i++){
            if(t>=y-n||k<n-x&&a[x+k]<=a[n+t]){
                arr[i]=a[x+k++];
            }else{
                arr[i]=a[n+t++];
            }
        }
        for(int i=x;i<y;i++) a[i]=arr[i-x];
        
    }
}
