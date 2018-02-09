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
public class Main3094 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.nextLine();
            if(s.equals("#")){
                break;                
            }
            char[]c=s.toCharArray();
            int sum=0;
            for(int i=0;i<c.length;i++){
                if(c[i]==' ') continue;
                sum+=(i+1)*(c[i]-'A'+1);
            }
            System.out.println(sum);
            
        }
    }
    
}
