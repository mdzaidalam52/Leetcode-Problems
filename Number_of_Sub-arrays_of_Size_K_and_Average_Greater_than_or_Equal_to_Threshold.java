class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        threshold *= k;
        int ans = sum >= threshold ? 1 : 0;
        for(int i = k; i < arr.length; i++){
            sum += arr[i] - arr[i-k];
            if(sum >= threshold)
                ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam