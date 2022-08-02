class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int ans = 0;
        int count = 0;
        long sum = 0;
        long prevSum = 0;
        long prevCount = 0;
        for(int i: grades){
            count++;
            sum += i;
            if(count > prevCount && prevSum < sum){
                ans++;
                prevCount = count;
                prevSum = sum;
                count = 0;
                sum = 0;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam