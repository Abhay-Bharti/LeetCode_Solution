class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            ListNode nxt = temp.next;
            ListNode nextPair = nxt.next;

            t.next = nxt;
            nxt.next = temp;
            t = temp;

            temp = nextPair;
        }

        t.next = temp;

        return dummy.next;
    }
}
