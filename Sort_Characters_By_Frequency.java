class Solution {
    public String frequencySort(String s) {
        int[] a = new int[128];
        for(char c: s.toCharArray()){
            a[c]++;
        }
        ArrayList<Data> arr = new ArrayList<>();
        for(int i = 0; i < 128; i++){
            if(a[i] > 0){
                arr.add(new Data((char)i, a[i]));
            }
        }
        Collections.sort(arr, (b, c) -> c.freq - b.freq);
        StringBuilder ans = new StringBuilder();
        for(Data d: arr){
            for(int i = 0; i < d.freq; i++){
                ans.append(d.val);
            }
        }
        return ans.toString();
    }
    class Data{
        char val;
        int freq;
        Data(char val, int freq){
            this.val = val;
            this.freq = freq;
        }
    }
}

// Code by Md Zaid Alam