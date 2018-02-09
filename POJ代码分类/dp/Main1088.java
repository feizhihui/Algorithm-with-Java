/*
 * 连续最长单调减序列
 * 滑雪问题
 */
package com.java.dp;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1088 {

    static class Point {

        int x;
        int y;

        Point(int i, int j) {
            x = i;
            y = j;
        }
    }

    static class Text {

        LinkedList<Point> list = new LinkedList();

        Text(int i, int j) {
            list.add(new Point(i, j));
        }

        public void add(int i, int j) {
            list.add(new Point(i, j));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m + 2][n + 2];     //map
        int[][] dp = new int[m + 2][n + 2];
        int max = 0;
        Text[] h = new Text[10010];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = scan.nextInt();            //代表高度
                if (h[a[i][j]] == null) {
                    h[a[i][j]] = new Text(i, j);
                } else {
                    h[a[i][j]].add(i, j);
                }
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        int maxh = 0;
        for (int i = 0; i <= max; i++) {
            if (h[i] != null) {
                for (int k = 0; k < h[i].list.size(); k++) {            //同一高度的可能有多个
                    int x = h[i].list.get(k).x;
                    int y = h[i].list.get(k).y;
                    int t=a[x][y],t1=dp[x - 1][y],t2=dp[x + 1][y],t3=dp[x][y - 1],t4=dp[x][y + 1];
                    int m1,m2;
                    if(a[x-1][y]==t){
                        t1=0;
                    }
                    if(a[x+1][y]==t){
                        t2=0;
                    }
                    if(a[x][y-1]==t){
                        t3=0;
                    } 
                    if(a[x][y+1]==t){
                        t4=0;
                    }
                    m1 = Math.max(t1,t2 );
                    m2 = Math.max(t3,t4 );
                    
                        dp[x][y] = Math.max(m1, m2) + 1;             //连续最长单调减序列（包括自己）
                    if (maxh < dp[x][y]) {
                        maxh = dp[x][y];
                    }
                }
            }
        }
        System.out.println(maxh);
    }
}
