class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < operations.length; i++){
            map.put(operations[i][1], map.get(operations[i][0]));
            map.remove(operations[i][0]);
        }
        for(int k: map.keySet()){
            nums[map.get(k)] = k;
        }
        return nums;
    }
}

// Code by Md Zaid Alam