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
    public int maxLevelSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE, -1};

        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }

        int level = 0;
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            level++;
            for(int i = 0; i<size; i++ ){
                TreeNode node = q.poll();
                sum += node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            int temp = max[0];
            max[0] = Math.max(max[0], sum);
            if(max[0] != temp){
                max[1] = level;
            }

        }

        return max[1];
    }
}