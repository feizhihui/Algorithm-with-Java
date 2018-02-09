/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.enumeration;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1222 {

    static int[][] map;
    static int[][] act;
    static final int X = 5;
    static final int Y = 6;
    static int key=1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        while (M-- != 0) {
            map = new int[X + 2][Y + 2];
            act=new int[X+1][Y+1];
            for (int i = 1; i <= X; i++) {
                for (int j = 1; j <= Y; j++) {
                    map[i][j] = scan.nextInt();

                }
            }
            for (int i = 0; i < 1 << Y; i++) {
                for (int j = 1; j <= Y; j++) {
                    if (cBit(i, j)) {
                        act[1][j] = 1;
                        turnOff(1, j);
                    }    
                }
                if(go(2)) break;
                for (int j = 1; j <= Y; j++) {
                    if (cBit(i, j)) {
                        act[1][j] = 0;
                        turnOff(1, j);
                    }
                }
            }

        }
    }

    public static boolean go(int x) {
        if (x == Y) {
            for (int i = 1; i <= X; i++) {
                for (int j = 1; j <= Y; j++) {
                    if (map[i][j] == 1) {
                        return false;
                    }
                }
            }
            System.out.println("PUZZLE #"+key++);
            for (int i = 1; i <= X; i++) {
                for (int j = 1; j <= Y; j++) {
                    System.out.print(act[i][j]);
                    if(j<Y) System.out.print(" ");
                }
                System.out.println();
            }
            return true;
        }
        boolean[] b = new boolean[Y+1];
        for (int i = 1; i <= Y; i++) {
            if (map[x - 1][i] == 1) {
                turnOff(x, i);
                act[x][i] = 1;
                b[i] = true;
            }
        }
        if(go(x + 1)) return true;
        for (int i = 1; i <= Y; i++) {
            if (b[i]) {
                turnOff(x, i);
                act[x][i] = 0;
            }
        }
        return false;
    }

    public static void turnOff(int x, int y) {
        map[x][y] = 1 - map[x][y];
        map[x + 1][y] = 1 - map[x + 1][y];
        map[x - 1][y] = 1 - map[x - 1][y];
        map[x][y + 1] = 1 - map[x][y + 1];
        map[x][y - 1] = 1 - map[x][y - 1];
    }

    public static boolean cBit(int x, int pos) {
        int i = 1 << (pos - 1);
        return (x & i) == 0 ? false : true;
    }
}
