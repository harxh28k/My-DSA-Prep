import java.util.Scanner;

public class subarray{
    public static void main (String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr= new int [n];

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        for(int i =0 ;i<arr.length;i++){
            for(int j =i ;j<arr.length;j++){
                for(int k=i;k<=j;k++){

                    System.out.print(arr[k]+"\t");
                }
                            System.out.println();

            }
        }

        
      }
}



//gfg question make subarray of an array and store it in arraylists 
// class Solution {
//     public List<List<Integer>> getSubArrays(int[] arr) {
//         // code here
//         List<List<Integer>> ans = new ArrayList<>();
//         for(int i =0 ;i<arr.length;i++){
//             for(int j=i;j<arr.length;j++){
//                  List<Integer> sub = new ArrayList<>();
//                 for(int k=i;k<=j;k++){
                    
//                     sub.add(arr[k]);
//                 }
//                 ans.add(sub);
//             }
//         }
//         return ans;
//     }
// } 