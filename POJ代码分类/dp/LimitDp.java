package com.java.dp;

import java.util.Scanner;

/**
 *
 * 有限制条件的 空间点的配对
 */
public class LimitDp {

    static class Note {
        int x;
        int y;
        int z;
    }
    static int m;
    static Note[] a;
    static boolean[]map;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        a = new Note[m];
        map = new boolean[m];
        for (int i = 0; i < m; i++) {
            a[i]=new Note();
            a[i].x = scan.nextInt();
            a[i].y = scan.nextInt();
            a[i].z = scan.nextInt();
        }

        System.out.println(dp(m));

    }
    public static double dp(int t) {
        if(t==0) return 0;
        if(map[t-1]) return dp(t-1);
        double max = 0;
        for (int i = 0; i < t - 1; i++) {
            if (map[i] == false) {
                map[i] = true;
                double x = dp(t - 1) + Math.sqrt((a[t - 1].x - a[i].x) * (a[t - 1].x - a[i].x) + (a[t - 1].y - a[i].y) * (a[t - 1].y - a[i].y) + (a[t - 1].z - a[i].z) * (a[t - 1].z - a[i].z));
                map[i] =false;
                if (max < x) {
                    max = x;
                }
            }
        }
        return max;

    }
}
