import java.util.Scanner;
public class displayrevarr{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        dispRevArr(arr,0);
    }

    public static void dispRevArr(int arr[] , int idx ){
        if(idx==arr.length){
            return;
        }

        dispRevArr(arr,idx+1);
        System.out.println(arr[idx]);


    }
}