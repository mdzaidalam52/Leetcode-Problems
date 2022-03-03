/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null)
            return null;
        return solve(head).first;
    }

    Data solve(Node head) {
        Node current = head;
        Data ans = new Data(head, current);
        while (current != null) {
            if (current.child != null) {
                Data data = solve(current.child);
                current.child = null;
                if (current.next != null)
                    current.next.prev = data.last;
                data.last.next = current.next;
                current.next = data.first;
                data.first.prev = current;
                ans.last = data.last;
                current = data.last.next;
            } else {
                ans.last = current;
                current = current.next;
            }
        }
        return ans;
    }

    class Data {
        Node first, last;

        Data(Node f, Node l) {
            first = f;
            last = l;
        }
    }
}

// Code by Md Zaid Alam