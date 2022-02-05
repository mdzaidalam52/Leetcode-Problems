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
    public ListNode swapNodes(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();
        int ind = 1;
        ListNode h = head;
        ListNode a = head;
        while(head != null){
            if(ind == k){
                a = head;
            }
            st.push(head);
            head = head.next;
            ind++;
        }
        for(int i = 1; i < k; i++){
            st.pop();
        }
        int t = st.peek().val;
        st.peek().val = a.val;
        a.val = t;
        return h;
    }
}

// Code by Md Zaid Alam