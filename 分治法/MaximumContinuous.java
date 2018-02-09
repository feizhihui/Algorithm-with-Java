/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divideAndConquer;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MaximumContinuous {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int[]a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(maxDivide(a,0,m));
        
        
    }
    public static int maxDivide(int[]a,int x,int y){           //x到y的左闭又开区间
        if(y-x==1) return a[x];
        int n=x+(y-x)/2;               //n为靠近起点x的分界中点
        int l=maxDivide(a,x,n);
        int r=maxDivide(a,n,y);
        int max=l>r?l:r;
        l=r=0;
        int v=0;
        for(int i=n-1;i>=x;i--){
            v+=a[i];
            if(l<v) l=v;
        }
        v=0;
        for(int i=n;i<y;i++){
            v+=a[i];
            if(r<v) r=v;
        }
        
        return max>(l+r)?max:(l+r);
    }
    
}
