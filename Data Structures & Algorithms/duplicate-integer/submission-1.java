class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1; i++) {
        //     if(nums[i]== nums[i+1]) {
        //         return true;
        //     }
        // }
        // return false;
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mp.getOrDefault(nums[i], 0) > 0)
                return true;

            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }

        return false;
    }
}