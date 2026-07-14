class Solution {
    public int majorityElement(int[] nums) {
        // O(nlogn)
        // Arrays.sort(nums);
        // return nums[nums.length/2]; 

        // O(n):
        HashMap<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.get(num) > maxCount) {
                res = num;
                maxCount = count.get(num);
            }
        }
        return res;
    }
}