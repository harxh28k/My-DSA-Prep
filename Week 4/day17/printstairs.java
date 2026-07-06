import java.util.Scanner;
public class printstairs{
    public static void main(String[]args){
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPath(n," ");

    }

    public static void printStairPath(int n ,  String path){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        printStairPath(n-1,path+"1");
        printStairPath(n-2,path+"2");
        printStairPath(n-3,path+"3");
    }
}