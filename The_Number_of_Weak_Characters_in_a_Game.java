class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> {
            if(a[0] != b[0])
                return b[0] - a[0];
            return a[1] - b[1];
        });
        int n = properties.length;
        int max = -1;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(max > properties[i][1])
                ans++;
            else
                max = properties[i][1];
        }
        return ans;
    }
}

// Code by Md Zaid Alam