/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * 给定两个整数n和k
 *
 * 通过 n+1或n-1 或n*2 这3种操作，使得n==k
 *
 * 输出最少的操作次数
 *
 */
public class Main3278 {

    static LinkedList<Integer> olist = new LinkedList();
    static boolean[]test=new boolean[100001];
    static int b, k;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        b = scan.nextInt();
        olist.add(a);
        bfs();
        System.out.println(k);
    }

    public static void bfs() {
        LinkedList<Integer> nlist = new LinkedList();
        for (int i = 0; i < olist.size(); i++) {
            int a = olist.get(i);
            if (a == b) {
                return;
            }
            if (a+1<=100000&&!test[a+1]) {
                nlist.add(a + 1);
                test[a+1]=true;
            }
            if (a-1>=0&&!test[a-1]) {
                nlist.add(a - 1);
                test[a-1]=true;
            }
            if (a*2<=100000&&!test[a*2]) {
                nlist.add(a * 2);
                test[a*2]=true;
            }
        }
            k++;
            olist=(LinkedList)nlist.clone();
            bfs();
    }
}
