/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class CyclotronTriangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[][] a=new int[n][2*n-1+10];
        int m=1,x=0,y=0;
        int i,j,t,k;
        for(k=0;k<n-2;k++){
            for(i=0;i<2*n-4*k-2;i++){if(m>5) m=1;    System.out.println("x="+x+" "+"y="+y+"  m="+m);        
               a[x][y++]=m++;      
            }
            for(j=0;j<n-2*k-1;j++){if(m>5) m=1;      System.out.println("x="+x+" "+"y="+y+"  m="+m);
                a[x++][y--]=m++;
            }
             for(t=0;t<n-2*k-1;t++){if(m>5) m=1;     System.out.println("x="+x+" "+"y="+y+"  m="+m);
               a[x--][y--]=m++;
           }
           x++;y+=2;
        }//一个轮回 x+1 y+2

        for(i=n-1;i>=0;i--){
            m=m>5?1:m;
            if(a[i][n-1]==0) a[i][n-1]=m;
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<2*n-1;j++){
                if(a[i][j]==0) System.out.print("*");
                else System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        
    } 
}
    
    

