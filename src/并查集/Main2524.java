/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnionFindSet;

import java.util.Scanner;

/**
 *
 * http://www.java3z.com/cwbwebhome/article/article18/report059.html?id=4713
 */
public class Main2524 {

    static int[] father;
    static int[] rank;
    static int fre=1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == 0 && m == 0) {
                break;
            }
            father = new int[n + 1];
            rank = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                father[i] = i;
                rank[i] = 1;
            }
            while (m-- != 0) {
                int g = scan.nextInt();
                int h = scan.nextInt();
                union(g, h);
            }
            int num = 0;
            for (int i = 1; i <= n; i++) {
                if (rank[i] != 0) {
                    num++;
                }
            }
            System.out.println("Case "+(fre++)+": "+num);
        }
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            if(rank[x]>=rank[y]){
            father[y] = x;
            rank[x] += rank[y];
            rank[y] = 0;
            }else{
            father[x] = y;
            rank[y] += rank[x];
            rank[x] = 0;    
            }
        }
    }

    public static int find(int x) {
        return father[x] == x?x:(father[x]=find(father[x]));
    }
}
