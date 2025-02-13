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

    static class Info{
        TreeNode node;
        int vd;

        public Info(TreeNode node, int vd){
            this.node = node;
            this.vd = vd;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<Info> q = new LinkedList<>();
        Map<Integer, TreeNode> map = new HashMap<>();

        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.poll();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.vd)){
                    map.put(curr.vd, curr.node);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right, curr.vd+1));
                    max = Math.max(max, curr.vd+1);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left, curr.vd+1));
                    max = Math.max(max, curr.vd+1);
                }
            }
        }

        for(int i = 0; i<=max; i++ ){
            list.add(map.get(i).val);
        }

        return list;
    }
}