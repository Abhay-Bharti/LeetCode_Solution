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
    public int findTilt(TreeNode root) {
        int[] ans = { 0 };
        helper(root, ans);
        return ans[0];
    }

    public int helper(TreeNode root, int[] ans) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left, ans);
        int right = helper(root.right, ans);

        int lc = root.left == null ? 0 : root.left.val;
        int rc = root.right == null ? 0 : root.right.val;

        int val = root.val;
        ans[0] += Math.abs((left + lc) - (right + rc));
        root.val = left + lc + right + rc;
        return val;
    }
}