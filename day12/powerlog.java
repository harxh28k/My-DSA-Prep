import java.util.Scanner;
public class powerlog{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int p = plog(x , n);
        System.out.println(p);
    }

    public static int plog(int x , int n){
        if(n==0){
            return 1;
        }
        int xpn2 = plog(x , n/2);
        int xn = xpn2 * xpn2;

        if(n%2==1){
            xn=xpn2*xpn2*x;
        }
        return xn;
    }
}