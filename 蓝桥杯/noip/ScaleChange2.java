/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package theblue.noip;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ScaleChange2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String s=scan.next();
            int m=scan.nextInt();
            int n=scan.nextInt();
            BigInteger bi=new BigInteger(s,m);
            System.out.println(Integer.toString(new Integer(bi+""),n));
            
        }
        
    }
    
}
