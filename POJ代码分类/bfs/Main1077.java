/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * 八数码问题，bfs算法，cantor判重
 */
public class Main1077 {

    static int[] b = new int[400000];
    static char[] route = new char[400000];
    static int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    static LinkedList<int[]> open = new LinkedList();
    static LinkedList<int[]> close = new LinkedList();
    static Stack<Character> stack=new Stack();
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            String s = scan.next();
            if (s.equals("x")) {
                a[i] = 9;
            } else {
                a[i] = Integer.parseInt(s);
            }
        }
        b[cantor(a)] = -1;
        open.add(a);
        bfs();
        while(!stack.empty()){   
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static int cantor(int[] a) {               //cantor判重
        int k = 0;
        for (int i = 0; i < a.length ; i++) {
            int t = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    t++;
                }
            }
            k += fact[a.length - i - 1] * t;
        }                                                 // an*(n-1)!   从第0未到最后位求和，an为逆序数，结果+1为序列的第几小的数
        return k+1;
    }

    public static int bfs() {

        while (open.size() != 0) {
            int[] a = open.remove();
            if (isOk(a)) {
                int t=cantor(a);
                stack.push(route[t]);
                return b[t];
            }
            int key = cantor(a);
            int k = 0, x = 0, y = 0;
            for (int i = 0; i < 9; i++) {
                if (a[i] == 9) {
                    k = i;
                    break;
                }
            }
            x = k / 3;
            y = k % 3;

            int temp;
            int[] clo1 = Arrays.copyOf(a, 9);
            if (x - 1 >= 0) {
                temp = clo1[3 * (x - 1) + y];
                clo1[3 * (x - 1) + y] = clo1[k];
                clo1[k] = temp;
                int ke = cantor(clo1);
                if (b[ke] == 0) {
                    b[ke] = key;
                    route[ke]='u';
                    close.add(clo1);
                }
            }
            int[] clo2 = Arrays.copyOf(a, 9);
            if (y - 1 >= 0) {
                temp = clo2[3 * x + y - 1];
                clo2[3 * x + y - 1] = clo2[k];
                clo2[k] = temp;
                int ke = cantor(clo2);
                if (b[ke] == 0) {
                    b[ke] = key;
                    route[ke]='l';
                    close.add(clo2);
                }
            }
            int[] clo3 = Arrays.copyOf(a, 9);
            if (x + 1 < 3) {
                temp = clo3[3 * (x + 1) + y];
                clo3[3 * (x + 1) + y] = clo3[k];
                clo3[k] = temp;
                int ke = cantor(clo3);
                if (b[ke] == 0) {
                    b[ke] = key;
                    route[ke]='d';
                    close.add(clo3);
                }
            }
            int[] clo4 = Arrays.copyOf(a, 9);
            if (y + 1 < 3) {
                temp = clo4[3 * x + y + 1];
                clo4[3 * x + y + 1] = clo4[k];
                clo4[k] = temp;
                int ke = cantor(clo4);
                if (b[ke] == 0) {
                    b[ke] = key;
                    route[ke]='r';
                    close.add(clo4);
                }
            }
        }
        open = close;
        close = new LinkedList();
        int t=bfs();
        if(route[t]!=0)
        stack.push(route[t]);
        return b[t];
    }

    public static boolean isOk(int[] a) {
        for (int i = 0; i < 9; i++) {
            if (a[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

}
