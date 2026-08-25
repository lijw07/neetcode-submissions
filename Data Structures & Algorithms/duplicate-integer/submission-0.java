class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> dup = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (dup.containsKey(nums[i]))
                return true;
            dup.put(nums[i], i);
        }

        return false;
    }
}
