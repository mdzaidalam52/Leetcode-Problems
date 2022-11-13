class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ans = 0;
        for (int i : costs) {
            if (coins < i) {
                break;
            }
            ans++;
            coins -= i;
        }
        return ans;
    }
}

// Code by Md Zaid Alam