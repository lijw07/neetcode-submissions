class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxL = 0;
        int maxR = 0;
        int max = 0;

        while (left <= right) {
            int curr = 0;

            if (maxL < heights[left])
                maxL = heights[left];

            if (maxR < heights[right])
                maxR = heights[right];

            if (maxL > maxR)
                max = Math.max(max, (maxR * (right - left)));
            else
                max = Math.max(max, (maxL * (right - left)));

            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }

        return max;
    }
}
