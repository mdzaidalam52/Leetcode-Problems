class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0)
            return true;
        int ans = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                continue;
            }else if(i > 0 && flowerbed[i-1] == 1){
                continue;
            }else if(i < flowerbed.length-1 && flowerbed[i+1] == 1){
                continue;
            }
            ans++;
            flowerbed[i] = 1;
        }
        return ans >= n;
    }
}

// Code by Md Zaid Alam