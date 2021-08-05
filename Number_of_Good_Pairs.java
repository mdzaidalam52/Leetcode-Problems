class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(int i : map.keySet()){
            int n = map.get(i);
            ans += (n*(n-1))/2;
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam