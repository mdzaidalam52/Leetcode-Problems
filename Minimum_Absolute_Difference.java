class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            min = Math.min(arr[i] - arr[i-1], min);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> l = new ArrayList<>();
                l.add(arr[i-1]);
                l.add(arr[i]);
                ans.add(l);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam