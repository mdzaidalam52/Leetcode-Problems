class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for(int i: weights){
            sum += i;
            max = Math.max(max, i);
        }
        int s = max, e = sum;
        while(s < e){
            int mid = (s+e)/2;
            if(check(mid, weights, days)){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
    
    boolean check(int s, int[] weights, int days){
        int count = 1;
        int a = s;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] > a){
                count++;
                if(count > days)
                    return false;
                a = s;
                a -= weights[i];
            }else{
                a -= weights[i];
                if(a == 0){
                    count++;
                    if(count > days && weights.length != i+1)
                        return false;
                    a = s;
                }
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam