
import java.math.BigDecimal;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author Administrator
 */
public class MythInjava {

    public static void main(String[] args) {
        int a = 1, b = 1;
        System.out.println((a / b) * b + (a % b) == a);          //恒成立
        double t1 = 2.00, t2 = 1.11;
        System.out.println(2.00 - 1.11);
        System.out.println(new BigDecimal(2.00).subtract(new BigDecimal(1.0)));
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.11")));

        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;      //24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
        
        






    }

    public static boolean isOdd(int i) {              //判断整数为奇数的两种方法
        return i % 2 != 0;
        //     return (i & 1) != 0;
    }
}
