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
    public ListNode partition(ListNode head, int x) {
        ListNode temp = head;
        ListNode low = new ListNode(-1);
        ListNode high = new ListNode(-1);
        ListNode l = low;
        ListNode h = high;
        while(temp!=null){
            if(temp.val<x){
                ListNode newnode = new ListNode(temp.val);
                l.next = newnode;
                l = newnode;
            }else {
                ListNode newnode = new ListNode(temp.val);
                h.next = newnode;
                h = newnode;
            }
            temp = temp.next;
        }
        l.next = high.next;
        return low.next;
    }
}