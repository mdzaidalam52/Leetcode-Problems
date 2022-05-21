class Solution {
    int ans = 0;

    public int maxLength(List<String> arr) {
        boolean[] curr = new boolean[26];
        for (int i = 0; i < arr.size(); i++) {
            if (check(curr, arr.get(i))) {
                ans = Math.max(arr.get(i).length(), ans);
                solve(arr.get(i).length(), i + 1, arr, curr);
                for (char c : arr.get(i).toCharArray())
                    curr[c - 'a'] = false;
            }
        }
        return ans;
    }

    void solve(int length, int ind, List<String> arr, boolean[] curr) {
        if (length > 26)
            return;
        ans = Math.max(length, ans);
        if (ind == arr.size())
            return;
        for (int i = ind; i < arr.size(); i++) {
            if (check(curr, arr.get(i))) {
                length += arr.get(i).length();
                solve(length, i + 1, arr, curr);
                for (char c : arr.get(i).toCharArray()) {
                    curr[c - 'a'] = false;
                }
                length -= arr.get(i).length();
            }
        }
    }

    boolean check(boolean[] vis, String str) {
        boolean[] curr = new boolean[26];
        for (char c : str.toCharArray()) {
            if (vis[c - 'a'] || curr[c - 'a'])
                return false;
            curr[c - 'a'] = true;
        }
        for (char c : str.toCharArray()) {
            vis[c - 'a'] = true;
        }
        return true;
    }

}

// Code by Md Zaid Alam