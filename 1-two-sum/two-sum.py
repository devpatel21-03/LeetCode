class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        res = []
        for i in range(len(nums)):
            for j in range(i+1):
                if i == j:
                    continue
                else:
                    sum = nums[i]+nums[j]
                    if(sum == target):
                        res.append(i)
                        res.append(j)
                        return res       
        