class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;
        for(int i: nums){
            if(i <= b)
                b = i;
            else if(i <= a)
                a = i;
            else
                return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam