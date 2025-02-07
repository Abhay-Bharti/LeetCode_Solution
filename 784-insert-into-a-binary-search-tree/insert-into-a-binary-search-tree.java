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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        TreeNode temp = root;
        TreeNode prev = root;
        while (root != null) {
            if (root.val > val) {
                prev = root;
                root = root.left;
            } else {
                prev = root;
                root = root.right;
            }
        }
        TreeNode newNode = new TreeNode(val);
        if (prev.val > val) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        return temp;
    }
}