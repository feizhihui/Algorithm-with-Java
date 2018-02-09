package bfs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    final static int len = 5;

    private class Point {

        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Point other = (Point) obj;
            if (this.x != other.x) {
                return false;
            }
            if (this.y != other.y) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] map = new int[len][len];
        int[][] track = new int[len][len];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                map[i][j] = scan.nextInt();
            }
        }
        Point cur = new Main().new Point(0, 0);
        Point end = new Main().new Point(len - 1, len - 1);
        ArrayList<Point> list = new ArrayList();
        ArrayList<Point> old = new ArrayList();
        list.add(cur);
        int k = 0;
        map[0][0] = 1;
        loop:
        while (true) {
            k--;                        //距圆点距离为k的包围层
            old = (ArrayList<Point>) list.clone();           //层中元素
            list = new ArrayList();
            if (old.isEmpty()) {
                System.out.println("----------------无解");
                return;
            }

            for (int i = 0; i < old.size(); i++) {            //一层一层遍历
                cur = old.get(i);
                //        System.out.println(cur);
                if (cur.equals(end)) {
                    break loop;
                }

                if (cur.x + 1 < len && map[cur.x + 1][cur.y] == 0) {//down
                    list.add(new Main().new Point(cur.x + 1, cur.y));
                    map[cur.x + 1][cur.y] = k;
                }
                if (cur.y + 1 < len && map[cur.x][cur.y + 1] == 0) {//right
                    list.add(new Main().new Point(cur.x, cur.y + 1));
                    map[cur.x][cur.y + 1] = k;
                }
                if (cur.x - 1 >= 0 && map[cur.x - 1][cur.y] == 0) {//up
                    list.add(new Main().new Point(cur.x - 1, cur.y));
                    map[cur.x - 1][cur.y] = k;
                }
                if (cur.y - 1 >= 0 && map[cur.x][cur.y - 1] == 0) {//left
                    list.add(new Main().new Point(cur.x + 1, cur.y));
                    map[cur.x][cur.y - 1] = k;
                }
            }

        }
        k++;
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                System.out.print(map[i][j] + " ");
//            }
//            System.out.println("");
//        }
        Stack<Point> stac = new Stack();
        stac.push(new Main().new Point(len-1,len-1));
        back(map, end, k, stac);
        stac.push(new Main().new Point(0,0));
        while (!stac.isEmpty()) {
            System.out.println(stac.pop());
        }
    }

public static void back(int[][] a, Point cur, int k, Stack<Point> sta) {
        k++;
        if(k==0) return; 
        if (cur.x + 1 < len && a[cur.x + 1][cur.y] == k) {
            cur.x++;
            sta.push(new Main().new Point(cur.x, cur.y));
            back(a, cur, k, sta);
        } else if (cur.x - 1 >= 0 && a[cur.x - 1][cur.y] == k) {
            cur.x--;
            sta.push(new Main().new Point(cur.x, cur.y));
            back(a, cur, k, sta);
        } else if (cur.y + 1 < len && a[cur.x][cur.y + 1] == k) {
            cur.y++;
            sta.push(new Main().new Point(cur.x, cur.y));
            back(a, cur, k, sta);
        } else if (cur.y - 1 >= 0 && a[cur.x][cur.y - 1] == k) {
            cur.y--;
            sta.push(new Main().new Point(cur.x, cur.y));
            back(a, cur, k, sta);
        }

    }
}
