class Solution {
    final int mod = 1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        long[] a = new long[arr.length];
        Arrays.fill(a, 1);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i]%arr[j] == 0){
                    int k = Arrays.binarySearch(arr, arr[i]/arr[j]);
                    if(k < 0)
                        continue;
                    a[i] = (a[i] + (a[j]*a[k])%mod)%mod;
                }
            }
        }
        long ans = 0;
        for(int i = 0; i < arr.length; i++)
            ans = (ans+a[i])%mod;
        return (int)ans;
    }
}

// Code by Md Zaid Alam