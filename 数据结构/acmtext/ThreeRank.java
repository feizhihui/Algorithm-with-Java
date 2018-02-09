/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ThreeRank {

    public static void main(String[] args) {
        ThreeRank.Compara tr = new ThreeRank().new Compara();
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        scan.nextLine();
        while (m-- != 0) {
            String s = scan.nextLine();
            char[] cha = s.toCharArray();
            Character[] ch = new Character[cha.length];
            for (int i = 0; i < cha.length; i++) {
                ch[i] = cha[i];
            }
            int l = ch.length;
            Arrays.sort(ch,tr);
            while (true) {
                for (int i = 0; i < ch.length; i++) {
                    System.out.print(ch[i]);
                }
                System.out.println();
                boolean b = false;
                for (int i = l - 2; i >= 0; i--) {
                    for (int j = l - 1; j > i; j--) {                   
                     if(tr.compare(ch[i],ch[j])<0){
                            char u = ch[i];
                            ch[i] = ch[j];
                            ch[j] = u;
                            Arrays.sort(ch, i + 1, l, tr);
                            b = true;
                            break;
                        }
                    }
                    if (b) {
                        break;
                    }
                }
                if (!b) {
                    break;
                }
            }
        }
    }

    class Compara implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Character c1 = (Character) o1;
            Character c2 = (Character) o2;
            if (Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
                return c1 - c2;
            }
            return Character.toLowerCase(c1) - Character.toLowerCase(c2);
        }
    }
}
