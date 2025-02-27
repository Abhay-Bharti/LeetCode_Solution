/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode prev = null;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }

                if (level % 2 == 0 && (node.val % 2 == 0 || (prev != null && prev.val >= node.val))) {
                    return false;
                } else if (level % 2 != 0 && (node.val % 2 != 0 || (prev!=null && prev.val <= node.val))) {
                    return false;
                }
                prev = node;
            }
            level++;
        }
        return true;
    }
}