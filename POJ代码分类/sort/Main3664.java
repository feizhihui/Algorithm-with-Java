/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.sort;

/**
 *
 * @author Administrator
 */
import java.util.*;

public class Main3664 {
    static class Vote {
        int vote1;
        int vote2;
        int mark;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int k=scan.nextInt();
        ArrayList<Vote>alist=new ArrayList();
        for (int i = 0; i < m; i++) {
            Vote a=new Vote();
            a.vote1 = scan.nextInt();
            a.vote2=scan.nextInt();
            a.mark=i+1;
            alist.add(a);
        }
        Collections.sort(alist,new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Vote v1=(Vote)o1;
                Vote v2=(Vote)o2;
                return v2.vote1-v1.vote1;   //从大到小
            }
        });

        int max=0;
        for(int i=1;i<k;i++){
            int t=alist.get(i).vote2;
            if(alist.get(max).vote2 <t){
                max=i;
            } 
        }
        System.out.println(alist.get(max).mark);
    }

}
