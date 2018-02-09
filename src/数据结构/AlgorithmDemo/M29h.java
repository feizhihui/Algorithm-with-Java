/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

/**
 *
 * @author Administrator
 */
public class M29h {
    public static void main(String[] args) {
        
        for(int i=123;i<334;i++){
            int[]a=new int[10];
            int m=2*i;
            int n=3*i;
            String s=""+i+m+n;
            for(int j=0;j<9;j++){
                a[s.charAt(j)-'0']=1;
            }
            boolean b=true;
            for(int j=1;j<10;j++){
                if(a[j]==0) b=false;
            }
            if(b){
                System.out.println(i+" "+m+" "+n);
            }
            
            
        }
        
        
    }
    
}
