/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package divideAndConquer;

/**
 *
 * 递推前缀和
 */
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main2479 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t--!=0){
        scan.nextLine();
        int m=scan.nextInt();
        int[]a=new int[m];
        int[]s=new int[m+1];
        for(int i=0;i<m;i++){
            a[i]=scan.nextInt();
            s[i+1]=a[i]+s[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m-1;i++){
            for(int j=i;j<m-1;j++){
                for(int k=j+1;k<m;k++){
                    for(int h=k;h<m;h++){
                       int b=s[j+1]-s[i]+s[h+1]-s[k];           //s[n] 为a【n】的前面n个解
                       if(max<b){
                           max=b;
                       }       
                        
                    }
                }
                
            }
        }

        System.out.println(max);
        }
    }
}
