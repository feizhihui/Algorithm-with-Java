/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hsoj1;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int time = scan.nextInt();

        int n[][] = new int[num][2];
        float hm = 0;
        int hn = 0; 
        for (int i = 0; i < num; i++) {
            n[i][0] = scan.nextInt();
            n[i][1] = scan.nextInt();
            hm += n[i][1];
            hn += n[i][0];
        }
        int num1 = scan.nextInt();
        int time1 = scan.nextInt();
        if (num1 == 0 && time1 == 0) {
            if (hn == time) {
                System.out.printf("%.2f\n",hm);
            }
        }
    }
}
