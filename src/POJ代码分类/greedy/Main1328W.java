/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * 错误的贪心策略
 */
public class Main1328W {

    static class Point implements Comparable {

        int x;
        int y;
        boolean cover;

        @Override
        public int compareTo(Object o) {
            Point p = (Point) o;
            return this.x - p.x;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 1;
        while (true) {
            int m = scan.nextInt();
            int r = scan.nextInt();
            if (m == 0 && r == 0) {
                break;
            }
            boolean fail = false;
            ArrayList<Point> alist = new ArrayList();
            for (int i = 0; i < m; i++) {
                Point p = new Point();
                p.x = scan.nextInt();
                p.y = scan.nextInt();
                alist.add(p);
                if (p.y > r) {
                    fail = true;
                }
            }
            if (fail) {
                System.out.println("Case " + (k++) + ": " + (-1));
                continue;
            }
            Collections.sort(alist);
            for(Point p:alist){
                System.out.print(p.x+" ");
            }
            System.out.println("");
            
            int num = 0;
            for (int i = 0; i < m; i++) {               //i为从左到又第几个点
                boolean cover = alist.get(i).cover;
                if (cover == false) {
                    int x = alist.get(i).x;
                    int y = alist.get(i).y;
                    int key;
                    key = (int)Math.sqrt(r * r - y * y)+x;
                    System.out.println(i+"        key=="+key);
                    for (; i < m; i++) {
                        Point p = alist.get(i);
                        double l = Math.sqrt((p.x - key) * (p.x - key) + p.y *p. y);
                        if (l <= r) {
                            p.cover = true;
                        }else{
                            break;
                        }
                    }
                    num++;
                    i--;
                }
            }
            System.out.println("Case " + (k++) + ": " + num);
        }
    }
}
