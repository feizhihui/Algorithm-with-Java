
package AlgorithmDemo;
import java.util.Scanner;

public class ToMinimizeTheMaximum {

    static int[] a;
    static int k;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k=scan.nextInt();
        scan.nextLine();
        String[] sh = scan.nextLine().split(" ");
        int len = sh.length;
        a = new int[len];
        int sum=0;
        for (int i = 0; i < len; i++) {
            a[i] = Integer.parseInt(sh[i]);
            sum+=a[i];
        }
        int x=0;
        int y=sum;
        while(x!=y){             //试行区域[x,y]
            int m=x+(y-x)/2;
            boolean b=p(m);
            if(b) y=m;    //m符合，但应找最小的
            else x=m+1;   //m不符合
  //          System.out.println(m+" --------------x="+x+"  y="+y);
        }
        System.out.println(x);
    }

    public static boolean p(int x) {  //k段子序列和是不是都小于等于x
        int t=0,sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>x) return false;
            sum+=a[i];
            if(sum>x){  //else sum<=x还是属于上一个序列  
                t++;
                i--;
                sum=0;
            }
            if(sum<=x&&i==a.length-1) t++;
        } 
        if(t<=k) return true;   //可以分成t段和小于x的子序列  
        return false;
    }
}
