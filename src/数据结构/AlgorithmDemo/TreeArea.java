/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *三角形面积计算公式(x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1) * 1 / 2
 * 三点逆时针 结果为正  顺时针结果为负
 */
public class TreeArea {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(2.00 - 1.10);
        while (true) {
            int count = 0;
            double x1 = scan.nextDouble();
            double y1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();
            double x3 = scan.nextDouble();
            double y3 = scan.nextDouble();
            //        System.out.println(area(x1,y1,x2,y2,x3,y3));   
            for (int i = 1; i < 100; i++) {
                for (int j = 1; j < 100; j++) {
                    if (Math.abs((area(i, j, x1, y1, x2, y2) + area(i, j, x1, y1, x3, y3) + area(i, j, x2, y2, x3, y3)) - area(x1, y1, x2, y2, x3, y3)) < 1e-9) {
                        count++;
                        System.out.println(i + " " + j);
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static double area(double x1, double y1, double x2, double y2, double x3, double y3) {
        return Math.abs((x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3 * x1) * 1 / 2);
    }
}
