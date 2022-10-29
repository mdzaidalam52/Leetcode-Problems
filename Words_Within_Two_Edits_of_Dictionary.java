class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            for (String str : dictionary) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (queries[i].charAt(j) != str.charAt(j)) {
                        count++;
                        if (count > 2) {
                            break;
                        }
                    }
                }
                if (count <= 2) {
                    ans.add(queries[i]);
                    break;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam