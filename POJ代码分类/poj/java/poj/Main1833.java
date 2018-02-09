/*
 1、从右边开始，找到一个满足右边存在大于自己的数，记为a

 2、从这个数a开始向右找，找到一个最小的比a打的数，两者交换

 3、把从a开始向右的所有数用qsort从小到大排个序


 */
package com.java.poj;

import java.util.Arrays;
import java.util.Scanner;

public class Main1833 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        while (m-- != 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            while (k-- != 0) {
                boolean b = false;
                for (int i = n - 2; i >= 0; i--) {
                    for (int j = n-1; j >i; j--) {
                        if (a[i] < a[j]) {
                            int u = a[i];
                            a[i] = a[j];
                            a[j] = u;             
                            b = true;
                            Arrays.sort(a, i + 1, n);          //i为u原始位置
                            break;
                        }
                    }
                      if(b) break;           //外层循环也要跳出
                }
                if(!b){
                    for(int i=0;i<n;i++){
                        a[i]=i+1;
                    }
                    
                }
            }
            for(int i=0;i<n-1;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println(a[n-1]);
        }
    }
}
