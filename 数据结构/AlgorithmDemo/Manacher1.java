
package AlgorithmDemo;

import java.util.Scanner;


public class Manacher1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (true) {
            String ss = scan.nextLine();
            if ("END".equals(ss)) {
                break;
            }
            String s="";
            for(int i=0;i<ss.length();i++){
                s+="*"+ss.charAt(i);
            }s+="*";      
            int l = 0,x=0,y=0,z=0;
            for (int i = 0; i < s.length(); i++) {               
                for (int j = 0,k = 0,use=0; i + j < s.length() && i - k >= 0;) {  //两边延伸j个
                      Character cl=s.charAt(i-k);
                      Character cr=s.charAt(i+j);
                      if(!Character.isLetter(cl)&&cl!='*'){
                          k++;
                          continue;
                      }
                      if(!Character.isLetter(cr)&&cr!='*'){
                          j++;
                          continue;
                      }
                      if(Character.toLowerCase(cl) ==Character.toLowerCase(cr)){//Character.toLowerCase(cl) ==Character.toLowerCase(cr)
                          use++;
                          if(use>l){
                              l=use;
                              z=i;
                              x=i-k;
                              y=i+j;
                          }
                      }else if(cl=='*'){
                          k++;
                          continue;
                      }else if(cr=='*'){
                          j++;
                          continue;
                      }
                      else break;               
                      k++;
                      j++;
                }
            }
            for(int i=x;i<=y;i++){
                if(s.charAt(i)!='*')
                System.out.print(s.charAt(i));          
            }
            System.out.println();
        }
    }
}