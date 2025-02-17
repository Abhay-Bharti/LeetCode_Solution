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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list, "");
        return list;
    }

    public void helper(TreeNode root, List<String> list, String s) {
        if (root == null) {
            return;
        }

        s += "->" + root.val;
        if (root.left == null && root.right == null) {
            list.add(s.substring(2));
            return;
        } else {
            helper(root.left, list, s );
            helper(root.right, list, s );
        }
        s = s.substring(0, s.length()-3);

    }
}