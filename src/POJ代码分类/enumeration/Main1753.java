/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.enumeration;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1753 {
    static int n = 4;
    static char[][] a = new char[n + 2][n + 2];
    static int min=20, now;
   static int num=1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= n; i++) {
            String s = scan.next();
            for (int j = 1; j <= n; j++) {
                a[i][j] = s.charAt(j - 1);
            }

        }
        goWhite(1);
        if(min==20) System.out.println("Impossible");
        else
        System.out.println(min);
    }

    static void goWhite(int x) {
        if (x == n+1) {
            if (isWhite()||isBlack()) {
                if (min > now) { 
                    min = now;
                }
            }
            return;
        }

        for (int i = 0; i < 16; i++) {       //1翻，0不翻
            for(int j=1;j<=4;j++){
                if(Tbit(i,j)){    //测试i的第j位是否为1
                    turn(x,j);
                    now++;
                }
            }
            goWhite(x + 1);              //第x排翻完
            for(int j=1;j<=4;j++){
                if(Tbit(i,j)){ 
                    turn(x,j);
                    now--;
                }
            }
        }
    }

    static boolean Tbit(int it, int position) {
        int t = 1;
        t = t<<(position - 1);
        return (t & it) != 0?true:false;
    }

    static void turn(int x, int y) {
        if (a[x][y] == 'b') {
            a[x][y] = 'w';  //中
        } else {
            a[x][y] = 'b';
        }
        if (a[x - 1][y] == 'b') {
            a[x - 1][y] = 'w';   //上
        } else {
            a[x - 1][y] = 'b';
        }
        if (a[x + 1][y] == 'b') {
            a[x + 1][y] = 'w';   //下
        } else {
            a[x + 1][y] = 'b';
        }
        if (a[x][y - 1] == 'b') {
            a[x][y - 1] = 'w';   //左
        } else {
            a[x][y - 1] = 'b';
        }
        if (a[x][y + 1] == 'b') {
            a[x][y + 1] = 'w';   //右
        } else {
            a[x][y + 1] = 'b';
        }

    }

    
    static boolean isWhite() {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] != 'w') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isBlack() {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (a[i][j] != 'b') {
                    return false;
                }
            }
        }
        return true;
    }
}
