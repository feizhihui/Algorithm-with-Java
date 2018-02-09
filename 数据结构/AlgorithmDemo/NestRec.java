/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NestRec {

    static class Rec implements Comparable{
        int len;
        int wide;

        @Override
        public int compareTo(Object o) {
            Rec r=(Rec)o;
            if(wide!=r.wide) return wide-r.wide;
            return len-r.len;
        }
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int m=scan.nextInt();
            Rec[]r=new Rec[m];
            int[]dp=new int[m];
            for(int i=0;i<m;i++){
                r[i]=new Rec();
                int x=scan.nextInt();
                int y=scan.nextInt();
                r[i].len=Math.max(x, y);
                r[i].wide=Math.min(x, y);
            }
            Arrays.sort(r);
            int ans=0;
            for(int i=1;i<m;i++){
                for(int j=0;j<i;j++){
                    if(r[i].wide>=r[j].wide&&r[i].len>=r[j].len){
                        dp[i]++;
                    }                    
                }
                if(dp[i]>ans) ans=dp[i];
            }
            System.out.println(ans+1);
            System.out.println("---------------------");
            
        }
    }
    
}
