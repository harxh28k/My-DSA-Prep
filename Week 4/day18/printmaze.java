import java.util.Scanner;
public class printmaze{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        prinyMazePath(1,1,n,m," ");

    }

    public static void prinyMazePath(int sr,int sc,int dr , int dc, String path){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        prinyMazePath(sr,sc+1,dr,dc,path+"h");
        prinyMazePath(sr+1,sc,dr,dc,path+"v");
    }
}