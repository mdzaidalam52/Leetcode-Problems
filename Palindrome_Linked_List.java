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
    public boolean isPalindrome(ListNode head) {
        int l = 0;
        ListNode h = head;
        Stack<ListNode> st = new Stack<>();
        while(h!= null){
            st.push(h);
            h = h.next;
            l++;
        }
        while(head != null){
            if(st.pop().val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}

// Code by Md Zaid Alam