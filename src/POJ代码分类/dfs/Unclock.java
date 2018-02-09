/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.dfs;

/**
 *
 * @author Administrator
 */
public class Unclock {
    static int M=3;
    static int[][]a=new int[M][M];
    public static void main(String[] args) {
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                a[i][j]=i*M+j+1;
            }
        }
        int s=4*d(0,0)+4*d(0,1)+d(1,1);          //
        System.out.println(s);
    }
    public static int d(int x,int y){
        int sum=1;
        a[x][y]=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                if(a[i][j]==0) continue;
                if(y==j&&i-x>1&&a[x+1][y]>0)  continue;
                if(y==j&&x-i>1&&a[x-1][y]>0)  continue;
                if(x==i&&j-y>1&&a[x][y+1]>0)  continue;
                if(x==i&&y-j>1&&a[x][y-1]>0)  continue;
                if(i-x>1&&j-y>1&&a[x+1][y+1]>0) continue;
                if(x-i>1&&y-j>1&&a[x-1][y-1]>0) continue;
                if(i-x>1&&y-j>1&&a[x+1][y-1]>0) continue;
                if(x-i>1&&j-y>1&&a[x-1][y+1]>0) continue;
                a[i][j]=0;
                sum+=d(i,j);
                a[i][j]=M*i+j+1;
            }
        }
        a[x][y]=M*x+y+1;
        return sum;
    }  
}
