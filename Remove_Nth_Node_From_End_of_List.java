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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Stack<ListNode> st = new Stack<>();
        ListNode h = head;
        while(head != null){
            st.push(head);
            head = head.next;
        }
        for(int i = 0; i < n; i++){
            st.pop();
        }
        if(st.isEmpty()){
            return h.next;
        }
        st.peek().next = st.peek().next.next;
        return h;
    }
}

// Code by Md Zaid Alam