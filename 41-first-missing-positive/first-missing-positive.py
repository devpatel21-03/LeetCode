class Solution(object):
    def firstMissingPositive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        i=1
        set1=set(nums)

        while i in set1:
            i+=1

        return i

        