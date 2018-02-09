/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class IntDivDfs {
    static int num=0;
    static int n=0,m=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        while(k--!=0){
        m=scan.nextInt();
        n=scan.nextInt();
        load(m,n,0);
        System.out.println(num);
        num=0;
        }
    }
    public static void load(int x,int y,int t){  //x个苹果y个盘子 前个盘子放t个
        if(y==1){
            if(x>=t)  num++;   //t是用来排序的
            return;
        }
        for(int i=t;i<=x;i++){
            load(x-i,y-1,i);            
        }
    }
}
