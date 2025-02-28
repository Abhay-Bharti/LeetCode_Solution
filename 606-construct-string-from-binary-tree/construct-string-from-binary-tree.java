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
    public String tree2str(TreeNode root) {
        StringBuilder s = new StringBuilder(String.valueOf(root.val));
        helper(root, s);
        return s.toString();
    }

    public void helper(TreeNode root, StringBuilder s){
        if(root == null){
            return;
        }

        if(root.left != null){
            s.append("(" + root.left.val);
            helper(root.left, s);
            s.append(")");
        }else if(root.right != null){
            s.append("()");
        }

        if(root.right != null){
            s.append("(" + root.right.val);
            helper(root.right, s);
            s.append(")");
        }
    }
}