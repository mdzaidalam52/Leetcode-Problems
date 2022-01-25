class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] left = new int[n];
        int count = boxes.charAt(0) - '0';
        for(int i = 1; i < n; i++){
            left[i] += left[i-1] + count;
            count += boxes.charAt(i) - '0';
        }
        int[] right = new int[n];
        count = boxes.charAt(n-1) - '0'; 
        for(int i = n-2; i >= 0; i--){
            right[i] += right[i+1] + count;
            left[i] += right[i];
            count += boxes.charAt(i) - '0';
        }
        
        return left;
    }
}

// Code by Md Zaid Alam