package AlgorithmDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int m = scan.nextInt();
            int l = 100;
            ArrayList<Byte> a = new ArrayList();
            a.add(0, (byte) 1);
            for (int i = 2; i <= m; i++) {
                int c = 0;
                for (int j = 0; j < a.size(); j++) {
                    int t = i * a.get(j) + c;
                    a.set(j, (byte) (t % 10));
                    c = t / 10;
                    if(c!=0&&j==a.size()-1) a.add((byte)0);
                }
            }
            double d = 0;
            if (a.size()>10) {
                d = a.get(a.size()-1) + a.get(a.size() - 2) / 10.0 + a.get(a.size() - 3) / 100.0 + a.get(a.size() - 4) / 1000.0;
            }

            for(int i=a.size()-1;i>=0;i--){
                System.out.print(a.get(i));
            }
            System.out.println();
            if (d > 0) {
                System.out.printf("%.2f*10^%d\n", d, a.size() - 1);
            }
        }
    }
}
