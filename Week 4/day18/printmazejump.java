import java.util.Scanner;
public class printmazejump{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazeJumpPath(1,1,n,m," ");

    }
    public static void printMazeJumpPath(int sr,int sc ,int dr, int dc ,String path){
        if(sc==dc && sr==dr){
            System.out.println(path);
            return;
        }

        for(int ms =1;ms<=dc-sc;ms++){
            printMazeJumpPath(sr,sc+ms,dr,dc,path+"h"+ms);
        }
        for(int ms =1;ms<=dr-sr;ms++){
            printMazeJumpPath(sr+ms,sc,dr,dc,path+"v"+ms);
        }
        for(int ms =1;ms<=dr-sr && ms<=dc-sc;ms++){
            printMazeJumpPath(sr+ms,sc+ms,dr,dc,path+"d"+ms);
        }
    }
}