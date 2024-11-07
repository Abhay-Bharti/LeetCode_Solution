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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        ListNode tail = head;
        int size = 0;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        tail.next = head;
        size++;

        int loop = k % size;

        ListNode temp = head;
        for (int i = 0; i < (size - loop) - 1; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}