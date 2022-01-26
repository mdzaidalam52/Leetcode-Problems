class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int s = 0;
        int e = arr.length - 1;
        while(s + 1 < arr.length - 1 && arr[s] < arr[s + 1]) s++;
        while(e - 1 > 0 && arr[e] < arr[e - 1]) e--;
        return s == e;
    }
}

// Code by Md Zaid Alam