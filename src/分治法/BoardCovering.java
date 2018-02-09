/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divideAndConquer;

import java.util.Scanner;

public class BoardCovering {

    static int[][] a;
    static int num;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int len = 1 << k;
        a = new int[len][len];
        merge(k, 0, 0,m,n);
//        a[m][n] = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.printf("%2d ",a[i][j]);
            }
            System.out.println();
        }
        System.out.println(num);

    }

    public static void merge(int k, int x, int y,int px,int py) {//px,py代表这一层黑点位置
        if (k == 0) {
            return;
        }
        int len=1<<k;
        int m=x+len/2-1;
        int n=y+len/2-1;
        int tx=0,ty=0;
        num++;
        if(px<=m&&py<=n){
            a[m][n+1]=num;
            a[m+1][n]=num;
            a[m+1][n+1]=num;    
            tx=m;
            ty=n;
        }else if(px<=m&&py>n){
           a[m][n]=num;
           a[m+1][n]=num;
           a[m+1][n+1]=num;
           tx=m;
           ty=n+1;
        }else if(px>m&&py<=n){
            a[m][n]=num;
            a[m][n+1]=num;
            a[m+1][n+1]=num;
            tx=m+1;
            ty=n;
        }else if(px>m&&py>n){
            a[m][n]=num;
            a[m][n+1]=num;
            a[m+1][n]=num;
            tx=m+1;
            ty=n+1;
        }
        for(int i=m;i<m+2;i++){
            for(int j=n;j<n+2;j++){
                if(!(tx==i&&ty==j))  //tx,ty用来记录上个黑点年在哪个方向
                merge(k-1,x+(i-m)*len*1/2,y+(j-n)*len*1/2,i,j);
                else
                   merge(k-1,x+(i-m)*len*1/2,y+(j-n)*len*1/2,px,py);         //乘1/2要放最后面
            }
        }
        
    }
   
}
