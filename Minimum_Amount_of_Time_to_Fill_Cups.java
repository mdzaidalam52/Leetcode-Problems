class Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[2] >= amount[0] + amount[1])
            return amount[2];
        int ans = 0;
        while(amount[2] > 0){
            amount[2]--;
            amount[1]--;
            ans++;
            Arrays.sort(amount);
        }
        return ans;
    }
}

// Code by Md Zaid Alam