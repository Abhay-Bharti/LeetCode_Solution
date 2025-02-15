/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> a = new ArrayList<>();
        List<TreeNode> b = new ArrayList<>();

        getPath(root, p, a);
        getPath(root, q, b);

        int i = 0;
        for (; i < a.size() && i < b.size(); i++) {
            if (a.get(i) != b.get(i))
                break;
        }

        return a.get(i - 1);
    }

    public boolean getPath(TreeNode root, TreeNode t, List<TreeNode> list) {
        if (root == null)
            return false;
        list.add(root);
        if (root.val == t.val)
            return true;

        boolean left = getPath(root.left, t, list);
        boolean right = getPath(root.right, t, list);

        if (left || right) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;
    }
}