
import java.util.Arrays;
import java.util.LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Experiment {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(a.length);
        int[][] b = a.clone();   //数组的clone未重写
        for(int i=0;i<3;i++){
            b[i]=Arrays.copyOf(a[i],3);
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((++b[i][j]) + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((a[i][j]) + " ");
            }
            System.out.println();
        }
        LinkedList<String>list=new LinkedList();
        list.add("aa");
        LinkedList list2=(LinkedList) list.clone();
        list.set(0, "bb");
        System.out.println(list2.get(0));
  //      String s=list2.get(0);
        StringBuilder sb1=new StringBuilder("abcss");
        StringBuilder sb2=new StringBuilder("abcss");
        System.out.println(sb1.equals(sb2));   //StringBuilder的equals未重写
        StringBuilder sb3=new StringBuilder(sb1);
        sb1.delete(0, 3);
        System.out.println(sb3);
        System.out.println(sb1);
        
    }
}
