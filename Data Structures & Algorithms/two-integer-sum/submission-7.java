class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];

            if (cache.containsKey(sum))
                return new int[] {cache.get(sum), i};
            
            cache.put(nums[i], i);
        }

        return null;
    }
}
