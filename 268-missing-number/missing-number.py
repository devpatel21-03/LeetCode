class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        lens=len(nums)
       
        for i in range(lens):
            if nums[i] != i:
                return i
        return lens