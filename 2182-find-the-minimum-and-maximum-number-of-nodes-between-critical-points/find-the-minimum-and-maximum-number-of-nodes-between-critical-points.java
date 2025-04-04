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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, i = 2;
        ArrayList<Integer> list = new ArrayList<>();

        if (head.next.next == null)
            return new int[]{ -1, -1 };

        ListNode prev = head, temp = head.next;

        while (temp.next != null) {
            if ((temp.val > prev.val && temp.val > temp.next.val)
                    || (temp.val < prev.val && temp.val < temp.next.val)) {
                if (list.size() >= 1) {
                    max = Math.max(max, i - list.get(0));
                    min = Math.min(min, i - list.get(list.size() - 1));
                }
                list.add(i);
            }
            i++;
            prev = temp;
            temp = temp.next;
        }

            System.out.println(min + " " + max);
        if(min == Integer.MAX_VALUE || max == Integer.MIN_VALUE)
            return new int[]{-1,-1};
        
        return new int[]{ min, max };
        
    }
}