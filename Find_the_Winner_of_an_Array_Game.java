class Solution {
    public int getWinner(int[] arr, int k) {
        int maxInd = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[maxInd] < arr[i])
                maxInd = i;
        }
        if(k >= maxInd)
            return arr[maxInd];
        int a = 0, b = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(true){
            if(a == maxInd || b == maxInd)
                return arr[maxInd];
            int c = Math.max(a, b)+1;
            int d = arr[a] > arr[b] ? a: b;
            map.put(arr[d], map.getOrDefault(arr[d], 0)+1);
            if(map.get(arr[d]) == k)
                return arr[d];
            a = c;
            b = d;
        }
    }
}

// Code by Md Zaid Alam