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
public class RobotCar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        while (m-- != 0) {
            int dire = 0;           //0 1 2 3 顺时针
            int x = 0, y = 0;
            String s = scan.next();
            int t = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'L') {
                    switch (dire) {
                        case 0:
                            x += t;
                            break;
                        case 1:
                            y -= t;
                            break;
                        case 2:
                            x -= t;
                            break;
                        case 3:
                            y += t;
                            break;
                        default:
                            break;
                    }
                    dire = (dire +3) % 4;
                    t = 0;
                    continue;
                } else if (c == 'R') {
                    switch (dire) {
                        case 0:
                            x += t;
                            break;
                        case 1:
                            y -= t;
                            break;
                        case 2:
                            x -= t;
                            break;
                        case 3:
                            y += t;
                            break;
                        default:
                            break;
                    }
                    dire = (dire + 1) % 4;
                    t = 0;
                    continue;
                }
                t = t * 10 + (c - '0');
            }
            switch (dire) {
                case 0:
                    x += t;
                    break;
                case 1:
                    y -= t;
                    break;
                case 2:
                    x -= t;
                    break;
                case 3:
                    y += t;
                    break;
                default:
                    break;
            }
            System.out.printf("%.2f\n",Math.sqrt(x*x+y*y));
        }

    }
}
