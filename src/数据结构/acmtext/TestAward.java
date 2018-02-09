
package acmtext;

public class TestAward {
    public static int first=10;
    public static int last=100;
    public static int num=10;
    public static StringBuffer s=new StringBuffer();
    public static void main(String[] args) {
           award(last,num);               
    }
    
    public static void award(int m,int n){
   //    System.out.println(m+" "+n);
             if(n==0){                                                          
                 if(m==first)
                 System.out.println(s.reverse());
                 s.reverse();
                 return;
             }
             
             if(m%2==1){
              s=s.append("0");    
             award(m+n,n-1);
              s=s.deleteCharAt(num-n);
             return;
             }
              //成功
             s=s.append("1"); 
             award(m/2,n-1);
             s=s.deleteCharAt(num-n); 
             
             //失败
             s=s.append("0");
             award(m+n,n-1);
             s=s.deleteCharAt(num-n);        
    }
}
