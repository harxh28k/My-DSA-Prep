import java.util.Scanner;
import java.util.ArrayList;
public class stairs{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairsPath(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairsPath(int n ){
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if (n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = getStairsPath(n-1);
        ArrayList<String> paths2 = getStairsPath(n-2);
        ArrayList<String> paths3 = getStairsPath(n-3);

        ArrayList<String> poths = new ArrayList<>();

        for(String path:paths1){
            poths.add(1+path);
        }
         for(String path:paths2){
            poths.add(2+path);
        }
         for(String path:paths3){
            poths.add(3+path);
        }
        return poths;
    }
}