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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        Stack<ListNode> stack = new Stack<>();
        
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        
        ListNode ans = stack.pop();
        ListNode a = ans;
        while(!stack.isEmpty()){
            a.next = stack.pop();
            a = a.next;
        }
        a.next = null;
        return ans;
    }
}

// Code by Md Zaid Alam