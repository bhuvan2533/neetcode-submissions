class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++) {
            rotateArray(nums);
        }
    }

    public void rotateArray(int[] nums) {
        int n=nums.length;
        int firstEle = nums[n-1];
        for(int i=n-1;i>0;i--) 
            nums[i] = nums[i-1];

        nums[0] = firstEle;
    }
}