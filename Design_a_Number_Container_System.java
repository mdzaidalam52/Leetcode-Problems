class NumberContainers {
    HashMap<Integer, Integer> min;
    HashMap<Integer, Integer> ind;
    HashMap<Integer, HashSet<Integer>> map;
    public NumberContainers() {
        map = new HashMap<>();
        min = new HashMap<>();
        ind = new HashMap<>();
        
    }
    
    public void change(int index, int number) {
        if(ind.containsKey(index) && ind.get(index) != number){
            remove(index);
        }else if(ind.containsKey(index)){
            return;
        }
        if(min.containsKey(number)){
            min.put(number, Math.min(min.get(number), index));
            map.get(number).add(index);
        }else{
            min.put(number, index);
            map.put(number, new HashSet<>());
            map.get(number).add(index);
        }
        ind.put(index, number);
    }
    
    public int find(int number) {
        return min.getOrDefault(number, -1);
    }
    
    public void remove(int index){
        int k = ind.get(index);
        if(min.get(k) == index){
            int least = Integer.MAX_VALUE;
            for(int i: map.get(k)){
                if(i != index)
                    least = Math.min(least, i);
            }
            if(least == Integer.MAX_VALUE){
                min.remove(k);
            }else{
                min.put(k, least);
            }
        }
        map.get(k).remove(index);
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */

 // Code by Md Zaid Alam