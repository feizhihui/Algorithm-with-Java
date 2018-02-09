/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 *shuffle poker， imitated problem
 */
public class Main3087 {
    static Set<String>set;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int M=scan.nextInt(),num=1;
        while(M--!=0){
            int n=scan.nextInt();
            String s1=scan.next();
            String s2=scan.next();
            String aim=scan.next();
            set=new TreeSet();
            int count=0;
            while(true){
                String s="";
                count++;
                for(int i=0;i<n;i++){
                    s=s+s2.charAt(i)+s1.charAt(i);
                }
                if(s.equals(aim)) break;
                if(set.contains(s)){
                    count=-1;
                    break;
                }else{
                    set.add(s);
                }
                s1=s.substring(0, n);
                s2=s.substring(n);
   //             System.out.println(s);
            }
            System.out.println((num++)+" "+count);
        }   
    }
    
}
