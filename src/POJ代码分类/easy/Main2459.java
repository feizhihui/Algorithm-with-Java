/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;
import java.util.*;

public class Main2459{
 static final int N = 2000+10;
 static int DP[] = new int[N];
 public static void main(String[]args) throws Exception{
	int n,F1,F2,Day,i,sum,a,b,j;
	Scanner cin = new Scanner(System.in);
	n = cin.nextInt();
	F1 = cin.nextInt();
	F2 = cin.nextInt();
	Day = cin.nextInt();
	for(i=0;i< N;i++) DP[i] = 0;
	for(i=0;i< n;i++){
		a = cin.nextInt();
		b = cin.nextInt();
		for(j=a;j<=b;j++)
			++DP[j];
	}
	sum = 0;
	for(i=Day;i>=0;i--){
		sum+=DP[i];
		if(sum==F1-F2){
			System.out.println(i);
			break;
		}
	}
 }
}

