import java.util.Scanner;
public class swap{
   public static void display(int[]a){
    for(int i =0;i<a.length;i++){
        System.out.print(a[i]);
    }
   }
   
    public static void swap(int[]a, int i , int j ){
        int li = i;
        int ri = j ;
        
        int temp = a[li];
        a[li]=a[ri];
        a[ri]=temp;
        
    }
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int[]a= new int[n];
        for(int i =0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        swap(a,0,2);
        display(a);

        
    }
}

//gfg question swap after skipping one index 
// class Solution {
//     public void swapElements(int[] arr) {
//         // Code here
//         for(int i =0;i<arr.length-2;i++){
//         int temp = arr[i];
//         arr[i]=arr[i+2];
//         arr[i+2]=temp;
//         }
//     }
// }