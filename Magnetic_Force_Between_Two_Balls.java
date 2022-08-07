class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s = 0, e = position[position.length-1];
        int ans = 0;
        int mid = s + (e-s)/2;
        while(s < e){
            if(check(position, mid, m)){
                ans = mid;
                s = mid+1;
            }else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return ans;
    }
    
    boolean check(int[] a, int mid, int m){
        int num = 1;
        int d = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] - d >= mid){
                num++;
                if(num == m)    
                    return true;
                d = a[i];
            }
        }
        return false;
    }
}

// Code by Md Zaid Alam