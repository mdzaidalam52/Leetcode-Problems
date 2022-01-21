class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0, current = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            sum += gas[i] - cost[i];
            current += gas[i] - cost[i];
            if(current < 0){
                ans = i+1;
                current = 0;
            }
        }
        
        if(sum < 0)
            return -1;
        return ans;
        
    }
}

// Code by Md Zaid Alam