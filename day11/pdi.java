import java.util.Scanner;
public class pdi{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        pdio(n);
    }


    public static void pdio(int n){
    //    if(n==0){
    //     return;
    //    }
        
       
         if(n==0){
        return;
       }
       System.out.println(n);
        pdio(n-1);
       
        System.out.println(n);
    }
}