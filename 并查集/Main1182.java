/*
 * To change this template, choose Tools | Templates
 * 有问题。。。。。。。。。。。。。。。。。。。
 */
package UnionFindSet;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1182 {

    static int[] fa;
    static int[] eat;
    static int[] food;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = 0;
        fa = new int[m + 1];
        eat = new int[m + 1];
        food = new int[m+1];
        for (int i = 1; i <= m; i++) {
            fa[i] = i;
        }
        for (int i = 0; i < n; i++) {
            int b = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x > m || y > m) {
                k++;
                continue;
            }
            x = find(x);
            y = find(y);
            if (b == 1) {              //同类
                if (x == y)   continue;
                if(find(eat[x])==y||find(eat[y])==x){k++;continue;}
                union(x,y);    
            } else if (b == 2) {                //x eat y
                if (x == y || find(eat[y]) == x) {  k++;  continue; } 
                if(eat[x]==0) eat[x]=y;
                else union(eat[x],y);
                if(food[y]==0) food[y]=x;
                else union(food[y],x);
                
            }
        }
        System.out.println(k);
    }

    public static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x != y) {
            fa[y] = x;
        }
        if(eat[x]==0) eat[x]=eat[y];
        else union(eat[x],eat[y]);
        if(food[x]==0) food[x]=food[y];
        else union(food[x],food[y]);
    }

    public static int find(int x) {
        if(x==fa[x]) return x;
        int t=fa[x];
        fa[x]=find(fa[x]);
        if(eat[fa[x]]==0) eat[fa[x]]=eat[t];
        return fa[x];
    }
}
