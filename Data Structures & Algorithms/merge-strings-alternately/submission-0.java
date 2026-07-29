class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();
        int smallestLen = Math.min(l1, l2);
        for(int i=0; i < smallestLen; i++) {
            str.append(word1.charAt(i));
            str.append(word2.charAt(i));
        }
        
        if(l1<l2) 
            str.append(word2.substring(smallestLen));
        else str.append(word1.substring(smallestLen));
        return str.toString();
    }
}