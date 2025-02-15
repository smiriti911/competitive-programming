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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode firstHead=new ListNode(0);
        ListNode first=firstHead;
        ListNode secondHead=new ListNode(0);
        ListNode second=secondHead;

        while(temp!=null){
            int val=temp.val;
            if(val<x){
                first.next=new ListNode(val);
                first=first.next;
            }
            else if(val>=x){
                second.next=new ListNode(val);
                second=second.next;
            }
            temp=temp.next;
        }
        first.next=secondHead.next;
        return firstHead.next;
    }
}