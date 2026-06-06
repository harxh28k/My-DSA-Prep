class Solution {

    public static void swap(int []arr, int x , int z ){

        int temp = arr[x];
        arr[x]=arr[z];
        arr[z]=temp;
    }
    public staic moveZero(int[]arr){
        int i =0;

        for(int j =;j<arr.length;j++){
            if(arr[j]!=0){
                swap(arr, j , i);
                i++;
            }
        }
    }
}