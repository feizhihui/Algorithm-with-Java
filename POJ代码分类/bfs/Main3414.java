/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3414 {
        static Queue<Integer>lista=new LinkedList(),listb=new LinkedList();
        static int cupa,cupb,aim,a,b;
        static boolean[]visit=new boolean[10000];
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        cupa=scan.nextInt();
        cupb=scan.nextInt();
        aim=scan.nextInt();
        int step=0;
        lista.add(0);
        loop:
        while(true){        
            while(!lista.isEmpty()){
            int t=lista.poll();
            if(visit[t]) continue;
            visit[t]=true;
            a=t/100;
            b=t%100;
            if(a==aim||b==aim) break loop;
            if(a!=0){
                t=aTob();
                listb.add((a-t)%100*100+(b+t)%100);
                listb.add(b); 
            }
            if(b!=0){
                t=bToa();
                listb.add((a+t)%100*100+(b-t)%100);
                listb.add(a*100); 
            }
            if(a<cupa){
                t=addA();
                listb.add((a+t)%100*100+b);
            }
            if(b<cupb){
                t=addB();
                listb.add(a*100+(b+t));
            }
        }
            lista=listb;
            listb=new LinkedList();
            step++;
      }
        System.out.println(step);
          
    }
    public static int aTob(){
        int t=cupb-b;
        if(a>=t) return t;
        else return a;
    }
    public static int bToa(){
        int t=cupa-a;
        if(b>=t) return t;
        else return b; 
        
    }
    public static int addA(){
        return cupa-a;
    }
    public static int addB(){
        return cupb-b;
    }
    
}
