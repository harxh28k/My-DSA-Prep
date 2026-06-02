import java.util.Scanner;
public class fandl{
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();
        int []arr = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int data = scn.nextInt();

        int lo=0;
        int hi=arr.length-1;
           int fi=-1;
       
        while(lo<=hi){
        
          int m = (lo+hi)/2;
            if(data>arr[m]){
                lo=m+1;
            }
            else if(data<arr[m]){
                hi=m-1;
            }
            else{
             fi=m;;
             hi=m-1;
            }
        }
        System.out.println(fi);

            lo=0;
              hi=arr.length-1;
           int li=-1;
       
        while(lo<=hi){
        
          int m = (lo+hi)/2;
            if(data>arr[m]){
                lo=m+1;
            }
            else if(data<arr[m]){
                hi=m-1;
            }
            else{
             li=m;;
             lo=m+1;
            }
        }
        System.out.println(li);



    }
}


//gfg question 
// class Solution {
//     ArrayList<Integer> find(int arr[], int x) {
//         // code here
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         int lo = 0;
//         int hi = arr.length-1;
//         int fi =-1;
        
//         while(lo<=hi){
//            int mid = (lo+hi)/2;
           
//             if(x>arr[mid]){
//                 lo=mid+1;
//             }
//             else if(x<arr[mid]){
//                 hi=mid-1;
//             }
//             else{
//                 fi=mid;
//                 hi=mid-1;
//             }
//         }
//         ans.add(fi);
        
//         lo = 0;
//         hi = arr.length-1;
//         int li =-1;
        
//         while(lo<=hi){
//            int mid = (lo+hi)/2;
           
//             if(x>arr[mid]){
//                 lo=mid+1;
//             }
//             else if(x<arr[mid]){
//                 hi=mid-1;
//             }
//             else{
//                 li=mid;
//                 lo=mid+1;
//             }
//         }
//         ans.add(li);
//         return ans;
//     }
// }
