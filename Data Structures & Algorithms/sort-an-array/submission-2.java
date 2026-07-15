class Solution {
    public int[] sortArray(int[] nums) {
        // Selection sort
        // Find the minimum element in an array and swap it with the ele at the beginning

        for(int i = 0; i<nums.length-1; i++) {
            for(int j= i+1; j<nums.length; j++) {
                if(nums[j] < nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}