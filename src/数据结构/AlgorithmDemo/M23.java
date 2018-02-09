

package AlgorithmDemo;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class M23 {
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           while(scan.hasNext()){
               int a=scan.nextInt();
               int b=scan.nextInt();
               int c=scan.nextInt();
               int d=(70*a+21*b+15*c)%(3*5*7);
               
               if(d>=10&&d<=100)
               System.out.println(d);
               else System.out.println("No answer");
               
               
           }
    }
    
}
