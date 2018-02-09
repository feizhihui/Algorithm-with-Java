/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*
 * JAVA解北大POJ3211（01背包）:洗衣服
 * http://www.java3z.com/cwbwebhome/article/article18/report047.html?id=4375
 */
public class Beibao1 {

    int[][] num;
    HashMap map;
    Scanner scan=new Scanner(System.in);
    int time;

    public static void main(String[] args) {
        Beibao1 m = new Beibao1();
     //   Scanner scan = new Scanner(System.in);
        int color = -1, total = -1;
        while (true) {            
            color = m.scan.nextInt();
            total = m.scan.nextInt();
            if(color==0&&total==0) break;
            m.go(color,total);
        }
    }

    public void go(int color,int total) {
        time=0;
        num = new int[color][101];
        map = new HashMap();
        for (int i = 0; i < color; i++) {
            map.put(scan.next(), i);
        }
//        System.out.println(map);
        for (int i = 0; i < total; i++) {
            int m = scan.nextInt();
            String s = scan.next();
            int n =(Integer) map.get(s);
            num[n][num[n][100]++] = m;
        }

        for (int i = 0; i < num.length; i++) {
            int j;
            for (j = 0; num[i][j] != 0; j++);
            int[] result = new int[j];
            for (j = 0; j < result.length; j++) {
                result[j] = num[i][j];
            }
            Arrays.sort(result);
            testTime(num[i]);
        }
        System.out.println(time);

    }

    public void testTime(int[] a) {
        int i, s = 0, t = 0, g;
        for (i = 0; a[i] != 0; i++) {
            s += a[i];
        }
        if (i == 0) {
            return;
        }
        i--;

        t = a[i];
        g = t;
        if (compare(s, t, t)) {
            time += t;
            return;
        }

        for (int k = 0; k < i - 1; k++) {          //k个试探
            for (int j = k; j < i; j++) {
                if (compare(s, g + a[j], t + a[j])) {
                    time += t;
                    return;
                }
            }
            t += a[k];
        }
    }

    public boolean compare(int s, int h, int t) {
        boolean b = false;
        if (s - h - t <= 0) {
            b = true;
        }
        return b;          //若返回负值，，则为最优解
    }
}
