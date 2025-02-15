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
    class BSTIteratorLeft {
        Stack<TreeNode> st = new Stack<>();

        public BSTIteratorLeft(TreeNode root) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
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

        public boolean hasNext() {
            return !st.isEmpty();
        }
    }

    class BSTIteratorRight {
        Stack<TreeNode> st = new Stack<>();

        public BSTIteratorRight(TreeNode root) {
            while (root != null) {
                st.push(root);
                root = root.right;
            }
        }

        public int next() {
            TreeNode temp = st.pop();
            TreeNode node = temp.left;

            while (node != null) {
                st.push(node);
                node = node.right;
            }
            return temp.val;
        }

        public boolean hasNext() {
            return !st.isEmpty();
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        if(root.left == null && root.right == null && root.val != k){
            return false;
        }

        BSTIteratorLeft l = new BSTIteratorLeft(root);
        BSTIteratorRight r = new BSTIteratorRight(root);

        int lv = l.next(), rv = r.next();
        int sum = lv + rv;
        while (true) {
            sum = lv + rv;
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                if (l.hasNext()) {
                    lv = l.next();
                    if(lv == rv){
                        if(l.hasNext()){
                            lv = l.next();
                        }else{
                            break;
                        }
                    }
                }else{
                    break;
                }
            }else {
                if(r.hasNext()){
                    rv = r.next();
                    if(lv == rv){
                        if(r.hasNext()){
                            rv = r.next();
                        }else{
                            break;
                        }
                    }
                }else{
                    break;
                }
            }
        }
        return false;
    }

}