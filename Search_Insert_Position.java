class Solution {
    public int searchInsert(int[] nums, int target) {
        return bSearch(nums, 0, nums.length - 1, target);
    }
    
    int bSearch(int[] a, int s, int e, int x){
        if(s == e){
            if(a[s] >= x){
                return s;
            }else{
                return s+1;
            }
        }else{
            if(a[s] > x){
                return s;
            }
            if(a[e] < x){
                return e+1;
            }
            if(a[s] == x){
                return s;
            }else if(a[e] == x){
                return e;
            }else if(e - s == 1){
                return e;
            }else{
                int mid = (s+e)/2;
                if(a[mid] < x){
                    return bSearch(a, mid, e, x);
                }else{
                    return bSearch(a, s, mid, x);
                }
            }
        }
    }
}

// Code by Md Zaid Alam