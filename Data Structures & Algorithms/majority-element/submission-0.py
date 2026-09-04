class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        sumMap = dict()

        for num in nums:
            sumMap[num] = sumMap.get(num, 0) + 1
        
        curr = 0
        largest = 0
        for key, val in sumMap.items():
            if curr < val:
                curr = val
                largest = key
        
        return largest
