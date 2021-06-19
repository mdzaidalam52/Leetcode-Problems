class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        Arrays.parallelSort(nums1);
        Arrays.parallelSort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
                while(i < nums1.length && nums1[i] == nums1[i-1]) i++;
                while(j < nums2.length && nums2[j] == nums2[j-1]) j++;
                
            }else if(nums1[i] < nums2[j]){
                i++;
                while(i < nums1.length && nums1[i] == nums1[i-1]) i++;
            }else{
                j++;
                while(j < nums2.length && nums2[j] == nums2[j-1]) j++;
            }
        }
        int[] ans = new int[list.size()];
        for(i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam