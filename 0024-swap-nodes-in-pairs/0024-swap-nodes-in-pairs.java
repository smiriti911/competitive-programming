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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy= new ListNode(0, head);
        if(head==null|| head.next==null){
            return head;
        }

        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        for(int i=0; i<2; i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=swapPairs(curr);
        return prev;
        
    }
}