/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

import java.util.Scanner;


public class M35 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[]sh=s.split(" ");
        int[][]a=new int[sh.length][sh.length];
        for(int i=0;i<sh.length;i++){
            for(int j=0;j<sh.length;j++){
                if(i==0){
                    a[i][j]=Integer.parseInt(sh[j]);
                }else{
                    a[i][j]=scan.nextInt();
                }   
            }
        }
        System.out.println("------------------------");
        for(int i=0;i<sh.length;i++){
            for(int j=0;j<sh.length;j++){
                System.out.print(a[sh.length-j-1][i]+" ");       
            }
            System.out.println();
        }
        
    }
    
}
