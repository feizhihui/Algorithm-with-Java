/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * 循环队列模仿
 */
public class Main3125 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        while(m--!=0){
            int n=scan.nextInt();
            int k=scan.nextInt();
            int[]a=new int[n];
            int count=1;
            LinkedList<Integer>queue=new LinkedList();
            for(int i=0;i<n;i++){
                queue.add(scan.nextInt());
            }   
            int d=queue.get(k);
            int i=0;
            while(true){         
                int max=Collections.max(queue);
                if(d==max&&k==i){
                    break;
                }else{
                    if(max==queue.get(i)){
                        count++;
                        queue.removeFirst();
                    }else{
                    queue.add(queue.removeFirst());
                    }
                    if(k==0) k=queue.size()-1;
                    else k--;
                    
                }
                
            }     
            System.out.println(count);
        }
     
    }
    
}
