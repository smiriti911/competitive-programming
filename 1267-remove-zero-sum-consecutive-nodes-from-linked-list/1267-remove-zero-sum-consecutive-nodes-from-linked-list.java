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
    public ListNode removeZeroSumSublists(ListNode head) {
         ListNode dummy = new ListNode(0, head);
        HashMap<Integer, ListNode> map = new HashMap<>();
        int prefixSum = 0;
        ListNode temp = dummy;

        // First pass: Store prefix sum and node reference
        while (temp != null) {
            prefixSum += temp.val;
            map.put(prefixSum, temp); // Store the latest occurrence of the sum
            temp = temp.next;
        }

        // Second pass: Remove zero-sum sublists
        prefixSum = 0;
        temp = dummy;
        while (temp != null) {
            prefixSum += temp.val;
            temp.next = map.get(prefixSum).next; // Skip zero-sum sublist
            temp = temp.next;
        }

        return dummy.next;
    }
}