class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        int mod = 1000000007;
        long ans = 0;
        for(int i = 0; i < arr.length-2; i++){
            int j = i+1, k = arr.length - 1;
            int sum = target - arr[i];
            while(j < k){
                if(arr[j] + arr[k] == sum){
                    if(arr[j] == arr[k]){
                        long count = (k-j+1);
                        j = k+1;
                        ans = (ans + (((count%mod) * ((count - 1)%mod))%mod) / 2)%mod;
                    }else{
                        long a = j, b = k;
                        while(arr[j] == arr[(int)a]){
                            j++;
                        }
                        while(arr[k] == arr[(int)b]){
                            k--;
                        }
                        ans = (ans + (((j - a)%mod)*((b - k)%mod)%mod))%mod;
                    }
                }else if(arr[j] + arr[k] < sum){
                    int a = j;
                    while(j < arr.length && arr[j] == arr[a]) j++;
                }else{
                    int b = k;
                    while(k < arr.length && arr[k] == arr[b]) k--;
                }
            }
        }
        return (int)ans;
    }
}

// Code by Md Zaid Alam