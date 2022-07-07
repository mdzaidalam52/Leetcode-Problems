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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int t = m;
        m = n; 
        n = t;
        int[][] ans = new int[n][m];
        for(int i = 0; i < Math.min(n, m)/2; i++){
            for(int j = i; j < m-i; j++){
                if(head != null){
                    ans[i][j] = head.val;
                    head = head.next;
                }else{
                    ans[i][j] = -1;
                }                
            }
            for(int j = i+1; j < n-i; j++){
                if(head != null){
                    ans[j][m-i-1] = head.val;
                    head = head.next;
                }else{
                    ans[j][m-i-1] = -1;
                }
            }
            for(int j = m-i-2; j >= i; j--){
                if(head != null){
                    ans[n-i-1][j] = head.val;
                    head = head.next;
                }else{
                    ans[n-i-1][j] = -1;
                }
            }
            for(int j = n-i-2; j > i; j--){
                if(head != null){
                    ans[j][i] = head.val;
                    head = head.next;
                }else{
                    ans[j][i] = -1;
                }
            }
        }
        if(Math.min(n, m)%2 == 1){
            int k = Math.min(n, m)/2;
            for(int j = k; j < m-k; j++){
                if(head != null){
                    ans[k][j] = head.val;
                    head = head.next;
                }else{
                    ans[k][j] = -1;
                }
            }
            for(int j = k+1; j < n-k; j++){
                if(head != null){
                    ans[j][m-k-1] = head.val;
                    head = head.next;
                }else{
                    ans[j][m-k-1] = -1;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam