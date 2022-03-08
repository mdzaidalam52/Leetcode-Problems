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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        Stack<Integer> st = new Stack<>(), s1 = new Stack<>(), s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int a = s1.isEmpty() ? 0 : s1.pop();
            int b = s2.isEmpty() ? 0 : s2.pop();
            st.push((a + b + carry) % 10);
            carry = (a + b + carry) / 10;
        }

        if (carry != 0) {
            st.push(carry);
        }

        ListNode head = new ListNode(st.pop());
        ListNode curr = head;

        while (!st.isEmpty()) {
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }

        return head;

    }
}

// Code by Md Zaid AlamDe