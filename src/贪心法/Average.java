/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GreedyMethod;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c=0;
        while(true){
        int num = scan.nextInt();
        if(num==0) break;
        c++;
        int[] a = new int[num];
        int ave = 0;
        int k=0;
        for (int i = 0; i < num; i++) {
            a[i] = scan.nextInt();
            ave += a[i];
        }
        ave /= num;
        for (int i = 0; i < num-1; i++) {
            if (a[i] == ave) {
                continue;
            }
            k++;
            a[i + 1] += a[i] - ave;  
            a[i] = ave;
        }
        System.out.println("Set #"+c);
        System.out.println("The minimum number of moves is "+k+".\n");
        }
    }
}
