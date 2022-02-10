class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        ArrayList<Data> d = new ArrayList<>();
        for(int k: map.keySet()){
            d.add(new Data(k, map.get(k)));
        }
        Collections.sort(d, (a, b) -> b.ind - a.ind);
        int n = arr.length;
        int count = 0;
        while(n > arr.length/2){
            n -= d.get(count).ind;
            count++;
        }
        return count;
    }
    class Data{
        int val, ind;
        Data(int val, int ind){
            this.val = val;
            this.ind = ind;
        }
    }
}

// Code by Md Zaid Alam