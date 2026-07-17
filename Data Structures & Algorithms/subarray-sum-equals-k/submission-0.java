class Solution {
    public int subarraySum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> sub = new ArrayList<>();
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum = sum+nums[k];
                    sub.add(nums[k]);
                }
                if(sum == target)
                    res.add(sub);
            }
        }

        return res.size();
    }
}