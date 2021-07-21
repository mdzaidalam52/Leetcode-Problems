class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] a = new int[256];
        for(int i = 0; i < jewels.length(); i++){
            a[jewels.charAt(i)] = 1;
        }
        int ans = 0;
        for(int i = 0; i < stones.length(); i++){
            ans += a[stones.charAt(i)];
        }
        return ans;
    }
}

// Code by Md Zaid Alam