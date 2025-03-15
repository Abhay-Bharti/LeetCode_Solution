class Solution {
    class Node{
        Node[] children = new Node[26];
        boolean eow;
        int freq;

        public Node(){
            freq = 1;
        }
    }
    public Node root = new Node();

    public void insert(String s){
        Node curr = root;
        for(int i = 0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public String helper(StringBuilder sb, int n, Node root){
        if(root == null){
            return sb.toString();
        }

        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                if(root.children[i].freq == n){
                    char ch = (char)(i+'a');
                    sb.append(ch);
                    helper(sb, n, root.children[i]);
                }else{
                    break;
                }
            }
        }
        return sb.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i<strs.length; i++){
            insert(strs[i]);
        }

        return helper(new StringBuilder(), strs.length, root);        
    }
}