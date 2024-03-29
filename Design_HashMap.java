import java.util.Hashtable;
class MyHashMap {
    
    private Hashtable<Integer, Integer> map;

    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new Hashtable<>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        map.put(key, value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */

 // Code by Md Zaid Alam