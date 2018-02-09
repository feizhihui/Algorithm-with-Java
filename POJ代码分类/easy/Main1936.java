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
public class Main1936 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String sub=scan.next();
            String s=scan.next();
            int k=0;
            boolean b=false;
            for(int i=0;i<sub.length();i++){
                char c=sub.charAt(i);
                b=false;
                for(int j=k;j<s.length();j++){
                    if(c==s.charAt(j)){
                          k=j+1;
                          b=true;
                          break;
                    }
                }
                if(b==false){
                    break;
                }
            }
            if(!b) System.out.println("No");
            else System.out.println("Yes");
        }
    }
    
}
