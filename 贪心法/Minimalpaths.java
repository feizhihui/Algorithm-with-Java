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
public class Minimalpaths {

    public static void main(String[] args) {
        int[][] a = new int[100][2];
        Scanner scan = new Scanner(System.in);
        boolean b;
        int l;
        for (l = 0;; l++) {
            int min = scan.nextInt();
            int max = scan.nextInt();
            if(max==0&&min==0){
                break;
            }    
            if (max <0 || min <0 || min >= max) {
                return;
            } 
                a[l][0] = min;
                a[l][1] = max;
            
        }
        for (int i = 0; i < l - 1; i++) {
            int min = a[i][0];
            int max = a[i][1];
            for (int j = i + 1; j < l; j++) {
                if (max <= a[j][0] || min >= a[j][1]) {
                    continue;
                } else if (max <= a[j][1] && min < a[j][0]) {
                    a[j][0] = min;
                    a[i][0] = a[i][1];
                    break;
                } else if (min >= a[j][0] && max <= a[j][1]) {
                    a[i][0] = a[i][1];
                    break;
                } else if (min <= a[j][0] && max >= a[j][1]) {
                    a[j][0] = min;
                    a[j][1] = max;
                    a[i][0] = a[i][1];
                    break;
                } else if (max > a[j][1] && min < a[j][1]) {
                    a[j][1] = max;
                    a[i][0] = a[i][1];
                    break;
                }

            }
        }                   
        int k=0;
        for(int i=0;i<l;i++){
//            System.out.println(a[i][0]+" "+a[i][1]);
            k+=a[i][1]-a[i][0];
        }
        System.out.println(k);

    }
}
