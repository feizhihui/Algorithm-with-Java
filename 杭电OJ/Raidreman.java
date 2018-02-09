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
public class Raidreman {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.next();
            String[] str=new String[2];
            str=s.split("/");          
            int mon=Integer.parseInt(str[0]);
            int day=Integer.parseInt(str[1]);
            if(mon==0&&day==0){
                break;
            }
            day+=(mon-7)*31;
            int t=0;
            for(int i=1,k=2;i<=62;i+=k,k++){
                if(i>=day) t++;                    
            }  
            System.out.println(t);
        }                
    }
}
