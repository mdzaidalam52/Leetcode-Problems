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
    public int pairSum(ListNode head) {
        ListNode mid = head;
        ListNode a = head;
        while(a.next.next != null){
            mid = mid.next;
            a = a.next.next;
        }
        mid = mid.next;
        Stack<ListNode> st = new Stack<>();
        while(mid != null){
            st.push(mid);
            mid = mid.next;
        }
        int max = 0;
        while(!st.isEmpty()){
            max = Math.max(max, st.pop().val + head.val);
            head = head.next;
        }
        return max;
    }
}

// Code by Md Zaid Alam