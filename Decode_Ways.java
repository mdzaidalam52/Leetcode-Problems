class Solution {
    public int numDecodings(String s) {        
        int n = s.length();        
        int[] ans = new int[n+1];
        ans[0] = 1;        
        ans[1] = s.charAt(0) == '0' ? 0 : 1;
        for(int i = 2; i <= n; i++){
            int a = Integer.parseInt(s.substring(i-1, i));
            int b = Integer.parseInt(s.substring(i-2, i));
            if(a >= 1)
                ans[i] += ans[i-1];            
            if(b >= 10 && b <= 26)
                ans[i] += ans[i-2];            
        }
        return ans[n];
    }
}

// Code by Md Zaid Alam