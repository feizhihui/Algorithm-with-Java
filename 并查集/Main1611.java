/*
 * To change this template, choose Tools | Templates
 * 基本并查集的 find union操作
 */
package UnionFindSet;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1611 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            if (m == 0 && n == 0) {
                break;
            }
            int[] fa = new int[m];
            int[] rank = new int[m];
            for (int i = 0; i < m; i++) {
                fa[i] = i;
                rank[i] = 1;
            }

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                int[] a = new int[num];
                for (int j = 0; j < num; j++) {
                    a[j] = scan.nextInt();
                    if (j > 0) {
                        union(a[0], a[j], fa, rank);
                    }
                }
            }
            System.out.println(rank[find(0, fa)]);
        }
    }

    public static int find(int x, int[] fa) {
        if (x == fa[x]) {
            return x;
        }
        return fa[x] = find(fa[x], fa);
    }

    public static void union(int x, int y, int[] fa, int[] rank) {
        x = find(x, fa);
        y = find(y, fa);
        if (x != y) {
            if (rank[x] >= rank[y]) {
                rank[x] += rank[y];
                fa[y] = x;
            } else {
                rank[y] += rank[x];
                fa[x] = y;
            }
        }
    }
    
}
