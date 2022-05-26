class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] != b[0])
                return a[0] - b[0];
            return b[1] - a[1];
        });
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(envelopes[0][1]);
        int val;
        for(int i = 1; i < envelopes.length; i++){
            val = envelopes[i][1];
            if(arr.get(arr.size() - 1) < val){
                arr.add(val);
                continue;
            }
            if(arr.get(0) >= val){
                arr.set(0, val);
                continue;
            }
            int k = binarySearch(arr, val);
            arr.set(k, val);
        }
        return arr.size();
    }
    
    int binarySearch(ArrayList<Integer> arr, int k){
        int s = 0, e = arr.size() - 1;
        while(s < e){
            int mid = (s+e)/2;
            if(arr.get(mid) < k)
                s = mid+1;
            else
                e = mid;
        }
        return e;
    }
}

// Code by Md Zaid Alam