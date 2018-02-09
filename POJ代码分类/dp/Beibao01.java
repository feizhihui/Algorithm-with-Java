package com.java.dp;

import java.util.Scanner;

public class Beibao01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();     //n种物品，每种只有一个
        int c=scan.nextInt();     //体积为c的背包
        int[]v=new int[n+1];       //每个物品的体积
        int[]w=new int[n+1];       //每个物品的重量
        int[][]max=new int[n+1][c+1];   //体积为i的背包最多装重量为max[i]的物品
        for(int i=1;i<=n;i++){
              v[i]=scan.nextInt();
              w[i]=scan.nextInt();
        }

        for(int i=1;i<=n;i++){         //选择性的挑选前i个
              for(int j=1;j<=c;j++){       //背包体积
                  if(i>1) max[i][j]=max[i-1][j];        // 先要初始化,不然放不下的时候赋值为0，右边计算就会开始出错，同一列向下不递减 ***
                  if(j>=v[i]){     //放得下
                      if(max[i][j]<max[i-1][j-v[i]]+w[i]) max[i][j]=max[i-1][j-v[i]]+w[i];                      
                  }
                  System.out.print(max[i][j]+" ");
              }     
              System.out.println();
        }
        System.out.println("体积"+c+"的背包最多能装的质量为："+max[n][c]);
        System.out.println("------------------------------");
    }
}
