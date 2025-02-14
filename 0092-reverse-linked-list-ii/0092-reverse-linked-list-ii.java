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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;

        ListNode mainHead = new ListNode(0, head);  
        ListNode prev = mainHead;
        ListNode next = null;

        // Move `prev` to the node just before `left`
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode newEnd = curr; // This node will be the end of the reversed part
        ListNode last=prev;
        // Reverse the sublist
        for (int i = left; i <= right; i++) {  // Fixed the loop range
            next = curr.next;
            curr.next = prev;  // Attach `curr` to the reversed part
            prev = curr;       // Move `prev` forward
            curr = next;            // Move `curr` forward
        }

        // Connect the reversed part with the remaining list
        last.next=prev;
        newEnd.next = curr;  

        return mainHead.next; // Return the modified list
    }
}
