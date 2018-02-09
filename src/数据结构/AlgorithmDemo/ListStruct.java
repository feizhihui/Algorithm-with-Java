/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ListStruct {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        LinkedList<Integer>list =new LinkedList();
        int k=scan.nextInt();
        int m=scan.nextInt();
        for(int i=0;i<=k;i++){
            list.add(i);
        }
        scan.nextLine();
        while(m--!=0){
            String s=scan.nextLine();
            String[]sh=s.split(" ");
            int x=Integer.parseInt(sh[1]);
            int y=Integer.parseInt(sh[2]);
            x=list.indexOf(x);
            y=list.indexOf(y);
            if(sh[0].equals("A")){
                if(x<y)
                    list.add(y-1,list.remove(x));
                else
                    list.add(y,list.remove(x)); 
            }
            else if(sh[0].equals("B"))
                if(x<y)
                    list.add(y,list.remove(x));
                else
                    list.add(y+1,list.remove(x));
        }
        System.out.println(list);        
    }
}
