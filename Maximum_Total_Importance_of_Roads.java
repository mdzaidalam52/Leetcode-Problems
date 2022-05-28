class Solution {
    public long maximumImportance(int n, int[][] roads) {
        ArrayList<Data> arr = new ArrayList<>();
        int[] a = new int[n];
        for(int i = 0; i < roads.length; i++){
            a[roads[i][0]]++;
            a[roads[i][1]]++;
        }
        
        for(int i = 0; i < n; i++){
            arr.add(new Data(i, a[i]));
        }
        Collections.sort(arr, (b, c) -> c.freq-b.freq);
        long[] values = new long[n];
        int val = n;
        for(int i = 0; i < n; i++){
            values[arr.get(i).val] = val;
            val--;
        }
        
        long ans = 0;
        for(int i = 0; i < roads.length; i++){
            ans += values[roads[i][0]] + values[roads[i][1]];
        }
        
        return ans;
    }
    
    class Data{
        int val, freq;
        Data(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
    }
}

// Code by Md Zaid Alam