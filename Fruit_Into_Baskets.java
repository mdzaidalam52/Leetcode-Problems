class Solution {
    public int totalFruit(int[] a) {
        int ans = 0;
        
        for(int i = 0; i < a.length; ){
            HashSet<Integer> set = new HashSet<>();
            int j = i;
            int max = 0;
            while(j < a.length){
                if(set.contains(a[j])){
                    max++;
                }else if(set.size() < 2){
                    max++;
                    set.add(a[j]);
                }else{
                    break;
                }
                j++;
            }
            if(max > ans){
                ans = max;
            }
            if(max > a.length-j){
                break;
            }
            j = i;
            while(i < a.length && a[i] == a[j])
                i++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam