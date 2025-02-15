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
    class Iterator {
        Stack<TreeNode> st;

        public Iterator(TreeNode root) {
            st = new Stack<>();
            while (root != null) {
                st.add(root);
                root = root.left;
            }
        }

        public boolean hasNext() {
            return !st.isEmpty();
        }

        public int next() {
            TreeNode temp = st.pop();
            TreeNode node = temp.right;

            while (node != null) {
                st.push(node);
                node = node.left;
            }

            return temp.val;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        Iterator i = new Iterator(root);
        int val = i.next();
        k--;
        while (k != 0) {
            if (i.hasNext())
                val = i.next();
            k--;
        }
        return val;
    }

}