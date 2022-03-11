/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        while (head != null && head.next != null && head.val == head.next.val) {
            head = remove(head);
        }
        if (head == null)
            return null;
        ListNode prev = head;
        ListNode curr = prev.next;
        while (curr != null) {
            while (curr != null && curr.next != null && curr.val == curr.next.val) {
                curr = remove(curr);
            }
            prev.next = curr;
            prev = curr;
            if (curr != null)
                curr = curr.next;
        }
        return head;
    }

    ListNode remove(ListNode head) {
        int k = head.val;
        while (head != null && head.val == k) {
            head = head.next;
        }
        return head;
    }
}

// Code by Md Zaid Alam