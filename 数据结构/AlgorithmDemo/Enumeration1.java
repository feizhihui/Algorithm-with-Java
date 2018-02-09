/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * 枚举子集生成，，也可用n位2进制数计数的方法表示子元素的存在与否
 */
public class Enumeration1 {
        static boolean[]b;
        static StringBuilder sb;
        static Set<String>se=new TreeSet();
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        sb=new StringBuilder(scan.next());
        b=new boolean[sb.length()];
        recur(0);        
        for(String s:se) System.out.println(s);
        
    }
    public static void recur(int x){
        if(x==b.length){
             String s="";
            for(int i=0;i<b.length;i++){
                if(b[i]){ 
                    s+=sb.charAt(i);
                }
            }
            if(!"".equals(s)) se.add(s);  
            return;
        }
        b[x]=false;
        recur(x+1);
        b[x]=true;    //没有增删元素，，是直接覆盖
        recur(x+1);
    }
    
}
