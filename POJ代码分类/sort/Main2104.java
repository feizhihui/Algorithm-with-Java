/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class Main2104 {

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        String[] ss = in.readLine().split(" ");
        int m = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int[] a = new int[m];
        ss=in.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            a[i] = Integer.parseInt(ss[i]);
        }
        while (k-- != 0) {
            int[] aa = new int[m];
            System.arraycopy(a, 0, aa, 0, m);
            ss=in.readLine().split(" ");
            int x = Integer.parseInt(ss[0]);
            int y = Integer.parseInt(ss[1]);
            int th = Integer.parseInt(ss[2]);
            System.out.println(QSort(aa, x - 1, y - 1, th));
        }

    }

    public static int QSort(int[] a, int low, int high, int key) {
        if (low < high) {
            int k = QR(a, low, high);
            int h = k - low;       //比a[k]小的数有h个
            if (h + 1 == key) {
                return a[k];     //a[k]是第h+1小的数
            }
            if (h < key) {
                return QSort(a, k + 1, high, key - h - 1);       //a[k]右边的第key-h-1个数
            } else {
                return QSort(a, low, k - 1, key);            //a[k]左边第key个数
            }
        }
        return a[low];                              //若low==high 则证明缩减到一个数了
    }

    public static int QR(int[] a, int low, int high) {          //一次
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] >= key) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }
}
