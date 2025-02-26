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
    private int sum = 0;

    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root, root.val, 10);
        return sum;
    }

    public void helper(TreeNode root, int num, int t) {
        if (root == null) {
            return;
        }

        if(root.left == null && root.right == null){
            System.out.println(sum + " " + num);
            sum += num;
            return;
        }

        if(root.left!= null){
            helper(root.left, num*10 + root.left.val, t*10);
        }
        if(root.right!= null){
            helper(root.right, num*10 + root.right.val, t*10);
        }
    }
}