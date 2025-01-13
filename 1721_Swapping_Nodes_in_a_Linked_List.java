class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // Step 1: Find the size of the linked list
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Step 2: Identify the two nodes to be swapped
        ListNode left = head, right = head;

        // Move left to the k-th node from the start
        for (int i = 1; i < k; i++) {
            left = left.next;
        }

        // Move right to the k-th node from the end
        for (int i = 1; i < size - k + 1; i++) {
            right = right.next;
        }

        // Step 3: Swap the values of the two nodes
        int tempVal = left.val;
        left.val = right.val;
        right.val = tempVal;

        return head;  // Return the modified list
    }
}
