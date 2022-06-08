class TextEditor {
    Node head;
    Node current;
    public TextEditor() {
        head = new Node();
        current = head;
    }
    
    public void addText(String text) {
        for(char c: text.toCharArray()){
            Node n = new Node();
            n.c = c;
            n.next = current.next;
            current.next = n;
            n.prev = current;
            current = n;
            if(n.next != null)
                n.next.prev = n;
        }        
    }
    
    public int deleteText(int k) {
        int ans = 0;
        Node n = current.next;
        while(k-- > 0 && current != head){
            current = current.prev;
            ans++;
        }
        current.next = n;
        if(n != null)
            n.prev = current;
        return ans;
    }
    
    public String cursorLeft(int k) {
        while(k-- > 0 && current != head){
            current = current.prev;
        }
        return get();
    }
    
    public String cursorRight(int k) {
        while(k-- > 0 && current.next != null){
            current = current.next;
        }
        return get();
    }
    
    private String get(){
        Stack<Character> st = new Stack<>();
        Node n = current;
        for(int i = 0; i < 10 && n != head; i++){
            st.push(n.c);
            n = n.prev;
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        return str.toString();
    }
    
    class Node{
        char c;
        Node next;
        Node prev;
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */

// Code by Md Zaid Alam