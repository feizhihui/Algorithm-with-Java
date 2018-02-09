/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.noip;

import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Recur1 {
        static int[][]map;
        static int[] a;
        static int n,day=1;
        static LinkedList<Point>list=new LinkedList();
        static class Point{
            int x;
            int y;
            Point(int i,int j){
                x=i;
                y=j;
            }
        }
        
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();             //2^n球队
        n=1<<n;
        map=new int[n+1][n+1];
        a=new int[n+1];
        recur(1);               
    }
    
    public static boolean recur(int x){
        if(x>n){
            for(int i=0;i<list.size();i++){
                Point p=list.get(i);
                System.out.print(p.x+" vs "+p.y+"   ");
            }       
            System.out.println("第"+(day++)+"天");
            return true;
        }
        if(a[x]==1){
            return recur(x+1);            
        }      
        boolean b=false;
        for(int i=x+1;i<=n;i++){
            if(a[i]==0&&map[x][i]==0){
                a[i]=1;
                map[x][i]=1;
                list.add(new Point(x,i));
                b=recur(x+1);
                a[i]=0;
                list.removeLast();
                if(x!=1&&b) return true;
            }
        } 
        return false;
    }
}
    

