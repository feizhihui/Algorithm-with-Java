/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.enumeration;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main1321 {
    static char[][]ch;
    static int n,m;
    static int num;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            num=0;
            m=scan.nextInt();
            n=scan.nextInt();
            if(m==-1&&n==-1) break;
            ch=new char[m][m];
            for(int i=0;i<m;i++){
                ch[i]=scan.next().toCharArray();
            }
            recur(0);
            System.out.println(num);       
        }
    }
    
    public static void recur(int x){
        if(n==0){
            num++;
            return;
        }
        if(x>=m) return;
        
        for(int i=0;i<m;i++){
            if(canPut(x,i)){
                n--;
                ch[x][i]='d';
                recur(x+1);
                ch[x][i]='#'; 
                n++;
            }           
        }
        recur(x+1);           //可以不放
    }
    
    public static boolean canPut(int x,int y){
        if(ch[x][y]!='#') return false;
        for(int i=0;i<x;i++){
           if(ch[i][y]=='d'){
               return false;
           }
        }
        for(int i=0;i<y;i++){
           if(ch[x][i]=='d'){
               return false;
           }
        }    
        return true;
    }
    
}
