class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (int i : set1) {
            if (!set2.contains(i)) {
                ans.get(0).add(i);
            }
        }

        for (int i : set2) {
            if (!set1.contains(i)) {
                ans.get(1).add(i);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam