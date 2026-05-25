import java.util.Scanner;
public class day1og{
   
   public static int fact(int x ){
    int rv = 1;
    for(int i= 1;i<=x;i++){
        rv = rv*i;
    }
    return rv ;
   }
   
   
   
    public static void main (String []args){

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int r = scn.nextInt ();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

         int npr = nfact/nmrfact;

        System.out.print(n+" P "+r+ " = "+npr);
    }
}
 

 //GFG code
 // User function Template for Java

// class Solution {
    
//     static long factorial(long num) {
//         long fact = 1;
//         for(long i=1;i<=num;i++){
//             fact= fact*i;
//         }
//         return fact;
//     }
//      static long nPr(long n, long r) {
         
//          long ans = factorial(n)/factorial(n-r);
         
//         // code here
//         return ans ;
//     }
// }