/*
 * To change this template, choose Tools | Templates
 *   输入一个数t，表示测试组数。
 * 然后每组第一行两个数字n,m，n表示有n只昆虫，
 * 编号从1—n,m表示下面要输入m行交配情况，
 * 每行两个整数，表示这两个编号的昆虫为异性，要交配。 
 * 要求统计交配过程中是否出现冲突，即是否有两个同性的昆虫发生交配。
 */
package UnionFindSet;

import java.util.Scanner;

/**
 *
 * 并查集  判别互斥问题
 */
public class Main2492 {
        static int[]fa;
        static int[]oth;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int M=scan.nextInt();
        int k=1;
        while(M--!=0){
            int m=scan.nextInt();
            int n=scan.nextInt();
            boolean b=false;
            fa=new int[m+1];
            oth=new int[m+1];
            for(int i=0;i<=m;i++){
                fa[i]=i;
            }
            for(int i=0;i<n;i++){
                int x=scan.nextInt();
                int y=scan.nextInt();
                if(oth[x]==0)   oth[x]=y;
                if(oth[y]==0)   oth[y]=x;
                int fx=find(x);
                int fy=find(y);
                if(fx==fy){             //同种
                    b=true;
                }else{               //不同种
                    if(oth[fy]!=0)
                    union(fx,oth[fy]);
                    if(oth[fx]!=0)
                    union(fy,oth[fx]);
                }    
            }
             System.out.println("Scenario #"+(k++)+":");
            if(b){
                System.out.println("Suspicious bugs found!");    
            }else{
                System.out.println("No suspicious bugs found!");
            }      
            System.out.println();
        }  
    }
    
    public static int find(int x){
        return fa[x]==x?x:(fa[x]=find(fa[x]));
    }
    public static void union(int x,int y){
        x=find(x);
        y=find(y);
        if(x!=y){
          fa[y]=x;
        }    
    }   
}
