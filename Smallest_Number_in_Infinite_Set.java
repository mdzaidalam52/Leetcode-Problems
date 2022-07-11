class SmallestInfiniteSet {
    HashSet<Integer> set;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        for(int i = 1; i <= 1000; i++){
            set.add(i);
        }
    }
    
    public int popSmallest() {
        for(int i = 1; ; i++){
            if(set.contains(i)){
                set.remove(i);
                return i;                
            }                
        }
    }
    
    public void addBack(int num) {
        set.add(num);        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

 // Code by Md Zaid Alam