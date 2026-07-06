class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max = arr[0];
        int min = arr[0];
        
        for(int i =1 ;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }
        }
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(min);
        ans.add(max);
        
        return ans;
    }
}
