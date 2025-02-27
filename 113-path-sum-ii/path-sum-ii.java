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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        List<Integer> sub = new ArrayList<>();
        sub.add(root.val);
        path(root, targetSum-root.val, res, sub);
        return res;
    }

    public void path(TreeNode root, int sum, List<List<Integer>> res, List<Integer> sub) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null && sum == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }

        if (root.left != null) {
        sub.add(root.left.val);
            path(root.left, sum - root.left.val, res, sub);
            sub.remove(sub.size() - 1);
        }
        if (root.right != null) {
            sub.add(root.right.val);
            path(root.right, sum - root.right.val, res, sub);
            sub.remove(sub.size() - 1);
        }
    }
}