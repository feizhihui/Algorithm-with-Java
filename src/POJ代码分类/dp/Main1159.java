/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

/**
 *
 * 字符串插入字符形成回文词LSC问题
 * ,如果是 x[i]==y[j] 那么有 c[i][j]=c[i-1][j-1]+1; 
 * 如果 x[i]!=y[j] 有c[i][j]=max{ c[i-1][j],c[i][j-1]} 
 */
public class Main1159 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        scan.nextLine();
        String s=scan.next();
        char[]c1=new char[m+1];
        char[]c2=new char[m+1];
        int[]a=new int[m+1];                     //采用滚动数组
        for(int i=1;i<=m;i++){
            c1[i]=s.charAt(i-1);
            c2[m-i+1]=c1[i];
        }
        
        for(int i=1;i<=m;i++){
            int dia=0,next=0;
            for(int j=1;j<=m;j++){
                next=a[j];
                if(c1[i]==c2[j]){
                    a[j]=dia+1;
                }else{
                    a[j]=Math.max(a[j-1], a[j]);
                }
                dia=next;
            }
        }
        System.out.println(m-a[m]);
    }    
}




/*
import java.util.Scanner;


public class Main1159 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        scan.nextLine();
        String s=scan.next();
        char[]c1=new char[m+1];
        char[]c2=new char[m+1];
        int[][]a=new int[m+1][m+1];
        for(int i=1;i<=m;i++){
            c1[i]=s.charAt(i-1);
            c2[m-i+1]=c1[i];
        }
        
//边界初始化为0
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(c1[i]==c2[j]){
                    a[i][j]=a[i-1][j-1]+1;
                }else{
                    a[i][j]=Math.max(a[i-1][j], a[i][j-1]);
                }   
            }
        }
        System.out.println(m-a[m][m]);
    }    
}

 */
