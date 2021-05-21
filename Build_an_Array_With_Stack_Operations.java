class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int ind = 0;
        for(int i = 1; i <= n; i++){
            if(target[ind] == i){
                ind++;
                ans.add("Push");
                if(ind == target.length){
                    break;
                }
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam