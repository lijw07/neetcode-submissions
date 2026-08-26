class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        sum = 0
        curr = 0
        for num in nums:
            if num == 1:
                curr += 1
            sum = max(sum, curr)
            if num != 1:
                curr = 0
        return sum