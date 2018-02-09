/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3750 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        boolean[] b = new boolean[m];
        String[] sh = new String[m];
        for (int i = 0; i < m; i++) {
            sh[i] = scan.next();
        }
        String[]s=scan.next().split(",");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int t = 0, num = 0;
        for (int i = n-1; i < m;i++) {
            if(num==m) break;
               if(!b[i]) t++;
               if(t==k){
                   b[i]=true;           //第i个被踢走
                   System.out.println(sh[i]);
                   num++;
                   t=0;
               }
               if(i==m-1){
                   i=-1;
                   continue;
               }
        }
    }
}
