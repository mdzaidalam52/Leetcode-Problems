class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        ArrayList<int[]> arr = new ArrayList<>();
        int n = intervals.length;
        for(int i = 0; i < n; i++){
            boolean bool = true;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j)[0] <= intervals[i][0] && intervals[i][1] <= arr.get(j)[1]){
                    bool = false;
                    break;
                }else if(arr.get(j)[0] >= intervals[i][0] && intervals[i][1] >= arr.get(j)[1]){
                    arr.remove(j);
                    j--;
                }
            }
            if(bool){
                arr.add(intervals[i]);
            }
        }
        
        return arr.size();
    }
}

// Code by Md Zaid Alam