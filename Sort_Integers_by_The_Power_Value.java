class Solution {
    HashMap<Integer, Integer> map;
    public int getKth(int lo, int hi, int k) {
        map = new HashMap<>();
        Data[] arr = new Data[hi-lo+1];
        for(int i = lo; i <= hi; i++){
            arr[i- lo] = new Data(i, calc(i));
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a.p != b.p)
                return a.p - b.p;
            return a.num - b.num;
        });
        
        return arr[k-1].num;
    }
    
    int calc(int n){
        if(n == 1){
            return 0;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        map.put(n, calc((n&1) == 0 ? n>>1 : n*3 + 1) + 1);
        return map.get(n);
    }
    
    class Data{
        int num, p;
        Data(int num, int p){
            this.num = num;
            this.p = p;
        }
    }
}

// Code by Md Zaid Alam