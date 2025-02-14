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

//  class Solution{
//     public ListNode middleNode(ListNode head){
//         ListNode fast= head;
//         ListNode slow=head;
//         while(fast!=null && fast.next!=null){
//             fast= fast.next.next;
//             slow= slow.next;
//         }
//         return slow;
//     }
// }
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp= head;
        ListNode mid= head;
       while(temp!=null && temp.next!=null){
        temp=temp.next.next;
        mid=mid.next;
       }
       return mid;
        
    }
}
