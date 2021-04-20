class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            set.add(val);
        }
        return (set.size() != nums.length);
    }
}

// Code by Md Zaid Alam