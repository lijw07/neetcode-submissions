class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];

            if (result.containsKey(sum))
                return new int[] {result.get(sum), i};
            
            result.put(nums[i], i);
        }

        return null;
    }
}
