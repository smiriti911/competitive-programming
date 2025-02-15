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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[]ans=new ListNode[k];
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        int size=length/k;
        int extra=length%k;
         
        temp=head;
        ListNode prev=temp;
        for(int i=0; i<k; i++){
            ListNode newpart= temp;

            int tempsize=size;
            if(extra>0){
                extra--;
                tempsize++;
            }

            int j=0;
            while(j<tempsize){
                prev=temp;
                temp=temp.next;
                j++;
            }
            if(prev!=null){
                prev.next=null;
            }
            ans[i]=newpart;
        }
        return ans;
    }
}