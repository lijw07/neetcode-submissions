class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        result = []

        for i in range(0, len(arr)):
            curr = 0
            for j in range(i + 1, len(arr)):
                curr = max(curr, arr[j])
            result.append(curr)
            curr = 0
        result[-1] = -1
        return result