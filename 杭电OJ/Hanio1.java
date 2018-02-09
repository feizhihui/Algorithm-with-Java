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
public class Hanio1 {
    static int k=0;
    static StringBuffer sb=new StringBuffer();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        String[]s=new String[6];
        for(int i=0;i<6;i++){
            s[i]=scan.next();
   //         if(i==0||s[i].charAt(0)!=s[i-1].charAt(1))
                sb.append(s[i]);     
        }        
        System.out.println(sb);
        move(k,0,0);
    }
     public static void move(int a,int b,int c) {
          if(c==k||b==k){
              System.out.println(k);
              return;
          }
          else{
              for(int i=0;i<sb.length();i=i+2){
                  if(sb.charAt(i)=='A') a--;
                  if(sb.charAt(i)=='B') b--;
                  if(sb.charAt(i)=='C') c--;
                  if(sb.charAt(i+1)=='A') a++;
                  if(sb.charAt(i+1)=='B') b++;
                  if(sb.charAt(i+1)=='C') c++;    
                  if(c==k||b==k) break;
              }                 
          }
          move(a,b,c);
    }
}
