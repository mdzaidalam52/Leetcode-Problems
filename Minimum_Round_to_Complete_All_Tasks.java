class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: tasks){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for(int k: map.keySet()){
            if(map.get(k) == 1)
                return -1;
            ans += map.get(k)/3 + (map.get(k) % 3 == 0 ? 0 : 1);
        }
        return ans;
    }
}

// Code by Md Zaid Alam