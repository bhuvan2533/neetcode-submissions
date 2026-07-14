class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Vertical scanning;
        // Where a word is taken and compared against all
        if (strs.length == 1)
            return strs[0];

        String word = strs[0];
        int wordLen = word.length();

        for (int i = 0; i < wordLen; i++) {
            for(String s : strs) 
                if(i==s.length() || s.charAt(i) != word.charAt(i))
                    return s.substring(0,i);
        }
        return word;
    }
}