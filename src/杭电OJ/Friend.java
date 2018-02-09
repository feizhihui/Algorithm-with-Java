/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hsoj1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Friend {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();                            //输入一个正整数t
        int[][]a=new int[100000][3];                   //定义二维数组存放 适合a+b+c=e+d+f=s的元素
        int m=0;
        for(int i=1;i<t;i++){                          //筛选a+b+c=t的三重循环
            for(int j=i+1;j<t;j++){
                for(int k=j+1;k<t;k++){
                    if(i+j+k==t){
                         a[m][0]=i;
                         a[m][1]=j;
                         a[m++][2]=k;                        
                    }                    
                }
            }
        }
                                                   //根据平方和相等的条件进行二次筛选
        for(int i=0;i<m-1;i++){
            for(int j=0;j<m;j++){
                if(a[i][0]<a[j][0]){
                    int m1=a[i][0]*a[i][0]+a[i][1]*a[i][1]+a[i][2]*a[i][2];       //计算平方和
                    int m2=a[j][0]*a[j][0]+a[j][1]*a[j][1]+a[j][2]*a[j][2];
                    if(m1==m2){
                        System.out.print("("+a[i][0]+","+a[i][1]+","+a[i][2]+"):");      //java输出语句：输出三元数组
                        System.out.println("("+a[j][0]+","+a[j][1]+","+a[j][2]+")");                       
                    }   
                }     
            }   
        }   
    }
    
}
