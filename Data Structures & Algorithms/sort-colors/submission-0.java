class Solution {
    public void sortColors(int[] nums) {
        // Counting sort
        int[] count = new int[3];

        for (int i = 0; i < nums.length; i++)
         count[nums[i]]++;

        int ind = 0;
        for (int i = 0; i < 3; i++) {
            while (count[i]-- > 0)
                nums[ind++] = i;
        }
    }
}