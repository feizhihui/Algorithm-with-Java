/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

public class BeibaoN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();     //n种物品，每种只有有限个
        int c=scan.nextInt();     //体积为c的背包
        int[]v=new int[n+1];       //每个物品的体积
        int[]w=new int[n+1];       //每个物品的重量
        int[]num=new int[n+1];
        int sum=0;
        for(int i=1;i<=n;i++){
              v[i]=scan.nextInt();
              w[i]=scan.nextInt();
              num[i]=scan.nextInt();
              sum+=num[i];
        }
        int[][]max=new int[sum+1][c+1];
        int h=0;
        for(int i=1;i<=n;i++){         
            for(int t=1;t<=num[i];t++){
                h++;
              for(int j=1;j<=c;j++){       //背包体积
               if(i>1) max[h][j]=max[h-1][j];        // 先要初始化,不然放不下的时候赋值为0，右边计算就会开始出错，同一列向下不递减 ***
                  if(j>=v[i]){     //放得下
                      if(max[h][j]<max[h-1][j-v[i]]+w[i]) max[h][j]=max[h-1][j-v[i]]+w[i];                      
                  }
                  System.out.printf("%2d ",max[i][j]);
              }
                System.out.println();
            }
        }     
        System.out.println("体积"+c+"的背包最多能装的质量为："+max[sum][c]);
        System.out.println("------------------------------");

    }
}
