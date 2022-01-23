class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            solve(low, high, list, i, i+1);
        }
        Collections.sort(list);
        return list;
    }

    void solve(int low, int high, List<Integer> ans, long current, int ind){
        if(current > high){
            return;
        }
        if(low <= current){
            ans.add((int)current);
        }
        if(ind > 9){
            return;
        }
        solve(low, high, ans, current*10+ind, ind+1);
        return;
    }
}

// Code by Md Zaid Alam