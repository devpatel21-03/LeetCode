class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = defaultdict(list)
        for s in strs:
            key = "".join(sorted(s))
            group[key].append(s)

        return group.values() 
        