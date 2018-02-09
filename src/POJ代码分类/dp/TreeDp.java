/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.dp;

import java.util.Scanner;

public class TreeDp {
       static int[][]a;
       static int m;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        m=scan.nextInt();
        m++;       //最大节点
        a=new int[m+1][m+1];
        for(int i=0;i<m-1;i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            a[x][x]=-1;   //存在x有出度
            a[x][y]=1;
        }
        System.out.println(dp(1));
  
    }
    public static int dp(int x){
        if(a[x][x]!=-1){          //没有出度直接返回1，并一定不是选择了x
            return 1;
        }
        int son=0,gson=0;
        for(int i=1;i<=m;i++){          //x->i
            if(a[x][i]==1){           //有儿子
                son+=dp(i);
                for(int j=1;j<=m;j++){   //x->i->j
                    if(a[i][j]==1){        //有孙子
                        gson+=dp(j);
                }
                    }
            }
        }
        if(son>=gson+1){        //x自己不选
            return son;
        }else{
            System.out.println("--------------"+x);
            return gson+1;   //选自己
        }
    }
}
