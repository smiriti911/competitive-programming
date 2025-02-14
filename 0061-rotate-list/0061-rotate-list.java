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

        ListNode temp=head;
        int length=1;
        if(head==null||head.next==null||k==0){
            return head;
        }

        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
        k=k%length;
        k=length-k;
        while(k>0){
            temp=temp.next;
            k--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}