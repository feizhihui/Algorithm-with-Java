/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Hanio {
    static int k=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        Hanio.move('A', 'B','C', h);
        System.out.println(k);
    }
     public static void move(char a, char b,char c ,int x) {

         if(x>=1){
             move(a,c,b,x-1);
             System.out.println(a+"->"+c);
             k++;
             move(b,a,c,x-1);
         }
         
    }
}
