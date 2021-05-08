/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode a = head;
        ListNode b = head.next;
        while(b != null && b.next != null){
            if(a == b){
                return true;
            }
            a = a.next;
            b = b.next.next;
        }
        return false;
    }
}

// Code by Md Zaid Alam