class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = (total/cost2)+1;
        total -= cost1;
        while(total >= 0){
            ans += (total/cost2)+1;
            total -= cost1;
        }
        return ans;
    }
}

// Code by Md Zaid Alam