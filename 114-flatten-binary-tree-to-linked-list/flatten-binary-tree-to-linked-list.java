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
    public void flatten(TreeNode root) {
        if (root != null) {
            TreeNode node = helper(root);
        }
    }

    public TreeNode helper(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode node1 = helper(root.left);
        TreeNode node2 = helper(root.right);

        if(root.left!=null){
            node1.right = root.right;
            root.right = root.left;
            root.left = null;
            if(node1 != null && node1.left!=null){
                node1.left = null;
            }
            if(node2 != null && node2.right != null){
                node1.right = null;
            }
        }

        if(node2 != null ){
            return node2;
        }else if(node1 != null ){
            return node1;
        }else{
            return root;
        }

    }
}