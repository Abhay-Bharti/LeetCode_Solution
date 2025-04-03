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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        Stack<Integer> st = new Stack<>();

        ListNode t = head;
        int i = 1;
        while(t != null){
            if(i % k == 0){
                st.push(t.val);
                    // System.out.println(st);
                while(!st.isEmpty()){
                    temp.next = new ListNode(st.pop());
                    temp = temp.next;
                }
            }else{
                st.push(t.val);
            }
            i++;
            t = t.next;
        }

        ListNode tail = temp;
        temp = temp.next;
        while(!st.isEmpty()){
            ListNode newNode = new ListNode(st.pop());
            tail.next = newNode;
            newNode.next = temp;
            temp = newNode;
        }
        // System.out.println(st);
        return dummy.next;
    }
}