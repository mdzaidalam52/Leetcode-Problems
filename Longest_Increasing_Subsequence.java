class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > arr.get(arr.size() - 1)){
                arr.add(nums[i]);
                continue;
            }
            if(nums[i] <= arr.get(0)){
                arr.set(0, nums[i]);
                continue;
            }
            int k = binarySearch(arr, nums[i]);
            arr.set(k, nums[i]);
        }
        return arr.size();
    }
    
    int binarySearch(ArrayList<Integer> arr, int k){
        int s = 0, e = arr.size() - 1;
        while(s < e){
            int mid = (s+e)/2;
            if(arr.get(mid) < k)
                s = mid+1;
            else
                e = mid;
        }
        return e;
    }
}

// Code by Md Zaid Alam