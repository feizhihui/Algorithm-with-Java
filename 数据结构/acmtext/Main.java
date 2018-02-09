package acmtext;



import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Main m=new Main();
        Scanner scan=new Scanner(System.in);
        int i,j;

        while(true){
        j=scan.nextInt();
        i=scan.nextInt();        
        if(i==0&&j==0) break;
        long time1=new Date().getTime();
        System.out.println(m.trans(i,j));
        System.out.println(new Date().getTime()-time1+"时间");      
        }
        
    }
    public int trans(int i,int j){     //i辆车 j台电脑

        if(j<i) return 0;
        if(i==1){
            return 1;
        }
        return trans(i-1,j-1)+trans(i,j-i);

    }
}

