class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort and scan : O(n * mlogm)
        Arrays.sort(strs);

        String first = strs[0]; 
        String last = strs[strs.length-1];
        int mini = Math.min(first.length(), last.length());

        for(int i = 0; i<mini; i++) {
            if(first.charAt(i) != last.charAt(i)) 
                return first.substring(0,i);
        }
        return first;
    }
}