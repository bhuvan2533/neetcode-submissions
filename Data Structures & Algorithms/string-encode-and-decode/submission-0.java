class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String it : strs) sb.append(it.length()).append('#').append(it);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int hash = str.indexOf('#', i);

            int len = Integer.parseInt(str.substring(i, hash));
            String word = str.substring(hash + 1, hash + 1 + len);

            response.add(word);

            i = hash + 1 + len;
        }

        return response;
    }
}
