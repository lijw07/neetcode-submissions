class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        index_map = {}
        for i in range(0, len(nums)):
            val = target - nums[i]
                
            if val in index_map:
                return [index_map[val], i]
            
            index_map[nums[i]] = i
        return []