import java.util.Scanner;
public class factorial{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = fact(n);
        System.out.println(f);
    }

    public static int  fact(int n ){
       if (n==1){
        return 1;
       }
       
        int nmof= fact(n-1);
        int fn=n*nmof;
        return fn;
    }
}