class Solution {
    public int findComplement(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(num > 0){
            arr.add((num&1));
            num = num >> 1;
        }
        int ans = 0;
        for(int i = arr.size() - 1; i >= 0; i--){
            ans = ans << 1;
            ans += (1 - arr.get(i));
        }
        return ans;
    }
}