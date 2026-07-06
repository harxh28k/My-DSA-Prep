import java.util.Scanner;
public class printpermutation{
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        printPermuatation(str,"");
        
        
    }
    public static void printPermuatation(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<ques.length();i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0,i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart+qrpart;

            printPermuatation(roq,ans+ch);
        }
    }
}