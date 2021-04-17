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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans;
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        if(l1.val > l2.val){
            ans = new ListNode(l2.val);
            l2 = l2.next;
        }else{
            ans = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode a = ans;
        
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                ans.next = new ListNode(l2.val);
                ans = ans.next;
                l2 = l2.next;
            }else{
                ans.next = new ListNode(l1.val);
                ans = ans.next;
                l1 = l1.next;
            }
        }
        
        if(l1 == null){
            while(l2 != null){
                ans.next = new ListNode(l2.val);
                ans = ans.next;
                l2 = l2.next;
            }
        }else{
            while(l1 != null){
                ans.next = new ListNode(l1.val);
                ans = ans.next;
                l1 = l1.next;
            }
        }
        return a;
    }
}

// Code by Md Zaid Alam