class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0], e = nums[0];
        do {
            s = nums[s];
            e = nums[nums[e]];
        } while (s != e);

        s = nums[0];

        while (s != e) {
            s = nums[s];
            e = nums[e];
        }

        return e;
    }
}

// Code by Md Zaid Alam