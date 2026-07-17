class Solution {
    public int subarraySum(int[] nums, int target) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum+nums[j];
                if(sum == target)
                    cnt++;
            }
        }

        return cnt;
    }
}