/*
 * 迷宫问题
 * and open the template in the editor.
 */
package poj.dfs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author feizhihui
 */
public class Main3984 {
    
    class Point{
        int i,j;
        public Point(int x,int y){
            i=x;
            j=y;
        }
        
        @Override
        public String toString(){
            
            return "("+i+", "+j+")";
        }       
    }
    static int[][] a = new int[5][5];
    static final int UP = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int RIGHT = 3;
    static final int h = 5;
    static Stack<Point> sta1 = new Stack();
    static Stack<Point> sta2 = new Stack();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main3984 m = new Main3984();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                a[i][j] = scan.nextInt();
                Point p = m.new Point(a[i][j], a[i][j]);
                sta1.add(p);
            }
        }

     //   m.search(0, 0, RIGHT);
              System.out.println(m.search(0, 0, RIGHT));
        for (int i = 0; i < sta1.size(); i++) {
            System.out.println(sta1.elementAt(i));
        }
    }

    public int search(int i, int j, int d) {
          Point p = new Point(i, j);

        if (i == j && i == h - 1) {
            sta2.push(p);
            if (sta1.size() > sta2.size()) {
                sta1 = (Stack<Point>) sta2.clone();
            }
            sta2.pop();
            return 0;
        }
        int[] num = {h * h, h * h, h * h, h * h};

        if (d != UP) {
            if (i + 1 < h && a[i + 1][j] == 0) {
                a[i][j] = 2;
                sta2.push(p);
                num[0] = search(i + 1, j, DOWN) + 1;
                sta2.pop();

                a[i][j] = 0;
            }
        }
        if (d != DOWN) {
            if (i - 1 >= 0 && a[i - 1][j] == 0) {
                a[i][j] = 2;
                sta2.push(p);
                num[1] = search(i - 1, j, UP) + 1;
                sta2.pop();
                a[i][j] = 0;
            }
        }
        if (d != LEFT) {
            if (j + 1 < h && a[i][j + 1] == 0) {
                a[i][j] = 2;
                sta2.push(p);
                num[2] = search(i, j + 1, RIGHT) + 1;
                sta2.pop();
                a[i][j] = 0;
            }
        }
        if (d != RIGHT) {
            if (j - 1 >= 0 && a[i][j - 1] == 0) {
                a[i][j] = 2;
                sta2.push(p);
                num[3] = search(i, j - 1, LEFT) + 1;
                sta2.pop();
                a[i][j] = 0;
            }
        }
        Arrays.sort(num);
        return num[0];
    }
}
