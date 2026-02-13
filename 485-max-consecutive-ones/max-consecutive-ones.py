class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = 0
        max1 = 0
        
        for i in range(len(nums)):
            if nums[i] == 1:
                res += 1
            else:
                if max1 < res:
                    max1 = res
                res = 0
        return max(max1,res)