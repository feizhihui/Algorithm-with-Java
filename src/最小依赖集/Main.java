/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package 最小依赖集;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    static LinkedList<Depen> list = new LinkedList();

    static class Depen {
        StringBuilder begin;
        StringBuilder end;

        public Depen(StringBuilder begin, StringBuilder end) {
            this.begin = begin;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            Depen dp = new Depen(new StringBuilder(scan.next()), new StringBuilder(scan.next()));
            list.add(dp);
        }
        step1();
        print();
        step2();
        print();
        step3();
        print();
    }

    public static void step1() {                     //右边化为单属性集合
        LinkedList<Depen> save = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Depen dp = list.get(i);
            int len = dp.end.length();
            if (len > 1) {
                StringBuilder begin = dp.begin;
                StringBuilder end = dp.end;
                for (int j = 0; j < len; j++) {
                    save.add(new Depen(begin, new StringBuilder(end.charAt(j) + "")));
                }
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < save.size(); i++) {
            list.add(save.get(i));
        }
    }

    public static void step2() {                    //去掉多余的依赖

        boolean[] del = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {           //去掉第i个试试
            Depen dp = list.get(i);
            StringBuilder save = new StringBuilder(dp.begin);
            boolean[] add = new boolean[list.size()];
            boolean b = false;
            for (int j = 0; j < list.size(); j++) {  
                if (i != j && !add[j] && !del[j]) {
                    if (contains(list.get(j).begin, save)) {
                        save.append(list.get(j).end);
                        add[j] = true;
                        b = true;
                    }
                }
                if (j == list.size() - 1 && b == true) {          //继续遍历
                    j = -1;
                    b=false;
                } else {                       //已经到最后
                    if (contains(list.get(i).end, save)) {
                        del[i] = true;
                        break;        //跳出j循环
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < del.length; i++) {
            if (del[i]) {
                list.remove(i - count);
                count++;
            }
        }

    }

    public static void step3() {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).begin.length()==1) continue;
            for (int j = 0; j < list.get(i).begin.length(); j++) {                //假设去掉list.get(i).begin第j个字母
                Depen dp = list.get(i);
                StringBuilder begin = dp.begin;
                StringBuilder sb = new StringBuilder(begin.substring(0, j) + begin.substring(j + 1));
                StringBuilder save = new StringBuilder(sb);
                boolean[] add = new boolean[list.size()];
                boolean b = false;
                for (int k = 0; k < list.size(); k++) {                             //依次扩大闭包
                    if (k != i && !add[k]) {                    //初始化未有函数依赖加入闭包                                               
                        if (contains(list.get(k).begin, save)) {
                            save.append(list.get(k).end);
                            add[k] = true;
                            b = true;
                        }
                    }
                    if (b && k == list.size() - 1) {
                        k = -1;
                        b=false;
                    } else {
                        if (contains(dp.end, save)) {
                            list.set(i, new Depen(sb, dp.end));            //可以去掉第j个字母
                            j--;
                            break;
                        }
                    }

                }
            }
            if (list.get(i).begin.length() == 0) {
                list.remove(i);
                i--;
            }
        }

    }

    public static boolean contains(StringBuilder sb1, StringBuilder sb2) {      //sb2 contains sb1?
        for (int i = 0; i < sb1.length(); i++) {
            String s = sb2 + "";
            if (!s.contains(sb1.charAt(i) + "")) {
                return false;
            }
        }
        return true;
    }

    public static void print() {
        System.out.println("-------------------------------");
        for (int i = 0; i < list.size(); i++) {
            Depen dp = list.get(i);
            System.out.println(dp.begin + "->" + dp.end);
        }
    }
}
