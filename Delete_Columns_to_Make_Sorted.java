class Solution {
    public int minDeletionSize(String[] strs) {
        int[] arr = new int[strs[0].length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = strs[0].charAt(i);
            
        }
        
        for(int i = 1; i < strs.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] == -1){
                    continue;
                }else if(arr[j] <= strs[i].charAt(j)){
                    arr[j] = strs[i].charAt(j);
                }else{
                    arr[j] = -1;
                }
            }
        }
        int ans = 0;
        for(int val : arr){
            if(val == -1)
                ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam