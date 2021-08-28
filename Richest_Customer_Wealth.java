class Solution {
    public int maximumWealth(int[][] accounts) {
        int total = 0, max = Integer.MIN_VALUE;
        
        for(int[] a: accounts){
            total = 0;
            for(int i : a){
                total += i;
            }
            max = Math.max(total, max);
        }
        return max;
    }
}

// Code by Md Zaid Alam