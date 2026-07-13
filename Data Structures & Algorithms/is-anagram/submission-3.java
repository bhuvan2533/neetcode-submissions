class Solution {
    public boolean isAnagram(String s, String t) {
        //TC: O(nlogn) SC: O(n)
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen)
            return false;

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
