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

    public void inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int s = 0, e = list.size()-1;
        int sum = list.get(s)+list.get(e);
        while(s<e){
            sum = list.get(s)+list.get(e);
            if(sum == k){
                return true;
            }
            if(sum < k){
                s++;
            }else{
                e--;
            }
        }
        return false;
    }
}