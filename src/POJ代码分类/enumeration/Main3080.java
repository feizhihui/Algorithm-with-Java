/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.enumeration;

import java.util.Scanner;

/**
 *
 * 暴力法求连续相同子序列
 */
public class Main3080 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        while (m-- != 0) {
            int n = scan.nextInt();
            char[][] ch = new char[n][60];
            int max = 0;
            int p=0,q=0;
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                ch[i] = scan.nextLine().toCharArray();
            }

            for (int i = 0; i < 60; i++) {
                for (int j = i; j < 60; j++) {
                    int k;
                    for (k = 1; k < n; k++) {
                        if (!contain(ch[0], i, j, ch[k])) {
                            break;
                        }
                    }
                    if (k == n && max < j - i + 1) {
                        max = j - i + 1;
                        p=i;
                        q=j;                     
                    }
                    if (k == n && max == j - i + 1) {
                        if(compare(ch[0],i,j,p,q)<0){
                        p=i;
                        q=j;                     
                        }
                    }         
                    
                }

            }
            if(q-p>1)
            for(int i=p;i<=q;i++)
                System.out.print(ch[0][i]);
            else System.out.print("no significant commonalities");
            System.out.println();
        }

    }

    public static boolean contain(char[] a, int f1, int t1, char[] b) {   //b中含a的子串
        for (int i = 0; i < 60; i++) {
            int j;
            for (j = 0; j <= t1 - f1 && i + j < 60; j++) {
                if (a[f1 + j] != b[i + j]) {
                    break;
                }
            }
            if (j == t1 - f1 + 1) {
                return true;
            }
        }
        return false;
    }
    public static int compare(char[]a,int f1,int t1,int f2,int t2){
        for(int i=0;i<=t1-f1;i++){
            if(a[f1+i]>a[f2+i]) return 1;
            if(a[f1+i]<a[f2+i]) return -1;
        }
        return 0;
    }
}
