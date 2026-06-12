import java.util.Scanner;
public class maxarray{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr= new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int max = maxArr(arr, 0);
        System.out.println(max);
    }
    public static int maxArr(int []arr , int idx ){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int mosa=maxArr(arr,idx+1);
        if(mosa>arr[idx]){
            return mosa;
        }
        else{
            return arr[idx];
        }
    }
}