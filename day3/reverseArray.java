import java.util.Scanner;
public class reverseArray{
    public static void reverse(int []a){
        int i = 0;
        int j = a.length-1;

        while(i<j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;

        i++;
        j--;
        }
      }
        public static void display(int []a){
            for(int i =0;i<a.length;i++){
                System.out.println(a[i]);
            }

        }


        public static void main(String[]args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int []a=new int [n];
            for(int i =0;i<a.length;i++){
                a[i]=scn.nextInt();
            }

            reverse(a);
            display(a);
        }
    }







// //GFG ques for reverse an array 
// class Solution {
//     public void reverseArray(int arr[]) {
//         // code here
//         int i = 0;
//         int j =arr.length-1;
        
//         while(i<j){
//            int temp =arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
            
//             i++;
//             j--;
//         }
//     }
// }