/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

public class InfiniteBag {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();     //n种物品，每种无限多个
        int c=scan.nextInt();     //体积为c的背包
        int[]v=new int[n];       //每个无凭的体积
        int[]w=new int[n];       //每个物品的重量
        int[]max=new int[c+1];   //体积为i的背包最多装重量为max[i]的物品
        for(int i=0;i<n;i++){
              v[i]=scan.nextInt();
              w[i]=scan.nextInt();
        }    
        for(int i=1;i<=c;i++){
            for(int j=0;j<n;j++) if(i>=v[j]){
                if(max[i-v[j]]+w[j]>max[i]) max[i]=max[i-v[j]]+w[j];               
            }
        }
        for(int i=1;i<=c;i++)
        System.out.println("体积"+i+"的背包最多能装的质量为："+max[i]);      
    }

}
