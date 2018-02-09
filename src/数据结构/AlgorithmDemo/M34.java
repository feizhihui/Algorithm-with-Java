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
public class M34 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.nextLine();
            StringBuilder sb=new StringBuilder(s);
            String sl="";
            int b=0,t=0;
            char c=0;
            for(int i=0;i<sb.length();i++){
                Character chara=sb.charAt(i);
                if(chara==' '){
                    sb.deleteCharAt(i);
                }else if(!Character.isDigit(chara)){
                   if(i>0)  b++;
                    t=i;
                    c=chara;
                }       
            }
            s=sb.toString();
            if(b==0){
                System.out.println(Integer.parseInt(s));
                return;
            }
            int m=Integer.parseInt(s.substring(0, t));
            int n=Integer.parseInt(s.substring(t+1)); 
            System.out.println(cal(m,n,c));
        }
        
        
        
    }

    public static double cal(int m,int n,char c){
            if(c=='*'){
                m*=n;
            }else if(c=='/'){
             return 1.0*m/n;
            }else if(c=='+'){
                m+=n;
            }else if(c=='-'){
                m-=n;
            }
            return m;
        
        
    }
    
}
