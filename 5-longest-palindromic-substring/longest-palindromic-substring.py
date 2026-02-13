class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if not s :
            return ""
        res = ""

        def expand(left,right):

            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
            return s[left + 1 : right]
        
        for i in range(len(s)):
            p1 = expand(i, i)
            p2 = expand(i,i+1)
            res = max(p1,p2,res,key = len)
        return res