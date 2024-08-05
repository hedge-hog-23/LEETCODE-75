class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        res = []
        a = set(nums1) - set(nums2)
        b = set(nums2) - set(nums1)
        res.append(a)
        res.append(b)
        return res
