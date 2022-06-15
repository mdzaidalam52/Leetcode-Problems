class Solution {
    public long minimumRemoval(int[] beans) {
        if(beans.length == 1)
            return 0;
        Arrays.sort(beans);
        long l = 0, r = 0;
        long min = Long.MAX_VALUE;
        for(int i: beans)
            l += i;
        l -= beans[beans.length-1];
        min = l;
        for(int i = beans.length-2; i >= 0; i--){
            l -= beans[i];
            r += beans[i + 1];
            long k = beans.length - i - 1;
            min = Math.min(min, l + r - k*beans[i]);
        }
        return min;
    }
}

// Code by Md Zaid Alam