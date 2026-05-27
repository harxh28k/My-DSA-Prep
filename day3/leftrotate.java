
import java.util.Scanner;
//gfg rotate arry left by d 
class Solution {
   static void reverse(int []arr,int i , int j ){
    int   li=i;
    int  ri =j;
    
    while(li<ri){
        int temp =arr[li];
        arr[li]=arr[ri];
        arr[ri]=temp;
        
        li++;
        ri--;
        
    }
       
   }
   
   static void rotateArr(int arr[], int d) {
        // code here
        d = d%arr.length;
        if(d<0){
            d=d+arr.length;
        }
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        
    }
}



