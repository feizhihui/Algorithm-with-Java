/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.bridge;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            double x = 0.5, t;
            double r = scan.nextDouble();
          
                for (int i = 0; i < 10100; i++) {
                    x = x * (1 - x) * r;
                    if(i>=10000)
                    System.out.println(x);
                }            
        }
    }
}
