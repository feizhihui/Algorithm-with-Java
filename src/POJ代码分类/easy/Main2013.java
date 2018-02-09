/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

public class Main2013 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=1;
        while(true){
            int m=scan.nextInt();
            if(m==0) break;
            scan.nextLine();
            String[]sh=new String[m];
            for(int i=0;i<m;i++){
                String s=scan.nextLine();
                if(i%2==0){
                    sh[i/2]=s;
                }else{
                    sh[m-i/2-1]=s;
                }
            }
            System.out.println("SET "+k++);
            for(int i=0;i<m;i++){
                System.out.println(sh[i]);
            }  
        }  
    }
}
