class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] ind = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ind[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int e = -1, start = 0;
        for (int i = 0; i < n; i++) {
            if (e < i) {
                start = i;
                e = ind[s.charAt(i) - 'a'];
            }
            if (i == e) {
                ans.add(e - start + 1);
            } else {
                e = Math.max(e, ind[s.charAt(i) - 'a']);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam