/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Step 1: Reverse the linked list
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // The head of the reversed list
        ListNode reversedHead = prev;

        // Step 2: Remove nodes that are less than the maximum value seen so far
        ListNode newHead = reversedHead;
        ListNode temp = reversedHead;
        int max = temp.val;

        while (temp != null && temp.next != null) {
            if (temp.next.val < max) {
                temp.next = temp.next.next; // Skip the node
            } else {
                max = temp.next.val; // Update max
                temp = temp.next; // Move to the next node
            }
        }

        // Step 3: Reverse the list again to restore original order
        prev = null;
        curr = newHead;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Return the final head
        return prev;
    }
}
