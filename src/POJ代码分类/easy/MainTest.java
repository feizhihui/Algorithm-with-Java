
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k,m,n,j;
        k=scan.nextInt();
        while(k--!=0){
            m=scan.nextInt();
            n=scan.nextInt();
            j=scan.nextInt();
            int t=n-j;
            if(m==t) System.out.println("does not matter");
            if(m>t) System.out.println("do not advertise");
            if(m<t) System.out.println("advertise");
        }
        
        
    }
    
}
