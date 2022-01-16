class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = 0, count = 0;
        boolean firstIndex = true;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                if(firstIndex){
                    ans = count;
                    firstIndex = false;
                }else{
                    ans = Math.max((count&1) != 0 ? (count+1)/2 : count/2, ans);
                }
                count = 0;
            }else{
                count++;
            }
        }
        ans = Math.max(count, ans);
        return ans;
    }
}

// Code by Md Zaid Alam