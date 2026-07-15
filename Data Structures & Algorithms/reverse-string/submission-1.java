class Solution {
    public void reverseString(char[] s) {
        //O(n)
        String st = new String(s);
        String sb = new StringBuilder(st).reverse().toString();

        for(int i=0;i<s.length; i++) 
            s[i] = sb.charAt(i);
    }
}