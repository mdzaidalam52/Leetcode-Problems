class Solution {
    public int minCost(String s, int[] cost) {
        int current = -1;
        int ans = 0;
        int max = 0;
        int n = s.length();
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                if(current == -1){
                    current = cost[i] + cost[i-1];
                    max = Math.max(cost[i] , cost[i-1]);
                }
                else{
                    current += cost[i];
                    max = Math.max(max, cost[i]);
                }
            }else if(current != -1){
                ans += current - max;
                current = -1;
            }
        }
        if(current != -1)
            ans += current - max;
        return ans;
    }
}

// Code by Md Zaid Alam