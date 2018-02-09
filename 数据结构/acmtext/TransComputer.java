
package acmtext;

import java.util.Scanner;

public class TransComputer {

    static int k = 0;
    static int[] a;
    static int l;

    public static void main(String[] args) {
        // TODO code application logic here
        TransComputer m = new TransComputer();
        Scanner scan = new Scanner(System.in);
        int i, j;               //i辆车，j台电脑
        i = scan.nextInt();
        j = scan.nextInt();
        a = new int[i];
        l = i;
        m.trans(i, j);
        System.out.println(k);
    }

    public void trans(int m, int n) {     //i辆车 j台电脑

        if (n < m) {
            return;
        }
        if (m == 1) {
            k++;
            a[l - 1] += n;
            for (int i = 0; i < l; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

            a[l - 1] -= n;
            return;
        }

        a[l - m]++;
        trans(m - 1, n - 1);
        a[l - m]--;

        for (int j = l - m; j < l; j++) {
            a[j]++;
        }
        trans(m, n - m);
        for (int j = l - m; j < l; j++) {
            a[j]--;
        }
    }
}
