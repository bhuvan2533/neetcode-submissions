class Solution {
    public boolean isAnagram(String s, String t) {
// Time Complexity: O(n) n for counting characters.
// The final comparison loop is constant time (26 iterations).

// Space Complexity: O(1)
// Two fixed-size arrays of length 26 are used, independent of the input size.
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++)
            if (freq1[i] != freq2[i])
                return false;
        
        return true;
    }
}
