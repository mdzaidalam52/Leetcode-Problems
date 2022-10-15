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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }else if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode a = head, b = head;
        while(b != null && b.next != null){
            b = b.next.next;
            a = a.next;
        }
        a.val = a.next.val;
        a.next = a.next.next;
        return head;
    }
}

// Code by Md Zaid Alam