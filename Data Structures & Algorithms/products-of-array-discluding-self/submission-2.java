class Solution {
    public int[] productExceptSelf(int[] nums) {
        int initialize = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = initialize;
            int index = 0;
            while (index < nums.length) {
                if (index != i)
                    result[i] *= nums[index];
                index++;
            }
        }

        return result;
    }
}  
