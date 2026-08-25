class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> value = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (value.contains(nums[i]))
                return true;
            value.add(nums[i]);
        }

        return false;
    }
}
