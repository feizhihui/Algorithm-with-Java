package poj.topology;
/*
 * 疑问：该题数组备份为何要在循环内
 */

import java.util.*;

public class Main1270 {

    static int[][] map;
    static int k, t = 1;        //k为字符个数
    static LinkedList<String> list;
    static HashMap<Character, Integer> hm;
    static HashMap<Integer, Character> hm2;
    static int[] a;
    static int[] aim;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String s = scan.nextLine();
            hm = new HashMap();
            hm2 = new HashMap();
            list = new LinkedList();
            k = 1;
            for (int i = 0; i < s.length(); i += 2) {
                char c = s.charAt(i);
                hm2.put(k, c);
                hm.put(c, k++);
            }
            --k;
            map = new int[k + 1][k + 1];
            a = new int[k + 1];       //保存列向sum,代表入度
            aim = new int[k + 1];         //目标数组
            String ord = scan.nextLine();
            for (int i = 0; i < ord.length(); i += 4) {
                int c2 = hm.get(ord.charAt(i + 2));
                map[hm.get(ord.charAt(i))][c2]++;
                a[c2]++;
            }
            if(topo()){
            Collections.sort(list);
            Iterator it=list.iterator();
            while(it.hasNext()) System.out.println(it.next());
            System.out.println();
            }else{
                System.out.println("ERROR!");
            }
            

        }  //while
    }

    public static boolean topo() {
        if (t - 1 == k) {            //由于后面的t++
            String s = "";
            for (int i = 1; i <= k; i++) {
                s = s + hm2.get(aim[i]);
            }
            list.add(s);
            return true;
        }
        boolean b = false;

        for (int i = 1; i <= k; i++) {
            if (a[i] == 0) {   //第i列入度为0 ，则第i排入度减一 
                int[] cla = new int[k + 1];
                cla = Arrays.copyOf(a, k + 1);
                int[][] clo = new int[k + 1][k + 1];              //clone浅复制，无效
                for (int g = 1; g <= k; g++) {                    //备份
                    clo[g] = Arrays.copyOf(map[g], k + 1);
                }
                aim[t++] = i;          //i号元素入度为0  存入aim中
                a[i] = -1;    //表示已载入aim
                for (int j = 1; j <= k; j++) {       //第i排入度减一 
                    if (map[i][j] != 0) {
                        map[i][j] = 0;
                        a[j]--;           //勿忘了还原a【】
                    }
                }
                if (topo()) {
                    b = true;   //每去一点均存在入度为0的点
                }
                a = cla;             //a map aim t还原
                map = clo;
                aim[--t] = 0;
            }
        }
        return b;
    }
}
