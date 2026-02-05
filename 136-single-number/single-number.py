class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        res={}
        nums.sort()
        for num in nums:
            if num not in res:
                res[num]=1
            else:
                res[num]+=1
        for k , v in res.items():
            if v == 1:
                return k