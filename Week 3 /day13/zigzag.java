import java.util.Scanner;
public class zigzag{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz( n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }
      
      
        System.out.print("Pre"+n+" ");
        pzz(n-1);
        System.out.print("In"+n+" ");
        pzz(n-1);
         System.out.print("Post"+n+" ");
    }
}