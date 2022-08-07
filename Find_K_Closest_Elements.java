class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int i = Arrays.binarySearch(arr, x);
        if(i < 0){
            i = -i-1;
        }
        int j = i-1;
        while(ans.size() < k && i < arr.length && j >= 0){
            if(Math.abs(arr[i] - x) >= Math.abs(arr[j] - x)){
                ans.add(arr[j--]);
            }else{
                ans.add(arr[i++]);
            }
        }
        while(ans.size() < k && i < arr.length){
            ans.add(arr[i++]);
        }
        
        while(ans.size() < k && j >= 0){
            ans.add(arr[j--]);
        }
        Collections.sort(ans);
        return ans;
    }
}

// Code by Md Zaid Alam