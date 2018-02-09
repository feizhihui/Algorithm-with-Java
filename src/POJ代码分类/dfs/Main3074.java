/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class Main3074 {

    static int[][] a;

    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(is);
        while (true) {
            a = new int[9][9];
            String s=in.readLine();
            if(s.equals("end")) return;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='.')
                a[i/9][i%9]=0;
                else a[i/9][i%9]=c-'0';
            }             

            sudoku(0, 0);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(a[i][j]);       
                }
            }
            System.out.println();
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

