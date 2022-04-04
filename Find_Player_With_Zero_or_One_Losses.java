class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            if (!map.containsKey(matches[i][0]))
                map.put(matches[i][0], 0);
            map.put(matches[i][1], map.getOrDefault(matches[i][1], 0) + 1);
        }
        for (int k : map.keySet()) {
            if (map.get(k) < 2) {
                ans.get(map.get(k)).add(k);
            }
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }
}

// Code by Md Zaid Alam