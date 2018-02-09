/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CycleCalendar {
    static int[][]a;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        a=new int[1<<m][1<<m];
        merge(m);
        for(int i=0;i<1<<m;i++){
            for(int j=0;j<1<<m;j++)
            System.out.printf("%2d ",a[i][j]);
            System.out.println();
        }
    }
    public static void merge(int k){   //1<<k为有效数组长度
        if(k==0){
            a[k][k]=1;
            return;
        }
        merge(k-1);
        int len=1<<k;
        for(int i=0;i<len/2;i++){
            for(int j=0;j<len/2;j++){
                a[i][j+len/2]=a[i][j]+len/2;
                a[i+len/2][j]=a[i][j]+len/2;
                a[i+len/2][j+len/2]=a[i][j];                
            }
            
        }     
        
    }
    
}
