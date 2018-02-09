/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2014 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            if(m==0) break;
            int mwid=0;
            int mhig=0;
            int nowh=0,noww=0;
            while(true){
                int wide=scan.nextInt();
                int high=scan.nextInt();
                if(wide==-1&&high==-1) break;
                if(mwid+wide<=m){           //直接放
                    mwid+=wide;
                    if(mhig<high) mhig=high;
                }else{                                      //换行放     
                    if(mwid>noww)  noww=mwid;
                    mwid=wide;
                    nowh+=mhig;
                    mhig=high;   
                }              
            }
            if(mwid>noww) noww=mwid;
            nowh+=mhig;
            System.out.println(noww+" x "+nowh);
            
        }
    }
    
}
