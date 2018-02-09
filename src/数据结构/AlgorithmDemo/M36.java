/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class M36 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int b=scan.nextInt();
        BigInteger bi=scan.nextBigInteger();
        System.out.println(bi.toString(b));   
        System.out.println("----------------------");
        int m=bi.intValue();
        ArrayList<Integer>alist=new ArrayList();
        StringBuilder sb=new StringBuilder();       
        while(m!=0){
            alist.add(m%b);
            sb.append(m%b);
            m/=b;                                    
        }
        
        ListIterator it=alist.listIterator();
        while(it.hasNext()){
            it.next();
        }
        System.out.println(it.hasPrevious());
        while(it.hasPrevious() ){
            System.out.print(it.previous());
        }
        System.out.println();
        
        System.out.println("---------------");
        System.out.println(sb.reverse());
    }
    
}
