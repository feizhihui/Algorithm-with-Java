/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acmtext;
/**
 *
 * @author Administrator
 */
public class MaxSame {
    public String same(String s1,String s2){
        int l1=0;
        int l2=s2.length();
        String s="";

        for(int i=0;i<l2-1;i++){
            for(int j=i;j<l2;j++){
                if(s1.indexOf(s2.substring(i,j+1))>=0){
                    if(s.length()<j+1-i)
                     s=s2.substring(i,j+1);              
                    
                }
                
            }    
        }       
        return s;
    }  
}

class AA{
    public static void main(String[] args) {
        String s1="ssssssdddddffffrojgiodrjgggggggo";
        String s2="ssddddddffffgggg";
        System.out.println(new MaxSame().same(s1, s2));
        
    }
    
    
}
