class Solution {
    public int minFlips(String target) {
        char[] a = target.toCharArray();
        int ans = a[0] == '1' ? 1 : 0;
        for(int i = 1; i < target.length(); i++){
            if(a[i] != a[i-1])
                ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam