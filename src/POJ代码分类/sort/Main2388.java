/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.sort;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Main2388 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }
        merge(a, 0, m);
        System.out.println(a[m/2]);
    }

    public static void merge(int[] a, int x, int y) {
        if (y - x <= 1) {
            return;
        }
        int key = a[x];
        int i = x, j = y - 1;
        while (true) {
            int t;
            while (j > i) {    //a[i]保存key
                if (key > a[j]) {
                    break;
                }
                j--;
            }
            if (i == j) {  //循环正常终止则必定有i==j
                break;
            }
            t = a[i];
            a[i] = a[j];
            a[j] = t;
            while (j > i) {   //a[j]保存key
                if (key < a[i]) {
                    break;
                }
                i++;
            }
            if (i == j) {
                break;
            }
            t = a[j];
            a[j] = a[i];
            a[i] = t;

        }
        merge(a, x, i);//注意x==i即key为第一个的情况
        merge(a, i + 1, y);
    }
}
