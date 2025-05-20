class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0;
        int minSum = 0;
        int maxAbsolute = 0;

        for (int num : nums) {
            maxSum = Math.max(num, maxSum + num);
            minSum = Math.min(num, minSum + num);
            maxAbsolute = Math.max(maxAbsolute, Math.max(maxSum, -minSum));
        }

        return maxAbsolute;
    }
}
