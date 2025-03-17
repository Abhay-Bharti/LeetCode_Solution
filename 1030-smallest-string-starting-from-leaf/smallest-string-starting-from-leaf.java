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

        if(root.left == null && root.right == null){
            sb.append((char)(root.val+'a'));
            if(ans.equals("")){
                ans = sb.reverse().toString();
            }else if(ans.compareTo(sb.reverse().toString()) > 0){
                ans = sb.toString();
            }
            sb.reverse();
            sb.deleteCharAt(sb.length()-1);
            return;
        }

        sb.append((char)(root.val + 'a'));
        helper(root.left, sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append((char)(root.val + 'a'));
        helper(root.right, sb);
        sb.deleteCharAt(sb.length()-1);

    }
}