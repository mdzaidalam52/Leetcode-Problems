class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, ArrayList<Integer>> set = new HashMap<>();
        for(int i = 0; i < cards.length; i++){
            if(!set.containsKey(cards[i])){
                set.put(cards[i], new ArrayList<>());
            }
            set.get(cards[i]).add(i);
        }
        int ans = Integer.MAX_VALUE;
        for(int keys: set.keySet()){
            for(int i = 0; i < set.get(keys).size()-1; i++){
                ans = Math.min(ans, set.get(keys).get(i+1) - set.get(keys).get(i) + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

// Code by Md Zaid Alam