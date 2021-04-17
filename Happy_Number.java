class Solution {
    public boolean isHappy(int n) {
        int a = 0;
        while(n > 0){
            a += (n%10)*(n%10);
            n = n/10;
        }
        HashSet<Integer> set = new HashSet<>();
        
        if(a == 1){
            return true;
        }else if(a == n){
            return false;
        }else{
            set.add(n);
            set.add(a);
            return isHappier(a, set);
        }
    }
    
    boolean isHappier(int n, HashSet<Integer> set){
        int a = 0;
        
         while(n > 0){
            a += (n%10)*(n%10);
            n = n/10;
        }
         if(a == 1){
            return true;
        }else if(set.contains(a)){
            return false;
        }else{
            set.add(a);
            return isHappier(a, set);
        }
    }
}

// Code by Md Zaid Alam