class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < 101; i++){
            arr.add(new ArrayList<>());
        }
        
        for(int i = 0; i < nums.length; i++){
            arr.get(nums[i]).add(i);
        }
        int count = 0;
        int[] ans = new int[nums.length];
        for(int i = 0; i < 101; i++){
            for(int j: arr.get(i)){
                ans[j] = count;
            }
            count += arr.get(i).size();
        }
        return ans;
    }
}

// Code by Md Zaid Alam