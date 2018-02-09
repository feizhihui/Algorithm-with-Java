/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.dfs;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2676 {

    static int[][] a;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        while (M-- != 0) {
            a = new int[9][9];
            for (int i = 0; i < 9; i++) {
                String s = scan.next();
                for (int j = 0; j < 9; j++) {
                    a[i][j] = s.charAt(j) - '0';
                }
            }
            sudoku(0, 0);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(a[i][j]);       
                }
                System.out.println();
            }
        }

    }

    public static boolean sudoku(int x, int y) {
        if (x > 8) {
            return true;
        }
        if (y > 8) {
            return sudoku(x + 1, 0);
        }
        if (a[x][y] != 0) {
            return sudoku(x, y + 1);
        }
        boolean[] b = new boolean[10];            //数组标记法
        for (int i = 0; i < 9; i++) {                        
            b[a[x][i]] = true;
            b[a[i][y]] = true;
        }
        int ix = x / 3 * 3, iy = y / 3 * 3;        
        for (int i = ix; i < ix + 3; i++) {
            for (int j = iy; j < iy + 3; j++) {
               b[a[i][j]]=true;
            }
        }
        for (int k = 1; k <= 9; k++) {
            if (!b[k]) {
                a[x][y] = k;
                if (sudoku(x, y + 1)) {
                    return true;
                }
                a[x][y] = 0;
            }
        }
        return false;
    }
}
