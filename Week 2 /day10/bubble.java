import java.util.Scanner;
public class bubble{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int temp;
        for(int i =0;i<arr.length;i++){

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}