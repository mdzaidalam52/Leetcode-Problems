class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] arr = new char[s.length() + spaces.length];
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(k < spaces.length && spaces[k] == i){
                arr[i+k] = ' ';
                k++;
            }
            arr[i+k] = s.charAt(i);
        }
        return new String(arr);
    }
}

// Code by Md Zaid Alam