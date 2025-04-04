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
        ListNode temp = head, prev = head;

        while(temp != null){
            if(temp.val == 0 && sum != 0){
                ListNode node = new ListNode(sum);
                if(head.val == 0){
                    head = prev = node;
                }else{
                    prev.next = node;
                    prev = node;
                }
                sum = 0;
            }else{
                sum += temp.val;
            }
            temp = temp.next;
        }

        return head;
    }
}