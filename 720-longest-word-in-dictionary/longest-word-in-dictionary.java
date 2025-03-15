class Solution {
    class Node{
        Node[] children = new Node[26];
        boolean eow;
    }

    Node root = new Node();

    public void insert(String word){
        Node curr = root;
        for(int i = 0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public String ans = "";

    public void prefix(Node root, StringBuilder temp){
        if(root == null) return;

        for(int i= 0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow){
                char ch = (char)(i+'a');
                temp.append(ch);
                if(ans.length() < temp.length()){
                    ans = temp.toString();
                }
                prefix(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public String longestWord(String[] words) {
        for(String s: words){
            insert(s);
        }
        prefix(root, new StringBuilder());
        return ans;
    }
}