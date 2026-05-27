Search element in an array 
public class search{
    public static void main (String []args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       
        int []arr = new int [n];
        for(int i = 0 ;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
         int k = scn.nextInt();
           int idx=-1;
        for(int i =0;i<arr.length;i++){
          
            if (k==arr[i]){
             
                idx=i;
                break;
                
            }
            
            }
             System.out.println("The index is :"+idx);
    }
}
//GFG question 
// //class Solution {
//     public int search(int arr[], int x) {
//         // code here
       
//         for(int i = 0 ;i<arr.length;i++){
//             if(x==arr[i]){
//                 return i ;
                
//             }
//         }
//         return -1;
            
//         }
        
//     }
  