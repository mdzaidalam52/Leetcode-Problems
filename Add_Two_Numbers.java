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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int k = 0;
        ListNode ans = new ListNode();
        ListNode l = ans;
        while(l1 != null || l2 != null){
            if(l1 != null && l2 != null){
                l.val = (k + l1.val + l2.val) % 10;
                k = (k + l1.val + l2.val) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1 == null){
                l.val = (k + l2.val)%10;
                k = (k + l2.val) / 10;
                l2 = l2.next;
            }else{
                l.val = (k + l1.val) % 10;
                k = (k + l1.val) / 10;
                l1 = l1.next;
            }
            if(l1 != null || l2 != null){
                l.next = new ListNode();
                l = l.next;
            }else if(k != 0){
                l.next = new ListNode(k);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam