class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r=0, maxi = 0, zeros=0;
        int n = nums.length;

        while(r<n) {
            if(nums[r] == 0)
                zeros++;
            
            if(zeros > k) 
                if(nums[l++] == 0)
                    zeros--;
                    
            maxi = Math.max(maxi, r-l+1);
            r++;
        }
        return maxi;
    }
}