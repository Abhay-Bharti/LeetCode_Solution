class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list = new ArrayList<>();
        perm(list, new StringBuilder(), s, 0);
        return list;
    }

    static void perm(List<String> list, StringBuilder st, String s, int idx) {
        if (idx == s.length()) {
            list.add(st.toString());
            return;
        }

        char ch = s.charAt(idx);

        st.append(ch);
        perm(list, st, s, idx + 1);
        st.deleteCharAt(st.length() - 1);
        if (Character.isUpperCase(ch)) {
            st.append(Character.toLowerCase(ch));
            perm(list, st, s, idx + 1);
            st.deleteCharAt(st.length() - 1);
        } else if (Character.isLowerCase(ch)) {
            st.append(Character.toUpperCase(ch));
            perm(list, st, s, idx + 1);
            st.deleteCharAt(st.length() - 1);
        }
    }
}