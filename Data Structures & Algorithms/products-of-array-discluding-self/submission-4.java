class Solution {
    public int[] productExceptSelf(int[] nums) {
        // TC: O(n) SC: O(n)
        int n = nums.length;
        int res[] = new int[n];
        int pref[] = new int[n];

        pref[0] = 1;

        for (int i = 1; i < n; i++) 
            pref[i] = nums[i-1] * pref[i-1];

        int rightProduct = 1;
        for( int i=n-1; i>=0; i--) {
            res[i] = pref[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
            
        
        // for(int i=0;i<n;i++)    
        //     res[i] = pref[i]*suff[i];

        return res;
        
    }
}
