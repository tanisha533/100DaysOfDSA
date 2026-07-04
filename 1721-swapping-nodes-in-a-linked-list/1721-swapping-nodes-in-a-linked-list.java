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
        ListNode left = head; 
        ListNode right = head; 
        int ct = 0; 

        while(ct < k-1){
            ct++; 
            left = left.next; 
        }

        ListNode temp = left;
        while(temp.next!=null){
            temp=temp.next;
            right=right.next;
        }
        // Swap values
        int tmp = left.val;
        left.val = right.val;
        right.val = tmp;
        return head;
    }
}