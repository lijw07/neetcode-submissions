class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max = 0
        curr = 0
        for i in nums:
            if i == 1:
                curr = curr + 1
            else:
                curr = 0

            if max < curr:
                max = curr
            
        return max