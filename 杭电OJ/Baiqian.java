/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hsoj1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Baiqian {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        while (true) {
            int k=0;
            int m = scan.nextInt();        //头
            int n = scan.nextInt();       //脚
            if(m==0&&n==0) break;           
            for (int i = 0; i <= m && 2 * i <= n; i++) {          //鸡
                for (int j = 0; j <= m && 4 * j <= n; j++) {          //兔
                    if (i + j == m && 2 * i + 4 * j == n) {
                        System.out.println(i + " " + j);
                          k++;
                    }
                }
            }if(k==0){
                System.out.println("Error");
            }            
        }

    }
}