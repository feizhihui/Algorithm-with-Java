/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberTheory;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Nim {
        static int m=0,len;
        static int[][]map;
        static int[]a;            //没排石子数
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入石子的堆数：");
        m = scan.nextInt(); 
        map = new int[m][20];
        a = new int[m];
        int max=0;
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
            int t = a[i];
            if(max<t) max=t;
            for (int j = 0; j < 20; j++) {
                if (t % 2 == 1) {
                    map[i][j] = 1;
                }
                t /= 2;
            }
        }
        len=new BigInteger(max+"").toString(2).length();
        System.out.println(len+"             长度");
        print();
        while(true){         
            System.out.println("请输入你要取的石子数：");
            int line=scan.nextInt();
            int num=scan.nextInt();
            if(a[line-1]<num){
                System.out.println("error!!!");
                continue;
            }
            a[line-1]-=num;
            int t=a[line-1];
            for (int j = 0; j < m; j++) {
                if (t % 2 == 1) {
                    map[line-1][j] = 1;
                }else{
                    map[line-1][j] = 0;
                }   
                t /= 2;
            }
   
            print();     
            if(test()){
                System.out.println("You win ！！！");
                break;
            }
            go();
            
            if(test()){
                System.out.println("黄剑飞 win ！！！");
                break;
            }
        }  

    }
    public static void  go(){
        int[]temp=new int[len];
        int t=0,h=0,r=0;
        boolean b=true;
        for(int j=len-1;j>=0;j--){
            for(int i=0;i<m;i++){
                if(map[i][j]!=0){                
                temp[j]++;
                if(b) t=i;              //t为记录的最后一个非零数的排
                }
            }   
            if(b&&temp[j]%2!=0){ 
                h=1<<j;                        //h为待会要减去的数 1<<j
                r=j;
                map[t][j]=0;
                temp[j]-=1;
                b=false;
            }
        }
        for(int j=r-1;j>=0;j--){         //横向
            if(temp[j]%2!=0){     //此列不匹配
                if(map[t][j]==0){
                h-=1<<j;
                map[t][j]=1;
                }else{
                    h+=1<<j;
                    map[t][j]=0;
                }
            }
        }
        a[t]=a[t]-h;       
        if(h>0)
        System.out.println("黄剑飞取第"+(t+1)+"堆"+h);
        else{
            int c=--a[t];
            for (int j = 0; j < len; j++) {
                if (c % 2 == 1) {
                    map[t][j] = 1;
                }else{
                    map[t][j] = 0;
                }   
                c /= 2;
            }
            System.out.println("黄剑飞取第"+(t+1)+"堆1个");
        }
        print();
        
    }
    

    public static void print() {
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" " + a[i]);
        }
        System.out.println("-------------------------------------------------------------");
    }
    public static boolean test(){
        for(int i=0;i<m;i++){
            if(a[i]!=0) return false;
        }
        
        return true;
    }
}
