/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.easy;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * BigInteger也可以进行位操作
 */
public class Main3748 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
        String[]s=scan.nextLine().trim().split(",");//String[] ss = scan.nextLine().trim().split("[,]");
        BigInteger x=new BigInteger(s[0],16);
        int a=Integer.parseInt(s[1]);
        int b=Integer.parseInt(s[2]);
        
        StringBuilder sb=new StringBuilder(x.toString(2));
        sb.reverse();
        sb.setCharAt(a, '0');
        sb.setCharAt(b, '1');
        sb.setCharAt(b-1,'1');
        sb.setCharAt(b-2,'0');
        sb.reverse();
        x=new BigInteger(sb.toString(),2);
        System.out.println(x.toString(16));
        }
    }
    
}
/*
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedInputStream(System.in));
        if (scan.hasNext()) {
            String[] ss = scan.nextLine().trim().split("[,]");
            Integer r = Integer.parseInt(ss[0], 16);//按16进制解析字符串
            Integer x = Integer.parseInt(ss[1]);//默认按10进制解析
            Integer y = Integer.parseInt(ss[2]);
            r = r & ~(0x1 << x);//第x位设置成0
            r = r & ~(0x1 << (y - 2));//0
            r = r | (0x1 << (y - 1));//1    BigInteger也可以进行位操作
            r = r | (0x1 << y);//1
            System.out.println(Integer.toHexString(r));
        }
    }
}


 */