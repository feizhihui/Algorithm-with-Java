/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 *    包含起点等于终点
 * 国际象棋最少步数问题
 */
public class Main1657 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //王、后、车、象
        int m=scan.nextInt();
        while(m--!=0){
            String former=scan.next();
            String later=scan.next();
            if(former.equals(later)){
                System.out.println("0 0 0 0");
                continue;
            }
            int ax=former.charAt(0)-'a';
            int ay=former.charAt(1)-'0';
            int bx=later.charAt(0)-'a';
            int by=later.charAt(1)-'0';
            
            System.out.print(Math.max(Math.abs(ax-bx),Math.abs(ay-by))+" ");  //王
            if(Math.abs(ax-bx)==Math.abs(ay-by)||ax==bx||ay==by){               //后
                System.out.print("1 ");
            }else{
                System.out.print("2 ");
            }
            if(ax==bx||ay==by){                            //车
                System.out.print("1 ");
            }else{
                System.out.print("2 ");
            }
            if((ax+ay)%2==(bx+by)%2){                        //象
                if(Math.abs(ax-bx)==Math.abs(ay-by)){
                    System.out.println("1");
                }else{
                    System.out.println("2");
                }
                
            }else{
                System.out.println("Inf");
            }
            
            
        }
        
        
    }
    
}
