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
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode a = head, b = head.next;
        
        while(b != null && b.next != null){
            if(a == b){
                ListNode c = head;
                a = a.next;
                while(c != a){
                    c = c.next;
                    a = a.next;
                }
                return a;
            }
            a = a.next;
            b = b.next.next;
            
        }
        
        
        return null;
    }
}

// Code by Md Zaid Alam