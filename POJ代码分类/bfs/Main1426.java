/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poj.bfs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 根本不用广搜，dfs Main1426
 * 广搜MLE
 */
public class Main1426 {

    static ArrayList<String> open;
    static ArrayList<String> close;
    static BigInteger m,zero=new BigInteger("0");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            m = scan.nextBigInteger();
            if (m.equals(zero)) {
                break;
            }
            open = new ArrayList();
            close = new ArrayList();
            open.add("1");
            bfs();
        }
    }

    public static void bfs() {
        while(!open.isEmpty()){
            String s=open.remove(0);
            BigInteger bi=new BigInteger(s);
            if(bi.mod(m).equals(zero)){
                System.out.println(bi);
                return;
            }else{
                close.add(bi+"0");
                close.add(bi+"1");
            }
        }
        open=close;
        close=new ArrayList();
        bfs();
        
    }
}
