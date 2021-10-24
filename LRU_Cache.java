class LRUCache {

    int cap;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head, tail;
    
    public LRUCache(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        map = new HashMap<>();
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            forward(map.get(key));
            return map.get(key).value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
            map.put(key, new Node(key, value));
            add(map.get(key));
        }else if(cap == 0){
            remove();
            map.put(key, new Node(key, value));
            add(map.get(key));
        }else{
            cap--;
            map.put(key, new Node(key, value));
            add(map.get(key));
        }
    }
    
    private void add(Node n){
        n.next = head.next;
        n.next.prev = n;
        head.next = n;
        n.prev = head;
    }
    
    private void remove(){
        int k = tail.prev.key;
        map.remove(k);
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }
    
    private void remove(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    
    private void forward(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
        add(n);
    }
    
    private class Node{
        int key, value;
        Node prev, next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */