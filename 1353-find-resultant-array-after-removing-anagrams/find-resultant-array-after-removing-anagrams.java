class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        char[] arr1 = words[0].toCharArray();
        Arrays.sort(arr1);

        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            char[] arr2 = words[i].toCharArray();
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                continue;
            } else {
                list.add(words[i]);
                arr1 = words[i].toCharArray();
                Arrays.sort(arr1);
            }

        }

        return list;
    }
}