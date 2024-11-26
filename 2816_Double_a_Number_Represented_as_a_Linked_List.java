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
    public ListNode doubleIt(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }

        int carry = 0;
        ListNode temp = prev;
        ListNode pre = temp;
        
        while(temp!=null){
            int val = temp.val*2 + carry;
            carry = val/10;
            temp.val = val%10;
            pre = temp;
            temp = temp.next;
        }

        if(carry > 0){
            ListNode newNode = new ListNode(carry);
            pre.next = newNode;
        }

        ListNode newprev = null;
        ListNode newCurr = prev;

        while(newCurr!=null){
            ListNode n = newCurr.next;
            newCurr.next = newprev;
            newprev = newCurr;
            newCurr = n;
        }

        return newprev;
    }
}