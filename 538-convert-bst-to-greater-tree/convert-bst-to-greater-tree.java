/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) { 
        helper(root, new int[]{0});
        return root;
    }

    public void helper(TreeNode root, int[] sum){
        if(root == null){
            return;
        }

        helper(root.right, sum );
        sum[0] += root.val;
        root.val = sum[0];
        helper(root.left, sum );
    }
}