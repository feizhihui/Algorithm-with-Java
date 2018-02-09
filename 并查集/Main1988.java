/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnionFindSet;

import java.util.Scanner;

/**
 *
 *  M：合并栈 C：查询栈
 */
public class Main1988 {
    static int[]father;
    static int[]rank;
    static int m;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        m=scan.nextInt();
        father=new int[m+1];
        rank=new int[m+1];          //代表它下面有多少个
        for(int i=1;i<=m;i++){
            father[i]=i;
            rank[i]=1;
        }
        while(true){
            String s=scan.next();
            if(s.equals("M")){
                int x=scan.nextInt();
                int y=scan.nextInt();
                merge(x,y);       
            }else if(s.equals("C")){
                int x=scan.nextInt();             
                System.out.println(rank[x]-1); 
            }           
        }
    }
    public static void merge(int x,int y){
        x=findf(x);
        y=findf(y);
        for(int i=1;i<=m;i++){
            if(father[i]==x){
                rank[i]+=rank[y];
            }      
        } 
        father[y]=x;     
    }
    public static int findf(int x){
        if(father[x]==x){
            return x;
        }else{
            return father[x]=findf(father[x]);
        }
    }

}
