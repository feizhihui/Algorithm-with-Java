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
public class Monkey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        int num,m,t=0,k=0;
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();   //猴子数
        m=scan.nextInt();    //选择数
        int []a=new int[num];        //初始均为0
        for(int i=0;i<num;i++){
            if(a[i]==0){k++;
            if(k==m){
                a[i]=1;
                t++;
                System.out.println(i+1);
                k=0;
            }
            }
            if(i==(num-1)){ i=-1;
            }
            if(t==num) {
                System.out.println("bye");
                break;
            }
        }
            
        
        
        
        
    }
}
