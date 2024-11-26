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
    public ListNode doubleIt(ListNode head) {
        int carry = 0;
        ListNode prev = reverse(head);
        ListNode temp = prev;
        ListNode pre = temp;

        while (temp != null) {
            int val = temp.val * 2 + carry;
            carry = val / 10;
            temp.val = val % 10;
            pre = temp;
            temp = temp.next;
        }

        if (carry > 0) {
            ListNode newNode = new ListNode(carry);
            pre.next = newNode;
        }

        return reverse(prev);
    }

    public static ListNode reverse(ListNode curr) {
        ListNode prev = null;

        while (curr != null) {
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }

        return prev;
    }
}