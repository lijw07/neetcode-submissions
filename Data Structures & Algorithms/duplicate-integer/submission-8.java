class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<Integer>();

        for (int num : nums) {
            if (dup.contains(num))
                return true;
            else
                dup.add(num);
        }

        return false;
    }
}
