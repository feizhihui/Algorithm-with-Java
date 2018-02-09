/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.bridge;

import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {

    static byte[][] a = new byte[10000][10000];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ax = new int[4];
        int[] ay = new int[4];
        for (int i = 0; i < 4; i++) {
            ax[i] = scan.nextInt();
            ay[i] = scan.nextInt();
        }
        white(ax[0], ay[0], ax[1], ay[1]);
        white(ax[2], ay[2], ax[3], ay[3]);
        Arrays.sort(ax);
        Arrays.sort(ay);     
               
        int cx = -1, cy = -1;
        boolean b=false;
        loop:
        for (int i = ay[0]; i <= ay[3]; i++) {
            for (int j = ax[0]; j <= ax[3]; j++) {
                if (a[i][j] == 2) {
                    cy = i;       //交集初点x
                    cx = j;       //交集初点y
                    b=true;
                } 
                if(b){
                    break loop;
                }
            }
        }
        int lx = 0, ly = 0;
        if(cx!=-1){
        for (int i = cx;; i++) {
            if (a[cy][i] == 2) {
                lx++;
            } else {
                break;
            }
        }
        for (int i = cy;; i++) {
            if (a[i][cx] == 2) {
                ly++;
            } else {
                break;
            }
        }
        System.out.println(cx + "," + cy+ "," + (lx-1) + "," + (ly-1));                        //交集信息
        }
        else{
            System.out.println("不存在");
        }
        System.out.println(ax[0] + "," + ay[0] + "," + (ax[3] - ax[0]) + "," + (ay[3] - ay[0]));        //并集信息
    }

    public static void white(int x1, int y1, int x2, int y2) {
        int t;
        if (x1 > x2) {
            t = x1;
            x1 = x2;
            x2 = t;
        }
        if (y1 > y2) {
            t = y1;
            y1 = y2;
            y2 = t;
        }      
        for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <=x2; j++) {
                a[i][j]++;
            }
        }
    }
}
