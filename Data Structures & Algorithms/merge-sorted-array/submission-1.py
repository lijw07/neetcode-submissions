class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1[m:] = nums2[:n]
        for i in range(1, len(nums1)):
            j = i - 1
            while j >= 0 and nums1[j + 1] < nums1[j]:
                tmp = nums1[j + 1]
                nums1[j + 1] = nums1[j]
                nums1[j] = tmp
                j -= 1