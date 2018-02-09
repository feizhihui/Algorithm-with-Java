package acmtext;

public class Combine {

    final static int ADD = 1;
    final static int SUB = 2;
    final static int NUL = 0;
    int k;
    String s = "123456789";
    int t;

    public static void main(String[] args) {
        Combine com = new Combine();
        com.go();
    }

    public void go() {
        int[] a = new int[8];
        for (a[0] = 0; a[0] < 3; a[0]++) {
            for (a[1] = 0; a[1] < 3; a[1]++) {
                for (a[2] = 0; a[2] < 3; a[2]++) {
                    for (a[3] = 0; a[3] < 3; a[3]++) {
                        for (a[4] = 0; a[4] < 3; a[4]++) {
                            for (a[5] = 0; a[5] < 3; a[5]++) {
                                for (a[6] = 0; a[6] < 3; a[6]++) {
                                    for (a[7] = 0; a[7] < 3; a[7]++) {
                                        check(a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(t);
    }

    public void check(int[] a) {
        String str = "";
        for (int i = 0; i < 8; i++) {
            str += s.charAt(i);
            if (a[i] == 1) {
                str += "+";
            }
            if (a[i] == 2) {
                str += "-";
            }
        }
        str += 9;
        calcu(str);
    }

    public void calcu(String s) {
        int k = 0;
        int j = 0,i;
        String s1 = "+" + s;
        for (i = 1; i < s1.length(); i++) {
            if (isNum(s1.charAt(i))) {
                continue;
            }           
            k += Integer.valueOf(s1.substring(j, i));
            j = i;
        }
        if(!isNum(s1.charAt(i-2))) 
        k+=Integer.valueOf(s1.substring(i-2));
        if (k == 110) {
            t++;
            System.out.println(s + "=110");
        }

    }

    boolean isNum(char c) {
        return c > '0' && c <= '9' ? true : false;
    }
}
