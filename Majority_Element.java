class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a, map.getOrDefault(a, 0) + 1);
            if(map.get(a) > nums.length/2)
                return a;
        }
        return -1;
    }
}

// Code by Md Zaid Alam
