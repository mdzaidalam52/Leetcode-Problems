class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != i+1){
                int j = 0;
                for(; arr[j] != i+1; j++){
                    
                }
                swap(arr, j, i);
                l.add(j+1);
                l.add(i+1);
            }
        }
        return l;
    }
    
    void swap(int[] arr, int a, int b){
        int s = 0, e = a;
        while(s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        s = 0;
        e = b;
        while(s < e){
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
}

// Code by Md Zaid Alam