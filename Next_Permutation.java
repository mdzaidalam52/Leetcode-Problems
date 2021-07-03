class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0){
            if(nums[i] < nums[i+1]){
                break;
            }
            i--;
        }
        if(i < 0){
            Arrays.sort(nums);
            return;
        }
        int j = i+1;
        while(j < nums.length && nums[j] > nums[i]) j++;
        j--;
        
        swap(nums, i, j);
        sort(nums, i+1);
    }
    
    void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    void sort(int[] nums, int s){
        int[] a = new int[nums.length - s];
        for(int i = 0; i < a.length; i++){
            a[i] = nums[i+s];
        }
        
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            nums[i+s] = a[i];
        }
    }
}

// Code by Md Zaid Alam