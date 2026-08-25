class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int first = 0; first < nums.length; first++) {
            if (nums[first] > 0)
                break;
            if (first > 0 && nums[first] == nums[first - 1])
                continue;

            int middle = first + 1, last = nums.length - 1;
            while (middle < last) {
                int result = nums[first] + nums[middle] + nums[last];

                if (result > 0)
                    last--;
                else if (result < 0)
                    middle++;
                else {
                    res.add(Arrays.asList(nums[first], nums[middle], nums[last]));
                    middle++;
                    last--;

                    while (middle < last && nums[middle] == nums[middle - 1]) {
                        middle++;
                    }
                }
            }
        }

        return res;
    }
}
