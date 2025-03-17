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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(-1);
        List<Integer> temp = new ArrayList<>();
        TreeNode t = dummy;

        helper(root, temp);

        for(int i = 0; i<temp.size(); i++){
            t.right = new TreeNode(temp.get(i));
            t = t.right;
        }

        return dummy.right;
    }

    public void helper(TreeNode root, List<Integer> temp){
        if(root == null) return;

        helper(root.left, temp);
        temp.add(root.val);
        helper(root.right, temp);
    }
}