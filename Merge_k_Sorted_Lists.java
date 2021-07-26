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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 0)
            return null;
            
        
        for(int i = 1; i < lists.length; i++){
            lists[0] = merge(lists, 0, i);
        }
        return lists[0];
    }
    
    public ListNode merge(ListNode[] a, int m, int n){
        if(a[m] == null)
            return a[n];
        if(a[n] == null)
            return a[m];
        ListNode head = new ListNode(Math.min(a[m].val, a[n].val));
        ListNode node = head;
        if(a[m].val < a[n].val)
            a[m] = a[m].next;
        else
            a[n] = a[n].next;
        while(a[m] != null && a[n] != null){
            if(a[m].val > a[n].val){
                node.next = new ListNode(a[n].val);
                node =node.next;
                a[n] = a[n].next;
            }else{
                node.next = new ListNode(a[m].val);
                a[m] = a[m].next;
                node = node.next;
            }
        }
        
        while(a[m] != null){
            node.next = new ListNode(a[m].val);
                a[m] = a[m].next;
                node = node.next;
        }
        
        while(a[n] != null){
            node.next = new ListNode(a[n].val);
                a[n] = a[n].next;
                node = node.next;
        }
        return head;
    }
}

// Code by Md Zaid Alam