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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode temp=head;
        ListNode prevHead=new ListNode(0,head);
        ListNode prev=prevHead;
        while(temp!=null&&temp.next!=null){
            if(temp.val==temp.next.val){
               while(temp!=null&&temp.next!=null&&temp.val==temp.next.val){
                temp=temp.next;
               }
               prev.next=temp.next;
            }
            else{
                prev=temp;
                
            }
            temp=temp.next;
        }
        return prevHead.next;
       
    }
}