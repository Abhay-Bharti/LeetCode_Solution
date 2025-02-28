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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int level = 1;

        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        helper(root, val, depth, level);
        return root;
    }

    public void helper(TreeNode root, int val, int depth, int level ){
        if(root == null) return;

        if(level == depth-1){
            TreeNode l = new TreeNode(val);
            l.left = root.left;
            root.left = l;

            TreeNode r = new TreeNode(val);
            r.right = root.right;
            root.right = r;

            return;
        }

        helper(root.left, val, depth, level+1);
        helper(root.right, val, depth, level+1);
    }
}