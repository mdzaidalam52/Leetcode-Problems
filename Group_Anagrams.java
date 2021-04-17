class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < strs.length; i++){
            if(set.contains(strs[i])){
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            set.add(strs[i]);
            for(int j = i+1; j < strs.length; j++){
                if(check(strs[i], strs[j])){
                    list.add(strs[j]);
                    set.add(strs[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public boolean check(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i = 0;i < a.length(); i++){
            if(c[i] != d[i]){
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam