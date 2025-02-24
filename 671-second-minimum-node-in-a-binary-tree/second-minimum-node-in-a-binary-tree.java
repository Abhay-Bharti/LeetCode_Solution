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
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set = new HashSet<>();
        preorder(root, set);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if (list.size() > 1) {
            return list.get(1);
        }
        return -1;
    }

    public void preorder(TreeNode root, HashSet<Integer> set) {
        if (root == null) {
            return;
        }

        set.add(root.val);
        preorder(root.left, set);
        preorder(root.right, set);
    }
}