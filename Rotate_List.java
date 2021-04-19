/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        Queue<Integer> q = new LinkedList<>();
        ListNode n = head;
        int size = 0;
        while(n != null){
            size++;
            n = n.next;
        }
        if(size == 0){
            return head;
        }
        k = k%size;
        n = head;
        for(int i = 0; i < k; i++){
            q.add(n.val);
            n = n.next;
        }
        while(n != null){
            q.add(n.val);
            n.val = q.remove();
            n = n.next;
        }
        n = head;
        for(int i = 0; i < k; i++){
            n.val = q.remove();
            n = n.next;
        }
        return head;
    }
}

// Code by Md Zaid Alam