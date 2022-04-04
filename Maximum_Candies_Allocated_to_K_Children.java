class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for(int i: candies)
            sum += i;
        if(sum < k)
            return 0;
        Arrays.sort(candies);
        long s = 0, e = candies[candies.length-1];
        long ans = 0;
        while(s <= e){
            long mid = (s+e)/2;
            long l = check(candies, mid);
            if(l >= k){
                ans = mid;
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return (int)ans;
    }
    
    long check(int[] a, long mid){
        if(mid == 0)
            mid = 1;
        long ans = 0;
        for(int i: a){
            ans += i/mid;
        }
        return ans;
    }
}

// Code by Md Zaid Alam