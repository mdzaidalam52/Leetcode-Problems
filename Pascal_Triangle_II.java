class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>(), prev = new ArrayList<>();
        prev.add(1);
        
        for(int i = 0; i < rowIndex; i++){
            ans = new ArrayList<>();
            ans.add(prev.get(0));
            for(int j = 0; j < prev.size()-1; j++){
                ans.add(prev.get(j) + prev.get(j+1));
            }
            ans.add(prev.get(prev.size() - 1));
            prev = ans;
        }
        
        return prev;
    }
}

// Code by Md Zaid Alam