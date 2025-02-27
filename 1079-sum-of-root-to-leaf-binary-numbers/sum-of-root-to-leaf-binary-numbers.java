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
    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        String s = String.valueOf(root.val);
        sum(root, s);
        return sum;
    }

    public void sum(TreeNode root, String s){
        if(root == null)
            return;

        if(root.left == null && root.right == null){
            sum += Integer.parseInt(s, 2);
            return;
        }

        if(root.left != null){
            sum(root.left, s+root.left.val);
        }
        if(root.right!=null){
            sum(root.right, s+root.right.val);
        }
    }
}