
package acmtext;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Quanpailie12 {

    public static int num = 1;
    public static char[][] ch = new char[100000][20];

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        LinkedList lj = new LinkedList();
        LinkedList lz = new LinkedList();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                lj.add(c);
            }
        }
        lz.add(lj.removeFirst());
        hjf(lj, lz);
    }

    public static void hjf(LinkedList lj1, LinkedList lz1) {
        LinkedList lj = new LinkedList();
        LinkedList lz = new LinkedList();
        for (int i = 0; i < lj1.size(); i++) {
            lj.add(lj1.get(i));
        }
        for (int i = 0; i < lz1.size(); i++) {
            lz.add(lz1.get(i));
        }                                        //链表复制

        for (int j = 0; j < lz.size(); j++) {      //删除*    
            if (lz.get(j) == '*') {
                lz.remove(j);          
                j--;
            }
        }
        if (lj.size() == 0) {                          //此时可以输出lz
            if (test(lz)) {
                System.out.println(lz + "----------------------------------------------------------------" + num++);
            }
            return;
        }

        ftrim(lz);               //给lz插入星号
        char c = (char) lj.removeFirst();        //插入字符c
        for (int i = 0; i < lz.size(); i++) {

            if (lz.get(i) == '*') {
                lz.set(i, c);
                hjf(lj, lz);              //此处进行回溯
                lz.set(i, '*');
            }

        }
    }

    public static void ftrim(LinkedList sb) {
        int t = 2 * sb.size() + 1;
        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                sb.add(i, '*');
            }
        }
    }

    public static boolean test(LinkedList<Character> sb) {
        boolean b = false;
        char ch1[] = new char[10];
        for (int i = 0; i < sb.size(); i++) {
            ch1[i] = sb.get(i);
        }

        for (int i = 0; i < num; i++) {
            if (ch[i][0] == 0) {
                for (int k = 0; k < sb.size(); k++) {
                    ch[i][k] = ch1[k];
                }
                b = true;
                break;                     //遍历完未发现重复list，则返回true，且将新list保存
            }
            int j = 0;
            for (; j < sb.size(); j++) {
                if (ch[i][j] == ch1[j]) {
                    continue;
                } else {
                    break;
                }
            }
            if (j == sb.size()) {
                break;
            }
        }
        return b;
    }
}
