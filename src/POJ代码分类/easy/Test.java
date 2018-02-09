
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        System.out.print("2 + 2 = " + (2 + 2));
        System.out.print("2 + 2 = " + 2 + 2);

        Object o = null;
        o = o + "aa";
        System.out.println(o);
        Object o1 = null;
        o1 += "aa";
        System.out.println(o1);
        System.out.println('a' + 'b' + " ");
        System.out.println("" + 'a' + 'b');

        char[] ch = {'a', 'b', 'c'};
        System.out.println(String.valueOf(ch));

        byte bytes[] = new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i] = (byte) i;
        }
        String str = new String(bytes);
        for (int i = 0, n = str.length(); i < n; i++) {
            System.out.print((int) str.charAt(i) + " ");
        }
        System.out.println();
        
        
        System.out.println(Test.class.getName().replaceAll(".","?"));
        System.out.println(Test.class.getName().replaceAll(Pattern.quote("."),"?"));

    }
}

