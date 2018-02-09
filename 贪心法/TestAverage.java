/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * 均摊纸牌问题！！
 * 
 */
package GreedyMethod;

import java.util.Scanner;

public class TestAverage {

    static int k = 0;

    public static void main(String[] args) {
        TestAverage t = new TestAverage();
        while (true) {
            t.test();
        }
    }

    public void print(int i, int m, int j) {
        System.out.println("从第" + (i + 1) + "堆向" + (j + 1) + "堆移动" + m + "张");
        k++;
    }

    public void test() {
        k = 0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] a = new int[num];
        int ave = 0;
        for (int i = 0; i < num; i++) {
            a[i] = scan.nextInt();
            if (a[i] < 0) {
                wrong();
                return;
            }
            ave += a[i];
        }
        if (ave % num != 0) {
            wrong();
            return;
        }
        ave /= num;
        int m = 0;
        for (int i = 0; i < num; i++) {
            if (m == 0) {
                if (a[i] > ave) {
                    print(i, a[i] - ave, i + 1);
                    a[i + 1] += a[i] - ave;
                    a[i] = ave;
                } else {
                    m += ave - a[i];
                }
                continue;

            }
            if (m > 0) {              //前面少m
                if (a[i] >= m) {
                    for (int j = i; m != 0; j--) {
                        print(j, m, j - 1);
                        a[j] -= m;
                        a[j - 1] += m;
                        m = a[j - 1] - ave;
                    }
                    i--;
                } else {
                    m += ave - a[i];
                }
            }
        }
        System.out.println("最少移动次数为：" + k);
    }

    public void wrong() {
        System.out.println("数据输入有误！");
    }
}
