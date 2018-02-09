/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.dfs;

import java.util.Scanner;

/**
 *
 * 进制转化模拟bfs
 */
public class Main1426 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            long m=scan.nextLong();
            if(m==0) break;
            long t=1,c;
            while(true){
                c=Long.parseLong(Long.toBinaryString(t));
                if(c%m==0) break;
                t++;                
            }
            System.out.println(c);
        }
    }
    
}
