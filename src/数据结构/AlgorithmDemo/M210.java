/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmDemo;

/**
 *
 * @author Administrator
 */
public class M210 {
    public static void main(String[] args) {
        for(int i=123;i<334;i++){
            int m=2*i;
            int n=3*i;
            String s=""+i+m+n;
            char[]ch=s.toCharArray();
            boolean b=true;
            loop:
            for(int j=ch.length-1;j>0;j--){
                if(ch[j]=='0'){
                    b=false;
                    break;
                }
                for(int k=j-1;k>=0;k--){
                    if(ch[j]==ch[k]||ch[k]=='0'){
                        b=false;
                        break loop;
                    }
                }
            }
            if(b) System.out.println(i+"  "+2*i+"  "+3*i);
            
        }
        
        
    }
    
}
