/*
 * To change this template, choose Tools | Templates
 * 提交不成功，，并查集判断连通性，，，，下列代码并没有使用并查集，提交WA
 */
package UnionFindSet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1308 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=1;
        while(true){
            boolean b=false;
            ArrayList<Integer>list=new ArrayList();
            int m=scan.nextInt();
            int n=scan.nextInt();
            if(m==-1&&n==-1){
                break;
            }
            if(m==0&&n==0){
                System.out.println("Case "+(num++)+" is a tree.");                 //提交不成功
                continue;
            }
            list.add(m);
            list.add(n);
            int max=Math.max(m, n);
            while(true){
                m=scan.nextInt();
                n=scan.nextInt();
                if(m==0&&n==0){
                    break;   
                }
                list.add(m);
                list.add(n);
                int t=Math.max(m, n);
                max=Math.max(max, t);
            }   
            int[]fa=new int[max+1];
            for(int i=0;i<list.size()-1;i+=2){
                if(list.get(i)==list.get(i+1)){          //不能自己指向自己
                    b=true;
                    break;
                }
                if(fa[list.get(i)]==0)  fa[list.get(i)]=list.get(i);       //!=0证明该节点用过
                if(fa[list.get(i+1)]==0)  fa[list.get(i)]=list.get(i);
                if(fa[list.get(i+1)]==0||fa[list.get(i+1)]==list.get(i+1)){           
                    fa[list.get(i+1)]=list.get(i); 
                }else{                                    //如果它已经有个父亲    &&fa[list.get(i+1)]!=list.get(i+1)
                    b=true;
                    break;
                }
            
            }

            int k=0;
            if(!b){
            for(int i=1;i<=max;i++){
                if(fa[i]==i){
                    k++;
                }
            }      
            if(k!=1) b=true;
            }
            if(b){
                System.out.println("Case "+(num++)+" is not a tree.");
            }else{
                System.out.println("Case "+(num++)+" is a tree.");
            }   
        }
    }
    
}
