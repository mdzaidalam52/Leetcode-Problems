class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int[] freq = new int[arr.length - map.size() + 2];
        for (int key : map.keySet()) {
            freq[map.get(key)]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] != 0) {
                while (freq[i] > 0 && k > 0) {
                    if (i <= k) {
                        k -= i;
                        freq[i]--;
                    } else {
                        k = 0;
                        break;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            ans += freq[i];
        }
        return ans;
    }
}

// Code by Md Zaid Alam