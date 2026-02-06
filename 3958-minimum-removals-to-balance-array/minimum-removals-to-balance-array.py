class Solution(object):
    def minRemoval(self, nums, k):
        nums.sort()
        n = len(nums)

        left = 0
        best = 1 

        for right in range(n):
            while nums[right] > k * nums[left]:
                left += 1

            best = max(best, right - left + 1)

        return n - best
