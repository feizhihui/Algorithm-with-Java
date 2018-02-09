package com.java.poj;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main1047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.next();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            int l = s.length();
            BigInteger bs = new BigInteger(s);
            boolean b=false;
            loop:
            for (int i = 1; i <= l; i++) {
                BigInteger bi = new BigInteger(i + "");
                BigInteger sum = bs.multiply(bi);
                String si = sum + "";   
                if(si.length()<l){
                    si="0"+si;
                }          
                if (si.length() != l) {
                    break;
                }
                char[]ctest=si.toCharArray();
                Arrays.sort(ctest);
                for (int j = 0; j <l;j++) {
                    if(ch[j]!=ctest[j]){
                        break loop;
                    }                    
                }
                if(i==l) b=true;
            }
            
            if(b){
                System.out.println(s+" is cyclic");
            }else{
                System.out.println(s+" is not cyclic");
            }                       
        }
    }
}
