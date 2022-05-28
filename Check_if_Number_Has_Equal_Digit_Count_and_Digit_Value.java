class Solution {
    public boolean digitCount(String num) {
        int[] a = new int[10];
        
        for(char c: num.toCharArray()){
            a[c-'0']++;
        }
        for(int i = 0; i < num.length(); i++){
            if(a[i] != num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam