class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            
            if(count>1 && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}