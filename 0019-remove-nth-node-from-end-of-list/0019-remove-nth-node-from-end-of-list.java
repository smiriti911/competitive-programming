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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if (head == null) return null; 

        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
         if (count == n) {
            return head.next;
        }
        
        int moves=count-n;
        curr=head;
        for(int i=0; i<moves-1; i++){
              curr=curr.next;
        }
        if(curr.next==null){
            curr.next=null;
        }
        curr.next=curr.next.next;
        return head;
        
    }
}