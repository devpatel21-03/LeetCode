class Solution(object):
    def constructTransformedArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result=[0]*len(nums)
        for i in range(len(nums)):
       
            new_index = ((i+nums[i]) % len(nums))
             
            result[i] = nums[new_index]
        return result
        