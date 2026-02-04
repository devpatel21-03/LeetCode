class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        seen = {}  # Dictionary to store {value: index}

        for i, num in enumerate(nums):
            sub = target - num  # Find the needed complement
            
            # Check if we've already seen this complement
            if sub in seen:
                return [seen[sub], i]
            
            # If not, store the current number and its index
            seen[num] = i
