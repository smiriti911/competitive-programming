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
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=null;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int moves=count/2;
        temp=head;
        ListNode last=null;
        while(moves>0){
            if(moves==1){
                last=temp;
            }
            temp=temp.next;
            moves--;
        }

        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        if (last != null) {
            last.next = prev;
        }

        ListNode pointer1=head;
        ListNode pointer2=prev;
        int max=Integer.MIN_VALUE;

        while(pointer2!=null){
           int num1=pointer1.val;
           int num2=pointer2.val;
           int sum=num1+num2;
           max=Math.max(max, sum);
           pointer2=pointer2.next;
           pointer1=pointer1.next;
        }

        return max;
    }
}