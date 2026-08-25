class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        for i in range(len(arr)):
            curr = 0
            for j in range(i + 1, len(arr)):
                if curr < arr[j]:
                    curr = arr[j]
            arr[i] = curr
        arr[-1] = -1
        return arr
