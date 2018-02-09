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
public class Main1298 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        while(true){
        String ss=scan.nextLine();
        if(ss.equals("ENDOFINPUT")) break;
        String s=scan.nextLine();
        scan.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                c=(char)((c+26-65-5)%26+65);
                System.out.print(c);
            }else{
                System.out.print(c);
            }
           
        }
         System.out.println();
        }
        
    }
    
}
