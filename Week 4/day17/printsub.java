import java.util.Scanner;
public class printsub{
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        printSubSeq(str , "");
    }
    public static void printSubSeq(String ques , String ans ){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSubSeq(roq,ans+"");
        printSubSeq(roq,ans+ch);
    }
}