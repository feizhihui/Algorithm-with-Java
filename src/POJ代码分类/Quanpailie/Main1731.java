/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Quanpailie;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1731 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] ch = scan.next().toCharArray();
        Arrays.sort(ch);
        while (true) {
            System.out.println(ch);
            int k=-1;
            loop:
            for(int i=ch.length-1;i>=0;i--){
                for(int j=ch.length-1;j>i;j--){
                    if(ch[i]<ch[j]){
                        char t=ch[i];
                        ch[i]=ch[j];
                        ch[j]=t;
                        k=i;
                        break loop;     //终止两重循环
                    }
                    
                }
            }
            if(k==-1) break;
            Arrays.sort(ch,k+1,ch.length);
        }
    }
}
