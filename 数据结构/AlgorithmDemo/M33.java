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
public class M33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            Character c=sb.charAt(i);
            if(!Character.isDigit(c)&&c!=' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        s=sb.toString();
        String[]sh=s.split(" ");
        int sum=1;
        for(int i=0;i<sh.length;i++){
            sum*=Integer.parseInt(sh[i]);
            sum%=1000;
        }
        System.out.println(sum);
        
        
    }
    
}
