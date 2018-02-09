/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class M31 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[101];
        String s = scan.nextLine();
        String[]sco=s.split(" ");
        for(int i=0;i<sco.length;i++){
            a[Integer.parseInt(sco[i])]++;
        }
        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < 101; i++) {
            if (a[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
    }   
}
