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
    ArrayList<Integer> list;
    Random random;

    public Solution(ListNode head) {
        list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        random = new Random();
    }
    
    public int getRandom() {
        int k = random.nextInt(list.size());
        return list.get(k);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */

 // Code by Md Zaid Alam