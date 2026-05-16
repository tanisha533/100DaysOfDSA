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
    public ListNode rotateRight(ListNode head, int k) {
         int size=1;
           if (head == null || head.next == null || k == 0)       return head;
         ListNode temp=head;
       
         while(temp.next != null){
            size++;
            temp=temp.next;}
         
            temp.next = head;
            k = k % size;
         
        ListNode current=head;
        for(int i = 0; i < (size - k - 1); i++) {
        current = current.next;
         }
         ListNode newHead = current.next;
         current.next = null;
         return newHead;
         
    }
}