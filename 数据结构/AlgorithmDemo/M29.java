
package AlgorithmDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class M29 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        
        String s="%."+c+"f\n";
        System.out.printf("c格式输出:\n"+s,1.0*a/b);
        
        BigDecimal biga=new BigDecimal(a);
        BigDecimal bigb=new BigDecimal(b);
        System.out.println(biga.divide(bigb,c,BigDecimal.ROUND_HALF_UP));   
        

     //   System.out.printf("c格式输出:\n%.*lf\n",c,1.0*a/b);     //该c语言格式不能应用与java中
    }
}
