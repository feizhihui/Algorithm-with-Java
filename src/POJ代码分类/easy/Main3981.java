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
public class Main3981 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
        String[]s=scan.nextLine().split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].equals("you")){
                s[i]="we";
            }
        }
        for(int i=0;i<s.length-1;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println(s[s.length-1]);
    }
    }
}
