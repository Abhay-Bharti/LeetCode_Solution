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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root1, list);
        helper(root2, list);

        Collections.sort(list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
