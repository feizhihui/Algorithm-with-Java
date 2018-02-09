package poj.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * 田忌赛马问题
 * 贪心算法。如果当前最好的马可以胜齐王最好的马，那么让这两匹马比一场。
 * 如果当前最差的马能胜齐王最差的马，那么让这两匹马比一场。
 * 如果上面两个条件都不满足，那么让当前最差的马和齐王最好的马比一场。
 * 除开排序，这个算法的时间复杂度可以做到O(n)。
 *
 */
public class Main2287 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int m = scan.nextInt();
            if (m == 0) {
                break;
            }
            int[] a = new int[m];
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = scan.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = scan.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int win = 0;
            int maxa = m - 1, maxb = m - 1, mina = 0, minb = 0;
            while (maxa >= mina) {          //一个循环比赛一场
                boolean or = false;
                if (a[maxa] > b[maxb]) {
                    win++;
                    maxa--;
                    maxb--;
                    or = true;
                } else if (a[mina] > b[minb]) {                //必须是else if
                    win++;
                    mina++;
                    minb++;
                    or = true;
                }
                if (!or) {
                    if (a[mina] > b[maxb]) {
                        win++;
                    } else if (a[mina] < b[maxb]) {
                        win--;
                    }
                    mina++;
                    maxb--;
                }
            }
            System.out.println(win * 200);
        }
    }
}
