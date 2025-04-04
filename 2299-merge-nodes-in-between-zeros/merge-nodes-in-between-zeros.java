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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while(temp != null){
            if(temp.val == 0 && sum != 0){
                t.next = new ListNode(sum);
                t = t.next;
                sum = 0;
            }else{
                sum += temp.val;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}