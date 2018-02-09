/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main3536 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int v=scan.nextInt();
            int[]a=new int[4];
            a[3]=999999999;    
            ArrayList<Integer>alist=new ArrayList();
            for(int i=1;i<=v;i++){
                if(v%i==0) alist.add(i);
            }
            for(int i=0;i<alist.size();i++){    
                for(int j=i;j<alist.size();j++){  
                    for(int k=j;k<alist.size();k++){
                        if(alist.get(i)*alist.get(j)*alist.get(k)==v){
                                if(2*(alist.get(i)*alist.get(j)+alist.get(i)*alist.get(k)+alist.get(j)*alist.get(k))<a[3]){
                                    a[0]=alist.get(i);
                                    a[1]=alist.get(j);
                                    a[2]=alist.get(k);
                                    a[3]=2*(alist.get(i)*alist.get(j)+alist.get(i)*alist.get(k)+alist.get(j)*alist.get(k));
                                }                 
                        } 
                    }
                }
            }
            System.out.println(a[0]+" "+a[1]+" "+a[2]);
            
        }
              
    }
    
}
