class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] response = new int[n*2];

        for(int i=0;i<n;i++) 
            response[i] = response[i+n] = nums[i];

        return response;
    }
}