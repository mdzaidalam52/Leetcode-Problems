class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        solve(candidates, ans, target, 0, sum);
        return ans;
    }
    void solve(int[] a, List<List<Integer>> ans, int sum, int ind, List<Integer> n){
        if(sum == 0){
            List<Integer> add = new ArrayList<>();
            for(int val : n){
                add.add(val);
            }
            ans.add(add);
            return;
        }else if(sum < 0){
            return;
        }
        for(int i = ind; i < a.length; i++){
            if(a[i] > sum){
                break;
            }
            n.add(a[i]);
            solve(a, ans, sum-a[i], i, n);
            n.remove(n.size() - 1);
        }
        
    }
}

// Code by Md Zaid Alam