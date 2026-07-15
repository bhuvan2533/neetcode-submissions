class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm
        int low = 0, mid = 0;
        int high = nums.length - 1;

        // [0,0,0,1,1,1,mid-high,2,2,2,2]
        // If mid == 0 then swap it with begining
        // If mid == 1 then just mvoe mid to one element
        // If mid == 2 then swap mid with high and move high to back pos

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}