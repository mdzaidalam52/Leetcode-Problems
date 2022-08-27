class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] a = arr(n);
        for(int i = 0; i < 31; i++){
            if(Arrays.equals(a, arr(1 << i)))
                return true;
        }
        return false;
    }
    
    int[] arr(int n){
        int[] a = new int[10];
        while(n != 0){
            a[n%10]++;
            n /= 10;
        }
        return a;
    }
}

// Code by Md Zaid Alam