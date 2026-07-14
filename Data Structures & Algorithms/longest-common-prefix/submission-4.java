class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Horizontal scanning;
        // Where a word is taken and compared against all
        if(strs.length == 1)
            return strs[0];

        int n=strs[0].length();
        String word = strs[0];

        for(int i=1; i<strs.length; i++) {
            int j=0;
            String curr = strs[i];
            int currLen = curr.length();
            
            while(j < Math.min(currLen, word.length())) {
                if(curr.charAt(j) != word.charAt(j))
                    break;
                j++;
            }
            word=word.substring(0, j);
            if(word.length() == 0)
                return "";
        }
        return word;
    }
}