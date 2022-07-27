class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int[] arr = new int[26];
        boolean bool = false;
        for(char c: suits){
            arr[c-'a']++;
            if(arr[c-'a'] == 5)
                return "Flush";
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r: ranks){
            map.put(r, map.getOrDefault(r, 0) + 1);
            if(map.get(r) == 3)
                return "Three of a Kind";
        }
        
        for(int k: map.keySet()){
            if(map.get(k) == 2)
                return "Pair";
        }
        return "High Card";
        
    }
}

// Code by Md Zaid Alam