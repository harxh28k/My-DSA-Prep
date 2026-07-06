import java.util.Scanner;
public class displayarr{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        dispArr(arr,0);
    }

    public static void dispArr(int arr[] , int idx ){
        if(idx==arr.length){
            return;
        }
        System.out.println(arr[idx]);
        dispArr(arr, idx+1);



    }
}