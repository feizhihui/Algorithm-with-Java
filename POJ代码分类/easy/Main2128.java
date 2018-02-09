/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Scanner;

/**
 *
 * 国王修路，，交叉最小
 */
public class Main2128 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int a=scan.nextInt();
        int b=0;
        if(m>2)
        b=scan.nextInt();
        if(m<4){
            System.out.println(0);
            return;
        }
        int min=b-a,x=2;;
        for(int i=3;i<m-1;i++){
            a=b;
            b=scan.nextInt();
            if(b-a<min){
                min=b-a;
                x=i;     //第几站
            }
            
        }
        int last=scan.nextInt();
        int l=last+min;         
        System.out.println(l);
        System.out.println(x+1+" 1"+" "+m+" "+x);
    }
    
}
