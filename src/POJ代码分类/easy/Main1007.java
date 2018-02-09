
package poj.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class Main1007 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        String[]s=new String[m];
        int[]copy=new int[m];
        int[]a=new int[m];
        HashMap<Integer,String>map=new HashMap();
        for(int i=0;i<m;i++){
            s[i]=scan.next();
           for(int j=0;j<n-1;j++){
               for(int k=j+1;k<n;k++){
                   if(s[i].charAt(j)>s[i].charAt(k)) a[i]++;                   
               }
           }
           copy[i]=a[i];
        }
        Arrays.sort(copy);
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(copy[i]==a[j]){
                    System.out.println(s[j]);
                    a[j]=-1;
                    break;
                }
                
            }
        } 
    }
}

