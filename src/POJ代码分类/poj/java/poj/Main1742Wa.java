/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;
import java.util.Scanner;

public class Main1742Wa {

    public static void main(String args[]) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            N = sc.nextInt();//硬币的种数
            M = sc.nextInt();//能表示出的面值的最大值
            if (N == 0 && M == 0) {
                break;
            }
            int a[] = new int[100];//a[i]表示第i种硬币的面值
            int c[] = new int[100];//c[i]表示第i种硬币的个数

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                c[i] = sc.nextInt();
            }

            int nRes = 0;
            boolean s[] = new boolean[100001];//s[i]=true,表示能表示出面值i
            s[0] = true;

            for (int i = 0; i < N; i++)//对每一种硬币,按面值从小到大进行测试
            {
                int u[] = new int[100001];

                for (int j = a[i]; j <= M; j++)//对a[i]至M的每一个面值进行测试,
                {

                    if (!s[j] && s[j - a[i]] && u[j - a[i]] < c[i]) {
                        s[j] = true;
                        u[j] = u[j - a[i]] + 1;//u[j]表示在组成面值j时使用了多少个面值为a[i]的硬币
                        nRes++;
                    }
                }
            }
            System.out.printf("%d\n", nRes);
        }
    }
}

