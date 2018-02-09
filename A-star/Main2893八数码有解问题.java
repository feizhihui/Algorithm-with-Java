/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package My2014;

import java.util.Scanner;

/**
 *
 * 如果为奇数列，则逆序数要一致；若偶数列，交换行列，与对应结果逆序数一致
 * TLE
 */
public class Main2893八数码有解问题 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m, n;
        m = scan.nextInt();
        n = scan.nextInt();
        while (m != 0 && n != 0) {
            int[][] a = new int[m][n];
            int[] e = new int[m * n - 1];
            int[]b=new int[m*n];
            int k = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scan.nextInt();
                    if (n % 2 != 0 && a[i][j] != 0) {
                        e[k++] = a[i][j];
                    }
                }
            }
            int t=0;
            if (n % 2 == 0) { //列 n为偶数
                k = 0;
                for (int i = 0; i < n; i++) {             //i 列
                    for (int j = 0; j < m; j++) {            // j 行
                        if (a[j][i] != 0) {   
                            e[k++] = a[j][i];
                        }
                        b[t++]= j*n+i+1;
                    }  
                }
            }
            
//            for(int i=0;i<e.length;i++) System.out.print(e[i]+" ");
//            System.out.println();
//            for(int j=0;j<b.length;j++) System.out.print(b[j]+" ");
//            System.out.println();
            //求逆序数
            int count = 0,count1=0;
            for (int i = 0; i < e.length - 1; i++) {
                for (int j = i + 1; j < e.length; j++) {
                    if (e[i] > e[j]) {
                        count++;
                    }
                    if(b[i]>b[j]){
                        count1++;
                    }
                }
            }
            
            if (count % 2 == 0&&n%2!=0 ||count%2==count1%2&&n%2==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            m = scan.nextInt();
            n = scan.nextInt();
        }

    }
}
