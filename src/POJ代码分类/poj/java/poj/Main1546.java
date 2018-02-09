/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.poj;

import java.util.*;
import java.math.*;


public class Main1546 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        String str;
        int inbas,oubas;
        while(cin.hasNext())
        {
            str=cin.next();//n进制的字符串
            inbas=cin.nextInt();//基数n
            oubas=cin.nextInt();//输出基数m
            BigInteger tmp=new BigInteger(str,inbas);//将inbas进制字符串转换为十进制bigInteger
            str=tmp.toString(oubas);//进制转换         再用BigInteger中的toString方法将十进制BigInteger转换为ouBas进制字符串 
            int len=str.length();   
            if(len>7)System.out.println("  ERROR");
            else
            {
                str=str.toUpperCase();            //不然十六进制以小写字符显示     
                System.out.printf("%7s\n",str);  //七位字符输出，，，不够前面补充空格
            }
        }
    }
}

