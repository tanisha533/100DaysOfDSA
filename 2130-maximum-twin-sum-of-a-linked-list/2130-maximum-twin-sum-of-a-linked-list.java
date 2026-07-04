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
    public int pairSum(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head; 

        while(fast!=null && fast.next !=null){
            slow = slow.next; 
            fast = fast.next.next; 
        }

        ListNode prev = null;
        ListNode mid = slow; 
        while(mid != null){
           ListNode forward = mid.next;
            mid.next = prev;
            prev = mid; 
            mid = forward; 
        }

        ListNode i= head; 
        ListNode j = prev; 
        int max_sum = 0; 

        while(j != null){
            int sum = i.val + j.val; 
            max_sum =Math.max(sum, max_sum); 
            j = j.next; 
            i = i.next; 
        }
        return max_sum; 
    }
}