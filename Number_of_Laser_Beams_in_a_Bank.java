class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, current = 0, ans = 0;
        for(String str: bank){
            for(char c: str.toCharArray()){
                current += (c == '1') ? 1 : 0;
            }
            if(current > 0){
                ans += current * prev;
                prev = current;
                current = 0;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam