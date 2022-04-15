class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        ArrayList<Data> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            arr.add(new Data(nums[i], i, map(mapping, nums[i])));
        }
        Collections.sort(arr, (a, b) -> {
            if(a.val != b.val)
                return a.val - b.val;
            return a.ind - b.ind;
        });
        
        int[] ans = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            ans[i] = arr.get(i).num;
        }
        return ans;
    }
    
    int map(int[] mapping, int n){
        int k = 1;
        int ans = 0;
        if(n == 0)
            return mapping[0];
        while(n != 0){
            ans += k*mapping[n%10];
            k *= 10;
            n /= 10;
        }
        return ans;
    }
    
    class Data{
        int num, val, ind;
        Data(int num, int ind, int val){
            this.num = num;
            this.ind = ind;
            this.val = val;
        }
    }
}

// Code by Md Zaid Alam