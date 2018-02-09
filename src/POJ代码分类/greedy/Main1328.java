/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.greedy;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * 错误的贪心策略
 */
public class Main1328 {

    static class Point implements Comparable {

        int L;
        int R;

        @Override
        public int compareTo(Object o) {
            Point p = (Point) o;
            return this.L - p.L;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String>result=new ArrayList();
        int k = 1;
        while (true) {
            int m = scan.nextInt();
            int r = scan.nextInt();
            if (m == 0) {
                break;
            }
            boolean fail=false;
            ArrayList<Point> alist = new ArrayList();
            for (int i = 0; i < m; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                Point p=new Point();
                p.L =x- (int)Math.sqrt(r * r - y * y);
                p.R =x+ (int)Math.sqrt(r * r - y * y);
                alist.add(p);
                if (y > r) {
                    fail = true;
                }
            }
            if (fail) {
           //     System.out.println("Case " + (k++) + ": " + (-1));
                result.add("Case " + (k++) + ": " + (-1));
                continue;
            }
            Collections.sort(alist);
            
            int num = 0,key=Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {               //i为从左到又第几个点
                Point p=alist.get(i);
                if(key<p.L){
                    num++;
                    key=p.R;
                }else{
                    if(key<p.R){
                      //key不变
                    }else{
                        key=p.R;  //改变key位置
                    }  
                }
            }
    //        System.out.println("Case " + (k++) + ": " + num);
            result.add("Case " + (k++) + ": " + num);
            scan.nextLine();
        }
        for(String s:result){
            System.out.println(s);
        }
    }
}
