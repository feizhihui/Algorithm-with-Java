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
public class TrueQuickSort {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[]a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
        }
        quickSort(a,0,m);
        for(int i=0;i<m;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }
    
    public static void quickSort(int[]a,int x,int y){
        if(y-x<=1) return;
        int i=x,j=y-1,key=a[x];
        while(i<j){
            while(j>=0&&a[j]>=key) j--;  //从后往前找到a[j]小于key
            while(i<y&&a[i]<=key) i++;  //从前往后找到a[i]大于key         
            if(i>=j) break;          //如果有一个找不到
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        if(i==y){                  //万一是找不到比key大的值，此时key为最大值，key与最右方的值交换
            int t=a[i-1];
            a[i-1]=a[x];
            a[x]=t; 
            i=i-1;
        }
        System.out.println(i+" "+j);
        quickSort(a,x,i);
        quickSort(a,i,y);   
    }
    
}
