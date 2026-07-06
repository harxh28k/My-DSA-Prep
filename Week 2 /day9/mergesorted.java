import java.util.Scanner;
public class mergesorted{
   
   public static void display(int[]res){
    for(int i =0;i<res.length;i++){
        System.out.println(res[i]);
    }
   }
   
    public static int[] merge(int[]a,int[]b){

        int[]res = new int[a.length+b.length];
        int i =0;
        int j=0;
        int k =0;
        
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]= a[i];
                i++;
                k++;
            }
            else{
                res[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
             res[k]=a[i];
                i++;
                k++;
        }
        while(j<b.length){
                res[k]=b[j];
                j++;
                k++;
        }
        return res;






    }
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n1 = scn.nextInt();
        int []a= new int[n1];
        for(int i =0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int n2 = scn.nextInt();
        int []b= new int[n2];
        for(int i =0;i<b.length;i++){
            b[i]=scn.nextInt();
        }

        
       
        int[] res = merge(a,b);
        display(res);
    }
}