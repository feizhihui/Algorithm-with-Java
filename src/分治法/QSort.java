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
public class QSort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
     //   int k=scan.nextInt();
        int[]a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
        }
        QSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
    }
    public static void QSort(int[]a,int low,int high){
        if(low<high){
            int k=QR(a,low,high);
            QSort(a,low,k-1);
            QSort(a,k+1,high);
        }
        
    }
    public static int QR(int[]a,int low,int high){
        int key=a[low];
        while(low<high){
            while(low<high&&a[high]>=key) high--;
            a[low]=a[high];
            while(low<high&&a[low]<=key) low++;
            a[high]=a[low];
        }
        a[low]=key;
        return low;
    }
}
