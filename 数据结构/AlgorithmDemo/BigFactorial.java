/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BigFactorial {
      public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
        int m=scan.nextInt();
        int l=100;
        if(m<=100) l=200;
        else if(m<=500) l=300;
        else if(m<=1000) l=2600;
        else if(m<=5000) l=16350;
        else if(m<=10000) l=35700;
        else l=100000;
        byte[]a=new byte[l];
        a[0]=1;
          for(int i=2;i<=m;i++){
              int c=0;
              for(int j=0;j<a.length;j++){
                  int t=i*a[j]+c;
                  a[j]=(byte)(t%10);
                  c=t/10;                  
              }    
          }
          int i,count=0;
          for(i=a.length-1;i>=0&&a[i]==0;i--);
          double d=0;
          if(i-10>=0)
          d=a[i]+a[i-1]/10.0+a[i-2]/100.0+a[i-3]/1000.0;
          for(;i>=0;i--){
              System.out.print(a[i]);
              count++;
          }
          System.out.println();
          if(d>0) System.out.printf("%.2f*10^%d\n",d,count-1);     
      }
      }
}
