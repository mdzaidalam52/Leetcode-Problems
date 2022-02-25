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
    public ListNode sortList(ListNode head) {
        if(head == null)
            return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        while(head != null){
            pq.add(head);
            head = head.next;
        }
        
        ListNode ans = pq.remove();
        head = ans;
        while(!pq.isEmpty()){
            head.next = pq.remove();
            head = head.next;
        }
        head.next = null;
        return ans;
    }
}

// Code by Md Zaid Alam