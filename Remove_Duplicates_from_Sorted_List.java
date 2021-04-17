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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        while(head.next != null && head.val == head.next.val){
            head.next = head.next.next;
        }
        if(head.next != null)
            deleteDuplicates(head.next);
        return head;
    }
}

// Code by Md Zaid Alam