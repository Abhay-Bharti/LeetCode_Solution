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
    public int getDecimalValue(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n = n << 1;
            n = n | temp.val;
            temp = temp.next;
        }

        return n;
    }
}