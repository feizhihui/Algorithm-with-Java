
package poj.dfs;

import java.util.Scanner;

public class Main1191 {

    static int m;
    static double ave,min =Double.MAX_VALUE,now;
    static int[][] a = new int[8][8];
    static boolean[][] b = new boolean[8][8];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = scan.nextInt();
                ave += a[i][j];
            }
        }
        ave = ave/m;
        incise(0, 0, 7, 7,m);
//        double result=Math.round(Math.sqrt(1.0*min/m)*1000)/1000.0;
//        if(result==Math.round(result)) {
//            System.out.println(Math.round(result));
//        }else
//        System.out.println(result);      
        System.out.println(String.format("%.3f",Math.sqrt(1.0*min/m)));
    }

    public static void incise(int x1, int y1, int x2, int y2,int n) {          //已知左上角右下角坐标的矩形继续分成n块
        int sum = 0;
        if(n==1){
            for(int i=x1;i<=x2;i++){
                for(int j=y1;j<=y2;j++){
                    sum+=a[i][j];
                }
            }
            now+=(sum-ave)*(sum-ave);
            if(now<min) min=now;
            now-=(sum-ave)*(sum-ave);
            return;
        }                        
        for (int i = x1; i < x2; i++) {   //横向切 从i下面切
            sum = 0;
            for (int j = x1; j <= i; j++) {              //取下方，计算上方
                for (int k = y1; k <=y2; k++) {
                    sum += a[j][k];
                }
            }
            now+=(sum-ave)*(sum-ave);
            incise(i+1, y1, x2, y2,n-1);
            now-=(sum-ave)*(sum-ave);
            sum = 0;
            for (int j = i+1; j <=x2; j++) {           //取上方，计算下方
                for (int k = y1; k <=y2; k++) {
                    sum += a[j][k];
                }
            }
            now+=(sum-ave)*(sum-ave);
            incise(x1, y1, i, y2,n-1);
            now-=(sum-ave)*(sum-ave);
            sum=0;
        }

        for (int i = y1; i < y2; i++) {   //纵向切 从i右面切
            sum = 0;
            for (int j = y1; j <=i; j++) {              //取右方，计算左方
                for (int k = x1; k <=x2; k++) {
                    sum += a[k][j];
                }
            }
            now+=(sum-ave)*(sum-ave);
            incise(x1, i+1, x1, y2,n-1);
            now-=(sum-ave)*(sum-ave);
            sum = 0;
            for (int j = i+1; j <=y2; j++) {          //取左方，计算右方
                for (int k = x1; k <=x2; k++) {
                    sum += a[k][j];
                }
            }
            now+=(sum-ave)*(sum-ave);
            incise(x1, y1, x2, i,n-1);
            now-=(sum-ave)*(sum-ave);
            sum=0;
        }
    }
}
