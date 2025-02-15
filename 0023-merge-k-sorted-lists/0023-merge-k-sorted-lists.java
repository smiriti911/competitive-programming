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
    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode mergeHead = new ListNode(0); // Dummy node
        ListNode merge = mergeHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                merge.next = l1;
                l1 = l1.next;
            } else {
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next; // Move the pointer forward
        }

        // Attach the remaining part of the non-empty list
        if (l1 != null) {
            merge.next = l1;
        }
        if (l2 != null) {
            merge.next = l2;
        }

        return mergeHead.next; // Skip the dummy node
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null|| lists.length==0){
            return null;
        }
        while(lists.length>1){
            List<ListNode> temp=new ArrayList<>();
            for(int i=0; i<lists.length;i+=2){
                ListNode l1=lists[i];
                ListNode l2= i+1<lists.length?lists[i+1]:null;
                temp.add(mergeList(l1,l2));
            }
            lists = temp.toArray(new ListNode[0]);
        }
        return lists[0];
    }
}