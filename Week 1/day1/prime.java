import java.util.Scanner ;
public class prime{
   public static int isPrime(int n ){

    if (n==1) return 0;
    boolean isPrime =true;
    for(int i =2 ;i<n;i++){
        if(n%i==0){
            isPrime=false;
            break;
        }
    }
    if (isPrime) return 1;
    else return 0 ;

   }
   
   
   
   
    public static void main(String[]args){
        int j = isPrime(7);
        System.out.println(j);

    }
}