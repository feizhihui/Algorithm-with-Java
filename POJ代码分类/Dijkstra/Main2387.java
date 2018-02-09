/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.Dijkstra;

import java.util.Scanner;

/**
 * Dijkstra、
 * 一个农场有n(1 ~ 1000)个landmarks
 * 有t(1 ~ 2000)条道路连接
 * 问Bessie要从编号为n的landmarks到编号为1的landmarks，
 * 最少得走多少的路程？
 */
public class Main2387 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int[]d=new int[n+1];
        boolean[]v=new boolean[n+1];
        int[][]w=new int[n+1][n+1];
        for(int i=2;i<=n;i++) d[i]=Integer.MAX_VALUE/2;              //除零点距离初始化为最大
        for(int i=0;i<m;i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            int t=scan.nextInt();
            if(w[x][y]!=0)
            w[x][y]=Math.min(t,w[x][y]);             //重边问题
            else
                w[x][y]=t;
            w[y][x]=w[x][y];
        }
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE,x=0;
            for(int j=1;j<=n;j++){
                if(!v[j]&&d[j]<=min){
                    x=j;
                    min=d[j];
                }
            }
            v[x]=true;
            for(int j=1;j<=n;j++){
                if(w[j][x]==0) w[j][x]=Integer.MAX_VALUE/2;        //若两点不直接连通，距离设为无穷大
                d[j]=Math.min(d[j],d[x]+w[j][x]);
            }
        }
        System.out.println(d[n]);  
    } 
}
