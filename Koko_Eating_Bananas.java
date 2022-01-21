class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = 0;
        for(int i: piles) {
        	e = Math.max(i, e);
        }
        while(s < e){
            int mid = (s+e)/2;
            if(check(mid, piles) > h){
                s = mid+1;
            }else{
                e = mid;
            }
        }
        return s;
    }
    
    int check(int mid, int[] a){
        int ans = 0;
        for(int i : a){
            ans += i/mid;
            ans += i%mid == 0 ? 0 : 1;
        }
        return ans;
    }
}

// Code by Md Zaid Alam