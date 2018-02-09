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
public class M32 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[]sh=s.split(" ");
        int l=0;
        for(int i=0;i<sh.length;i++){
            l+=sh[i].length();
        }
        System.out.println(1.0*l/sh.length);
        
        
    }
    
}
