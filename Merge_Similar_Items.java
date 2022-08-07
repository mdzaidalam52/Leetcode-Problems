class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(items1, (a, b) -> a[0] - b[0]);
        Arrays.sort(items2, (a, b) -> a[0] - b[0]);
        int i = 0, j = 0;
        while(i < items1.length && j < items2.length){
            ans.add(new ArrayList<>());
            if(items1[i][0] == items2[j][0]){
                ans.get(ans.size() - 1).add(items1[i][0]);
                ans.get(ans.size() - 1).add(items1[i][1] + items2[j][1]);
                i++;
                j++;
            }else if(items1[i][0] > items2[j][0]){
                ans.get(ans.size() - 1).add(items2[j][0]);
                ans.get(ans.size() - 1).add(items2[j][1]);
                j++;
            }else{
                
                ans.get(ans.size() - 1).add(items1[i][0]);
                ans.get(ans.size() - 1).add(items1[i][1]);
                i++;
            }
        }
        
        while(i < items1.length){
            
            ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(items1[i][0]);
            ans.get(ans.size() - 1).add(items1[i][1]);
            i++;
        }
        while(j < items2.length){
            
            ans.add(new ArrayList<>());
            ans.get(ans.size() - 1).add(items2[j][0]);
            ans.get(ans.size() - 1).add(items2[j][1]);
            j++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam