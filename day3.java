
import java.util.Scanner;


//roatate an array by k 
public class day3{
    public static void display(int[]a){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
     public static void reverse(int []a,int i, int j ){

        int li = i;
        int ri = j;
         
        while(li<ri){
            int temp = a[li];
            a[li]=a[ri];
            a[ri]=temp;

            li++;
            ri--;
        }

    }
        public static void rotate(int []a,int k ){

            k = k%a.length;
            if(k<0){
                k = k+a.length;
            }
            //part 1 
            reverse(a,0,a.length-k-1);
            reverse(a,a.length-k,a.length-1);
            reverse(a,0,a.length-1);
        }

   
    
     public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int []a=new int [n];
        for(int i =0 ;i<a.length;i++){
            a[i]=scn.nextInt();
        }

       

        rotate(a,2);
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






// // Sum of 2 array 
// public class day3 {
//     public static void main (String[]args ){
//         Scanner scn = new Scanner(System.in);
//         int n1 = scn.nextInt();
//         int []a1= new int [n1];
//         for(int i=0;i<a1.length;i++){
//             a1[i]=scn.nextInt();
//         }
//          int n2 = scn.nextInt();
//         int []a2= new int [n2];
//         for(int i=0;i<a2.length;i++){
//             a2[i]=scn.nextInt();
//         }

//         int []sum = new int [n1>n2?n1:n2];
//         int c = 0;
//         int i = a1.length-1;
//         int j = a2.length-1;
//         int k  =sum.length-1;

        
//         while(k>=0){
//             int d =c ;
//             if(i>=0){
//                 d+=a1[i];
//             }

//             if(j>=0){
//                 d+=a2[j];
            
//             }

//             c = d/10;
//             d=d%10;

//             sum[k]=d;

//             i--;
//             j--;
//             k--;

//         } 
//         if(c!=0){
//             System.out.print(c);
//         }
//         for(int val:sum){
//             System.out.print(val);
//         }
//     }
// }

// GFG question sum of 2 array 

// class Solution {

//     String calc_Sum(int arr1[], int arr2[]) {
//       int   n1=arr1.length;
//       int   n2=arr2.length;
//     int []sum= new int [n1>n2?n1:n2];
//     int c = 0;
    
//     int i = arr1.length-1;
//     int j = arr2.length-1;
//     int k = sum.length-1;
    
//     while (k>=0){
//         int d =c ;
//         if(i>=0){
//             d+=arr1[i];
//         }
//         if(j>=0){
//             d+=arr2[j];
//         }
        
//         c = d/10;
//         d=d%10;
        
//         sum[k]=d;
        
//         i--;
//         j--;
//         k--;
        
//     }
    
//     String ans = "";
    
//     if(c!=0){
//         ans+=c;
//     }
    
//     for(int x :sum ){
//         ans+=x;
//     }
    
//     return ans ;
//     }
// }


//Search element in an array 
// public class day3{
//     public static void main (String []args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
       
//         int []arr = new int [n];
//         for(int i = 0 ;i<arr.length;i++){
//             arr[i]=scn.nextInt();
//         }
//          int k = scn.nextInt();
//            int idx=-1;
//         for(int i =0;i<arr.length;i++){
          
//             if (k==arr[i]){
             
//                 idx=i;
//                 break;
                
//             }
            
//             }
//              System.out.println("The index is :"+idx);
//     }
// }
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
  

