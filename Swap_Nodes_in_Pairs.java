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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
        return head;
    }
    
    ListNode previous = head;
    ListNode current = previous.next;
    
    while(current.next != null && current.next.next != null){
        int temp = previous.val;
        previous.val = current.val;
        current.val = temp;
        previous = current.next;
        current = previous.next;
    }
    
    int temp = previous.val;
    previous.val = current.val;
    current.val = temp;

    return head;
    }
}

// Code by Md Zaid Alam