import java.util.Scanner;
public class inverse{
   
   
    public static int[] inverse(int[]a){

        int []inv=new int[a.length];
        for(int i =0 ;i<a.length;i++){
            int v = a[i];
            inv[v]= i;
        }
        return inv;

    }
    
     public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []a=new int [n];
        for(int i =0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int []ans = inverse(a);
        for(int i =0 ;i<ans.length;i++){
            System.out.println(ans[i]);
        }    


    }
}