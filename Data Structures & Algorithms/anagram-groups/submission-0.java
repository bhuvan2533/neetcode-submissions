class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            String cur = strs[i];
            char[] curArray = cur.toCharArray();
            Arrays.sort(curArray);
            String sortedWord = new String(curArray);

            mp.putIfAbsent(sortedWord, new ArrayList<>());
            mp.get(sortedWord).add(cur);
        }

        return new ArrayList<>(mp.values());
    }
}
