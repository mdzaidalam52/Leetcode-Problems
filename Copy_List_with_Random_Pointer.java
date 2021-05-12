/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        
        Node a = head;
        
        while(a != null){
            Node n = new Node(a.val);
            n.next = a.next;
            a.next = n;
            a = n.next;
        }
        
        a = head;
        while(a != null){
            if(a.random != null)
                a.next.random = a.random.next;
            
            a = a.next.next;
        }
        
        a = head;
        Node ans = head.next;
        Node l = ans;
        while(a != null){
            a.next = a.next.next;
            if(l.next != null)
                l.next = l.next.next;
            a = a.next;
            l = l.next;
        }
        return ans;
    }
}

// Code by Md Zaid Alam