class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        curr = 0
        for num in nums:
            if num != 1:
                curr = 0
            
            if num == 1:
                curr += 1
                count = max(count, curr)

        return count
            
