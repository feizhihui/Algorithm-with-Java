
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class RoundBinarySearch {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.binarySearch(a, 9));      //未插入
        System.out.println("下标的相反数减一："+Arrays.binarySearch(a, 9));
        int []b={1,2,0,4,5,6,7,8,3,3,3,6,7,4,5};
        Arrays.sort(b);
        System.out.println(Arrays.binarySearch(b,3));
        System.out.printf("%.3f\n",0.05349);
        System.out.println(new BigDecimal(0.05349).setScale(3,BigDecimal.ROUND_HALF_UP));
        DecimalFormat formater = new DecimalFormat(".##"); 
        System.out.println(formater.format(123456.7897456));
        
    }
}
