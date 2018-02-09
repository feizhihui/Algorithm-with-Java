/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classicalDataStructure;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Administrator
 */
public class Evaluation {
        static Stack<Double>opnd=new Stack();
        static Stack<Character>optr=new Stack();
        static String s;
        static int len=0;
        static Double x=0.0;
        static int wide=0;
        
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            opnd=new Stack();
            optr=new Stack();
            optr.push('#');
            s=scan.nextLine();                
            len=s.length();     
            for(int i=0;i<len;){
                if(index(i)){
                    opnd.push(x);
                    i+=wide;
                    wide=0;
                    System.out.println(x);
                }else{
                //    optr.push(s.charAt(i));
                    i++;
                }
                
            }
                       
        }         
    }
    
    public static boolean index(int begin){
        boolean b=false;
        String sub="";
        
        for(int i=begin;i<len;i++){
            Character c=s.charAt(i);
            if(Character.isDigit(c)||c=='.'){
                 sub+=c+"";
                 wide++;
                 b=true;
            }else{
                break;
            }         
        }
        if(b) {
            x=Double.valueOf(sub);
        }
//        System.out.println("里面x"+x);
        return b;     
    }
     
}
