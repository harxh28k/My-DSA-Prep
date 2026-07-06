import java.util.Scanner;
public class binary{
    public static void main (String[]args){

        int []arr= {10,20,30,40,50,60,70,80,90,100};
        int data = 70;

        int l=0;
        int h=arr.length-1;

       
        while(l<=h){
             int m = (l+h)/2;
            if(data>arr[m]){
                l=m+1;
            }
            else if(data<arr[m]){
                h=m-1;
            }

            else{
                System.out.print(m);
                return;
            }


        }
        System.out.println(-1);

    }
}


//gfg question 
// class Solution {
//     public boolean binarySearch(int[] arr, int k) {
//         // code here
        
//         int l = 0;
//         int h = arr.length-1;
        
//         while(l<=h){
          
//             int m = (l+h)/2;
//             if(k>arr[m]){
//                 l = m+1;
//             }
//             else if(k<arr[m]){
//                 h=m-1;
//             }
//             else{
             
//                 return true;
//             }
//         }
//         return false;
//     }
// }