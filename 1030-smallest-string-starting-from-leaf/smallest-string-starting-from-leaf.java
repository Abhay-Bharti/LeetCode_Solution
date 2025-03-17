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
    String ans;

    public String smallestFromLeaf(TreeNode root) {
        ans = "";
        helper(root, new StringBuilder());
        return ans;
    }

    public void helper(TreeNode root, StringBuilder sb){
        if(root == null){
            return;
        }

        sb.insert(0, (char)(root.val + 'a'));
        if(root.left == null && root.right == null){
            if(ans.equals("") || ans.compareTo(sb.toString()) > 0){
                ans = sb.toString();
            }
            sb.deleteCharAt(0);
            return;
        }

        helper(root.left, sb);
        sb.deleteCharAt(0);
        sb.insert(0, (char)(root.val + 'a'));
        helper(root.right, sb);
        sb.deleteCharAt(0);

    }
}