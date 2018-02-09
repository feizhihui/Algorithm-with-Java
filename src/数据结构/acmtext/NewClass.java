/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

/**
 *
 * @author Administrator
 */
public class NewClass {
    public static void main(String[] args) {
        int[] c={1,2,3,4,5};
        fun(c);
        System.out.println(c[0]+"  " +c[1]);
        
    }
    
    public static void fun(int[] c){
        c[0]=100;
        c[1]=100;
        
        
    }
    
}
