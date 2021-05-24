class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long a = 0;
        List<Boolean> ans = new ArrayList<>();
        for(int val : nums){
            a = a << 1;
            a += val;
            ans.add(a%5 == 0);
            a = a%10;
        }
        return ans;
    }
}

// Code by Md Zaid Alam