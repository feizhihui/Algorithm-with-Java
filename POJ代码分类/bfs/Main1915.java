/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * bfs求国际象棋中马的最短路径问题
 */
public class Main1915 {

    static boolean[][] map;
    static int m, endx, endy;
    static LinkedList<Point> now, save;

    static class Point {

        int x;
        int y;

        Point(int i, int j) {
            x = i;
            y = j;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        while (M-- != 0) {
            now = new LinkedList();
            save = new LinkedList();
            m = scan.nextInt();
            map = new boolean[m][m];
            Point p = new Point(scan.nextInt(), scan.nextInt());
            save.add(p);
            endx = scan.nextInt();
            endy = scan.nextInt();
            System.out.println(bfs());
        }
    }

    public static int bfs() {
        now = (LinkedList<Point>) save.clone();
        save = new LinkedList();
        for (int i = 0; i < now.size(); i++) {
            Point p = now.get(i);
            if (p.x == endx && p.y == endy) {
                return 0;
            }
            if (p.x - 1 >= 0 && p.y - 2 >= 0 && !map[p.x - 1][p.y - 2]) {
                save.add(new Point(p.x - 1, p.y - 2));
                map[p.x - 1][p.y - 2] = true;
            }
            if (p.x - 2 >= 0 && p.y - 1 >= 0 && !map[p.x - 2][p.y - 1]) {
                save.add(new Point(p.x - 2, p.y - 1));
                map[p.x - 2][p.y - 1] = true;
            }
            if (p.x - 2 >= 0 && p.y + 1 < m && !map[p.x - 2][p.y + 1]) {
                save.add(new Point(p.x - 2, p.y + 1));
                map[p.x - 2][p.y + 1] = true;
            }
            if (p.x - 1 >= 0 && p.y + 2 < m && !map[p.x - 1][p.y + 2]) {
                save.add(new Point(p.x - 1, p.y + 2));
                map[p.x - 1][p.y + 2] = true;
            }
            if (p.x + 1 < m && p.y + 2 < m && !map[p.x + 1][p.y + 2]) {
                save.add(new Point(p.x + 1, p.y + 2));
                map[p.x + 1][p.y + 2] = true;
            }
            if (p.x + 2 < m && p.y + 1 < m && !map[p.x + 2][p.y + 1]) {
                save.add(new Point(p.x + 2, p.y + 1));
                map[p.x + 2][p.y + 1] = true;
            }
            if (p.x + 2 < m && p.y - 1 >= 0 && !map[p.x + 2][p.y - 1]) {
                save.add(new Point(p.x + 2, p.y - 1));
                map[p.x + 2][p.y - 1] = true;
            }
            if (p.x + 1 < m && p.y - 2 >= 0 && !map[p.x + 1][p.y - 2]) {
                save.add(new Point(p.x + 1, p.y - 2));
                map[p.x + 1][p.y - 2] = true;
            }
        }

        return bfs() + 1;
    }
}
