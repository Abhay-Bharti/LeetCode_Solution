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
    TreeNode curr;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        curr = dummy;

        helper(root);
        return dummy.right;
    }

    public void helper(TreeNode root){
        if(root == null) return;

        helper(root.left);
        curr.right = new TreeNode(root.val);
        curr = curr.right;
        helper(root.right);
    }
}