package acmtext;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Calculate24 {

    private static Stack<String> stack = new Stack();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList alist = new ArrayList();
        for (int i = 0; i < 4; i++) {
            Double a = scan.nextDouble();
            alist.add(a);
        }
        boolean b = cal(alist);
        System.out.println(b);
        if (b) {
            for (int i = 0; i < stack.size(); i++) {
                StringBuilder s = new StringBuilder(stack.elementAt(i));
                for (int j = 0; j < s.length(); j++) {                     //删除没必要的0
                    if (s.charAt(j) == '0' && (j == s.length() - 1 || s.charAt(j + 1) > '9' || s.charAt(j + 1) < '0')) {     //0后非数字
                        if (j == s.length() - 1 || s.charAt(j + 1) != '.') {       //0后不为小数点               
                            if (s.charAt(j - 1) == '.') {             //该删除的0前若为小数点一并删除
                                s.deleteCharAt(j - 1);
                                s.deleteCharAt(j - 1);
                            } else {
                                s.deleteCharAt(j);
                            }
                        }
                    }
                }

                System.out.println(s + " ");
            }
        }

    }

    public static boolean cal(ArrayList<Double> alist) {

        if (alist.size() == 1) {
            if (alist.get(0) == 24) {
                return true;
            } else {
                return false;
            }
        }

        for (int j = alist.size() - 1; j > 0; j--) {

            Double a = alist.get(j);
            alist.remove(j);
            for (int i = alist.size() - 1; i >= 0; i--) {        //遍历所有的加减乘除
                double d = alist.get(i);

                alist.set(i, d + a);
                stack.push(d + "+" + a + "=" + (d + a));
                if (cal(alist)) {
                    return true;
                }
                stack.pop();
                alist.set(i, d);

                if (d - a > 0) {                          //避免产生负数
                    alist.set(i, d - a);
                    stack.push(d + "-" + a + "=" + (d - a));
                    if (cal(alist)) {
                        return true;
                    }
                    stack.pop();
                    alist.set(i, d);
                }

                alist.set(i, d * a);
                stack.push(d + "*" + a + "=" + (d * a));
                if (cal(alist)) {
                    return true;
                }
                stack.pop();
                alist.set(i, d);

                if (a == 0) {
                    continue;               //避免除0
                }
                alist.set(i, d / a);
                stack.push(d + "/" + a + "=" + (d / a));
                if (cal(alist)) {
                    return true;
                }
                stack.pop();
                alist.set(i, d);

            }
            alist.add(j, a);
        }
        return false;
    }
}
