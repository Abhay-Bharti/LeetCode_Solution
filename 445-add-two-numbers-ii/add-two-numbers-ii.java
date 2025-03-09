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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        ListNode temp = l1;
        while(temp != null){
            s1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp != null){
            s2.push(temp.val);
            temp = temp.next;
        }

        int carry = 0;
        ListNode head = null;
        while(!s1.isEmpty() && !s2.isEmpty()){
            int num = s1.pop() + s2.pop() + carry;
            ListNode node = new ListNode(num%10);
            node.next = head;
            head = node;
            carry = num/10;
        }
        while(!s1.isEmpty()){
            int num = s1.pop() + carry;
            ListNode node = new ListNode(num%10);
            node.next = head;
            head = node;
            carry = num/10;
        }

        while(!s2.isEmpty()){
            int num = s2.pop() + carry;
            ListNode node = new ListNode(num%10);
            node.next = head;
            head = node;
            carry = num/10;
        }

        if(carry > 0){
            ListNode node = new ListNode(carry);
            node.next = head;
            head = node;
        }
        
        return head;
    }
}