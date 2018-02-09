/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

public class Main1046 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] col = new int[16][3];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                col[i][j] = scan.nextInt();
            }
        }
        while (true) {
            int r=scan.nextInt();
            int g=scan.nextInt();
            int b=scan.nextInt();
            if(r==-1&&g==-1&&b==-1){
                break;
            }
            double min=255*255*255;
            int mark=0;
            for(int i=0;i<16;i++){
                double s=Math.sqrt((r-col[i][0])*(r-col[i][0])+(g-col[i][1])*(g-col[i][1])+(b-col[i][2])*(b-col[i][2]));
                if(min>s){
                    min=s;
                    mark=i;
                }                
            }
            System.out.printf("(%d,%d,%d) maps to (%d,%d,%d)\n",r,g,b,col[mark][0],col[mark][1],col[mark][2]);
        }
    }
}
