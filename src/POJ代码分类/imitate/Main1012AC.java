/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.imitate;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1012AC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int k = scan.nextInt();     
            if (k == 0) {
                break;
            }
            for (int m = (3 * k) / 2 + 1;; m++) {
                boolean[] b = new boolean[2 * k + 1];
                int[] dp = new int[k + 1];
                dp[0] = 1;        
                int i;
                loop:
                for (i = 1; i <= k; i++) {     //第i次删除，第dp[i]个数
                    dp[i] = (dp[i - 1] + m - 1) % (2*k - i + 1);
                    if(dp[i]==0) dp[i]=2*k - i + 1;
                    int count = 0;
                    for (int j = 1; j <= 2 * k; j++) {        //开始搜索第dp[i]个数
                        if (!b[j]) {
                            count++;
                            if (count == dp[i]) {            //搜索到，赋值true，如果搜到的是好人，则返回失败
                                if(j<=k) break loop;
                                b[j] = true;
                                break;
                            }
                        }
                    }
                }
                if(i==k+1){
                    System.out.println(m);
                    break;
                }
                
            }
        }
    }
}
