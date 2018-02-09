/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

/**
 *
 * @author 简单回溯
 */
public class EightQueens {

    static int p = 8, count;      //p皇后
    static boolean[][] bh = new boolean[p][p];

    public static void main(String[] args) {
        for(int i=0;i<p;i++){
           backtrack(0,i);
        }        
        System.out.println(count);
    }

    public static void backtrack(int x, int y) {
        if (x == p - 1) {
            count++;
            return;
        }
        bh[x][y] = true;        //x,y可以放
        for (int j = 0; j < p; j++) {
            if (canPut(x+1,j)) {
                backtrack(x + 1, j);      
            }
        }
        bh[x][y]=false;
    }

    public static boolean canPut(int x, int y) {   //x排y列是否可以放皇后
        for (int i = 0; i < x; i++) {
            if (bh[i][y]) {
                return false;
            }
        }
        for (int i = 1; x - i >= 0 && y - i >= 0; i++) {
            if (bh[x - i][y - i]) {
                return false;
            }
        }
        for (int i = 1; x - i >= 0 && y + i < p; i++) {
            if (bh[x - i][y + i]) {
                return false;
            }
        }
        return true;
    }
}