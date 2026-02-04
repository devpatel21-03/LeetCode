class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        left=0
        right=len(height)-1 
        max1=0
        while left<right:
            h=min(height[left],height[right])
            current=h*(right-left)
        
            max1=max(current,max1)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max1