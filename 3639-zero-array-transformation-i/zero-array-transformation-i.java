class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];  // one extra for boundary handling

        // Mark decrements in the difference array
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            diff[start] -= 1;
            if (end + 1 < n) {
                diff[end + 1] += 1;
            }
        }

        // Apply the difference array as prefix sum and subtract from original nums
        int runningSum = 0;
        for (int i = 0; i < n; i++) {
            runningSum += diff[i];
            nums[i] += runningSum; // apply decrement
            if (nums[i] > 0) return false; // still positive? Not zero
        }

        return true;
    }
}
