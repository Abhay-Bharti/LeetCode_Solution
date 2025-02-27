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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            long sum = 0;

            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();

                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                sum += curr.val;
            }
            list.add(sum);
        }
        Collections.sort(list, Comparator.reverseOrder());
        if(list.size() < k){
            return -1;
        }else {
            return list.get(k-1);
        }
    }
}