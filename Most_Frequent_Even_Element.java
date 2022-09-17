class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = 0, ans = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            if(i%2 == 1)
                continue;
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(max < map.get(i)){
                max = map.get(i);
                ans = i;
            }else if(max == map.get(i)){
                ans = Math.min(ans, i);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam