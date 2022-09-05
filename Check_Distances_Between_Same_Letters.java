class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] a = new int[26];
        Arrays.fill(a, -1);
        for(int i = 0; i < s.length(); i++){
            int k = s.charAt(i) - 'a';
            if(a[k] == -1){
                a[k] = i;
            }else{
                a[k] = i - a[k] - 1;
            }
        }
        for(int i = 0; i < 26; i++){
            if(a[i] == -1)
                continue;
            if(a[i] != distance[i]){
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam