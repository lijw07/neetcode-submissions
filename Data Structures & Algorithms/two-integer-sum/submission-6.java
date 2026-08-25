class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> dup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (dup.containsKey(target - nums[i]))
                return new int[] {dup.get(target - nums[i]), i};
            dup.put(nums[i], i);
        }

        return null;
    }
}
